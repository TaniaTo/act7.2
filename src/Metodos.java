
import static javafx.beans.binding.Bindings.or;
import javax.swing.JOptionPane;

public class Metodos {


    // ATRIBUTOS
    String nombre;
    char cal1;
    char cal2;
    char cal3;
    char cal4;
    char  cal5;
    char ALTA ='A';
    char b = 'B';
    char c= 'C';
    char d= 'D';
    char e = 'E';
    char f= 'F';
    int promedio;
    int sumA = 100;
    int sumB = 90;
    int sumC = 80;
    int sumD =70;
    int sumE =60;
    int sumF= 50;

    int resultado;
    int resultad;
    int resulta;
    int result;
    int resul;
    int prome;








    //METODOS





    public void Metodo1(){



        Metodos  a[]=new Metodos [1];


        for(int  i=0;i<a.length;i++){

        }


        //PEDIR DATOS


        JOptionPane.showMessageDialog(null, "METODO 1 ");

        nombre= JOptionPane.showInputDialog("Escribe tu nombre ");
        JOptionPane.showMessageDialog(null, "Bienvenid@ " + nombre);



        //PEDIR CALIFICACIONES
        cal1 = JOptionPane.showInputDialog(null,"Ingrese la calificacion  1 ").charAt(0);
        cal2 = JOptionPane.showInputDialog(null,"Ingresa la calificacion 2").charAt(0);
        cal3 = JOptionPane.showInputDialog(null,"Ingresa la calificacion 3").charAt(0);
        cal4= JOptionPane.showInputDialog(null,"Ingresa la calificacion 4").charAt(0);
        cal5 = JOptionPane.showInputDialog(null,"Ingresa la calificacion 5").charAt(0);

        //CALIFICACION 1



        if(cal1 == ALTA){
            System.out.println(sumA);

            resultado=sumA;


        }else if(cal1 == b){
            System.out.println(sumB);


            resultado=sumB;

        }else if(cal1 == c){
            System.out.println(sumC);

            resultado=sumC;

        }else if(cal1 == d){
            System.out.println(sumD);

            resultado=sumD;

        }else if(cal1 == e){
            System.out.println(sumE);

            resultado=sumE;



        }else if(cal1 == f){
            System.out.println(sumF);

            resultado=sumF;



        }else
            System.out.println("NO ES CORRECTA LA CALIFICACION");


        //CALIFICACION 2
        if(cal2 ==ALTA){
            System.out.println(sumA);
            resultad=sumA;



        }else if(cal2 == b){
            System.out.println(sumB);
            resultad=sumB;

        }else if(cal2 == c){
            System.out.println(sumC);

            resultad=sumC;

        }else if(cal2 == d){
            System.out.println(sumD);

            resultad=sumD;

        }else if(cal2 == e){
            System.out.println(sumE);

            resultad=sumE;

        }else if(cal2 == f){
            System.out.println(sumF);

            resultad=sumF;

        }else
            System.out.println("NO ES CORRECTA LA CALIFICACION");


        //CALIFICACION 3

        if(cal3 ==ALTA){
            System.out.println(sumA);
            resulta=sumA;


        }else if(cal3 == b){
            System.out.println(sumB);
            resulta=sumB;

        }else if(cal3 == c){
            System.out.println(sumC);
            resulta=sumC;

        }else if(cal3 == d){
            System.out.println(sumD);
            resulta=sumD;

        }else if(cal3 == e){
            System.out.println(sumE);
            resulta=sumE;


        }else if(cal3 == f){
            System.out.println(sumF);
            resulta=sumF;


        }else
            System.out.println("NO ES CORRECTA LA CALIFICACION");



        //CALIFICACION 4
        if(cal4 ==ALTA){
            System.out.println(sumA);
            result=sumA;

        }else if(cal4 == b){
            System.out.println(sumB);
            result=sumB;

        }else if(cal4 == c){
            System.out.println(sumC);
            result=sumC;

        }else if(cal4 == d){
            System.out.println(sumD);
            result=sumD;

        }else if(cal4 == e){
            System.out.println(sumE);
            result=sumE;

        }else if(cal4 == f){
            System.out.println(sumF);
            result=sumF;


        }else
            System.out.println("NO ES CORRECTA LA CALIFICACION");



        //CALIFICACION 5
        if(cal5 ==ALTA){
            System.out.println(sumA);
            resul=sumA;

        }else if(cal5 == b){
            System.out.println(sumB);
            resul=sumB;

        }else if(cal5 == c){
            System.out.println(sumC);
            resul=sumC;

        }else if(cal5 == d){
            System.out.println(sumD);
            resul=sumD;

        }else if(cal5 == e){
            System.out.println(sumE);
            resul=sumE;

        }else if(cal5 == f){
            System.out.println(sumF);
            resul=sumF;


        }else
            System.out.println("NO ES CORRECTA LA CALIFICACION");
        {

        }

        prome = resultado + resultad + resulta + result + resul ;
        System.out.println(prome);

        promedio = prome/5;

        System.out.println("Tu promedio es:" + promedio);






    }









    public void Metodo2(){



        JOptionPane.showMessageDialog(null, "METODO 2 ");


        if(promedio >= 91 &&  promedio <=100){
            System.out.println("A");



        }else if(promedio >=81 && promedio <=90){
            System.out.println("B");

        }else if(promedio >=71 && promedio<= 80){
            System.out.println("C");

        }else if(promedio>=61 && promedio<=70){
            System.out.println("D");

        }else if(promedio>=51 && promedio<=60){
            System.out.println("E ");


        }else if(promedio <=50){
            System.out.println("F");

        }else {
            System.out.println("NO ESTA CORRECTO TU PROMEDIO");
        }


    }
    public void Metodo3(){

        JOptionPane.showMessageDialog(null, "METODO 3 ");
        System.out.println("NOMBRE DEL ESTUDIANTE :" + nombre);
        System.out.println("CALIFICACION 1->" + cal1);
        System.out.println("CALIFICAION 2->" + cal2);
        System.out.println("CALIFICAION 3->" + cal3);
        System.out.println("CALIFICAION 4->" + cal4);
        System.out.println("CALIFICAION 5->" + cal5);
        System.out.println("PROMEDIO->" + promedio);








    }






}


