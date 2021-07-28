package com.mackittipat.macapptodoapi.api;

import com.mackittipat.macapptodoapi.model.Task;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("tasks")
public class TaskController {

    @PostMapping("")
    public Task create(@RequestBody Task task) {
        log.info("Creating task {}", task.toString());
        return new Task();
    }
}
