package com.example.urlshortener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@RequestMapping("/api/shorty")
public class UrlController {

    @Autowired
    UrlService urlService;

    @PostMapping
    public ResponseEntity<String> shortenUrl(@RequestBody String longUrl) {
        return new ResponseEntity<String>(urlService.generateUrl(longUrl), HttpStatus.OK);
    }

    @GetMapping("/{shortUrl}")
    public RedirectView redirectUrl(@PathVariable String shortUrl) {
        String redirectUrl = urlService.getRedirectUrl(shortUrl);
        return new RedirectView(redirectUrl);
    }
}
