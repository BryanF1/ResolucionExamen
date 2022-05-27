package clase1;

public class Matricula {
    private String semestre;
    private int codigo;
    private Alumno[] alumno;
    private int conteo;

    public Matricula(String semestre, int cod) {
        this.semestre = semestre;
        this.cod = codigo;
        this.alumno = new Alumno[2];
        this.conteo = 0;

                 }

            public void setSemestre(String semestre) {
        this.semestre = semestre;
                }

            public String getSemestre() {
        return semestre;
                }

        public void setCodigo(int cod) {
        this.codigo = cod;
                }   

    public int getCodigo() {
        return codigo;
                }

        public void setAlumno(Alumno alumno) {
        this.alumno[this.conteo] = alumno;
        this.conteo++;
            }

            public Alumno[] getAlumno() {
        return alumno;
                 }

}
