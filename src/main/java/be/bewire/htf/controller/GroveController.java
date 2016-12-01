package be.bewire.htf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

import be.bewire.htf.service.api.GroveService;

@RestController
public class GroveController {
    private final GroveService groveService;

    @Autowired
    public GroveController(GroveService groveService) {
        this.groveService = groveService;
    }

    @RequestMapping(value = "/led", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public void toggleLed() throws IOException {
        groveService.toggleLed();
    }
}