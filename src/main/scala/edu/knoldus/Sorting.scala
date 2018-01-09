package edu.knoldus

class Sorting {

  def insertionSort(array: Array[Int]): Array[Int] = {
    //todo: Add Logic
    println("INSERTION SORT : ")
    for (i <- 1 until array.length) {
      val item = array(i)
      var comp = i
      while (comp > 0 && array(comp - 1) > item) {
        array(comp) = array(comp - 1)
        comp -= 1
      }
      array(comp) = item
    }
    return array
  }


  def selectionSort(array: Array[Int]): Array[Int] = {
    //todo: Add Logic
    for (i <- 0 until array.length - 1) {
      var min = i
      for (j <- i + 1 until array.length) {
        if (array(j) < array(min)) {
          min = j
        }
      }
      val temp = array(i)
      array(i) = array(min)
      array(min) = temp
    }
    return array
  }

  def bubbleSort(array: Array[Int]): Array[Int] = {
    //todo: Add Logic
    println("BUBBLE SORT : ")
    for (i <- 0 until array.length - 1) {
      for (j <- 0 until array.length - 1 - i) {
        if (array(j) > array(j + 1)) {
          val temp = array(j)
          array(j) = array(j + 1)
          array(j + 1) = temp
        }
      }
    }
    return array
    array
  }

}
