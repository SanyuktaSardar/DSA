# def isEven(n):
#     rem = n % 2
#     if rem ==0 :
#         return True
#     else:
#         return False
def isEven(n):
    if (n & 1) == 0:
        return True
    else:
        return False
    
if __name__ == "__main__":
    n = int(input("Enter a number: "))
    if isEven(n):
        print(f"{n} is even")
    else:
        print(f"{n} is odd")


