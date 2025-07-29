package org.app.dev_note_taking_app.service;

import org.app.dev_note_taking_app.dto.NoteDto;

public interface NoteService{
    String saveNote(NoteDto note);
}
