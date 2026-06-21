interface Fibonacci {
    fun fibonacci(n: Int, flag: Boolean): Int
}

class FibonacciImpl1 : Fibonacci {
    override fun fibonacci(n: Int, flag: Boolean): Int {
        if (!flag) {
            return -1
        }

        if (n <= 1) {
            return n
        }

        return fibonacci(n - 1, true) + fibonacci(n - 2, true)
    }
}

class FibonacciImpl2 : Fibonacci {
    override fun fibonacci(n: Int, flag: Boolean): Int {
        if (flag) {
            return -1
        }

        if (n <= 1) {
            return n
        }

        var previous = 0
        var current = 1

        for (i in 2..n) {
            val next = previous + current
            previous = current
            current = next
        }

        return current
    }
}