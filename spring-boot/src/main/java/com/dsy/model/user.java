package com.dsy.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class user {
  private Integer id;
  private String name ;
  private Integer age;

  public user() {
  }

  public user(Integer id, String name, Integer age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }
}
