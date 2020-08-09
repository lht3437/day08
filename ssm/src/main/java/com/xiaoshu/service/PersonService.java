package com.xiaoshu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import com.xiaoshu.dao.CompanyMapper;
import com.xiaoshu.dao.PersonMapper;
import com.xiaoshu.dao.UserMapper;
import com.xiaoshu.entity.Company;
import com.xiaoshu.entity.Person;
import com.xiaoshu.entity.PersonVo;
import com.xiaoshu.entity.User;
import com.xiaoshu.entity.UserExample;
import com.xiaoshu.entity.UserExample.Criteria;

@Service
public class PersonService {

	@Autowired
	PersonMapper personMapper;
	@Autowired
	CompanyMapper companyMapper;
	public PageInfo<PersonVo> findList(PersonVo personVo, Integer pageNum, Integer pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		List<PersonVo> list=personMapper.findList(personVo);
		return new PageInfo<>(list);
	}

	public List<Company> findAll() {
		// TODO Auto-generated method stub
		return companyMapper.selectAll();
	}

	public void addPerson(Person person) {
		// TODO Auto-generated method stub
		personMapper.insert(person);
	}

	public void updatePerson(Person person) {
		// TODO Auto-generated method stub
		personMapper.updateByPrimaryKeySelective(person);
	}

	

}
