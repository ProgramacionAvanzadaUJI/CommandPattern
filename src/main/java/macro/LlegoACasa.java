package macro;

import command.Accion;
import electrodomestico.DVD;
import electrodomestico.TV;

/**
 * Created by oscar on 11/4/16.
 */
public class LlegoACasa implements Accion {
    TV tv;
    DVD dvd;

    public LlegoACasa(TV tv, DVD dvd) {
        this.tv = tv;
        this.dvd = dvd;
    }

    @Override
    public void ejecutaAccion() {
        tv.enciende();
        dvd.play();
    }
}
