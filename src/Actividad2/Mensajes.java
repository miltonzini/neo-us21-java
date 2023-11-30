package Actividad2;

import javax.swing.JOptionPane;

public class Mensajes {
    public interface Mensaje {
        String obtenerContenido();
        String obtenerTitulo();
    }

    public abstract static class MensajeAbstracto implements Mensaje {
        public abstract String obtenerTitulo();
        public abstract String obtenerContenido();
    }

    public static class MensajeInfo extends MensajeAbstracto {
        private String contenido;
        private String titulo;
    
        public MensajeInfo(String contenido, String titulo) {
            this.titulo = titulo;
            this.contenido = contenido;
        }
    
        @Override
        public String obtenerTitulo() {
            return titulo;
        }
        
        @Override
        public String obtenerContenido() {
            return contenido;
        }
        
        public void mostrar() {
            JOptionPane.showMessageDialog(
                null,
                this.obtenerContenido(),
                this.obtenerTitulo(),
                JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
}
