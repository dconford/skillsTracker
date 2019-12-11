package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    // Handles Requests at path (localhost:8080/)
    @RequestMapping(value = "/")
    public String skills() {
        String landingPage = "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>\n" +
                "<h2>We have a few skills we'd like you to learn. Here is the list</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>HTML</li>" +
                "<li>CSS</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "<li>Ruby</li>" +
                "<li>PHP</li>" +
                "</ol>" +
                "</body>" +
                "</html>";

        return landingPage;
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    //@RequestMapping(method= {RequestMethod.GET, RequestMethod.POST}, value= "/form")
    //@GetMapping("/form")
    public String skillsForm() {
        String languageChoice =  "    <option value='Java'>Java</option>\n" +
                "    <option value='HTML'>HTML</option>\n" +
                "    <option value='CSS'>CSS</option>\n" +
                "    <option value='JavaScript'>JavaScript</option>\n" +
                "    <option value='Python'>Python</option>\n" +
                "    <option value='Ruby'>Ruby</option>\n" +
                "    <option value='PHP'>PHP</option>\n";


        String gimmeLine =  "<html>" +
                "<body>" +
                "<form method= 'post' action= 'form'>" +
                "<label for= 'name'>Name: </label><br>" +
                "<input type= 'text' id= 'name' name= 'name' required><br>" +
                "<label for= 'firstChoice'>My favorite language: </label><br>" +
                "<select name= 'firstChoice'><br>" +
                languageChoice +
                "</select><br>" +
                "<label for= 'secondChoice'>My second favorite language: </label><br>" +
                "<select name= 'secondChoice'><br>" +
                languageChoice +
                "</select><br>" +
                "<label for= 'thirdChoice'>My third favorite language: </label><br>" +
                "<select name= 'thirdChoice'><br>" +
                languageChoice +
                "</select><br>" +
                "<input type= 'submit' value= 'Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";

        return gimmeLine;

    }




    @RequestMapping(value = "/form", method = RequestMethod.POST)
    //@PostMapping("createMessage")
    public String createMessage(@RequestParam String firstChoice,
                                @RequestParam String secondChoice,
                                @RequestParam String thirdChoice,
                                @RequestParam String name) {

        String formResponse = "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstChoice + "</li>" +
                "<li>" + secondChoice + "</li>" +
                "<li>" + thirdChoice + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
        return  formResponse;
    }
}
