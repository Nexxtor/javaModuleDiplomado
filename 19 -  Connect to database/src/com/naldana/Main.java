package com.naldana;

import com.naldana.controllers.StudentController;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        System.out.println("DB2");
        Connection.setDriver(Connection.BD2_DRIVER);



        StudentController students = new StudentController();

        try {
            Connection.getInstance().setUrl("//localhost:50000/dama");
            Connection.getInstance().setUser("db2inst1");
            Connection.getInstance().setPassword("root");
            System.out.println(students.getAll());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
