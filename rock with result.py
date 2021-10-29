import random

def player_choice(user_choice):
    if user_choice==1:
        print("You choose..... Rock")
    elif user_choice==2:
        print("You choose..... Paper")
    else:
        print("You choose..... Scissor")

def computer_choice(cpu_choice):
    if cpu_choice == 1:
        print("Computer choose....... Rock")
    elif cpu_choice == 2:
        print("Computer choose....... Paper")
    else:
        print("Computer choose....... Scissor")


def result(user_choice,cpu_choice,player_score,cpu_score):
    if user_choice == cpu_choice:
        return [player_score + 0.5,cpu_score + 0.5]
    elif user_choice ==1 and cpu_choice ==3:
        return [player_score + 1,cpu_score + 0]
    elif user_choice == 2 and cpu_choice ==1:
        return [player_score +1, cpu_score + 0]
    elif user_choice == 3 and cpu_choice ==2:
        return [player_score +1 and cpu_score + 0]
    else:
        return [player_score,cpu_score + 1]

def print_score(p_score,c_score):
    print("Score:""\nPlayer:",p_score,"\nComputer:",c_score)


def validation_input():
    while True:
        try:
            user_input = int(input("Put the choice ......"))
            if user_input not in range(1,4):
                print("Accempt commands 1 to 3 only")
                continue
            if type(user_input)== int:
                break
        except ValueError:
            print("We only accept exact number")
            continue
    return user_input

print('''1- Rock \n2- Paper \n3- Scissors''')
human_score = 0
computer_score =0
while True:
    user = validation_input()
    player_choice(user)
    ai = random.randint(1,3)
    computer_choice(ai)
    human_score,computer_score = result(user,ai,human_score,computer_score)
    print_score(human_score,computer_score)
    command = int(input("Type 0 to stop the program \nType any number for play"))
    if command == 0:
        break
    
