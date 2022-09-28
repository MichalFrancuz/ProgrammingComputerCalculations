Set of task 3.

Task 1.

Jednym z najważniejszych problemów matematycznych wszech czasów było znalezienie obszaru 
wielokąta, zwłaszcza że tereny nieruchomości często miały kształt wielokątów i trzeba było 
od nich płacić podatek. Mamy wielokąt przedstawiony poniżej.

(...)

Jednym z najważniejszych problemów matematycznych wszech czasów było znalezienie obszaru 
wielokąta, zwłaszcza że tereny nieruchomości często miały kształt wielokątów i trzeba było 
od nich płacić podatek. Mamy wielokąt przedstawiony poniżej.

A = 1/2 |(x1y2 +x2y3 +···+xn−1yn +xny1)−(y1x2 +y2x3 +···+yn−1xn +ynx1)|

1. Napisz funkcję polyarea(x, y), której argumentami są dwie macierze zawierające 
współrzędne wierzchołków. Funkcja zwraca obszar wielokąta.

2. Przetestuj funkcję na trójkącie, czworoboku i pięciokącie, gdzie możesz obliczyć pole 
powierzchni za pomocą alternatywnych metod porównawczych.

3. Wskazówka Ponieważ listy i tablice Pythona mają 0 jako pierwszy indeks, rozsądnie jest 
przepisać wzór matematyczny na współrzędne wierzchołkówponumerowanejakox0,x1,...,xn−1 
iy0,y1,...,yn−1.