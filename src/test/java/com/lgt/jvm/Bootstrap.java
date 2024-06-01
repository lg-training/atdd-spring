package com.lgt.jvm;


import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(classes = Application.class)
@CucumberContextConfiguration
public class Bootstrap {


}
