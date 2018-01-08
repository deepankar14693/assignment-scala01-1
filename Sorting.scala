object Sorting extends App {
  val input = Array(20, 11, 39, 4, 23)

  def insertionSort(): Array[Int] = {
    println("INSERTION SORT : ")
    for (i <- 1 until input.length) {
      val item = input(i)
      var comp = i
      while (comp > 0 && input(comp - 1) > item) {
        input(comp) = input(comp - 1)
        comp -= 1
      }
      input(comp) = item
    }
    sortedArray(input)
    return input
  }

  def sortedArray(input: Array[Int]) {
    for (x <- input){
      println(x)}
    println()
  }

  def selectionSort(): Array[Int] = {
    println("SELECTION SORT : ")
    for (i <- 0 until input.length - 1) {
      var min = i
      for (j <- i + 1 until input.length) {
        if (input(j) < input(min)) {
          min = j
        }
      }
      val temp = input(i)
      input(i) = input(min)
      input(min) = temp
    }
    sortedArray(input)
    return input
  }

  def bubbleSort(): Array[Int] = {
    println("BUBBLE SORT : ")
    for (i <- 0 until input.length - 1) {
      for (j <- 0 until input.length - 1 - i) {
        if (input(j) > input(j + 1)) {
          val temp = input(j)
          input(j) = input(j + 1)
          input(j + 1) = temp
        }
      }
    }
    sortedArray(input)
    return input
  }

  val insertion:Array[Int]=insertionSort()
  val selection:Array[Int]=selectionSort()
  val bubble:Array[Int]=bubbleSort()


}