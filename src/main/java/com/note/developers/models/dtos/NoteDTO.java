package com.note.developers.models.dtos;

import jakarta.persistence.*;

@Entity(name = "note")
public class NoteDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

   @ManyToOne
   @JoinColumn(name = "user")
    public UserInfoDTO user;


   @Column(columnDefinition = "TEXT")
    public String code;

}
