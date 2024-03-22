package com.weavus.banking.account.service;

import com.weavus.banking.account.entity.AccountEntity;
import com.weavus.banking.dao.AccountDao;
import com.weavus.banking.dto.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountDao accountDao;


    public List<AccountEntity> getAccountInfo(String id) {
        List<Account> accountList =  accountDao.findByUserId(id);

        List<AccountEntity> accountEntities = new ArrayList<>();

        for(Account account : accountList) {
            AccountEntity accountEntity = new AccountEntity();
            accountEntity.setAccount(account.getAccount());
            accountEntity.setBranchName("신주쿠");
            accountEntity.setBrandCode(account.getBranchCode());
            accountEntity.setAmount(account.getAmount());
            accountEntities.add(accountEntity);
        }

        return accountEntities;


    }
}
