package io.pratik

import kotlinx.coroutines.*
import java.io.File


fun main() = runBlocking{
//    try {
//        var k = 0
        val job1 = launch {
//            repeat(20){
//                delay(1000)
                println("processing job 1: ${Thread.currentThread().name}")
//                ++k
//                if( k == 10)
//                    cancel()
                    throw Exception("BREAK job1")
//                yield()
//            }
        }

//        val job2 = launch {
//            repeat(20){
//                delay(1000)
//                println("processing job 2: ${Thread.currentThread().name}")
//                yield()
//            }
//        }

        job1.join()
        println("Joined failed job1")
//        job2.join()

//    } catch (e: CancellationException) {
//        // clean up code
//        println("job1 was canceled!")
//    }
}




