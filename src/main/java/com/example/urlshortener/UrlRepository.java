package com.example.urlshortener;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlRepository extends JpaRepository<Long, Url> {

    Url findByShortUrl(Url shortUrl);
}
