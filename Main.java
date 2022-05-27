package clase1;

public class Main {
    public static void main(String args[]) {
        Docente Ferananda = new Docente("Ferananda");
        Docente Casas = new Docente("De Las Casas");

        Docente Francisca = new Docente("Francisca");
        Docente Maldini = new Docente("Maldini");

        Area areaRDT = new Area("Redes y telecomunicaciones");
        areaRDT.setDocente(teofilo);
        areaRDT.setDocente(gil);

        Area areaIgles = new Area("Ingles");
        aeraIngles.setDocente(Berta);
        areaIngles.setDocente(gargate);

        Alumno alumno = new Alumno("Rosio", 20);

        alumno.setArea(cursRDT);
        alumno.setArea(cursoIngles);

        Matricula matricula = new Matricula("2022-I", 2344);
        matricula.setAlumno(alumno);

        for (Alummo e : matricula.getAlumno()) {
            System.out.println("nombre:" + e.getNombre());
            System.out.println("edad:" + e.getEdad());
            System.out.println("semestre: " + matricula.getSemestre());

            for (Area c : e.getArea()) {
                System.out.println("Curso: " + c.getNombre());

                for (Docente d : c.getDocente()) {
                    System.out.println("Docente: " + d.getNombre());
                }
            }
        }
        

    }

}
