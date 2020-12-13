fruits = {
    "apple" : 123,
    "mango" : 400,
    "banana": 60,
    "orange" :200
}

user = input("Enter your fruit").lower()
if(user in fruits):
    print("Banana exists in the list")
else:
    print(user,"fruit does not exist in the list")
