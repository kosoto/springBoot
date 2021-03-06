package com.bemeal.demo.mbr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bemeal.demo.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService{
	@Autowired MemberMapper mbrMapper;
	@Override
	public String countAll() {
		return mbrMapper.countAll();
	}
}
