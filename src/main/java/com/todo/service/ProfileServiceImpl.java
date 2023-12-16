package com.todo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.todo.domain.Criteria;
import com.todo.domain.ProfileVO;
import com.todo.mapper.ProfileMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class ProfileServiceImpl implements ProfileService {
	private ProfileMapper mapper;
	
	@Override
	public List<ProfileVO> getList(Criteria cri) {
		log.info("get List with criteria: " + cri);

		return mapper.getListWithPaging(cri);
	}

}
