def reverse_array(numbers):
    reversed_array = []
    for i in range(len(numbers) - 1, -1, -1):
        reversed_array.append(numbers[i])
    return reversed_array
