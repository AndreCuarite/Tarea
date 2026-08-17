#include <iostream>
using namespace std;

// C++ necesita saber la lista y tambien cuantos elementos tiene
int sumar(int lista[], int tamano) {
    int suma = 0;
    for (int i = 0; i < tamano; i++) {
        suma = suma + lista[i];
    }
    return suma;
}

int main() {
    int misNumeros[] = {5, 10, 15};
    int tamano = 3;
    cout << "La suma total es: " << sumar(misNumeros, tamano) << endl;
    return 0;
}