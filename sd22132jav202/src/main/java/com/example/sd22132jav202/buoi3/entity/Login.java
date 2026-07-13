package com.example.sd22132jav202.buoi3.entity;

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
    @NotBlank(message = "Khong duoc de trong username")
    private String username;
    private String password;
    @NotNull(message = "Khong duoc de trong remember")
    private Boolean remember;
}
