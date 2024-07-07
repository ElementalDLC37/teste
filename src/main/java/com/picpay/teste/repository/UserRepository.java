package com.picpay.teste.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.picpay.teste.model.UserModel;


public interface UserRepository extends JpaRepository<UserModel, Long> {

    public Optional<UserModel> findUserById(Long id);
    
    public Optional<UserModel> findUserByDocument(String document);
    
}
