package com.yunsheng.record.dao;

import com.yunsheng.record.model.Record;

import java.util.List;

public interface RecordDao {

    public int addRecord(Record record);

    public List<Record> queryRecords();

}
