package comunicacion;

public class Alfabeto extends Pictograma{

        private static String[] letras;
        private String interpretacion;

        public Alfabeto(String origen, String[] letras, String interpretacion) {
            super(origen);
            Alfabeto.letras = letras;
            this.interpretacion = interpretacion;
        }

        public String[] getLetras() {
            return letras;
        }

        public void setLetras(String[] letras) {
            this.letras = letras;
        }

        public String getInterpretacion() {
            return interpretacion;
        }

        public void setInterpretacion(String interpretacion) {
            this.interpretacion = interpretacion;
        }

        public String interpretacion() {
            return this.interpretacion;
        }

        public String toString() {
            String r = "";
            for (int i = 0; i < this.letras.length; i++) {
                if (i == this.letras.length - 1) {
                    r += this.letras[i];
                } else {
                    r += this.letras[i] + ", ";
                }
            }
            return r;
        }

        public int cantidadLetras() {
            return this.letras.length;
        }
}
