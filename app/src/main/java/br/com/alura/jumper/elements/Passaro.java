package br.com.alura.jumper.elements;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;

import br.com.alura.jumper.engine.Som;
import br.com.alura.jumper.graphics.Cores;
import br.com.alura.jumper.graphics.Tela;
import jumper.alura.com.br.jumper.R;

/**
 * Created by Gustavo Vinicius on 23/12/2017.
 */

public class Passaro {

    public static final float X = 100;
    public static final int RAIO = 40;
    private static final Paint VERMELHO = Cores.getCorDoPassaro();
    private final Bitmap passaro;
    private float altura;
    private Tela tela;
    private Som som;

    public Passaro(Tela tela, Context context, Som som){
        this.tela = tela;
        this.som = som;
        this.altura = 100;
        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.passaro);
        this.passaro = Bitmap.createScaledBitmap(bitmap, RAIO*2, RAIO*2, false);
    }

    public void desenhaNo(Canvas canvas){
        //canvas.drawCircle(X, altura, RAIO, VERMELHO);
        canvas.drawBitmap(passaro, X - RAIO, altura - RAIO, null);
    }

    public void cai() {
        boolean chegouNoChao = altura + RAIO > tela.getAltura();
        if(!chegouNoChao){
            this.altura += 3;
        }
    }

    public void pula() {
        if(altura - RAIO > 0){
            som.toca(Som.PULO);
            this.altura -= 50;
        }
    }

    public float getAltura() {
        return this.altura;
    }
}
