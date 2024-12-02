package Models.Genericos;
public class CajaGenerica<T> {

    private T objeto;

    public void guardar(T objeto){
        this.objeto = objeto;
    }

    public T obtener(){
        return objeto;
    }
}
