package com.springmvc.mapper;

import java.util.HashMap;
import java.util.List;

public interface UserMainMapper {
	
	
	public HashMap<String,Object> selectByPrimaryKey(int userId);
	
	public List<HashMap<String,Object>> getUserRed(int userId);

}
