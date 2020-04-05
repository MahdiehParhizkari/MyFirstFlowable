package com.sadaf.my.first.test.service;

import javax.transaction.Transactional;
import com.sadaf.my.first.test.dao.FamilyDao;
import com.sadaf.my.first.test.model.Family;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("familyService")
public class FamilyServiceImp implements FamilyService{

    @Autowired
    private FamilyDao familyDao;

    @Transactional
    @Override
    public Family get(long id) {
        return familyDao.get(id);
    }

}