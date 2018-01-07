package br.com.alura.jumper.graphics;

import android.graphics.Paint;
import android.graphics.Typeface;

/**
 * Created by Gustavo Vinicius on 23/12/2017.
 */

public class Cores {

    private static Paint corDoCano;
    private static Paint corDoGameOver;

    public static Paint getCorDoPassaro() {
        Paint paint = new Paint();
        paint.setColor(0xFFFF0000);
        return paint;
    }

    public static Paint getCorDoCano() {
        Paint paint = new Paint();
        paint.setColor(0xFF00FF00);
        return paint;
    }

    public static Paint getCorDaPontuacao() {
        Paint paint = new Paint();
        paint.setColor(0xFFFFFFFF);
        paint.setTextSize(80);
        paint.setTypeface(Typeface.DEFAULT_BOLD);
        paint.setShadowLayer(3, 5, 5, 0xFF000000);
        return paint;
    }

    public static Paint getCorDoGameOver() {
        Paint paint = new Paint();
        paint.setColor(0xFFFF0000);
        paint.setTextSize(50);
        paint.setTypeface(Typeface.DEFAULT_BOLD);
        paint.setShadowLayer(5, 3, 3, 0xFF000000);
        return paint;
    }
}
