package com.back.eventos.repository;

import com.back.eventos.dto.UserDTO;
import com.back.eventos.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
