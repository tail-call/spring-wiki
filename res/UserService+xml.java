package com.example;

// Initialized with applicationContext.xml

public class UserService {
    private UserRepository userRepository;

    // Конструктор
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Методы для работы с пользователем
    public void addUser(User user) {
        userRepository.addUser(user);
    }

    public User getUserById(int userId) {
        return userRepository.getUserById(userId);
    }

    public void updateUser(User user) {
        userRepository.updateUser(user);
    }

    public void deleteUser(int userId) {
        userRepository.deleteUser(userId);
    }

    // Геттер и сеттер для userRepository
    public UserRepository getUserRepository() {
        return userRepository;
    }

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}