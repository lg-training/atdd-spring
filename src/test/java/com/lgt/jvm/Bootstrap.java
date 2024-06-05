package com.lgt.jvm;


import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.testcontainers.containers.KafkaContainer;
import org.testcontainers.containers.Network;

import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.lifecycle.Startables;
import org.testcontainers.utility.DockerImageName;


@CucumberContextConfiguration
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class Bootstrap {

    static PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>(DockerImageName.parse("postgres:16.3"));

    //private static final Logger log = LoggerFactory.getLogger(Bootstrap.class);


    //static PostgreSQLContainer postgreSQLContainer;
    //static KafkaContainer kafkaContainer;



    @BeforeAll
    public static void init() {
        postgres.start();
        System.out.println("Init config*****************************");
    /*    DockerImageName dockerImageName = DockerImageName.parse("confluentinc/cp-kafka:7.6.1");

        try {
                kafkaContainer = new KafkaContainer(dockerImageName);
            kafkaContainer.start();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }*/


    }

    @AfterAll
    public static void tearDown() {
        System.out.println("**************************ENDDDD");
       // System.out.println("End config*****************************" + kafkaContainer.getContainerId());
        postgres.stop();
       // kafkaContainer.stop();
    }
}
