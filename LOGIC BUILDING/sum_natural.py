def sum_natural(n):
    # sum = 0
    # for i in range(1,n+1):
    #     sum += i
    sum = n*(n + 1)//2
    return sum

if __name__ == "__main__":
    num = int(input("Enter number of natural numbers: "))
    print(f"Sum of first {num} natural numbers is: {sum_natural(num)}")