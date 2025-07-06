"""num = int(input("Enter number: "))
fact = 1
for i in range(1,num+1):
    fact *= i

print(fact)"""

def factorial(n):
    if n==0:
        return 1
    return n*factorial(n-1)

num = 5
print(f"The factorial of {num} is {factorial(num)}")
