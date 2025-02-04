package com.example.FileSharingApp.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping()  //end points
public class filecontroller {
    @GetMapping("/files")
    public String login() {
        return "home";
    }
    @GetMapping("/list")
    public String file() {
        return "list-files";
    }
    @GetMapping("/share")
    public String share() {
        return "share-file";
    }
}
