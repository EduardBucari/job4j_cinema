package ru.job4j.store;

import ru.job4j.model.Account;
import ru.job4j.model.Ticket;

import java.sql.SQLException;
import java.util.Collection;

public interface Store {

    Collection<Ticket> findAllTicket();

    void save(Ticket ticket) throws SQLException;

    int save(Account account) throws SQLException;

    Ticket findByTicket(int id);
}
