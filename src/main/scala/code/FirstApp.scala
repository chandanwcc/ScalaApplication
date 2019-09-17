package code

object FirstApp {
  def main(args: Array[String]): Unit = {
    println("Hello Scala");
    val name = "chandrakant";
    val company = "publicic sapient";
    val age = 18.5;
    println(name + "  ->  " + company)
    println(s"$name -> $company")
    println(f"$name%s -> $age%f")
    println(f"$name%s -> $age%f")
    println(s"The \n interpolation")
    println(raw"The \n interpolation")

    val  x = 10;
    val y = 30;

    if(x == 10 && y == 30){
      println("hi")
    }else{
      println("hi");
    }
    println(if (x == 20 && y == 30)  "hello" else "hi");
    var list = List(1,2,3,4);
    for (ps <- list){
      println(ps)
    }
    var res = for (i <- list ; if i<6) yield {
      i*i;
    }
    println(res)
  }

}
