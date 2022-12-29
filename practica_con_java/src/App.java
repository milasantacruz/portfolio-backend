import java.util.Scanner;

import Objetos.cliente;
import Objetos.educacion;
import Objetos.proyecto;
import Objetos.tecnologia;
import Objetos.usuario;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class App {
    /*public static void main(String[] args){
        // Scanner:
        double x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a large number:");
        x = scanner.nextDouble();
        System.out.println("test:" + x);
        scanner.close();


        // Random

        Random random = new Random();
        int r = random.nextInt(6);
        System.out.println("the random number is: "+r);

        //ArrayList
        ArrayList<String> food = new ArrayList<String>() ;
        ArrayList<String> candys = new ArrayList<String>() ;
        
        //ArrayList 2D
        ArrayList<ArrayList<String>> groseryList = new ArrayList();

        food.add("pizza");
        food.add("sancocho");
        food.add("arroz");

        food.set(2, "sushi");
        food.remove(2);

        candys.add("chocoramo");
        candys.add("yogo-yogo");
        candys.add("alpinito");
        //food.clear();

        groseryList.add(candys);
        groseryList.add(food);

        for(int i =0; i<food.size();i++){
            System.out.println(food.get(i));
        }

        for(int i =0; i<groseryList.size();i++){
            System.out.println(groseryList.get(i));
        }


        //ForEach

        String[] animals = {"cat", "dog", "bird"};
        for(String i: animals){
            System.out.println(i);
        }

       //Methos = a block of code that is executed whenever it is called
        hello("camila");
        hello("Bob");


        //Call a Class 
        //Car myCar = new Car();
        //System.out.println(myCar.model);
        //myCar.drive();

        car myCar2 = new car("Nissan", "SD45120", 2020, "green");
        System.out.println(myCar2.make);
        myCar2.drive();


        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println("is: "+i);
          }
    }

    
    static void hello(String e){
        System.out.println("helloww " + e);
    }*/
    /*public static void main(String[] args){
        Usuario U1 = new Usuario("carlo","e@m.com","123456", "./imagen/imagen.jpg");
        System.out.println(U1.getEmail());
        Educacion Edu1 = new Educacion("Frontend Developer", 2018, "es un curso de ...", "./img/img.jpg");
        Educacion Edu2 = new Educacion("Fullstack Developer", 2019, "es un curso de ...", "./img/img1.jpg");
        U1.setNew_attribute(Edu1);
        U1.setNew_attribute(Edu2);
        System.out.println(U1.getNew_attribute());
    }*/

    public static void main(String[] args){

        //Crear usuario
        usuario U1 = new usuario();
        U1.setNombre("carlo");
        U1.setEmail("e@i.com");
        U1.setPassword("123456789");
        U1.setImagen("./img/img.jpg");

        // Crear una lista de educacion y agregarla al Usuario
        List<educacion> listaEducacion = new ArrayList<educacion>();
        educacion edu1 = new educacion();
        educacion edu2 = new educacion();

        edu1.setTitulo("Fullstack Developer");
        edu1.setPeriodo(2019);
        edu2.setTitulo("Frontend Developer");
        edu2.setPeriodo(2017);

        listaEducacion.add(edu1);
        listaEducacion.add(edu2);

        U1.setEducacion(listaEducacion);
        //System.out.println(U1.getEmail()+ " " + U1.getNombre() +" "+U1.getEducacion().toString());

        //Crear una lista de proyectos y agregarla al Usuario
        List<proyecto> listaProyecto = new ArrayList<proyecto>();
        proyecto proyecto1 = new proyecto();
        proyecto proyecto2 = new proyecto();

        proyecto1.setTitulo("neurosynch");
        proyecto1.setPeriodo(2021);
        proyecto1.setImagen("./img.jpg");
        cliente Cliente1 = new cliente("Milly Reyes");
        proyecto1.setClientes(Cliente1);
        List<tecnologia> listaTecno1 = new ArrayList<tecnologia>();
        tecnologia Html = new tecnologia("HTML5", 10);
        tecnologia Css = new tecnologia("css", 10);
        listaTecno1.add(Html);
        listaTecno1.add(Css);
        proyecto1.setTecnologias(listaTecno1);
        
        proyecto2.setTitulo("freakstudio");
        proyecto2.setPeriodo(2022);
        proyecto2.setImagen("./logo.jpg");
        cliente Cliente2 = new cliente("Camilo Moreno");
        proyecto2.setClientes(Cliente2);
        List<tecnologia> listaTecno2 = new ArrayList<tecnologia>();
        tecnologia Docker = new tecnologia("Docker", 10);
        tecnologia Python = new tecnologia("Python", 10);
        listaTecno1.add(Docker);
        listaTecno1.add(Python);
        proyecto2.setTecnologias(listaTecno2);
        

        listaProyecto.add(proyecto1);
        listaProyecto.add(proyecto2);

        U1.setProyectos(listaProyecto);
        System.out.println(U1.getEmail()+ " " + U1.getNombre() +" "+U1.getProyectos().toString());



    }

}
