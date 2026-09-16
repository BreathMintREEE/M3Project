package edu.fscj.cen3024c.taskmanager.services;

import edu.fscj.cen3024c.taskmanager.entities.Task;
import edu.fscj.cen3024c.taskmanager.exceptions.TaskNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TaskService {
    private final Map<Integer, Task> taskMap = new HashMap<>();
    private int currentId = 1;

    public List<Task> findAll() {
        return new ArrayList<>(taskMap.values());
    }

    public Task findById(Integer id) {
        if (!taskMap.containsKey(id)) {
            throw new TaskNotFoundException(id);
        }
        return taskMap.get(id);
    }

    public Task save(Task task) {
        if (task.getId() == null) {
            task.setId(currentId++);
        }
        taskMap.put(task.getId(), task);
        return task;
    }

    public void deleteById(Integer id) {
        if (!taskMap.containsKey(id)) {
            throw new TaskNotFoundException(id);
        }
        taskMap.remove(id);
    }
}
