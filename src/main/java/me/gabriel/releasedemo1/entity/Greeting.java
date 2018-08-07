package me.gabriel.releasedemo1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Greeting {
  private long id;
  private final String content;
}
