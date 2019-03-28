2. select team
Example:
```
n = 5; k = 2  
players:   a  b  c  d  e  
strength:  4  4  2  2  5  

Option  Team A   Team B  Strength  Difference      
  1     [a,b]    [c,e]      15        1
  2     [a,b]    [d,e]      15        1   
  3     [a,c]    [b,e]      15        3
  4     [a,d]    [b,e]      15        3
  5     [a,c]    [b,d]      12        0
  6     [a,d]    [c,b]      12        0
  7     [a,d]    [c,e]      13        1
Option 1 and option 2 are winning combinations as their total strength is 15 (maximum), while their difference in strength is closer to the minimum than options 3 and 4.
```

https://stackoverflow.com/questions/51222876/partition-n-players-into-two-teams-of-size-k-and-equal-or-minimally-different
