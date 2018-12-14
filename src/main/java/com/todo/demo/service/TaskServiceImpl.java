package com.todo.demo.service;

import com.todo.demo.dao.TaskDao;
import com.todo.demo.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskDao taskDao;

    @Override
    public Iterable<Task> findAll() {
        return taskDao.findAll();
    }

    @Override
    public Task findOne(Long id) {
        Optional<Task> optionalTask = taskDao.findById(id);
        return optionalTask.get();
    }

    @Override
    public void toggleComplete(Long id) {
        Optional<Task> optionalTask = taskDao.findById(id);
        Task task = optionalTask.get();
        task.setComplete(!task.isComplete());
        taskDao.save(task);
    }

    @Override
    public void save(Task task) {
        taskDao.save(task);
    }
}
