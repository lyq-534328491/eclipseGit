package com.itcast.service;



import java.util.List;

import com.itcast.domain.Items;

public interface ItemsService {
    public Items findById(Integer id);
    
	public List<Items> findAll();
}
