/*
Para practicar la encapsulación:
Crear clase Persona.
Crear variables las privadas edad, nombre y telefono de la clase Persona.
Crear gets y sets de cada propiedad.
Crear un objeto persona en el main.
Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono,
por último muéstralas por consola.
*/
public class Main {
    public static void main(String[] args) {

Persona persona= new Persona();//objeto persona

            persona.setEdad(33);
        int edad=persona.getEdad();
        System.out.println(edad);

        persona.setNombre("Emanuel");
        String nombre=persona.getNombre();
        System.out.println(nombre);
        persona.setTelefono(1166209612);
        int telefono=persona.getTelefono();
        System.out.println(telefono);

    }
}
class Persona {
    private int edad;
    private String nombre;
    private int telefono;
    public void setEdad(int edad){

        this.edad=edad;//this hace referencia a la propiedad de la clase
    }
    public int getEdad(){
        return edad;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setTelefono(int telefono){
        this.telefono=telefono;
    }
    public int getTelefono(){
        return telefono;
    }
}