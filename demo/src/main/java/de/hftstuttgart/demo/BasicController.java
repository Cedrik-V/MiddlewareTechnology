package de.hftstuttgart.demo;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    private Logger logger = LoggerFactory.getLogger(BasicController.class);
    ArrayList<String> basicList = new ArrayList<String>();

    @GetMapping("/hello")
    public String index() {
        return "Hello, Cedrik!";
    }

    @GetMapping("/personalizedHello/{name}")
    @ResponseBody
    public String personalizedHello(@PathVariable String name) {
        logger.info("personalizedHello invoked ith parameter {}", name);
        return "Hello, " + name;
    }

    @GetMapping("/strings/get")
    @ResponseBody
    public String getAllStrings() {
        return basicList.toString();
    }


    @PutMapping("/strings/add/{newString}")
    @ResponseBody
    public String addNewString(@PathVariable String newString) {
        logger.debug(newString);
        basicList.add(newString);
        return newString + " added";
    }


}