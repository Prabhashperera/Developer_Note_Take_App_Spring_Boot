package org.app.dev_note_taking_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/note")
public class NoteController {
    @GetMapping("get")
    public String getRequest() {
        return "Hello";
    }
}
