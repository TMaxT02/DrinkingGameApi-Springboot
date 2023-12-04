package hello.oliver.classen

import jakarta.persistence.*

@Entity
@Table(name = "task")
class TaskEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_taskId")
    var taskId: Int,

    @Column(name = "task_task")
    var task: String,
) {
}