package com.karakaraoke.webCrawler;

import com.karakaraoke.webCrawler.dto.karaokeResponse;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class WebCrawler {


    /**
     * 제목을 이용 하여 해당 정보를 가져올 때 사용합니다.
     * */
    public List<karaokeResponse> getSingByTitle(int strType,
                                         String strText,
                                         int strSize01,
                                         int intPage) throws IOException {
        String commonUrl = "https://www.tjmedia.com/tjsong/song_search_list.asp";

        String url = UriComponentsBuilder.fromUriString(commonUrl)
                .queryParam("strType", strType)
                .queryParam("strText", strText)
                .queryParam("strSize01", strSize01)
                .queryParam("intPage", intPage)
                .toUriString();

        Document document = Jsoup.connect(url).get();
        System.out.println(url);
        //Elements element =document.select("div");
        Elements element= document.select("table");
        for (Element e : element) {
            System.out.println(e);
        }

        return null;
    }

    public List<karaokeResponse> getNaver() throws IOException {
        String url = "https://www.naver.com/";
        System.out.println(url);

        Document document = Jsoup.connect(url).get();

        //Elements element =document.select("div");
        Elements element= document.select("root");
        for (Element e : element){
            System.out.println(e);
        }

        return null;
    }



}
