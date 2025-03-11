package ru.job4j.collection.bank;

import java.util.Objects;

/**
 * Класс User представляет пользователя банка.
 * Содержит информацию о паспорте и имени пользователя.
 * @author Denis
 * @version 1.0
 */
public class User {
    /**
     * Паспорт пользователя.
     */
    private String passport;
    /**
     * Имя пользователя.
     */
    private String username;

    /**
     * Конструктор для создания нового пользователя.
     * @param passport номер паспорта пользователя.
     * @param username имя пользователя.
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Возвращает паспорт пользователя.
     * @return Паспорт пользователя
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Устанавливает паспорт пользователя.
     * @param passport Паспорт пользователя.
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Возвращает имя пользователя.
     * @return Имя пользователя.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Устанавливает имя пользователя.
     * @param username Имя пользователя.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Сравнивает текущий объект User с другим объектом.
     * Объекты считаются равными, если у них совпадают паспорта.
     * @param o Объект, с которым производится сравнение.
     * @return true, если объекты равны, иначе false.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Возвращает хеш-код объекта User на основе его паспорта.
     * @return Хеш-код объекта User.
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
