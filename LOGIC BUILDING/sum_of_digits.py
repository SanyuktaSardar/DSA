def sumOfDigits(n):
    sum = 0
    #for i in n:
    #    sum += int(i)
    while n > 0:
        sum += n%10
        n//= 10
    return sum

if __name__ == "__main__":
    num = int(input("Enter number: "))
    print(f"The sum of the digits is: {sumOfDigits(num)}")
