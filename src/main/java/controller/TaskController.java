package controller;

import model.Task;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TaskController {

    @RequestMapping("/getAllTasks")
    public List<Task> getAllTasks(){
        List<Task> testTasks = new ArrayList<>();
        testTasks.add(new Task("1","Test task 1", "Description 1", "4"));
        testTasks.add(new Task("2","Test task 2", "Description 2", "5"));
        testTasks.add(new Task("3","Test task 3", "Description 3", "6"));

        return testTasks;
    }
}
