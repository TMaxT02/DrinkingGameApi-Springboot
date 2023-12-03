package hello.oliver

class TaskLogic() {

    private val tasklist = mutableListOf<String>("test1", "Test2", "Test3")
    private val randomIndex = (0 until tasklist.size).random()
    private val randomValue = tasklist[randomIndex]
    fun getTask():String{

        return randomValue
    }
}