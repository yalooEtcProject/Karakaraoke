package com.karakaraoke;

import com.karakaraoke.webCrawler.WebCrawler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class KarakaraokeApplication {

    public static void main(String[] args) throws IOException {

        WebCrawler webCrawler = new WebCrawler();

        //webCrawler.getSingByTitle(2,"빅뱅",10,10);
        webCrawler.getNaver();
        SpringApplication.run(KarakaraokeApplication.class, args);
    }

}
