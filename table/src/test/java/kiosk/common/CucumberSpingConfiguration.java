package kiosk.common;

import io.cucumber.spring.CucumberContextConfiguration;
import kiosk.TableApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { TableApplication.class })
public class CucumberSpingConfiguration {}
