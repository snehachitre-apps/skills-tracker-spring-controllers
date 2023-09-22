package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {


    @GetMapping("/")
    public String displayHomePage(){

        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2> Three Languages</h2>" +
                "<ol>" +
                "<li>JavaScript</li>" +
                "<li>Java</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";

    }

    @GetMapping("/form")
    public String displayForm(){

        return "<html>" +
                "<body>" +
                "<form action='/form' method='POST'>" +
                "Enter Your Name <br/><input name='name' type='text' label='name'></input>" +

                "<h3>Select Most Fav Langauge!</h3>" +
                "<select name='fav1' id='fav1'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<h3>Select Your Second Fav Langauge!</h3>" +
                "<select name='fav2' id='fav2'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<h3>Select Your Third Fav Langauge!</h3>" +
                "<select name='fav3' id='fav3'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br/>" +
                "<input type='submit' name='submit' />" +
                "</form>" +
                "</body>" +
                "</html>";

    }

    @PostMapping("/form")
    public String displayUserChoices(@RequestParam String name, String fav1, String fav2, String fav3){


        return "<html>" +
                "<body>" +
                "<h1>"+ name + "</h1>" +
                "<ol>" +
                "<li> " +fav1 +"</li>" +
                "<li> " +fav2 +"</li>" +
                "<li> " +fav3 +"</li>" +
                "</ol>"+
                "</body>" +
                "</html>";

    }
}
