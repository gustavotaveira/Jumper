package br.com.alura.jumper.elements;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;

import br.com.alura.jumper.graphics.Cores;
import br.com.alura.jumper.graphics.Tela;
import jumper.alura.com.br.jumper.R;

/**
 * Created by Gustavo Vinicius on 23/12/2017.
 */

public class Cano {

    private static final Paint VERDE = Cores.getCorDoCano();
    private final int alturaDoCanoInferior;
    private final Bitmap canoInferior;
    private final Bitmap canoSuperior;
    private int posicao;
    private Tela tela;
    private static final int LARGURA_DO_CANO = 100;
    private static final int TAMANHO_DO_CANO = 250;
    private int alturaDoCanoSuperior;

    public Cano(Tela tela, int posicao, Context context){
        this.tela = tela;
        alturaDoCanoInferior = tela.getAltura() - TAMANHO_DO_CANO -  valorAleatorio();
        this.posicao = posicao;
        alturaDoCanoSuperior = TAMANHO_DO_CANO + valorAleatorio();
        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.cano);
        canoInferior = Bitmap.createScaledBitmap(bitmap, LARGURA_DO_CANO, alturaDoCanoInferior, false);
        canoSuperior = Bitmap.createScaledBitmap(bitmap, LARGURA_DO_CANO, alturaDoCanoSuperior, false);

    }

    private int valorAleatorio() {
        return (int) (Math.random() * 90);


    }

    public void desenhaNo(Canvas canvas) {
        desenhaCanoSuperior(canvas);
        desenhaCanoInferior(canvas);
    }

    private void desenhaCanoInferior(Canvas canvas) {
        //canvas.drawRect(posicao, alturaDoCanoInferior, posicao + LARGURA_DO_CANO, tela.getAltura(), VERDE);
        canvas.drawBitmap(canoInferior, posicao, alturaDoCanoInferior, null);
    }

    private void desenhaCanoSuperior(Canvas canvas) {
       // canvas.drawRect(posicao, 0, posicao + LARGURA_DO_CANO, alturaDoCanoSuperior, VERDE);
        canvas.drawBitmap(canoSuperior,posicao,0,null);
    }

    public void move() {
        posicao-=8;
    }

    public boolean saiuDaTela() {
        return posicao + LARGURA_DO_CANO < 0;
    }

    public int getPosicao() {
        return posicao;
    }

    public boolean temColisaoHorizontalCom(Passaro passaro) {
        return this.posicao < passaro.X + passaro.RAIO;
    }

    public boolean temColisaoVerticalCom(Passaro passaro) {
        return passaro.getAltura() - passaro.RAIO < this.alturaDoCanoSuperior ||
                passaro.getAltura() + passaro.RAIO > this.alturaDoCanoInferior;
    }
}
