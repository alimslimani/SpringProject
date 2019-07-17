package com.project.spring.cache.main;

import com.project.spring.cache.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(AppRunner.class);

    private final BookRepository bookRepository;

    public AppRunner(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info(".... Cacheable books");
        logger.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));
        logger.info("isbn-4567 -->" + bookRepository.getByIsbn("isbn-4567"));
        logger.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));
        logger.info("isbn-4567 -->" + bookRepository.getByIsbn("isbn-4567"));
        logger.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));
        logger.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));


        logger.info(".... CacheEvict books");
        logger.info("isbn-1234Evict -->" + bookRepository.getByIsbnToEvict("isbn-1234Evict"));
        logger.info("isbn-4567Evict -->" + bookRepository.getByIsbnToEvict("isbn-4567Evict"));
        logger.info("isbn-1234Evict -->" + bookRepository.getByIsbnToEvict("isbn-1234Evict"));
        logger.info("isbn-4567Evict -->" + bookRepository.getByIsbnToEvict("isbn-4567Evict"));
        logger.info("isbn-1234Evict -->" + bookRepository.getByIsbnToEvict("isbn-1234Evict"));
        logger.info("isbn-1234Evict -->" + bookRepository.getByIsbnToEvict("isbn-1234Evict"));
    }

}