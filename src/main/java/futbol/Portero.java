package futbol;

public class Portero extends Futbolista {
    public short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre, int edad, String posicion, short golesRecibidos, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    @Override
    public int compareTo(Object o) {
        return golesRecibidos - ((Portero) o).golesRecibidos;
    }
    @Override
    public boolean jugarConLasManos() {
        return true;
    }
    @Override
    public String toString(){
        String retorno ="El futbolista " + getNombre() + " tiene " + getEdad() + ", y juega de " + getPosicion();
        if(this instanceof Portero){
            retorno += ". Le han marcado " + golesRecibidos;
        }
        return retorno;
    }
}
