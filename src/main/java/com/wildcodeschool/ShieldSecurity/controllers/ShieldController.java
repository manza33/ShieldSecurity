package com.wildcodeschool.ShieldSecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShieldController {

    @GetMapping("/")
    public String welcome(){
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String assemble(){
        return "Avengers... Assemble";
    }

    @GetMapping("/secret-bases")
    public String secretBases(){
       return "<ul>" +
                    "<li>Biarritz</li>" +
                    "<li>Bordeaux</li>" +
                    "<li>La Loupe</li>" +
                    "<li>Lille</li>" +
                    "<li>Lyon</li>" +
                    "<li>Marseille</li>" +
                    "<li>Nantes</li>" +
                    "<li>Orléans</li>" +
                    "<li>Paris</li>" +
                    "<li>Reims</li>" +
                    "<li>Strasbourg</li>" +
                    "<li>Toulouse</li>" +
                    "<li>Tours</li>" +
                    "<li>Berlin</li>" +
                    "<li>Bruxelles</li>" +
                    "<li>Bucarest</li>" +
                    "<li>Lisbonne</li>" +
                    "<li>Londres</li>" +
                    "<li>Madrid</li>" +
                "</ul>";
    }

}




