object Searching extends App {
  val input: Array[Int] = Array(20, 11, 39, 4, 23)
  Sorting.bubbleSort()
  val find=3

  def binarySearch(input : Array[Int],first : Int,last : Int,key : Int) : String = {
    println("BINARY SEARCH : ")
if(last >= first)
  {
    val mid = first + (last - first) / 2
    if(input(mid) == key)
      return "number present"
    if(input(mid)>key)
      return binarySearch(input, first, mid - 1, key)
    return binarySearch(input, mid + 1, last, key)
  }
    return "number not present"
  }

  def linearSearch(input : Array[Int],key : Int) : String ={
    println("LINEAR SEARCH : ")
    for(i<-0 until input.length-1)
      {
        if (input(i)==key)
          return "number present"
      }
    return "number not present"
  }
  val binary:String=binarySearch(input,0,input.length -1,find)
  val linear:String=linearSearch(input,find)
}
