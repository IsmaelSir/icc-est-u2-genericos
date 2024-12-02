package Models.Genericos;

public class Park<k,V> {

    private k clave;
    private V valor;

    public void esteblecerClave(k clave){
        this.clave = clave;
    }

    public void establecerValor(V valor){
        this.valor = valor;
    }

    public k obtenerClave(){
        return clave;
    }

    public V obtenerValor(){
        return valor;
    }

}
