package com.deushdezt.controllers;

public interface Manageable {
    boolean register();

    boolean update(String code);

    boolean delete(String code);

    void showAll();
}
