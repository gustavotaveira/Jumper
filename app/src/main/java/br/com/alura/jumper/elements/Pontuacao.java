package br.com.alura.jumper.elements;

import android.graphics.Canvas;
import android.graphics.Paint;

import br.com.alura.jumper.engine.Som;
import br.com.alura.jumper.graphics.Cores;

/**
 * Created by Gustavo Vinicius on 23/12/2017.
 */

public class Pontuacao {

    private static final Paint BRANCO = Cores.getCorDaPontuacao();
    private int pontos = 0;
    private Som som;

    public Pontuacao(Som som) {
        this.som = som;
    }

    public void desenhaNo(Canvas canvas) {
        canvas.drawText(String.valueOf(pontos), 100, 100, BRANCO);
    }

    public void aumenta() {
        som.toca(Som.PONTUACAO);
        pontos++;
    }
}
