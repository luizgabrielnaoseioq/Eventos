package com.back.eventos.dto;

import lombok.Data;
import java.util.Date;

@Data
public class UserDTO {
    private Long id;
    private String name;
    private String email;
    private String password;
    private String cpf;
    private Date birthDate;
    private String perfil;
    private Boolean isVerified;

    public UserDTO(Long id, String name, String email, String password, String cpf, Date birthDate, String perfil, Boolean isVerified) {
    }
}
