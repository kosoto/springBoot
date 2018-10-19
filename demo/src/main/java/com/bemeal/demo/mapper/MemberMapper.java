package com.bemeal.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper //@Repository에서 바뀜
public interface MemberMapper {
	public String countAll();
}
