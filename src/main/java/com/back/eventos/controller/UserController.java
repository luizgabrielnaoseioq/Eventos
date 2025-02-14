package com.back.eventos.controller;

import com.back.eventos.dto.UserDTO;
import com.back.eventos.entity.User;
import com.back.eventos.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/test")
    public String getUser() {
        return "testar retorno";
    }

    @PostMapping("/createUser")
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO) {
        User user = new User(userDTO.getName(),
                userDTO.getEmail(),
                userDTO.getPassword(),
                userDTO.getCpf(),
                userDTO.getBirthDate(),
                userDTO.getPerfil(),
                userDTO.getIsVerified());
        userRepository.save(user);
        return ResponseEntity.ok(userDTO);
    }
}