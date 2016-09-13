package cn.amumu.spring.dao;

import cn.amumu.spring.orm.PersonRecord;

public interface PersonRecordsDao {
	
	public PersonRecord findByFKey(int id);
	
}
