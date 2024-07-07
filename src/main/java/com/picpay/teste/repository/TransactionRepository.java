package com.picpay.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.picpay.teste.model.TransactionModel;

public interface TransactionRepository extends JpaRepository<TransactionModel, Long> {
    
}
