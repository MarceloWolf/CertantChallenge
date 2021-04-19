package dataBase;
import objects.Evolution;
import objects.Pokemon;

import java.util.List;

public class DataBase {
    private List <Pokemon> pokemons;

    public DataBase() {
    }

    public DataBase(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public void addPokemon(Pokemon pokemon){
        if(pokemon == null){
            throw new RuntimeException("The pokemon does not exist");
        }
        this.pokemons.add(pokemon);
    }

    public Pokemon getPokemon(String name){
        Pokemon pokemon = null;
        for (int i=0; i<pokemons.size();i++){
            if(pokemons.get(i).getName().equals(name)){
                    pokemon = pokemons.get(i);
            }
        }
        return pokemon;
    }

    public void editPokemonName(Pokemon pokemon, String name){
        if (!this.pokemons.contains(pokemon)){
            throw new RuntimeException("The pokemon does not exist in the database");

        }
        pokemon.setName(name);
    }

    public void addPokemonType(Pokemon pokemon, String type){
        if(!this.pokemons.contains(pokemon)){
            throw  new RuntimeException("The pokemon does not exist in the database");
        }
        pokemon.addType(type);
    }

    public void removePokemonType(Pokemon pokemon,String type){
        if(!this.pokemons.contains(pokemon)){
            throw  new RuntimeException("The pokemon does not exist in the database");
        }
        pokemon.removeType(type);

    }

    public void addPokemonEvolution(Pokemon pokemon , Evolution evolution){
        if (!this.pokemons.contains(pokemon)){
            throw new RuntimeException("The pokemon does not exist in the database");
        }
        pokemon.addEvolution(evolution);
    }

    public String showPokemonAtribbutes(String name){
        Pokemon pokemon = null;
        for(int i=0; i<pokemons.size();i++){
            if(this.getPokemons().get(i).getName().equals(name)){
                pokemon = this.getPokemons().get(i);
            }
        }
        return pokemon.toStringAttributes();
    }

    public String showPokemonAspects(String name){
        Pokemon pokemon = null;
        for(int i=0; i<pokemons.size();i++){
            if(this.getPokemons().get(i).getName().equals(name)){
                pokemon = this.getPokemons().get(i);
            }
        }
        return pokemon.toStringAspects();
    }

    public String showPokemonEvolutions(String name){
        Pokemon pokemon = null;
        for(int i=0; i<pokemons.size();i++){
            if(this.getPokemons().get(i).getName().equals(name)){
                pokemon = this.getPokemons().get(i);
            }
        }
        return pokemon.getEvolutions().toString();
    }






}
