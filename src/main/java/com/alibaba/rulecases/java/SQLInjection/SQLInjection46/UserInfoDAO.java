package com.alibaba.rulecases.java.SQLInjection.SQLInjection46;
import java.util.List;
import java.util.Map;

public interface UserInfoDAO {
	List<UserInfoDO> query(Map<String,String> query);
}
