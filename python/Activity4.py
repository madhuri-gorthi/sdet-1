

while True:
    input1=input("Enter player1 input :").lower()
    input2=input("Enter player2 input :").lower()
    if input1 ==  input2:
       print("Its tie !!")
    elif input1 == 'rock':
       if input2 == 'scissors':
        print("player 1 wins")
       else:
        print("player 2 wins")
    elif input1 == 'scissors':
       if input2 == 'rock':
         print("player 1 wins")
       else:
          print("player 2 wins")
    elif input1 == 'paper':
       if input2 == 'scissors':
         print("player 2 wins")
       else:
         scisprint("player 1 wins")
    
    choice = input("Do you want to play one more round(yes/no) :").lower()
    if choice == 'yes':
        pass
    else:
        raise SystemExit     
else:
	print("You entered an invalid option. Exiting now.")
	raise SystemExit
