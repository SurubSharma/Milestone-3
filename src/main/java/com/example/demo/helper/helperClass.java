package com.example.demo.helper;

import com.example.demo.bean.Constants;
import com.example.demo.entities.CSVEntity;
import com.example.demo.entities.NetflixDataEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class helperClass {

    @Autowired
    Constants constant;
    public List<NetflixDataEntity> readCSVContent(){
        List<NetflixDataEntity> movieLists=new ArrayList<>();
        String file= constant.FILE_PATH;
        try {
            System.out.println("Reading csv content-------");
            BufferedReader br=new BufferedReader(new FileReader(file));

            System.out.println(Arrays.stream(br.readLine().split(","))+"  "+br.readLine().split(",").length);

            while(br.readLine()!=null && !br.readLine().equalsIgnoreCase("")){
                String line=br.readLine();
                if(line!=null) {
                    String[] values = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
//                    System.out.println(values.length);
                    if (values.length == 12) {
                        NetflixDataEntity movie = new NetflixDataEntity(values[0], values[1], values[2], values[3], values[5], values[6], values[7], values[8], values[9], values[10], values[11]);
                        movieLists.add(movie);
                    }
                }
            }


            System.out.println(movieLists.toArray().length);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return movieLists;
    }

}
