package com.example.jav20201.buoi3.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Login {
    @NotBlank(message = "Username khong duoc de trong")
    private String username;
    private String password;
//    @NotNull(message = "remember khong duoc de trong")
    private Boolean remember;
}
