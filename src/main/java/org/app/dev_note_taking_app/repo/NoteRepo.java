package org.app.dev_note_taking_app.repo;

import org.app.dev_note_taking_app.entity.NoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepo extends JpaRepository<NoteEntity, Integer> {
}
