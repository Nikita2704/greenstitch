package com.example.GreenStich.Services;

import com.example.GreenStich.DTO.UserRequestDto;
import com.example.GreenStich.Models.User;
import com.example.GreenStich.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServices
{
    @Autowired
    UserRepository userRepository;



    public ResponseEntity<String> addUser(UserRequestDto userRequestDto) throws UserAlreadyExistException {
        if(userRepository.findByUname(userRequestDto.getUname())!=null)
        {
            throw new UserAlreadyExistException("User already exists in Db");
        }
        User user=new User();
        user.setUname(userRequestDto.getUname());
        user.setEmail(userRequestDto.getEmail());
        userRepository.save(user);

        return new ResponseEntity<String>(HttpStatus.OK);
    }
}
