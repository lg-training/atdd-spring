package com.lgt.jvm;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.KafkaContainer;
import org.testcontainers.containers.PostgreSQLContainer;


public class CucumberHooks {
/*
    @Autowired
    private PostgreSQLContainer<?> postgreSQLContainer;

    @Autowired
    private KafkaContainer kafkaContainer;



    @Before
    public void setUp() {
        System.out.println("******************************************** STARTTTTTT ");
        // Arrancar los contenedores si es necesario
        if (!postgreSQLContainer.isRunning()) {
            System.out.println("// Start 1");
            postgreSQLContainer.start();
        }
        if (!kafkaContainer.isRunning()) {
            System.out.println("// Start 2");
            kafkaContainer.start();
        }

    }

    @After
    public void tearDown() {
        System.out.println("******************************************** END ");
        if (kafkaContainer.isRunning()) {
            System.out.println("// Detener los contenedores después de las pruebas 2");
            kafkaContainer.stop();
        }
        if (postgreSQLContainer.isRunning()) {
            System.out.println("// Detener los contenedores después de las pruebas 3");
            postgreSQLContainer.stop();
        }



        System.out.println("******************************************** ENDDDDDD ");
    }*/
}
