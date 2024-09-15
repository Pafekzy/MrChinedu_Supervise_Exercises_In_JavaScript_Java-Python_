def count_odd_numbers(numbers):
    odd_count = 0
    for number in numbers:
        if number % 2 != 0:
            odd_count += 1
    return odd_count
