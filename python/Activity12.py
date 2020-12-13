
def calculateSum(num):
   if num:
     return num + calculateSum(num-1)
   else:
     return 0

        

new = calculateSum(10)
print(new)
        
   
