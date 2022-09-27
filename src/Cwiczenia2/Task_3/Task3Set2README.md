Na przestrzeni dziejów wielkie umysły rozwinęły różne schematy obliczeniowe liczby π.

Rozważymy tutaj dwa takie schematy, jeden Leibniza, a drugi Eulera.

schemat Leibniza

                                     8
                               π = 8 E = 1 / (4k + 1)(4k + 3)
                                    k=0

Schemat Eulera

                                               8
                                    π = pier 6 E 1 / k**2
                                              k=1

Jeśli tylko pierwszych N wyrazów każdej sumy zostanie użytych jako przybliżenie π, każdy
zmodyfikowany schemat będzie obliczał π z pewnym błędem.

Napisz program, który przyjmuje N jako dane wejściowe od użytkownika i wykreśl rozwój błędu 
w obu schematach w miarę zbliżania się liczby iteracji do N.

Program powinien również wypisać końcowy błąd uzyskany w obu schematach, tj. gdy liczba
wynosi N.

Uruchom program z N = 100 i wyjaśnij pokrótce, co pokazują wykresy.