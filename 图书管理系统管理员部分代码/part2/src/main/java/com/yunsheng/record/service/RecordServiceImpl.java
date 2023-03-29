package com.yunsheng.record.service;

import com.yunsheng.record.dao.RecordDao;
import com.yunsheng.record.dao.RecordDaoImpl;
import com.yunsheng.record.model.Record;

import java.util.List;

public class RecordServiceImpl implements RecordService {

    private RecordDao recordDao = new RecordDaoImpl();


    @Override
    public int addRecord(Record record) {
        recordDao.addRecord(record);
        return 0;
    }

    @Override
    public List<Record> queryRecords() {
        return recordDao.queryRecords();
    }
}
