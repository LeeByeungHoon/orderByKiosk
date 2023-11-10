package kiosk.common;

import io.cucumber.spring.CucumberContextConfiguration;
import kiosk.CookApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { CookApplication.class })
public class CucumberSpingConfiguration {}
