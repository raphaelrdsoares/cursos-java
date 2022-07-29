package com.devsuperior.myfirstproject.entities;

import java.io.Serializable;

public class Category implements Serializable {

  private Long id;
  private String name;

  public Category() {}

  public Category(Long id, String name) {
    this.id = id;
    this.name = name;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}
