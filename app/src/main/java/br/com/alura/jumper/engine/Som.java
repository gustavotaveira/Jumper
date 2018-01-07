package br.com.alura.jumper.engine;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

import jumper.alura.com.br.jumper.R;

/**
 * Created by Gustavo Vinicius on 24/12/2017.
 */

public class Som {

    public static int COLISAO;
    public static int PONTUACAO;
    public static int PULO;
    private final SoundPool soundPool;

    public Som(Context context){
        soundPool = new SoundPool(3, AudioManager.STREAM_MUSIC, 0);
        PULO = soundPool.load(context, R.raw.pulo, 1);
        COLISAO = soundPool.load(context, R.raw.colisao, 0);
        PONTUACAO = soundPool.load(context, R.raw.pontos, 0);
    }

    public void toca(int som){
        soundPool.play(som, 1, 1, 1, 0, 1);
    }
}
