class TryOut {
    fun drawFirstTriangle(n: Int) {
        for(i in 0..n) {
            for (j in 0..i) {
                print("* ")
            }
            print("\n")
        }
    }

    fun drawSecondTriangle(n: Int) {
        for(i in n downTo 0) {
            for(j in i downTo 0) {
                print("* ")
            }
            print("\n")
        }
    }

   fun drawRectangle(n: Int) {
       for(i in 0..n) {
           for (j in 0..n) {
               if (i in 1 until n && j in 1 until n ) {
                   print("  ")
               } else {
                   print("* ")
               }
           }
           print("\n")
       }
   }
}