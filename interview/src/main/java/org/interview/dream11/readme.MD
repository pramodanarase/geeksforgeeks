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

another example
```
var players = [{id:"Courtois", strength:65}, {id:"Mignolet", strength:21}, {id:"Casteels", strength:0},
               {id:"Alderweireld", strength:83}, {id:"Vermaelen", strength:69}, {id:"Kompany", strength:82},
               {id:"Vertonghen", strength:108}, {id:"Meunier", strength:30}, {id:"Boyata", strength:10},
               {id:"Dendoncker", strength:6}, {id:"Witsel", strength:96}, {id:"De Bruyne", strength:68},
               {id:"Fellaini", strength:87}, {id:"Carrasco", strength:30}, {id:"Tielemans", strength:13},
               {id:"Januzaj", strength:9}, {id:"Dembele", strength:80}, {id:"Chadli", strength:51},
               {id:"Lukaku", strength:75}, {id:"E. Hazard", strength:92}, {id:"Mertens", strength:75},
               {id:"T. Hazard", strength:13}, {id:"Batshuayi", strength:19}];
			   
Dendoncker (6) Januzaj (9) Chadli (51) Mignolet (21) Carrasco (30) Courtois (65) Vermaelen (69) Mertens (75) Kompany (82) Fellaini (87) Witsel (96)
→ team strength = 591

Boyata (10) Tielemans (13) Batshuayi (19) Meunier (30) T. Hazard (13) De Bruyne (68) Lukaku (75) Dembele (80) Alderweireld (83) E. Hazard (92) Vertonghen (108)
→ team strength = 591
```


Solution:
1. https://en.wikipedia.org/wiki/Partition_problem
2. https://en.wikipedia.org/wiki/Birthday_problem
3. https://en.wikipedia.org/wiki/Subset_sum_problem
