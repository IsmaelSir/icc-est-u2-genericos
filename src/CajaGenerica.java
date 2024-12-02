public class CajaGenerica<T> {

    private T t;

    public void guardar(T t){
        this.t = t;
    }

    public T obtener(){
        return t;
    }
}
