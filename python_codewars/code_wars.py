def sum_of_integers(string: str) -> int:
    string_int = ""
    integers_sum = 0
    spaces = 0

    for n in range(0, len(string)):
        if string[n].isdigit():
            string_int += string[n]
            if string[n + 1].isdigit():
                continue
            else:
                string_int += " "
        else:
            continue
    print(string_int)
    string_int = string_int.strip()
    print(string_int)
    for numbers in string_int:

        if numbers == " ":
            spaces += 1

    print(spaces)
    return integers_sum


# print(sum_of_integers("The30quick20brown10f0x1203jumps914ov3r1349the102l4zy "
#                       "dog"))


def fizzbuzz(n: int) -> str:
    returned = ""
    for number in range(1, n):
        if number % 3 == 0 and number % 5 == 0:
            returned += '\'FizzBuzz\', '
        elif number % 3 == 0:
            returned += '\'Fizz\', '
        elif number % 5 == 0:
            returned += '\'Buzz\', '
        else:
            returned += ", " + str(number)
    if n % 5 == 0 and n % 3 == 0:
        returned += ' \'FizzBuzz\''
    elif n % 3 == 0:
        returned += ' \'Fizz\''
    elif n % 5 == 0:
        returned += ' \'Buzz\''
    else:
        returned += " " + str(n)

    return returned


# print(fizzbuzz(22))


def no_space(x: str) -> str:
    no_spaces = ""
    for y in x:
        if y.isalpha():
            no_spaces += y
    return no_spaces


print(no_space("donkety drjgng jgjrg"))
