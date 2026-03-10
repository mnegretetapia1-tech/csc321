# Moises Negrete
#lab 7 


targetnum = 5
attempts = 0
max_attempts = 3
won = False

while True:
    x = int(input("enter a number between 0 and 9: "))
    attempts += 1

    if x < targetnum:
        print("too low")
    elif x > targetnum:
        print("too high")
    else:
        won = True
        print("you win!!")
        print("attempts:", attempts)
        break

    if attempts == max_attempts:
        print("you lost")
        print("attempts:", attempts)
        break

# runs after win OR lose
for i in range(5):
    print("bazinga")

f = 0
while f < 5:
    print("tacos")
    f += 1
