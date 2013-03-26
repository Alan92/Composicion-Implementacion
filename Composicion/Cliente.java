class Cliente {
  public static void main(String args[]) {

    Profesor profesor1 = new Profesor();
    profesor1.getPersona().setNombre("Sande");
    Alumno alumno1 = new Alumno();
    alumno1.getPersona().setNombre("Alan");
    System.out.println(alumno1.getPersona().getNombre());
    System.out.println(profesor1.getPersona().getNombre())
  }

}
