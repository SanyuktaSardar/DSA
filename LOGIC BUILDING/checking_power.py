"""def isPower(x, y):
    # The only power of 1 is 1 itself
    if x == 1:
        return y == 1

    # Repeatedly compute power of x
    pow = 1
    while pow < y:
        pow *= x

    # Check if power of x becomes y
    return pow == y

if __name__ == '__main__':
    print(isPower(10, 1))
    print(isPower(1, 20))
    print(isPower(2, 128))
    print(isPower(2, 30)) """

import math

def isPower(x, y):
    res1 = math.log(y) / math.log(x)
    return res1 == math.floor(res1)

print(isPower(2, 128))
