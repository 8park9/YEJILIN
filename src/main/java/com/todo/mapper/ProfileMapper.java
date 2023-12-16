package com.todo.mapper;

import java.util.List;

import com.todo.domain.Criteria;
import com.todo.domain.ProfileVO;

public interface ProfileMapper {
	public List<ProfileVO> getList();
	
	public List<ProfileVO> getListWithPaging(Criteria cri);
}
