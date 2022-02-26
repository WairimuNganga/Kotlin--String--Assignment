//Given a string “akirachix”.
// Write a function that prints out a string composed of the first, third and fourth characters of the string (2 points)
fun main () {
    var campus = "akirachix"
    var char1 = campus[0]
    var char2 = campus[2]
    var char3 = campus[3]
    var result: String = "$char1$char2$char3"
    println(result)
    var x = "Zipporah"
    var y = 19
    println("Hello,my name is $x and I am $y years old")
    var girl = "Zipporah"
    println(girl.length)

    var name = "Zipporah"
    if(name=="Zipporah"){
        println("That's me!")
    }else{
        println("I don't know who that is")
    }
}
//Write a function that takes in 2 parameters, name and age
//returns a String with this structure “Hi, my name is x and I am y years old.”
// Where x and y are the provided name and age respectively. (3 points)
//Write a function that takes in a String and returns its length. (2 points)
//Write a function that takes in a name and prints out “That’s me!”
// when your name is passed to it, otherwise it prints out “I don’t know who that is” (3 points)





