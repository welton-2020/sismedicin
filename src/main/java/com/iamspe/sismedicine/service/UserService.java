package com.iamspe.sismedicine.service;

import com.iamspe.sismedicine.dto.response.MessageRersponseDTO;
import com.iamspe.sismedicine.entity.User;
import com.iamspe.sismedicine.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {


    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public MessageRersponseDTO createUser(User user) {
        User savedUser = userRepository.save(user);
        return  MessageRersponseDTO
                .builder()
               .message("Created user with ID" + savedUser.getId())
               .build();
    }
}
