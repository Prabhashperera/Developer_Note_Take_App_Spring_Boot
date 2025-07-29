package org.app.dev_note_taking_app.service;

import org.app.dev_note_taking_app.dto.NoteDto;
import org.app.dev_note_taking_app.entity.NoteEntity;

public interface NoteService{
    NoteEntity saveNote(NoteDto note);
    NoteEntity updateNote(NoteDto note);
    String deleteNote(int note);
}
