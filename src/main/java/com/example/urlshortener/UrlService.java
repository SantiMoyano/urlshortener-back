package com.example.urlshortener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UrlService {

    @Autowired
    UrlRepository urlRepository;

    public String generateUrl(String longUrl) {
        String newShortUrl = generateShortUrl();
        Url newUrl = new Url();
        newUrl.setLongUrl(longUrl);
        newUrl.setShortUrl(newShortUrl);
        urlRepository.save(newUrl);
        return newShortUrl;
    }

    private String generateShortUrl() {
        return UUID.randomUUID().toString().substring(0, 8);
    }
}
