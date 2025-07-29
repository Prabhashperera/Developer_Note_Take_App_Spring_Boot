package org.app.dev_note_taking_app.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.app.dev_note_taking_app.dto.NoteDto;
import org.app.dev_note_taking_app.entity.NoteEntity;
import org.app.dev_note_taking_app.service.NoteService;
import org.app.dev_note_taking_app.util.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/note")
@RequiredArgsConstructor
public class NoteController {
    private final NoteService noteService;

    @PostMapping("save")
    public ResponseEntity<ApiResponse> saveNote(@Valid @RequestBody NoteDto note) {
        NoteEntity noteEntity = noteService.saveNote(note);
        if (noteEntity == null) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
        return ResponseEntity.ok(
                new ApiResponse("Job Saved", HttpStatus.OK, note)
        );
    }
}
