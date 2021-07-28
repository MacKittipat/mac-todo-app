package com.mackittipat.macapptodoapi.mapper;

import com.mackittipat.macapptodoapi.model.Task;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TaskMapper {

  void create(Task task);
}
