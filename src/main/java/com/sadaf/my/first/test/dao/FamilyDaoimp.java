package com.sadaf.my.first.test.dao;

import com.sadaf.my.first.test.model.Family;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.function.IntToLongFunction;

import javax.persistence.EntityManager;
@Repository
public class FamilyDaoimp implements FamilyDao {
   
    @Autowired
    private EntityManager entityManager;
    
    @Override
    public Family get(long ID) {
        // Session currSession = entityManager.unwrap(Session.class);
        // Family fmly = currSession.get(Family.class, ID);
        Family fmly =new Family();
        fmly.setID((long) 2);
        fmly.setCodeMeli((long)999);
        fmly.setAge((long)23);
        fmly.setName("Sadaf");

        return fmly;
    }

}