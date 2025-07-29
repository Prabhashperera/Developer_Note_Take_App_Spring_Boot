package org.app.dev_note_taking_app.controller;

import lombok.RequiredArgsConstructor;
import org.app.dev_note_taking_app.dto.NoteDto;
import org.app.dev_note_taking_app.service.NoteService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/note")
@RequiredArgsConstructor
public class NoteController {
    private final NoteService noteService;

    @PostMapping("save")
    public String getRequest(@RequestBody NoteDto note) {
        return noteService.saveNote(note);
    }
}
