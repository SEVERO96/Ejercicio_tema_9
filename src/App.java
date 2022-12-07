import javax.swing.AbstractAction;
import javax.swing.UIDefaults.ProxyLazyValue;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();
        cliente.nombre = "severo";
        cliente.edad = 20;
        cliente.telefono = 1234123123;
        cliente.credito = (float)2319.22;
        System.out.println("------CLASE CLIENTE------");
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getEdad());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getCredito());
        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "severo";
        trabajador.edad = 20;
        trabajador.telefono = 1234123123;
        trabajador.salario = (float)5000.00;
        System.out.println("-----CLASE TRABAJADOR------");
        System.out.println(trabajador.getNombre());
        System.out.println(trabajador.getEdad());
        System.out.println(trabajador.getTelefono());
        System.out.println(trabajador.getSalario());

    }
}

abstract class Persona {
    int edad;
    String nombre;
    int telefono;

   public Persona() {
        System.out.println("estoy en contructor de persona");
    }

    public int getEdad() {
        return this.edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre () {
        return this.nombre;
    }
    public int getTelefono (){
        return this.telefono;
    }
    public void setTelefono (int telefono) {
        this.telefono = telefono;
    }
}

final class Cliente extends Persona {
    float credito;
    public float getCredito(){
        return this.credito;
    }
    public void setCredito (int credito) {
        this.credito = credito;
    }
}

final class Trabajador extends Persona {
    float salario;
    public float getSalario(){
        return this.salario;
    }
    public void setSalario (int salario) {
        this.salario = salario;
    }
}

//Crea una clase Persona con las siguientes variables:
//- La edad
//- El nombre
//- El teléfono
//Una vez creada la clase, crea una nueva clase Cliente que herede de 
//Persona, esta nueva clase tendrá la variable credito solo para esa clase.
//Crea ahora un objeto de la clase Cliente que debe tener como propiedades la 
//edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas 
//por pantalla. Una vez hecho esto, haz lo mismo con la clase Trabajador que 
//herede de Persona, y con una variable salario que solo tenga la clase Trabajador.
