package com.note.developers.controllers;


import com.note.developers.models.dtos.NoteDTO;
import com.note.developers.models.dtos.UserInfoDTO;
import com.note.developers.repositories.NoteRepository;
import com.note.developers.repositories.UserInfoRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/notes")
public class NoteController {

    private final NoteRepository noteRepository;
    private final UserInfoRepository userRepo;

    @Autowired
    public NoteController(NoteRepository repo, UserInfoRepository userRepo){
        this.noteRepository = repo;
        this.userRepo = userRepo;
    }

    @PostMapping(path = "create")
    public void create(@RequestBody NoteDTO note){

        if(note == null || note.user == null || note.user.id == 0){
            return;
        }


        NoteDTO save = this.noteRepository.save(note);


    }

    @GetMapping(path = "get")
    public Optional<NoteDTO> getById(@RequestParam Integer id){
        Optional<NoteDTO> noteById = this.noteRepository.findById((int)id);
        return noteById;
    }
}
