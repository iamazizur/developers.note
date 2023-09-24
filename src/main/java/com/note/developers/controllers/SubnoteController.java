package com.note.developers.controllers;

import com.note.developers.models.dtos.SubNoteDTO;
import com.note.developers.repositories.SubnoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("api/v1/subnotes")
public class SubnoteController {
    private SubnoteRepository repository;
    @Autowired
    public SubnoteController(SubnoteRepository repository)
    {
        this.repository = repository;
    }

    @GetMapping("get")
    public Optional<SubNoteDTO> getById(@RequestParam Integer id){
        Optional<SubNoteDTO> byId = this.repository.findById(id);
        return byId;

    }
}
