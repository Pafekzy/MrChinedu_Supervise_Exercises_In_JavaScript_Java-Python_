def find_max(numbers):
    if not numbers:
        return None  # Handle empty array
    max_number = numbers[0]
    for number in numbers:
        if number > max_number:
            max_number = number
    return max_number
