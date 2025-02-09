# Code Challenge

El reto se trata de usar TDD para implementar una funcion que determine si dos palabras son anagramas, la funcion recibiendo ambas palabras y retornando un booleano con true de serlo y con false de lo contrario.

## Complejidad Big(O)

~~La complejidad del algoritmo es O(n * log(n)), esto debido a que para la realizacion del algoritmo se utilizo el ordenamiento de las listas de characteres, las cuales tienen esta complejidad temporal.~~

La complejidad del algoritmo refactorizado es de `O(n)`, donde `n` es igual a la longitud de la palabra mas larga, basado en que se tienen que recorrer ambas palabras para poder verificar si son anagramas y que el `counter`, que almacena la cantidad de veces que aparace cada letra, no va a ser recorrido mas que la cantidad de letras de la palabra con mayor longitud (en el peor de los casos, porque de haber una diferencia se detendra el recorrido en ese momento)