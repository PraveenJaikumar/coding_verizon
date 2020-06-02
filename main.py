import random
def randomGenerate( num ):
  min = 1;
  if num < 0 :
    num = 0
  max = int(num)+1;
  data=[];
  print('Random integer value from {} to {}'.format(min,num))
  count = 1
  while (count < max):
    randomInt = int(random.random()*(max - min) + min);
    if not (randomInt in data):
      data.append(randomInt);
      count = count + 1
      print(randomInt)

randomGenerate(12)


 # Output:
# Random integer value from 1 to 12
# 5
# 9
# 12
# 11
# 1
# 8
# 6
# 7
# 10
# 3
# 2
# 4
