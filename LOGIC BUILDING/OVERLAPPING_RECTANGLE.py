#l: Top left coordinate of a rectangle
#r: Bottom right coordinate of a rectangle
#condition for not overlap:
#1.One rectangle is above top edge of other rectangle
#2.One rectangle is on left side of lift edge of other rectangle

class Point:
    def __init__(self,x,y):
        self.x = x
        self.y = y
        
def overlap(l1,r1,l2,r2):
    if l1.x > r2.x or l2.x > r1.x:
        return False

    if r1.y > l2.y or r2.y >  l1.y:
        return False

    return True

if __name__ == "__main__":
    l1 = Point(0,10)
    r1 = Point(10,0)
    l2 = Point(5,5)
    r2 = Point(15,0)

    if overlap(l1,r1,l2,r2):
        print("Rectangles Overlap.")
    else:
        print("Rectangles Don't Overlap")
