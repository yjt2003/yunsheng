package com.yunsheng.record.service;

import com.yunsheng.record.model.Record;

import java.util.List;

public interface RecordService {

    public int addRecord(Record record);

    public List<Record> queryRecords();

}
