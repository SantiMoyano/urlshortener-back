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

    @Mock
    private UrlRepository urlRepository;

    @InjectMocks
    private UrlService urlService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGenerateUrl() {
        String longUrl = "https://www.example.com";
        String shortUrl = "abcd1234";

        // Mocking generateShortUrl method
        UrlService spyUrlService = spy(urlService);
        doReturn(shortUrl).when(spyUrlService).generateShortUrl();

        // Perform the test
        String generatedShortUrl = spyUrlService.generateUrl(longUrl);

        verify(urlRepository, times(1)).save(any(Url.class));

        assertEquals(shortUrl, generatedShortUrl);
    }

    @Test
    public void testGenerateShortUrl() {
        UrlService urlService = new UrlService();
        String longUrl = "https://www.example.com";
        String shortUrl = urlService.generateShortUrl();
        assertEquals(8, shortUrl.length());
    }

    @Test
    public void testGetLongUrl() {
        String shortUrl = "abcd1234";
        String longUrl = "https://www.example.com";
        Url url = new Url();
        url.setShortUrl(shortUrl);
        url.setLongUrl(longUrl);

        when(urlRepository.findByShortUrl(shortUrl)).thenReturn(url);

        String result = urlService.getLongUrl(shortUrl);

        assertEquals(longUrl, result);
    }

    @Test
    public void testGetLongUrlNotFound() {
        String shortUrl = "abcd1234";

        when(urlRepository.findByShortUrl(shortUrl)).thenReturn(null);

        String result = urlService.getLongUrl(shortUrl);

        assertNull(result);
    }
}
