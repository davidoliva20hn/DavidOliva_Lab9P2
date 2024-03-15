/*
 */
package davidoliva_lab9p2;

import javax.swing.JProgressBar;
import javax.swing.JTextArea;

/**
 *
 * @author DAVIDANDRESOLIVAHERN
 */
public class HiloProgesoArchivo extends Thread {

    private JProgressBar progBar;
    private JTextArea textArea;
    private String Valor;

    public HiloProgesoArchivo(JProgressBar progBar, JTextArea textArea) {
        this.progBar = progBar;
        this.textArea = textArea;
    }

    public HiloProgesoArchivo(JProgressBar progBar, JTextArea textArea, String Valor) {
        this.progBar = progBar;
        this.textArea = textArea;
        this.Valor = Valor;
    }

    
    public JProgressBar getProgBar() {
        return progBar;
    }

    public void setProgBar(JProgressBar progBar) {
        this.progBar = progBar;
    }

     @Override
    public void run() {
        int i=0;
        while (progBar.getValue() <= 100) {
            if (progBar.getValue() <= 100) {
                progBar.setValue(progBar.getValue() + 1);
                progBar.setString(Integer.toString(progBar.getValue()));
            }
            if (i==100) {
                textArea.setText(Valor);
                System.out.println("hola");
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }
            i++;
        }

    }
}
