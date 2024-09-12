def print_patterns():
    fixedNum1 = 11
    fixedNum2 = 1

    for outerCount in range(10, 0, -1):
        for innerCount1 in range(1, fixedNum1 - outerCount + 1):
            print("* ", end="")
        for innerSpaceCount2 in range(1, outerCount + 1):
            print("  ", end="")
        for innerCount3 in range(1, (outerCount + 1) - fixedNum2 + 1):
            print("* ", end="")
        for innerSpaceCount4 in range(1, fixedNum1 - outerCount + 1):
            print("   ", end="")
        for innerSpaceCount5 in range(1, fixedNum1 - outerCount + 1):
            print(" ", end="")
        for innerSpaceCount6 in range(1, outerCount + 1):
            print("* ", end="")
        for innerSpaceCount7 in range(1, (outerCount + 1) - fixedNum2 + 1):
            print("  ", end="")
        for innerSpaceCount8 in range(1, fixedNum1 - outerCount + 1):
            print("* ", end="")

        print()

print_patterns()
