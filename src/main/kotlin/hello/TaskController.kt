package hello

import hello.oliver.TaskLogic
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/task")
class TaskController() {

	@GetMapping("/getTask")
	fun getTask():String{
		return TaskLogic().getTask()
	}
}