package com.note.developers.models.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.note.developers.models.dtos.NoteDTO;
import com.note.developers.models.dtos.UserInfoDTO;
import jakarta.persistence.*;

@Entity(name = "subnote")
public class SubNoteDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;


    @ManyToOne
    @JoinColumn(name = "note_id")
    @JsonIgnore
    public NoteDTO note;

    public String heading;
   @Column(columnDefinition = "TEXT")
    public String description;
   @Column(columnDefinition = "TEXT")
   public String code;
}
