import sympy


def gap(gaps: int, minimum: int, maximum: int) -> list:
    # def primes(minimum: int, maximum: int) -> list:
    #     our_primes = []
    #     for number in range(minimum, maximum + 1):
    #         if number == 2 or number == 3 or number == 5 or number == 7:
    #             our_primes.append(number)
    #         else:
    #             if number > 10:
    #                 flag = 0
    #                 for n in range(2, int(number / 2)):
    #                     if number % n == 0:
    #                         flag += 1
    #                 if flag == 0:
    #                     our_primes.append(number)
    #     return our_primes
    prime = primes(minimum, maximum + 1)
    print(prime)
    for i, n in enumerate(prime):
        if i >= 1 and n - prime[i - 1] == gaps:
            return [prime[i - 1], n]


# print(gap(6, 100, 110))


def primes(minimum: int, maximum: int) -> list:
    our_primes = []
    for number in range(minimum, maximum):
        if number < 10:
            if number == 2 or number == 3 or number == 5 or number == 7:
                our_primes.append(number)
        else:
            if number % 2 != 0:
                flag = 0
                for n in range(3, int(number / 2)):
                    if number % n == 0:
                        flag += 1
                if flag == 0:
                    our_primes.append(number)
    return our_primes


# n1 = 10
# n2 = 30
print(list(sympy.primerange(0, 10000)))
print(primes(0, 10000))
