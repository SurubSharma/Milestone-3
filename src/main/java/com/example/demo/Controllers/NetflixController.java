package com.example.demo.Controllers;

import com.example.demo.bean.Constants;
import com.example.demo.bean.NetflixInput;
import com.example.demo.entities.NetflixDataEntity;
import com.example.demo.helper.helperClass;
import com.example.demo.services.NetflixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class NetflixController {
    @Autowired
    NetflixService netflixService;
    @Autowired
    Constants constant;

    @Autowired
    helperClass helper;

    @GetMapping("/")
    public void InsertData2() throws FileNotFoundException {
        this.netflixService.InsertData(new NetflixInput());
    }

    @GetMapping("/movies")
    public ResponseEntity<List<NetflixDataEntity>> getAllMovies(@RequestParam("datasource") String datasource){
        List<NetflixDataEntity> movieLists=new ArrayList<>();
        if(datasource.equalsIgnoreCase(constant.DB)) {
            movieLists= netflixService.getAllMovie();
            System.out.println("From DB");
        }else if(datasource.equalsIgnoreCase(constant.CSV)){
            movieLists=helper.readCSVContent();
            System.out.println("From CSV");
        }

        return  ResponseEntity.ok().body(movieLists);
    }



//    SQL QUERY FOR TABLE CREATION
//CREATE TABLE `netflix`.`movies` (
//    show_id varchar(255),
//    type_in  varchar(255) ,
//    title   varchar(255) ,
//    producer varchar(255),
//    caste varchar(1655),
//    country varchar(655),released varchar(655), year varchar(655),tv varchar(655),
//    seasons varchar(655),genre varchar(655),description varchar(1655)
//);
}

