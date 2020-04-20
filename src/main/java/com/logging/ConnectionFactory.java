package com.logging;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

/*
create table APP_LOGS(
    LOG_ID varchar(100) primary key,
    ENTRY_DATE timestamp,
    LOGGER varchar(100),
    LOG_LEVEL varchar(100),
    MESSAGE TEXT,
    EXCEPTION TEXT
);
 */

public class ConnectionFactory {
    private static BasicDataSource dataSource;
    private static final String USER = "root";
    private static final String PASS = "root";

    private ConnectionFactory() {
    }

    public static Connection getConnection() throws SQLException {
        if (dataSource == null) {
            dataSource = new BasicDataSource();
            dataSource.setUrl("jdbc:mysql://localhost:3306/logs");
            dataSource.setDriverClassName("org.mariadb.jdbc.Driver");
            dataSource.setUsername(USER);
            dataSource.setPassword(PASS);
        }
        return dataSource.getConnection();
    }
}