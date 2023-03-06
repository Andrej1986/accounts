package sk.soukupandrej.accounts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import sk.soukupandrej.accounts.model.Accounts;
import sk.soukupandrej.accounts.model.Customer;
import sk.soukupandrej.accounts.repository.AccountsRepository;

@RestController
public class AccountsController {
    @Autowired
    private AccountsRepository accountsRepository;

    @PostMapping("/myAccount")
    public Accounts getAccountDetail(@RequestBody Customer customer){
        return accountsRepository.findByCustomerId(customer.getCustomerId());
    }
}
