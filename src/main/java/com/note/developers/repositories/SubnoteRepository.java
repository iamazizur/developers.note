package com.note.developers.repositories;

import com.note.developers.models.dtos.SubNoteDTO;
import org.springframework.data.repository.CrudRepository;

public interface SubnoteRepository extends CrudRepository<SubNoteDTO,Integer> {
}
