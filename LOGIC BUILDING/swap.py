def swap(num1,num2):
    print(f"Before swapping: num1 = {num1}, num2 = {num2}")
    # temp = num1
    # num1 = num2
    # num2 = temp
    num1, num2 = num2, num1  # Swapping using tuple unpacking
    print(f"After swapping: num1 = {num1}, num2 = {num2}")
if __name__ == "__main__":
    num1 = int(input("Enter first number: "))
    num2 = int(input("Enter second number: "))
    swap(num1, num2)