"""
def count_pairs(n):
    count = 0
    for a in range(1,n+1):
        for b in range(n+1):
            if a**3+b**3 == n:
                count += 1
    return count

n= 9
print(count_pairs(n))
"""

"""while traversing numbers from 1 to the cube root of n,
subtract the cube of the current number from n and check if
their differencew is a perfect cube."""

