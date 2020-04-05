package com.sadaf.my.first.test.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;

@Table(name = "family")
@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Family implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @NonNull
    private String Name;

    @NonNull
    private Long CodeMeli;
 
    @NonNull
    private Long Age;

    public Long getID() {
        return ID;
    }

    public void setID(Long iD) {
        ID = iD;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Long getCodeMeli() {
        return CodeMeli;
    }

    public void setCodeMeli(Long codeMeli) {
        CodeMeli = codeMeli;
    }

    public Long getAge() {
        return Age;
    }

    public void setAge(Long age) {
        Age = age;
    }

}