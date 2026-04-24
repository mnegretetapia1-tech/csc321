// Moises Negrete
//Exam2
	

#include<stdio.h>
#include<stdlib.h>

void printName(int num);

int main(void)
{
	int num;
	printf("enter a number: ");
	scanf("%d", &num);

	printName(num);
	return EXIT_SUCCESS;

}


//loop for the number of prints in the output
void printName(int num)
{
	int i; 
	for(i = 0; i < 6; i++)
	{
		printf("Moises%d\n", num);
	}


}
