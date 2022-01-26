package com.behindcodeline.model

class Book(var name : String, var isbn : String)

@main def main =
    val book = Book("ET", "test")
    println(book.name)