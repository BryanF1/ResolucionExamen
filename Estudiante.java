package clase1;

        public class Estudiante {
            private String nombre;
            private int edad;
            private Area[] area;
            private int conteo;

    Estudiante(String nom, int edad) {
        this.nombre = nom;
        this.edad = edad;
        this.area = new Area[2];
        this.conteo = 0;
    }
            public void setNombre(String nombre)
             {
            this.nombre = nombre;
                }
    public String getNombre()
             {
        return nombre;
                }
    public void setEdad(int edad) 
            {
        this.edad = edad;
                 }
    int getEdad() 
            {
        return edad;
                 }
    public void setArea(Area area) 
            {

        this.area[this.conteo++] = area;
                }
    public Curso[] getArea() 
            {
        return area;
                }
}
