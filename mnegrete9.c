#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    int secretNumber, guess, i;

    secretNumber = 13;

    printf("Guess a number between 1 and 20:\n");

    scanf("%d", &guess);

    while (guess <= 1 || guess > 20) {
        printf("You input a number that is out of range (1-20) re-enter a valid number.\n");
        scanf("%d", &guess);
    }

    if (guess == secretNumber) {
        for (i = 0; i < guess; i++) {
            printf("You won and guessed the number correctly!\n");
        }
    }
    else {
        if (guess < secretNumber) {
            printf("You lost and your guess is lower than my number which was %d.\n", secretNumber);
        } else {
            printf("You lost and your guess is higher than my number which was %d.\n", secretNumber);
        }
    }

    return 0;
}
