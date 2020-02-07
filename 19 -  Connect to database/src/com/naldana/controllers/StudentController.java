package com.naldana.controllers;

import com.naldana.Connection;
import com.naldana.models.Student;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentController implements DatabaseController<Student> {

    @Override
    public void insert(Student insert) throws Exception {
        java.sql.Connection con = Connection.getInstance().getConnection();
        PreparedStatement preparedStatement =
                con.prepareStatement("INSERT INTO NEXTOR.Student (NAME,LAST_NAME)  VALUES(?,?)");
        preparedStatement.setString(1, insert.getName());
        preparedStatement.setString(2, insert.getLastName());

        preparedStatement.execute();

        preparedStatement.close();

        con.close();
    }

    @Override
    public void update(Student old, Student update) {

    }

    @Override
    public void delete(Student delete) {

    }

    @Override
    public List<Student> getAll() throws ClassNotFoundException, SQLException {
        String sql = "SELECT * FROM NEXTOR.Student";
        java.sql.Connection con = Connection.getInstance().getConnection();
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        ArrayList<Student> students = new ArrayList<>();

        while (resultSet.next()) {
            Student student = new Student();

            student.setId(resultSet.getLong("_id"));
            student.setName(resultSet.getString("name"));
            student.setLastName(resultSet.getString("last_name"));
            student.setCreatedAt(resultSet.getTimestamp("created_at"));
            student.setUpdatedAt(resultSet.getTimestamp("updated_at"));

            students.add(student);
        }

        if (resultSet != null) {
            resultSet.close();
        }

        statement.close();
        con.close();
        return students;
    }

    @Override
    public List<Student> getBy(String field, Student search) {
        return null;
    }
}
