-- src/test/resources/task.sql

CREATE TABLE IF NOT EXISTS task (
    task_taskId INT PRIMARY KEY AUTO_INCREMENT,
    task_task VARCHAR(255) NOT NULL
);