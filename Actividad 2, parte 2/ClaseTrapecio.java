public class Trapecio {
    int baseMayor, baseMenor, lado1, lado2, altura;

    Trapecio(int baseMayor, int baseMenor, int lado1, int lado2, int altura){
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura;
    }

    double calcularPerimetro(){
        return baseMayor+baseMenor+lado2+lado1;
    }

    double calcularArea(){
        return ((baseMenor+baseMayor)*altura)/2;
    }
}
