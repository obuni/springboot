package com.co.kr.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co.kr.domain.LoginDomain;
import com.co.kr.mapper.UserMapper;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
	
	@Autowired
	private final UserMapper userMapper;

	@Override
	public void mbCreate(LoginDomain loginDomain) {
		this.userMapper.mbCreate(loginDomain);
	}

	@Override
	public LoginDomain mbSelectList(Map<String, String> map) {
		return this.userMapper.mbSelectList(map);
	}

	@Override
	public List<LoginDomain> mbAllList(Map<String, Integer> map) { 
		return this.userMapper.mbAllList(map);
	}

	@Override
	public void mbUpdate(LoginDomain loginDomain) {
		this.userMapper.mbUpdate(loginDomain);
	}

	@Override
	public void mbRemove(Map<String, String> map) {
		this.userMapper.mbRemove(map);
	}

	@Override
	public LoginDomain mbGetId(Map<String, String> map) {
		return this.userMapper.mbGetId(map);
	}

	@Override
	public int mbDuplicationCheck(Map<String, String> map) {
		// TODO Auto-generated method stub
		return this.userMapper.mbDuplicationCheck(map);
	}

	@Override
	public int mbGetAll() {
		// TODO Auto-generated method stub
		return this.userMapper.mbGetAll();
	}

}
