package com.sadaf.my.first.test.controller;

import com.sadaf.my.first.test.model.Family;
import com.sadaf.my.first.test.service.FamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/familyApi")
public class FamilyController {

    

    @Autowired
    private FamilyService familyService;

    @GetMapping("/family/{id}")
    public Family get(@PathVariable long id) {
        return familyService.get(id);
    }
}