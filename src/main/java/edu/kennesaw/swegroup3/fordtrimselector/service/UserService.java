package edu.kennesaw.swegroup3.fordtrimselector.service;

import edu.kennesaw.swegroup3.fordtrimselector.document.User;
import edu.kennesaw.swegroup3.fordtrimselector.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<User> findUserById(String id) {
        return userRepository.findById(id);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }
}