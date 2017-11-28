package jap.com.service;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import jap.com.dao.HouseHoldDao;
import jap.com.model.c_t_house_hold;

@Component("houseHoldService")
public class HouseHoldService {
	
	private HouseHoldDao houseHoldDao;  
	
	public void init() {
		System.out.println("init");
	}
	
	public HouseHoldDao getHouseHoldDao() {
		return houseHoldDao;
	}

	@Resource(name="u")
	public void setHouseHoldDao(HouseHoldDao houseHoldDao) {
		this.houseHoldDao = houseHoldDao;
	}
	
	@Transactional
	public void add(c_t_house_hold cthh) {
		houseHoldDao.save(cthh);
	}

	public void destroy() {
		System.out.println("destroy");
	}
}
