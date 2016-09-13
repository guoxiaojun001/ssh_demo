package cn.amumu.spring.service;

import cn.amumu.spring.orm.PersonRecord;

public interface PersonRecordService {
	
	public PersonRecord findByFKey(int foreignkey);
	
	
}
