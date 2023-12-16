package com.todo.service;

import java.util.List;

import com.todo.domain.Criteria;
import com.todo.domain.ProfileVO;

public interface ProfileService {

	public List<ProfileVO> getList(Criteria cri);
	
}
