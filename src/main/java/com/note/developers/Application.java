package com.note.developers;

import com.note.developers.models.dtos.NoteDTO;
import com.note.developers.models.dtos.UserInfoDTO;
import com.note.developers.repositories.NoteRepository;
import com.note.developers.repositories.UserInfoRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext config = SpringApplication.run(Application.class, args);

	}

}
