import java.util.ArrayList;

public class Main{

    public static void main(String[] args){
        Carro meuCarro = new Carro("Fusca");
        Carro meuCarro1 = new Carro("Etios");
        Carro meuCarro2 = new Carro("Gol");

        meuCarro.acelerar();
        meuCarro1.acelerar();
        meuCarro2.acelerar();
    }
}

class Carro {
    String modelo;

    public Carro(String modelo){
        this.modelo = modelo;
    }

    public void acelerar(){
        System.out.println("Acelerando o " + this.modelo);
    }
}
