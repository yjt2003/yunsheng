package com.yunsheng.record.dao;

import com.yunsheng.BaseDao;
import com.yunsheng.record.model.Record;

import java.util.List;

public class RecordDaoImpl extends BaseDao implements RecordDao {


    @Override
    public int addRecord(Record record) {
//       String sql = "insert into borrowRecords(bookName,borrower,borrowTime,howLong,returned,destoryed,compensated) values(?,?,?,?,?,?,?)";
 //       return update(sql,record.getBookName(),record.getBorrower(),record.getBorrowTime(), record.getHowLong(),record.getReturned(),record.getDestroyed(),record.getCompensated());

        String sql = "update borrowrecords set compensated = 1 where borrower= ?";
       return update(sql,record.getBorrower());//更改为 审批功能

    }

    @Override
    public List<Record> queryRecords() {
        String sql = "select * from borrowrecords";
        return queryForList(Record.class,sql);
    }


}
