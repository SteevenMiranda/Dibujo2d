package dibujo2d;

import javax.swing.JFrame;

public class Dibujo2d {

    public static void main(String[] args) {
        JFrame marco = new JFrame("Dibujo de arcos");
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Dibujo d = new Dibujo(); // crea objeto ArcosJPanel
        marco.add(d); // agrega arcosJPanel al marco
        marco.setSize(450, 350); // establece el tamaño del marco
        marco.setVisible(true); // muestra el marco
    }

}
