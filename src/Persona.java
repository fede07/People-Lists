public class Persona {
    private int id;
    private String nombre;
    private String tel;
    private String email;
    private static int numPersonas = 0;
    
    public Persona(){
        this.id = ++Persona.numPersonas;
    }

    public Persona(String nombre, String tel, String email){
        this();
        this.nombre = nombre;
        this.tel = tel;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTel() {
        return tel;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona [id=" + id + ", nombre=" + nombre + ", tel=" + tel + ", email=" + email + "] " + super.toString();
    }

    public static void main(String[] args) {
        Persona person1 = new Persona("Juan Perez", "43503564", "juanpe@gmail.com");
        System.out.println(person1);
    }    
    
}
