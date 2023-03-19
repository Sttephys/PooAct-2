public class Rombo {
    int diagonalVertical, diagonalHorizontal, lado;

    Rombo(int diagonalHorizontal,int diagonalVertical, int lado){
        this.diagonalHorizontal = diagonalHorizontal;
        this.diagonalVertical = diagonalVertical;
        this.lado = lado;
    }
    double calcularArea(){
        return (diagonalVertical*diagonalHorizontal)/2;
    }

    double calcularPerimetro(){
        return 4*lado;
    }
}
