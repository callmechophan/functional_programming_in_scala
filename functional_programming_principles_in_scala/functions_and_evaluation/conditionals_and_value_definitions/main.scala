object main
{
    def main(args: Array[String]): Unit =
    {
        // conditional expressions
        def abs(x: Int): Int =
            if (x >= 0)
            {
                x
            }
            else
            {
                -x
            }
        
        // value definitions
        def square(x: Int): Int = x * x
        val x = 2
        val y = square(x)
    }
}