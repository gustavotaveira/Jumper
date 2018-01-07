package br.com.alura.jumper.elements;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

import br.com.alura.jumper.graphics.Cores;
import br.com.alura.jumper.graphics.Tela;

/**
 * Created by Gustavo Vinicius on 24/12/2017.
 */

public class GameOver {

    private static final Paint VERMELHO = Cores.getCorDoGameOver();
    private final Tela tela;
    private static final String GAME_OVER = "Game Over";

    public GameOver(Tela tela) {
        this.tela = tela;
    }

    public void desenhaNo(Canvas canvas) {
        canvas.drawText(GAME_OVER, centralizaTexto(GAME_OVER), tela.getAltura()/2, VERMELHO);
    }

    private int centralizaTexto(String texto){
        Rect limiteDoTexto = new Rect();
        VERMELHO.getTextBounds(texto,0 , texto.length(), limiteDoTexto);
        return (tela.getLargura()/2) - (limiteDoTexto.right - limiteDoTexto.left)/2;
    }
}
