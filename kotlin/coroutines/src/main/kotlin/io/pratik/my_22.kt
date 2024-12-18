package io.pratik

fun main(){
    try {
     5 / 0
    } catch (e: Exception) {
        println("Деление на ноль!")
    }
}