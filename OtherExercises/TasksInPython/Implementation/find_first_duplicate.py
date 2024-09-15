def find_first_duplicate(numbers):
    seen = set()
    for number in numbers:
        if number in seen:
            return number
        seen.add(number)
    return -1
