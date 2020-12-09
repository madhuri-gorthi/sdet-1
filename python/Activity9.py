list1= [1,2,3,6,5,7,8]
list2= [8,4,3,5,7,1]
list3 = []
for x in list1:
    if(x%2!=0):
        list3.append(x)
    
for y in list2:
    if(y%2==0):
        list3.append(y)

print(list3)


         