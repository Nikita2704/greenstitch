package com.example.GreenStich.Controller;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class JwtResponse
{
    private String jwtToken;
    private String username;
}
