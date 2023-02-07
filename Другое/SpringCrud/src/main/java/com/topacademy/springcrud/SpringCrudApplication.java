package com.topacademy.springcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;

@SpringBootApplication
@Configuration
public class SpringCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCrudApplication.class, args);
        System.out.println("Sql select");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            System.out.println("Sql select");

        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/MyHomeDb", "root", "Tdutbq21@sql");

            System.out.println("Sql select");
            connection.close();
        } catch (Exception e) {
            System.out.println("Connection failed");
       }
    }

}
