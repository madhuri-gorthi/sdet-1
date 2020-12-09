list1=(1,40,15,46,78,60,45)
list2 = []
for x in list1:
    if(x%5==0):
        list2.append(x)

print("numbers divisible by 5 in the list are :" , list2)