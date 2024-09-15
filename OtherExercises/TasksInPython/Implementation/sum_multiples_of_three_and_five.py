def sum_multiples_of_three_and_five(n):
    return sum(number for number in range(n) if number % 3 == 0 or number % 5 == 0)
