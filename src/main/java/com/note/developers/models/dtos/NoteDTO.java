package com.note.developers.models.dtos;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity(name = "note")
public class NoteDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

   @ManyToOne
   @JoinColumn(name = "user")
    public UserInfoDTO user;


   @Column(name="title",nullable = false)
   public String title;

   @Column(name = "description", columnDefinition = "TEXT")
   public String description;


   @Column(columnDefinition = "TEXT")
    public String code;

   @Column(columnDefinition = "datetime default CURRENT_TIMESTAMP")
   public LocalDateTime creationTime;

}
