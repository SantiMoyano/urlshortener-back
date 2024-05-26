package com.example.urlshortener;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
public class UrlServiceTest {

//    @Mock
//    private UrlRepository urlRepository;
//
//    @InjectMocks
//    private UrlService urlService;
//
//    @BeforeEach
//    public void setUp() {
//        MockitoAnnotations.openMocks(this);
//    }
//
//    @Test
//    public void testGenerateUrl() {
//        String longUrl = "https://www.example.com";
//        String shortUrl = "abcd1234";
//
//        // Mocking generateShortUrl method
//        when(urlService.generateShortUrl()).thenReturn(shortUrl);
//
//        // Perform the test
//        Url newUrl = new Url();
//        newUrl.setLongUrl(longUrl);
//        newUrl.setShortUrl(shortUrl);
//
//        when(urlRepository.save(any(Url.class))).thenReturn(newUrl);
//
//        String generatedShortUrl = urlService.generateUrl(longUrl).getShortUrl();
//
//        verify(urlRepository, times(1)).save(any(Url.class));
//
//        assertEquals(shortUrl, generatedShortUrl);
//    }
//
//    @Test
//    public void testGetRedirectUrl() {
//        String shortUrl = "abcd1234";
//        String longUrl = "https://www.example.com";
//
//        Url url = new Url();
//        url.setShortUrl(shortUrl);
//        url.setLongUrl(longUrl);
//
//        when(urlRepository.findByShortUrl(shortUrl)).thenReturn(url);
//
//        String result = urlService.getRedirectUrl(shortUrl);
//
//        assertEquals(longUrl, result);
//    }
//
//    @Test
//    public void testGetRedirectUrlNotFound() {
//        String shortUrl = "abcd1234";
//
//        when(urlRepository.findByShortUrl(shortUrl)).thenReturn(null);
//
//        String result = urlService.getRedirectUrl(shortUrl);
//
//        assertEquals("/error", result);
//    }
//
//    @Test
//    public void testGetLongUrl() {
//        String shortUrl = "abcd1234";
//        String longUrl = "https://www.example.com";
//        Url url = new Url();
//        url.setShortUrl(shortUrl);
//        url.setLongUrl(longUrl);
//
//        when(urlRepository.findByShortUrl(shortUrl)).thenReturn(url);
//
//        String result = urlService.getLongUrl(shortUrl);
//
//        assertEquals(longUrl, result);
//    }
//
//    @Test
//    public void testGetLongUrlNotFound() {
//        String shortUrl = "abcd1234";
//
//        when(urlRepository.findByShortUrl(shortUrl)).thenReturn(null);
//
//        String result = urlService.getLongUrl(shortUrl);
//
//        assertNull(result);
//    }
//
//    @Test
//    public void testGenerateShortUrl() {
//        String shortUrl = urlService.generateShortUrl();
//        assertEquals(8, shortUrl.length());
//    }
}

