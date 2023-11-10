package kiosk.common;

import io.cucumber.spring.CucumberContextConfiguration;
import kiosk.OrderstatusApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { OrderstatusApplication.class })
public class CucumberSpingConfiguration {}
