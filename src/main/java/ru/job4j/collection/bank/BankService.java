package ru.job4j.collection.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу банковского сервиса , который добавляет,
 * удаляет, пользователей их аккаунтов и перевод средств между счетами.
 * @author Denis
 * @version 1.0
 */
public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Добавляет нового пользователя в систему.
     * Если пользователь с таким паспортом уже существует, новый пользователь не добавляется.
     * @param user Объект пользователя {@link User}, которого необходимо добавить.
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());

    }

    /**
     * Удаляет пользователя из системы по номеру паспорта.
     * @param passport номер паспорта пользователя, которого необходимо удалить.
     */
    public void deleteUser(String passport) {
        users.remove(findByPassport(passport));
    }

    /**
     * Добавляет новый счет к пользователю по номеру паспорта.
     * Если пользователь не найден или у него уже есть такой счет, операция не выполняется.
     * @param passport номер паспорта пользователя.
     * @param account добавляемый счет.
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> list = getAccounts(user);
             if (!list.contains(account)) {
                 list.add(account);
            }
        }
    }

    /**
     * Ищет пользователя по номеру паспорта.
     * @param passport номер паспорта пользователя.
     * @return пользователь с указанным паспортом или null, если пользователь не найден.
     */
    public User findByPassport(String passport) {
        for (User users : users.keySet()) {
            if (users.getPassport().equals(passport)) {
                return users;
            }
        }
        return null;
    }

    /**
     * Ищет счет пользователя по номеру паспорта и реквизитам.
     * @param passport Паспорт пользователя, которого необходимо найти.
     * @param requisite Реквизиты счета.
     * @return Объект пользователя {@link User}, если пользователь найден, иначе null.
     */
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

    /**
     * Выполняет перевод денег с одного счета на другой.
     * @param sourcePassport Паспорт пользователя, со счета которого переводятся деньги.
     * @param sourceRequisite Реквизиты счета, с которого переводятся деньги.
     * @param destinationPassport Паспорт пользователя, на счет которого переводятся деньги.
     * @param destinationRequisite Реквизиты счета, на который переводятся деньги.
     * @param amount Сумма перевода.
     * @return true, если перевод выполнен успешно, иначе false.
     */
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

    /**
     * Возвращает список счетов пользователя.
     * @param user Объект пользователя {@link User}, для которого необходимо получить список счетов.
     * @return Список счетов {@link Account} пользователя.
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
