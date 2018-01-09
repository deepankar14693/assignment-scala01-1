package edu.knoldus

class Searching {

 def binarySearch(input: Array[Int], first: Int, last: Int, key: Int): Boolean = {
  if (last >= first) {
   val mid = first + (last - first) / 2
   if (input(mid) == key)
    return true
   if (input(mid) > key)
    return binarySearch(input, first, mid - 1, key)
   return binarySearch(input, mid + 1, last, key)
  }
  return false
 }

 def binarySearch(array: Array[Int], elem: Int): Boolean = {
  //todo: Add Logic
  val first: Int = 0
  val last: Int = array.length - 1
  var res: Boolean = binarySearch(array, first, last, elem)
  if (res)
   return true
  else
   return false
 }

 def linearSearch(array: Array[Int], elem: Int): Boolean = {
  //todo: Add Logic
  for (i <- 0 until array.length - 1) {
   if (array(i) == elem)
    return true
  }
  return false
 }
}