import Models.Genericos.Park;
import Models.Genericos.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        /*CajaGenerica<Integer> cajaInteger = new CajaGenerica<>();
        CajaGenerica<String> cajaString = new CajaGenerica<>();
        CajaGenerica<Persona> cajaPersona = new CajaGenerica<>();

        //Persona sin constructor
        Persona persona1 = new Persona();
        persona1.setEdad(18);
        persona1.setNombre("Maria");

        cajaString.guardar("Guardar un String");
        cajaInteger.guardar(10);
        //cajaPersona.guardar(new Persona("Pablo", 20));
        cajaPersona.guardar(persona1);

        System.out.println(cajaString.obtener());
        System.out.println(cajaInteger.obtener());
        System.out.println(cajaPersona.obtener());

        //Implementacion con Park
        Park<String, Integer> inplemenStringInteger = new Park<>();
        inplemenStringInteger.esteblecerClave("carlos");
        inplemenStringInteger.establecerValor(20);
        System.out.println(inplemenStringInteger.obtenerClave());
        System.out.println(inplemenStringInteger.obtenerValor());*/

        Persona[] listaPersonas = new Persona[10];
        listaPersonas[0] = new Persona("pablo", 23);
        listaPersonas[1] = new Persona("maria", 10);
        listaPersonas[2] = new Persona("juan", 5);
        listaPersonas[3] = new Persona("laura", 2);
        listaPersonas[4] = new Persona("margarita", 17);
        listaPersonas[5] = new Persona("fernanda", 20);
        listaPersonas[6] = new Persona("mauro", 34);
        listaPersonas[7] = new Persona("karla",30);
        listaPersonas[8] = new Persona("pedro", 27);
        listaPersonas[9] = new Persona("carlos", 7);
        int personaMayor = 0;
        int perosonaMenor = 0;
        for (int i = 0; i < listaPersonas.length; i++) {
            if(listaPersonas[i].getEdad() >= 18){
                personaMayor++;
            }else{
                perosonaMenor++;
            }
        }
        Park<String, Integer>[] mayores = new Park[personaMayor];
        Park<Integer, String>[] menores = new Park[perosonaMenor];

        int indexMayor = 0;
        int indexMenor = 0;

        for (int i = 0; i < listaPersonas.length; i++) {
            if (listaPersonas[i].getEdad() >= 18) {
                mayores[indexMayor] = new Park<>();
                mayores[indexMayor].esteblecerClave(listaPersonas[i].getNombre());
                mayores[indexMayor].establecerValor(listaPersonas[i].getEdad());
                indexMayor++;
            } else {
                menores[indexMenor] = new Park<>();
                menores[indexMenor].esteblecerClave(listaPersonas[i].getEdad());
                menores[indexMenor].establecerValor(listaPersonas[i].getNombre());
                indexMenor++;
            }
        }

        System.out.println("Menores de edad:");
        for (Park<Integer, String> park : menores) {
            System.out.println(park.obtenerClave() + " - " + park.obtenerValor());
        }

        System.out.println("\nMayores de edad:");
        for (Park<String, Integer> park : mayores) {
            System.out.println(park.obtenerClave() + " - " + park.obtenerValor());
        }
    }
}
