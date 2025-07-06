def reverse(n):
    """rev = 0
    while n > 0:
        digit = n%10
        rev = rev*10 + digit
        n //= 10
    return rev """
    
    s = str(n)
    s = s[::-1]
    n = int(s)
    return n

num = int(input("Enter the number: "))    
print("The reverse of the number is: ",reverse(num))       
