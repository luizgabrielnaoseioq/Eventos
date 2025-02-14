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
}
