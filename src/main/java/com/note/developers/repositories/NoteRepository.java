package com.note.developers.repositories;

import com.note.developers.models.dtos.NoteDTO;
import org.springframework.data.repository.CrudRepository;

public interface NoteRepository extends CrudRepository<NoteDTO,Integer> {
}
