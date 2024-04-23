object main
{
    def main(args: Array[String]): Unit =
    {
        def times(x: Int, y: => Int) = x * x
    }
}