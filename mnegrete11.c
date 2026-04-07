// Moises Negrete
// lab 11


//couldn't get the math lib to link 
// to run on terminal is gcc mnegrete11.c -lm 
// then ./mnegrete11



#include <stdio.h>
#include <math.h>

double findHypotenuse(double base, double height);

int main()
{
    double base;
    double height;
    double hypotenuse;

    printf("Enter the base: ");
    scanf("%lf", &base);

    printf("Enter the height: ");
    scanf("%lf", &height);

    hypotenuse = findHypotenuse(base, height);

    printf("The hypotenuse is %.2lf\n", hypotenuse);

    return 0;
}

double findHypotenuse(double base, double height)
{
    return sqrt(base * base + height * height);
}



