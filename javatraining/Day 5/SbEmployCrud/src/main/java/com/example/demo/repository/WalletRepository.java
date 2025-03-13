package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Wallet;

public interface WalletRepository extends JpaRepository<Wallet, Integer>{

}
