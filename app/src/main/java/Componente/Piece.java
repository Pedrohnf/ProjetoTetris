package Componente;

import java.util.ArrayList;

public abstract class Piece{

    Coordenada pontoA, pontoB, pontoC, pontoD;

    public Piece() {
        this.pontoA = new Coordenada();
        this.pontoB = new Coordenada();
        this.pontoC = new Coordenada();
        this.pontoD = new Coordenada();
    }

    public void rotate(){
        return;
    }
    public void moveDown(){
        return;
    }
    public void moveLeft(){
        return;
    }
    public void moveRight(){
        return;
    }

    public static class Coordenada{
        public int x;
        public int y;
    }

    public Coordenada getPontoA() {
        return pontoA;
    }

    public void setPontoA(Coordenada pontoA) {
        this.pontoA = pontoA;
    }

    public Coordenada getPontoB() {
        return pontoB;
    }

    public void setPontoB(Coordenada pontoB) {
        this.pontoB = pontoB;
    }

    public Coordenada getPontoC() {
        return pontoC;
    }

    public void setPontoC(Coordenada pontoC) {
        this.pontoC = pontoC;
    }

    public Coordenada getPontoD() {
        return pontoD;
    }

    public void setPontoD(Coordenada pontoD) {
        this.pontoD = pontoD;
    }


}
