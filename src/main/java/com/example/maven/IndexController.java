package com.example.maven;

import org.springframework.web.bind.annotation.RestController;

@RestController
<<<<<<< HEAD
public class IndexController {
    double index;
=======
public class IndexController implements IndexRepository{

    @Override
    public void printMessage(String message) {
        message = "New message";
        System.out.println(message);
    }

    /**
     * This method prints the id and the name
     * @param id
     * @param name
     */
    @Override
    public void printIdAndName(String id, String name) {
        id = "1";
        name = "Here is the service layer";
        System.out.println(id + " " + name);
    }


>>>>>>> bc208bf5c4e16adf0d3ade99c6c882a9efa0c7ca
}
