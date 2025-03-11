package ru.job4j.collection.bank;

import java.util.Objects;

/**
 * Класс представляет банковский счет
 * Содержит информацию о реквизитах
 * @author Denis
 * @version 1.0
 */

public class Account {
    /**
     * Реквизиты счета
     */
    private String requisite;
    /**
     * Баланс счета
     */
    private double balance;

    /**
     * Конструктор инициализирует реквизиты и баланс счета.
     * @param requisite реквизиты счета.
     * @param balance баланс счета.
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Возвращает реквизиты счета.
     * @return реквизиты счета.
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Устанавливает реквизиты счета.
     * @param requisite реквизиты счета.
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Возвращает текущий баланс счета.
     * @return баланс счета.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Устанавливает новый баланс счета.
     * @param balance новый баланс счета.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Сравнивает текущий объект с другим объектом.
     * @param o объект дла сравнения.
     * @return true если объекты равны, иначе false.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * Возвращает хеш-код объекта.
     * @return хеш-код объекта.
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
