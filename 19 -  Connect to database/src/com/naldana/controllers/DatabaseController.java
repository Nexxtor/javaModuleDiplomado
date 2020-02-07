package com.naldana.controllers;

import java.sql.SQLException;
import java.util.List;

public interface DatabaseController<T> {
    void insert(T insert) throws Exception;

    void update(T old, T update);

    void delete(T delete);

    List<T> getAll() throws Exception;

    List<T> getBy(String field, T search);
}
