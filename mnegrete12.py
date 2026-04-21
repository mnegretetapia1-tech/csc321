 # Moises Negrete
 # lab 12 

import math


def rectangleArea(base, height):
     return base * height

def circleArea(radius):
     return math.pi * radius **2


#body of program 



base = float(input("enter the base of the rectangle: "))
height = float(input("enter the height of the rectangle: "))



results_for_rectangle = rectangleArea(base, height)
print("The area of the rectangle is : ", results_for_rectangle)


radius = float(input("Enter the radius of the circle: "))

circleResults = circleArea(radius)
print("The area of the circle is:  ", circleResults)

