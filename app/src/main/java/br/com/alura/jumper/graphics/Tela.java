package br.com.alura.jumper.graphics;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/**
 * Created by Gustavo Vinicius on 23/12/2017.
 */

public class Tela {

    private final DisplayMetrics metrics;

    public Tela(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = windowManager.getDefaultDisplay();
        metrics = new DisplayMetrics();
        display.getMetrics(metrics);
    }

    public int getAltura(){
        return metrics.heightPixels;
    }

    public int getLargura() {
       return metrics.widthPixels;
    }
}
