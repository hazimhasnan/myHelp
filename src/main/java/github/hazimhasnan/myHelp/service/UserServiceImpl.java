package github.hazimhasnan.myHelp.service;

import github.hazimhasnan.myHelp.entity.UserEntity;
import github.hazimhasnan.myHelp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }
}
