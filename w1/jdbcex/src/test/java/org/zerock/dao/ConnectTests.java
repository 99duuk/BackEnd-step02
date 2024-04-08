package org.zerock.dao;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectTests {

    @Test
    public void testHikariCP() throws Exception{

        HikariConfig config = new HikariConfig();
        config.setDriverClassName("org.mariadb.jdbc.Driver");
        config.setJdbcUrl("jdbc:mariadb://localhost:5306/webdb");
        config.setUsername("duuk");
        config.setPassword("1234");
        config.addDataSourceProperty("cashPrepstmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepsStmtCacheSqlLimit", "2048");

        HikariDataSource ds = new HikariDataSource();
        Connection connection = ds.getConnection();

        connection.close();

    }

}
