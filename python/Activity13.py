def cal_sum(newlist):
    sum1 = 0
    for number in newlist:
	    sum1 += int(number)
    return sum1

list2 =list(input("enter the number u want to add").split(","))
#list2 = [10,56,77]
sum2 = cal_sum(list2)
print(sum2)