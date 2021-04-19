package test;


import dataBase.DataBase;
import objects.Abilitie;
import objects.Evolution;
import objects.Pokemon;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PokemonTest {
    private DataBase db;
    private Pokemon pokemon1;
    private Pokemon pokemon2;
    private Pokemon pokemon3;
    private Pokemon pokemon4;
    private Pokemon pokemon5;
    private Pokemon pokemon6;
    private Pokemon pokemon7;
    private Pokemon pokemon8;
    private Pokemon pokemon9;
    private Pokemon pokemon10;
    private List <Pokemon> pokemons;
    private Abilitie abilitie;
    private Evolution evolution;
    private Evolution evolution2;
    private Abilitie abilitie2;
    private Abilitie aspect4;
    private List<String> tipos1;
    private List<String> tipos2;
    private List <Abilitie> abilities;
    private List <Abilitie> abilities2;
    private List <Evolution> evolutions;
    private List <Evolution> evolutions2;


    @BeforeEach
    void setUp(){
        db = new DataBase();
        evolutions = new ArrayList<>();
        abilities = new ArrayList<>();
        abilities2 = new ArrayList<>();
        evolutions2 = new ArrayList<>();
        tipos2 = new ArrayList<>();
        tipos2.add("Agua");
        tipos2.add("Planta");
        tipos1= new ArrayList<>();
        tipos1.add("Fuego");
        tipos1.add("Tierra");
        evolution = new Evolution("Dragon",tipos1,9);
        evolutions.add(evolution);
        evolution2 = new Evolution("Caballo",tipos1,10);
        evolutions2.add(evolution2);
        abilitie = new Abilitie("Correr",tipos1,8);
        abilities.add(abilitie);
        abilitie2 = new Abilitie("Escupir fuego",tipos1,6);
        abilities2.add(abilitie2);
        pokemon1 = new Pokemon("Pikachu",tipos1,8,abilities,evolutions);
        pokemons = new ArrayList<>();
        pokemon2 = new Pokemon("Raichu",tipos2,9,abilities2,evolutions2);
        pokemon3 = new Pokemon("volvasor",tipos1,11,abilities,evolutions);
        pokemon4 = new Pokemon("karthus",tipos2,10,abilities2,evolutions2);
        pokemon5 = new Pokemon("snorlax",tipos1,10,abilities,evolutions);
        pokemon6 = new Pokemon("Zygarde",tipos2,10,abilities2,evolutions2);
        pokemon7 = new Pokemon("Kyurem",tipos1,10,abilities,evolutions);
        pokemon8 = new Pokemon("Arceus",tipos2,10,abilities2,evolutions2);
        pokemon9 = new Pokemon("Rayquaza",tipos1,10,abilities,evolutions);
        pokemon10 = new Pokemon("Dialga",tipos2,10,abilities2,evolutions2);
        pokemons.add(pokemon1);
        pokemons.add(pokemon2);
        pokemons.add(pokemon3);
        db.setPokemons(pokemons);
        db.addPokemon(pokemon5);
        db.addPokemon(pokemon6);
        db.addPokemon(pokemon7);
        db.addPokemon(pokemon8);
        db.addPokemon(pokemon9);
        db.addPokemon(pokemon10);
    }
        //db.getPokemons().size() = 9 because pokemon 4 is not in the database yet
    @Test
    void listAllPokemons(){
        assertEquals(9,db.getPokemons().size());
    }

    @Test
    void showPokemonAttributes(){
        assertEquals(db.showPokemonAtribbutes("Pikachu"),pokemon1.toStringAttributes());
        assertEquals(db.showPokemonAtribbutes("Raichu"),pokemon2.toStringAttributes());
        assertEquals(db.showPokemonAtribbutes("volvasor"),pokemon3.toStringAttributes());
        assertEquals(db.showPokemonAtribbutes("snorlax"),pokemon5.toStringAttributes());
        assertEquals(db.showPokemonAtribbutes("Zygarde"),pokemon6.toStringAttributes());
        assertEquals(db.showPokemonAtribbutes("Kyurem"),pokemon7.toStringAttributes());
        assertEquals(db.showPokemonAtribbutes("Arceus"),pokemon8.toStringAttributes());
        assertEquals(db.showPokemonAtribbutes("Rayquaza"),pokemon9.toStringAttributes());
        assertEquals(db.showPokemonAtribbutes("Dialga"),pokemon10.toStringAttributes());

    }

    @Test
    void showPokemonAspects(){
        assertEquals(db.showPokemonAspects("Pikachu"),pokemon1.toStringAspects());
        assertEquals(db.showPokemonAspects("Raichu"),pokemon2.toStringAspects());
        assertEquals(db.showPokemonAspects("volvasor"),pokemon3.toStringAspects());
        assertEquals(db.showPokemonAspects("snorlax"),pokemon5.toStringAspects());
        assertEquals(db.showPokemonAspects("Zygarde"),pokemon6.toStringAspects());
        assertEquals(db.showPokemonAspects("Kyurem"),pokemon7.toStringAspects());
        assertEquals(db.showPokemonAspects("Arceus"),pokemon8.toStringAspects());
        assertEquals(db.showPokemonAspects("Rayquaza"),pokemon9.toStringAspects());
        assertEquals(db.showPokemonAspects("Dialga"),pokemon10.toStringAspects());
    }
    @Test
    void showEvolutionsAndInformation(){
        assertEquals(db.showPokemonEvolutions("Pikachu"),pokemon1.getEvolutions().toString());
        assertEquals(db.showPokemonEvolutions("Raichu"),pokemon2.getEvolutions().toString());
        assertEquals(db.showPokemonEvolutions("volvasor"),pokemon3.getEvolutions().toString());
        assertEquals(db.showPokemonEvolutions("snorlax"),pokemon5.getEvolutions().toString());
        assertEquals(db.showPokemonEvolutions("Zygarde"),pokemon6.getEvolutions().toString());
        assertEquals(db.showPokemonEvolutions("Kyurem"),pokemon7.getEvolutions().toString());
        assertEquals(db.showPokemonEvolutions("Arceus"),pokemon8.getEvolutions().toString());
        assertEquals(db.showPokemonEvolutions("Rayquaza"),pokemon9.getEvolutions().toString());
        assertEquals(db.showPokemonEvolutions("Dialga"),pokemon10.getEvolutions().toString());
    }

        //Now i add the pokemon 4 in the database
    @Test
    void addPokemonAndLaterRetrieve(){
        db.addPokemon(pokemon4);
        assertEquals(10,db.getPokemons().size());
        assertEquals(pokemon4,db.getPokemon("karthus"));
    }

    @Test
    void knownPokemonsInformationUpdate(){
        db.editPokemonName(pokemon5,"carlitos");
        assertEquals("carlitos",pokemon5.getName());
    }


}


