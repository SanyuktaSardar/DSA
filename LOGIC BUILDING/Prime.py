def isPrime(n):
    count = 0
    
    for i in range(1,n):
        if n % i == 0:
            count += 1

    if count > 1:
        return False
    return True

num = int(input("Enter a number: "))
if isPrime(num):
    print(f"The {num} is Prime.")
else:
    print(f"The {num} is not Prime.")
