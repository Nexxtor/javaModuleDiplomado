package com.naldana;

import com.naldana.Connection;
import com.naldana.controllers.StudentController;

import java.sql.SQLException;

public class MainDB2 {

    public static void main(String[] args) {
        System.out.println("Maria DB");
        Connection.setDriver(Connection.MARIADB_DRIVER);



        StudentController students = new StudentController();

        try {
            Connection.getInstance().setUrl("//localhost:3001/NEXTOR");
            Connection.getInstance().setUser("root");
            Connection.getInstance().setPassword("root");
            System.out.println(students.getAll());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
