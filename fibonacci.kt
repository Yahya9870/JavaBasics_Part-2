class fibonacci {
    fun main() {
        val number = 10 // Change this value to generate more Fibonacci numbers
        print("Fibonacci series up to $number terms: ")
        for (i in 0 until number) {
            print("${fibonacci(i)} ")
        }
    }

    fun fibonacci(n: Int): Int {
        return if (n <= 1) {
            n
        } else {
            fibonacci(n - 1) + fibonacci(n - 2)
        }
    }

}