package net.rumq.hospitalsbproject.restService;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class SeedDb {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @PostConstruct
    public void init(){
        jdbcTemplate.update("insert into HOSPITALS (id, name, city) values (?, ?, ?)", new Object[]{1, "Mother Tereza", "Tirane"});
        jdbcTemplate.update("insert into HOSPITALS (id, name, city) values (?, ?, ?)", new Object[]{2, "The Military Hospital", "Tirane"});
        jdbcTemplate.update("insert into HOSPITALS (id, name, city) values (?, ?, ?)", new Object[]{3, "The American Hospital", "Fier"});
    }
}
