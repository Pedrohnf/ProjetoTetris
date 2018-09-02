package Componente;

public class Linha extends Piece {

    public static final int VERTICAL = 55;
    public static final int HORIZONTAL = 33;

    int estado;

    public Linha(int x, int y){
        super();

        /*
         D [ ]                         D   C   B   A
         C [*]  //pivô de rotação     [ ] [*] [ ] [ ]
         B [ ]
         A [ ]  //para todas as peças o ponto A sempre será o ponto mais proximo do fundo.
         */

        this.pontoA.x = x;
        this.pontoA.y = y;

        this.pontoB.x = x -1;
        this.pontoB.y = y;

        this.pontoC.x = x-2;
        this.pontoC.y = y;

        this.pontoD.x = x-3;
        this.pontoD.y = y;

        this.estado = VERTICAL;
    }

    @Override
    public void rotate() {
        if(estado == VERTICAL){

            this.pontoD.x = this.pontoC.x;
            this.pontoD.y = this.pontoC.y-1;

            this.pontoB.x = this.pontoC.x;
            this.pontoB.y = this.pontoC.y+1;

            this.pontoA.x = this.pontoC.x;
            this.pontoA.y = this.pontoC.y+2;

            this.estado = HORIZONTAL;

        }else {
            this.pontoD.x = this.pontoC.x-1;
            this.pontoD.y = this.pontoC.y;

            this.pontoB.x = this.pontoC.x+1;
            this.pontoB.y = this.pontoC.y;

            this.pontoA.x = this.pontoC.x+2;
            this.pontoA.y = this.pontoC.y;

            this.estado = VERTICAL;
        }
    }

    @Override
    public void moveDown() {
        this.pontoA.x++;
        this.pontoB.x++;
        this.pontoC.x++;
        this.pontoD.x++;
    }

    @Override
    public void moveLeft() {
        this.pontoA.y--;
        this.pontoB.y--;
        this.pontoC.y--;
        this.pontoD.y--;
    }

    @Override
    public void moveRight() {
        this.pontoA.y++;
        this.pontoB.y++;
        this.pontoC.y++;
        this.pontoD.y++;
    }
}
