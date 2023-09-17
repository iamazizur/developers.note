package com.note.developers.repositories;

import com.note.developers.models.dtos.UserInfoDTO;
import org.springframework.data.repository.CrudRepository;

public interface UserInfoRepository extends CrudRepository<UserInfoDTO,Integer> {
}
