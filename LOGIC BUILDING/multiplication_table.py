def multiplication_table(n,i=1):
    # for i in range(1,11):
    #     print(f"%d X %d = %d" % (n, i, n * i))
    if (i == 11):
        return
    print(n,"X",i,"=",n*i)
    i += 1
    multiplication_table(n, i)

if __name__ == "__main__":
    num = int(input("Enter a number :"))
    print(f"Multiplication table of {num} is:")
    multiplication_table(num)