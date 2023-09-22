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
                "<h2> Skills to Learn: </h2>" +
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
                "<form action='/results' method='POST'>" +
                "<table>" +
                "<tr><td><b><em>Enter Your Name </em></b></td><td><input name='name' type='text' label='name'></input></td></tr><br/>" +

                "<tr><td><b>Select Most Fav Langauge!</b></td>" +
                "<td><select name='fav1' id='fav1'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select></td></tr>" +
                "<tr><td><b>Select Your Second Fav Langauge!</b></td>" +
                "<td><select name='fav2' id='fav2'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select></td></tr>" +
                "<tr><td><b>Select Your Third Fav Langauge!</b></td>" +
                "<td><select name='fav3' id='fav3'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select></tr></table>" +
                "<br/>" +
                "<input type='submit' name='submit' />" +
                "</form>" +
                "</body>" +
                "</html>";

    }

    @PostMapping("/results")
    public String displayUserChoices(@RequestParam String name, String fav1, String fav2, String fav3){


        return "<html>" +
                "<body>" +
                "<h1>"+ name + "</h1>" +
                "My skills in order of preference are:<br/><br/>" +
                "<table border='1'>" +
                "<tr><td> Most favorite </td><td>" +fav1 +"</td></tr>" +
                "<tr><td> Second favorite </td><td>" +fav2 +"</td></tr>" +
                "<tr><td> Third favorite </td><td>" +fav3 +"</td></tr>" +
                "</table>"+
                "</body>" +
                "</html>";

    }
}
