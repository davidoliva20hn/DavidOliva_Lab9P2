/*
 */
package davidoliva_lab9p2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author DAVIDANDRESOLIVAHERN
 */
public class HiloFachaHora extends Thread {

    private JLabel Hora;
    private JLabel fecha;

    public HiloFachaHora(JLabel Hora, JLabel fecha) {
        this.Hora = Hora;
        this.fecha = fecha;
    }

    @Override
    public void run() {
        while (true) {
            Date h = new Date();
            DateFormat f = new SimpleDateFormat("hh:mm:ss");
            Hora.setText(f.format(h));
            Date Fecha = new Date();
            DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            fecha.setText(formatoFecha.format(Fecha));
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {

            }
        }
    }

}
