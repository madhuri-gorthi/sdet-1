#list1 = [1,2,3,4,5,6]
newlist = list(input("Enter the list with comma seperated:").split(","))
sum1 = 0
for x in newlist:
    sum1 = sum1+int(x)

print(sum1)