package com.note.developers.controllers;


import com.note.developers.models.dtos.NoteDTO;
import com.note.developers.models.dtos.SubNoteDTO;
import com.note.developers.repositories.NoteRepository;
import com.note.developers.repositories.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
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

        if(note.id == 0)
            note.creationTime = LocalDateTime.now();
        if(note.subnotes != null){
            for(SubNoteDTO subnote : note.subnotes){
                subnote.note = note;
            }
        }


        NoteDTO save = this.noteRepository.save(note);


    }

    @GetMapping(path = "get")
    public Optional<NoteDTO> getById(@RequestParam Integer id){
        Optional<NoteDTO> noteById = this.noteRepository.findById((int)id);
        return noteById;

    }

    @PostMapping(path = "update")
    public ResponseEntity<NoteDTO> update(@RequestBody NoteDTO note){
        Optional<NoteDTO> noteFromDb = this.noteRepository.findById(note.id);
        if(noteFromDb.isPresent() == false){
            return ResponseEntity.badRequest().body(null);
        }
        noteFromDb.get().code = note.code;
        NoteDTO save = this.noteRepository.save(noteFromDb.get());

        return ResponseEntity.ok(save);

    }

}
