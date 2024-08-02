package com.application.di.toBeModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // 해당클래스를 Service로 지정하여 spring bean(객체)로 등록
public class ToBeService {

	// before
	// TobeDAO toBeDAO = new ToBeDAO();
	
	// after
	@Autowired // 자동연결(과거에는 @Inject로도 사용)
	ToBeDAO toBeDAO;
}
