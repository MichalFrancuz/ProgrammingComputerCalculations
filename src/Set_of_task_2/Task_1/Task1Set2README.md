Zestaw zadan nr 2.

Zadanie 1

Niektóre pomiary yi, i = 0,1,...,N, były zbierane regularnie, raz na minutę, ti = i, i = 0,1,...,N.

Chcemy znaleźć wartość y pomiędzy pomiarami, np. przy t = 3,2 min. Obliczanie takich wartości y nazywa się interpolacją.

Niech program użyje interpolacji liniowej do obliczenia y między dwoma kolejnymi pomiarami:

1. Znajdź i, takie, że ti ≤ t ≤ ti+1.
2. Znajdź wyrażenie matematyczne dla prostej przechodzącej przez punkty (i, yi) i (i + 1, yi+1).
3. Oblicz wartość y, wstawiając wartość czasu użytkownika do wyrażenia dla linii prostej.

a) Zaimplementuj technikę interpolacji liniowej w funkcji interpolującej, która przyjmuje jako dane wejściowe tablicę z pomiarami yi, czasem między nimi ∆t i pewnym czasem t, dla którego żądana jest wartość interpolowana. Funkcja powinna zwrócić interpolowaną wartość y w czasie t.

b) Napisz inną funkcję find_y, która wyszukuje i wypisuje interpolowaną wartość y w czasie żądanym przez użytkownika. Niech find_y użyje pętli, w której użytkownik jest proszony o podanie czasu w przedziale [0, N]. Pętla może się zakończyć, gdy użytkownik poda czas ujemny.

c) Zastosuj następujące pomiary: 4.4, 2.0, 11.0, 21.5, 7.5, odpowiadające czasom 0, 1,. . . , 4 (min) i oblicz interpolowane wartości przy t = 2.5 i t = 3.1 min.
