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
       print("player 1 wins")

	
