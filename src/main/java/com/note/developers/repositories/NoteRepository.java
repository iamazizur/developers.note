package com.note.developers.repositories;

import com.note.developers.models.dtos.NoteDTO;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NoteRepository extends CrudRepository<NoteDTO,Integer> {
    List<NoteDTO> findByUser_Id(Integer userId);
}
