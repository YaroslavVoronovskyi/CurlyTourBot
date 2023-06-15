package com.gmail.voronovskyi.yaroslav.curlytourbot.service.impl;

import com.gmail.voronovskyi.yaroslav.curlytourbot.model.User;
import com.gmail.voronovskyi.yaroslav.curlytourbot.repository.IUserRepository;
import com.gmail.voronovskyi.yaroslav.curlytourbot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    private final IUserRepository userRepository;

    @Autowired
    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
