package net.rumq.hospitalsbproject.databaseConnection;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class SeedDb {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @PostConstruct
    public void init(){
        jdbcTemplate.update("insert into HOSPITALS (name, city) values (?, ?)", new Object[]{"Mother Tereza", "Tirane"});
    }
}
