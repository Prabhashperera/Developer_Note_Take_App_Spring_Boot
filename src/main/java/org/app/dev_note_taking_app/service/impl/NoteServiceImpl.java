package org.app.dev_note_taking_app.service.impl;

import lombok.RequiredArgsConstructor;
import org.app.dev_note_taking_app.Exception.ResourceNotFoundException;
import org.app.dev_note_taking_app.dto.NoteDto;
import org.app.dev_note_taking_app.entity.NoteEntity;
import org.app.dev_note_taking_app.repo.NoteRepo;
import org.app.dev_note_taking_app.service.NoteService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class NoteServiceImpl implements NoteService {
    private final NoteRepo noteRepo;
    private final ModelMapper modelMapper;

    @Override
    public NoteEntity saveNote(NoteDto note) {
        return noteRepo.save(modelMapper.map(note, NoteEntity.class));
    }

    @Override
    public NoteEntity updateNote(NoteDto note) {
        boolean isExists = noteRepo.existsById(note.getNoteId());
        if (!isExists) {
            throw new ResourceNotFoundException("Note Not exists!");
        }
        return noteRepo.save(modelMapper.map(note, NoteEntity.class));
    }

    @Override
    public String deleteNote(int note) {
        if (noteRepo.existsById(note)) {
            noteRepo.deleteById(note);
        }else {
            throw new ResourceNotFoundException("Note Not exists!");
        }
        return "Note Deleted";
    }
}
