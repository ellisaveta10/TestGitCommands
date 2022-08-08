package com.example.maven;

import org.springframework.web.bind.annotation.RestController;

@RestController
<<<<<<< HEAD
=======

>>>>>>> 666c2b03bbe5ae840e7e5b32bbcd31d9b8103dfa
public class IndexController implements IndexRepository{

        @Override
        public void printMessage(String message) {
            message = "New message";
            System.out.println(message);
        }

        /**
         * This method prints the id and the name
         *
         * @param id
         * @param name
         */
        @Override
        public void printIdAndName(String id, String name) {
            id = "1";
            name = "Here is the service layer";
            System.out.println(id + " " + name);
        }
    }
<<<<<<< HEAD


    public static final int AGE = 22;
}
=======
>>>>>>> 666c2b03bbe5ae840e7e5b32bbcd31d9b8103dfa
