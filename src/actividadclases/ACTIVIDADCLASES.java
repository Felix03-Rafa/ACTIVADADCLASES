
package actividadclases;

 class ACTIVIDADCLASES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Personas humanos = new Personas("Alumno","FELIX LARRA",18,'H',"LAVF020331HNRRLA3");
        System.out.println(humanos.toString());
        Edificios escuela=new Edificios("I","Salones",true,100);
      System.out.println(escuela.toString());
    }

}