package com.example.CRUD.Controller;

import com.example.CRUD.Entity.User;
import com.example.CRUD.Repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return repository.save(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        User existingUser = repository.findById(id).orElse(null);
        if (existingUser != null) {
            existingUser.setFirstName(user.getFirstName());
            existingUser.setLastName(user.getLastName());
            existingUser.setAge(user.getAge());
            existingUser.setGender(user.getGender());
            existingUser.setCountry(user.getCountry());
            existingUser.setResidence(user.getResidence());
            existingUser.setEntryExam(user.getEntryExam());
            existingUser.setPrevEducation(user.getPrevEducation());
            existingUser.setStudyHours(user.getStudyHours());
            existingUser.setPython(user.getPython());
            existingUser.setDb(user.getDb());
            return repository.save(existingUser);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        repository.deleteById(id);
        return "Deleted user with id: " + id;
    }
}
