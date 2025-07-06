def square_sum(n):
    sum = 0
    for i in range(1, n+1):
        sum += i*i
    # sum = n * (n +1)*(2*n + 1)//6
    return sum

if __name__ == "__main__":
    num = int(input("Enter number of natural numbers: "))
    print(f"Sum of squares of first {num} natural numbers is: {square_sum(num)}")