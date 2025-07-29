package org.app.dev_note_taking_app.service.impl;

import lombok.RequiredArgsConstructor;
import org.app.dev_note_taking_app.dto.NoteDto;
import org.app.dev_note_taking_app.entity.NoteEntity;
import org.app.dev_note_taking_app.repo.NoteRepo;
import org.app.dev_note_taking_app.service.NoteService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class NoteServiceImpl implements NoteService {
    private final NoteRepo noteRepo;
    private final ModelMapper modelMapper;

    @Override
    public String saveNote(NoteDto note) {
        noteRepo.save(modelMapper.map(note, NoteEntity.class));
        return "Note saved";
    }
}
