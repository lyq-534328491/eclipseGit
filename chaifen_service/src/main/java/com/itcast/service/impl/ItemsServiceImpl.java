package com.itcast.service.impl;


import com.itcast.dao.ItemsDao;
import com.itcast.domain.Items;
import com.itcast.service.ItemsService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;

    @Override
    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }
    @Override
    public List<Items> findAll() {
    	return itemsDao.findAll();
    }
}
