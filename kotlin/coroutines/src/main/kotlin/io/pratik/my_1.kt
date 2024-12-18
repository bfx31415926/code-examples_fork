package io.pratik
import kotlinx.coroutines.*

fun main() = runBlocking{
    println("My program runs...: ${Thread.currentThread().name}")

    val job:Job = launch {

        longRunningFunction()
    }
    delay(1500) // задержка, чтобы программа не успела завершиться
//    job.cancel() // отмена задачи
//    job.join()  // ожидание отмены задачи

     job.cancelAndJoin() // мы также можем сделать это за один присест

    println(
        "My program run ends...: ${Thread.currentThread().name}")
}

suspend fun longRunningFunction(){
    repeat(1000){ i ->
        println("executing :$i step on thread: ${Thread.currentThread().name}")
        delay(600)
    }
}
