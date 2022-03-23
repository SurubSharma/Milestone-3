package com.example.demo.services;

import com.example.demo.bean.NetflixInput;
import com.example.demo.csv.CSVPojo;
import com.example.demo.entities.NetflixDataEntity;
import com.example.demo.repositories.NetflixDataRepository;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

@Service
public class NetflixService {

    @Autowired
    NetflixDataRepository netflixDataRepo;


    public void InsertData(NetflixInput netflixInput) throws IllegalStateException, FileNotFoundException {
        List<CSVPojo> airportData=  new CsvToBeanBuilder(new FileReader(netflixInput.getPath()))
                .withType(CSVPojo.class).build().parse();

        NetflixDataEntity netflixEntity= new NetflixDataEntity(values[0], values[1], values[2], values[3], values[5], values[6], values[7], values[8], values[9], values[10], values[11]);
        for(CSVPojo ad:airportData){
            System.out.println("*****"+ad.getType_in()+"***"+ad.getTitle()+"***"+ad.getProducer()+"***"+ad.getCaste());

//          airportEntity.setId(ad.getId());
            netflixEntity.setShow_id(ad.getShow_id());
            netflixEntity.setType_in(ad.getType_in());
            netflixEntity.setTitle(ad.getTitle());
            netflixEntity.setProducer(ad.getProducer());
            netflixEntity.setCaste(ad.getCaste());
            netflixEntity.setCountry(ad.getCountry());
            netflixEntity.setReleased(ad.getReleased());
            netflixEntity.setYear(ad.getYear());
            netflixEntity.setTv(ad.getTv());
            netflixEntity.setSeasons(ad.getSeasons());
            netflixEntity.setGenre(ad.getGenre());
            netflixEntity.setDescription(ad.getDescription());

            netflixDataRepo.save(netflixEntity);
            netflixDataRepo.flush();

            System.out.println("Record Saved Succesfully");
        }

    }


    public void getCSVData(NetflixInput netflixInput) throws IllegalStateException, FileNotFoundException {
        List<CSVPojo> csvData=  new CsvToBeanBuilder(new FileReader(netflixInput.getPath()))
                .withType(CSVPojo.class).build().parse();
System.out.println(csvData);
        NetflixDataEntity netflixEntity= new NetflixDataEntity(values[0], values[1], values[2], values[3], values[5], values[6], values[7], values[8], values[9], values[10], values[11]);
//        for(CSVPojo ad:csvData) {
//            System.out.println("*****" + ad.getType_in() + "***" + ad.getTitle() + "***" + ad.getProducer() + "***" + ad.getCaste());
//
//            NetflixDataEntity movie = new NetflixDataEntity(ad.getType_in() ad.getTitle());
//
//        }
        }




//    public List<CSVEntity> getType() {
//        List<CSVEntity> movieLists=new ArrayList<>();
//        String file="src/main/resources/netflix_titles.csv";
//        String line="";
//        try {
//            System.out.println("Reading csv content-------");
//            BufferedReader br=new BufferedReader(new FileReader(file));
////            System.out.println(Arrays.stream(br.readLine().split(","))+"  "+br.readLine().split(",").length);
//            while(br.readLine()!=null){
////                String line=br.readLine();
////                if(line!=null) {
//                    String[] values = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
////                    System.out.println(values.length);
////                    if (values[5].equals(n)) {
//                        CSVEntity movie = new CSVEntity(values[0], values[1], values[2], values[3], values[4], values[5], values[6], values[7], values[8], values[9], values[10], values[11]);
//                        movieLists.add(movie);
////                    }
//                }
//            } catch (FileNotFoundException ex) {
//            ex.printStackTrace();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//
//        System.out.println("ss"+movieLists);
//
//        return movieLists;
//
//    }


    public List<NetflixDataEntity> saveMovie(List<NetflixDataEntity> movieList) {
        List<NetflixDataEntity> movies=new ArrayList<>();
        for (NetflixDataEntity movie : movieList) {
            if (!netflixDataRepo.existsById(movie.getShow_id())) {
                System.out.println("Not Exist!!!!!!!!");
                movies.add(movie);
                this.netflixDataRepo.save(movie);
            }


        }
        return movies;
    }

    public List<NetflixDataEntity> getAllMovie(){
        List<NetflixDataEntity> movieList=netflixDataRepo.findAll();
        return movieList;
    }

        }

