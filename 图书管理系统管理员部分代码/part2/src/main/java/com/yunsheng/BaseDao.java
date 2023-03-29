package com.yunsheng;


import com.yunsheng.userManage.model.User;
import com.yunsheng.util.DBUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public abstract class BaseDao {

    private QueryRunner queryRunner = new QueryRunner();

    //此方法用于执行Insert\Update\Delete
    //若返回非-1则表示成功
    public int update(String sql,Object ... args){

        Connection connection = DBUtil.getConnection();
        try {
           return queryRunner.update(connection,sql,args);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            DBUtil.close(connection);
        }

    }

    //查询返回上一个JavaBean的sql
    //type  返回对象类型
    //sql   执行语句
    //args  sql对应的参数值
    //T     返回的类型的泛型
    public <T> T queryForOne(Class<T> type,String sql,Object...args){
        Connection con = DBUtil.getConnection();
        try {
             return queryRunner.query(con,sql,new BeanHandler<T>(type),args);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            DBUtil.close(con);
        }
    }
    //查询返回多个JavaBean的sql
    //type  返回对象类型
    //sql   执行语句
    //args  sql对应的参数值
    //T     返回的类型的泛型
    public <T> List<T> queryForList(Class<T> type, String sql, Object...args){
        Connection con = DBUtil.getConnection();
        try {
            return queryRunner.query(con,sql,new BeanListHandler<T>(type),args);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            DBUtil.close(con);
        }
    }
    //查询返回某行 某列
    public Object queryForSingleValue(String sql,Object... args){

        Connection conn = DBUtil.getConnection();

        try {
            return queryRunner.query(conn, sql,new ScalarHandler(),args);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            DBUtil.close(conn);
        }
    }
}
