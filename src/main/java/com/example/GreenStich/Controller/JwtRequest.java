package com.example.GreenStich.Controller;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class JwtRequest
{
    private String email;
    private String password;
}
