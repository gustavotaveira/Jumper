package br.com.alura.jumper.engine;

import br.com.alura.jumper.elements.Canos;
import br.com.alura.jumper.elements.Passaro;

/**
 * Created by Gustavo Vinicius on 24/12/2017.
 */

public class VerificadorDeColisao {

    private Passaro passaro;
    private Canos canos;

    public VerificadorDeColisao(Passaro passaro, Canos canos) {

        this.passaro = passaro;
        this.canos = canos;
    }

    public boolean temColisao() {
        return canos.temColisaoCom(passaro);
    }
}
