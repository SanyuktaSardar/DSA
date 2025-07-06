def AP(num1, num2, term):
    diff =  num2 - num1
    an = num1 + (term -1)*diff
    return an
if __name__ == "__main__":
    n1 = int(input("Enter the first number: "))
    n2 = int(input("Enter the second number: "))
    term = int(input("Enter the term: "))
    print(f"The {term}th term of the AP is: {AP(n1,n2,term)}")
