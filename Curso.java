package clase1;

public class Curso 
{
    private String nombre;

    private Docente[] docente;
    private int conteo;

            Curso(String nom)
            {

            this.nombre = nom;
            this.docente = new Docente[2];
            this.conteo = 0;
            }

        public void setNombre(String nom)
         {
        this.nombre = nom;
        }

            String getNombre()
         {
            return nombre;
            }

         public void setDocente(Docente docente) 
        {

        this.docente[this.contador] = docente;

            this.contador++;
     }

    public Docente[] getDocente() 
    {
        return docente;
    }

}
