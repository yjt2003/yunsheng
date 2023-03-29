package com.yunsheng.util;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {


    public static DruidDataSource dataSource;

    static {
        try {
            Properties properties = new Properties();
            //读取priperties属性配置文件
            InputStream inputStream = DBUtil.class.getClassLoader().getResource("mysql.properties").openStream();
            //从流中加载数据
            properties.load(inputStream);
            //创建了数据库连接池
            dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    //获取连接池中的连接
    //null表示失败
    public static Connection getConnection(){

        Connection conn = null;

        try {
            conn = dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return conn;

    }
    //关闭连接  放回连接池
    public static void close(Connection conn){

        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
