#formula for valid triangle
#(a+b)>c
#(a+c)>b
#(b+c)>a

def valid_triangle(a,b,c):
    if ((a+b)>c and (a+c)>b and (b+c)>a):
        return True
    else:
        return False

if __name__ =="__main__":
    a = int(input("Enter a: "))
    b = int(input("Enter b: "))
    c = int(input("Enter c: "))
    
    if valid_triangle(a,b,c):
        print("valid Triangle")
    else:
        print("Invalid Triangle")
        
    
    
    
    
