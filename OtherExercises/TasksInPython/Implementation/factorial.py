def factorial(number):
    if number < 0:
        return 0
    result = 1
    for i in range(1, number + 1):
        result *= i
    return result
