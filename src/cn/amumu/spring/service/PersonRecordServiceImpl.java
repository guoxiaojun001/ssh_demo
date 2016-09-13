package cn.amumu.spring.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import cn.amumu.spring.dao.PersonRecordsDao;
import cn.amumu.spring.orm.PersonRecord;

@Service
public class PersonRecordServiceImpl implements PersonRecordService {

	@Resource
	private PersonRecordsDao personRecordsDao;

	@Override
//	@Cacheable(value = "personRecord", key = "#id")
	public PersonRecord findByFKey(int id) {
		return personRecordsDao.findByFKey(id);
	}




}
