package hello.logic

import hello.classen.TaskEntity
import hello.reposotorys.TaskRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TaskService @Autowired constructor(private val taskRepository: TaskRepository) {

    fun getAllTasks(): List<TaskEntity> {
        return taskRepository.findAll()
    }

    fun getTaskById(taskId: Int): TaskEntity? {
        return taskRepository.findById(taskId).orElse(null)
    }

    fun saveTask(task: TaskEntity): TaskEntity {
        return taskRepository.save(task)
    }

    fun deleteTask(taskId: Int) {
        taskRepository.deleteById(taskId)
    }
}