package ru.job4j.collection.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());

    }

    public void deleteUser(String passport) {
        users.remove(findByPassport(passport));
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> list = getAccounts(user);
             if (!list.contains(account)) {
                 list.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        for (User users : users.keySet()) {
            if (users.getPassport().equals(passport)) {
                return users;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> list = getAccounts(user);
            for (Account account : list) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String sourcePassport, String sourceRequisite,
                                 String destinationPassport, String destinationRequisite,
                                 double amount) {
        boolean result = false;
        Account sourseAccount = findByRequisite(sourcePassport, sourceRequisite);
            if (sourseAccount == null || sourseAccount.getBalance() < amount) {

        return result;
    }
            Account destinationAccount = findByRequisite(destinationPassport, destinationRequisite);
            if (destinationAccount != null) {
               destinationAccount.setBalance(destinationAccount.getBalance() + amount);
                sourseAccount.setBalance(sourseAccount.getBalance() - amount);
                result = true;
            }
            return result;
    }

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
