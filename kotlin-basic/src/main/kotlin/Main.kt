fun main(args: Array<String>) {
    val a = 10;
    val b = 20;
    println(max(a, b))

    val stringArrayList = arrayListOf("A", "B", "C")
    println(stringArrayList)

    val myName = "Kangchan"
    println("Hello, $myName!")
    println("Max of 10, 20 => ${max(10, 20)}")
//    println("$myName님 반가워요!") 한글까지 식별자로 인식 -> 에러
    println("${myName}님 반가워요!")

    // custom accessor
    val rectangle = Rectangle(10, 10)
    println("is Square ? -> ${rectangle.isSquare}")
}

fun max(a: Int, b: Int) = if (a > b) a else b