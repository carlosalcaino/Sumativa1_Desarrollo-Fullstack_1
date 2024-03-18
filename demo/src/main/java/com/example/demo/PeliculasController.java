package com.example.demo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
public class PeliculasController {
    private List<Peliculas> peliculas = new ArrayList<>();

    public PeliculasController(){
        
        peliculas.add(new Peliculas(1, "Talk to Me", 2022,"Danny Philippou","Terror","Jovenes que juegan a ser poseidos por una mano misteriosa"));
        peliculas.add(new Peliculas(2,"Wonka", 2023,"Paul King","Fantasia","Un Musical donde se retrata la vida de un Wonka más joven"));
        peliculas.add(new Peliculas(3, "Un espía y medio", 2016,"Rawson Marshall Thurber","Comedia","Un agente de la CIA que sufria Bullying se reencuentra con sus antiguos compañeros de la escuela"));
        peliculas.add(new Peliculas(4, "Oppenheimer", 2023,"Christopher Nolan","Biográfica de suspenso","En tiempos de guerra, el físico Oppenheimer, lidera los ensayos nucleares para construir la bomba atómica"));
        peliculas.add(new Peliculas(5, "Hombres de honor", 2000,"George Tillman Jr","Drama","El primer afroamericano en alistarse en la Marina y servir como buzo para el ejército de Estados Unidos"));
    }

    @GetMapping("/peliculas")
    public List<Peliculas> getPeliculas() {
        return peliculas;
    }

    @GetMapping("/peliculas/{id}")
    public Peliculas getPeliculasById(@PathVariable int id){
        for (Peliculas peliculas : peliculas){
            if (peliculas.getId() == id){
                return peliculas;
            }
           
          
        }
        return null;
    }

}
