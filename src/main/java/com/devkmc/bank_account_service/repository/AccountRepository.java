package com.devkmc.bank_account_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devkmc.bank_account_service.entitiy.AccountUser;

public interface AccountRepository  extends JpaRepository<AccountUser, Long> {
    
}
