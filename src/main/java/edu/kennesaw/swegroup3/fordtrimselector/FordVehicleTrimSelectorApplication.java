package edu.kennesaw.swegroup3.fordtrimselector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FordVehicleTrimSelectorApplication {

    public static void main(String[] args) {
        SpringApplication.run(FordVehicleTrimSelectorApplication.class, args);
    }

    @GetMapping("/")
    public String apiRoot() {
        return "Welcome to the Ford Vehicle Trim Selector API!";
    }

    @GetMapping("/secured")
    public String secured() {
        return "This is a secured endpoint!";
    }


}
