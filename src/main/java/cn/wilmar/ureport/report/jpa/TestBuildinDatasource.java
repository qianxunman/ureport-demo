package cn.wilmar.ureport.report.jpa;
import java.sql.Connection;
public class TestBuildinDatasource implements BuildinDatasource {
    private Datasource datasource;
    public String name() {
        return "内置数据源DENO";
    }
    public Connection getConnection() {
        try {
            return dataSource.getConnection();
        } catch (sQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void setDatasource(Datasource datasource) {
        this.datasource = datasource;
    }
}