package cn.wilmar.ureport.report.jpa;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;

import com.bstek.ureport.definition.datasource.BuildinDatasource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class TestBuildinDatasource implements BuildinDatasource {
    private DataSource datasource1;
    public String name() {
        return "内置数据源DENO";
    }
    public Connection getConnection() {
        try {
            return datasource1.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void setDatasource(DataSource datasource) {
        this.datasource1 = datasource;
    }
}