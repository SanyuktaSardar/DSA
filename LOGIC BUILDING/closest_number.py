#Find the number closest to n and divisible by m
def closest_number(n,m):
    if n % m == 0:
        return n
    lower = n - (n % m)
    upper = lower + m
    if (n -lower) > (upper - n):
        return upper
    else:
        return lower
    
if __name__ == "__main__":
    n = int(input("Enter a number: "))
    m = int(input("Enter a divisor: "))
    
    print(f"The closest number to {n} that is divisible by {m} is: {closest_number(n, m)}")