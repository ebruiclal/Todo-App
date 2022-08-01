package com.example.springmysql;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.junit.jupiter.api.Assertions.*;

class AccessingDataMysqlApplicationTest {


    @SpringBootApplication
    public class AccessingDataMysqlApplication {

        public static void main(String[] args) {
            SpringApplication.run(AccessingDataMysqlApplication.class, args);
        }

    }

}