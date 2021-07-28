package com.mackittipat.macapptodoapi.api;

import com.mackittipat.macapptodoapi.mapper.TaskMapper;
import com.mackittipat.macapptodoapi.model.Task;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("tasks")
public class TaskController {

  @Autowired
  private TaskMapper taskMapper;

  @PostMapping("")
  public Task create(@RequestBody Task task) {
    log.info("Creating a task {}", task.toString());
    taskMapper.create(task);
    return task;
  }
}
