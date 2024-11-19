package com.example.test1

fun main(){
    //java -> system.out.println()
    //kotlin
    println("Hello World")
    //mutable
    var name1 = "Lucifer"
    name1 = "ankit"
    println(name1)

    //immutable
    var age1 = 20


    // java -> String name = "Lucifer";
    var name : String  = "Lucifer"
    var age : Int = 10
    var terms : Boolean = false

    println("My name is ${name.uppercase()}" + "and my age is $age")

    var data = arrayOf("probs","ram","sham")

    data[2]="hari"

    println("1st element is ${data[0]}")
    println("2nd element is ${data[1]}")
    println("3rd element is ${data[2]}")

    //array-list
    var data1= arrayOf("probs","ram","sham")
    var students= arrayListOf<String>("probs","ram")
    students.add("lucifer")
    var students2= ArrayList<String>()
    var students3= arrayListOf<Any>("s",1)


    //Kotlin collections
    var lst= listOf("probs")
    var lst1= mutableListOf("kumar")

    //maps
    var dictionary= mutableMapOf(
        "cat" to "this is animal",
        "bajaj" to "this is bike",
        "apple" to "this is fruit"
    )

    //input
    println("Enter any word :")
    var input : String = readln()
    println(dictionary[input])

    //operators
    println("Enter day of the week")
    var dayOfweek: Int = readln().toInt()
    var day: String

    when(dayOfweek){ //when=Switch
        1->day="Sunday"
        2->day="Monday"
        3->day="Tuesday"
        4->day="Wednesday"
        5->day="Thursday"
        6->day="Friday"
        7->day="Saturday"
        else -> day= "Invalid option"
    }
    println(day)

    //loop
    for(i in 0 until 5){
        println(i)
    }
    for(i in 0 .. 5){
        println(i)
    }

    //for each
    var data3= listOf("probs","kuma")
    data.forEach {name ->
        println(name)

    }

    //Funtioncalls
    fun calculate(a:Int, b:Int) : Int{
        return a+b;
    }
    calculate(10,50)

    fun calculate2(a:Int, b:Int) : Unit{
        println(a+b);
        calculate(10,50)

    }

}

