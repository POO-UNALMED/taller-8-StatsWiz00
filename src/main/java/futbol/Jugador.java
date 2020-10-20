package futbol;

public class Jugador extends Futbolista {
    public short golesMarcados;
    public byte dorsal;
    public Jugador() {
        super();
        this.golesMarcados = 289;
        this.dorsal = 7;
    }

    @Override
    public boolean jugarConLasManos() {
       return false;
    }

    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }
    @Override
    public int compareTo(Object o) {
        return getEdad() - ((Futbolista) o).getEdad();
    }
    @Override
    public String toString(){
        String retorno ="El futbolista " + getNombre() + " tiene " + getEdad() + " y juega de " + getPosicion();
        if (this instanceof Jugador){
            retorno += ". Ha marcado " + golesMarcados;
        }
        return retorno;
    }

}
