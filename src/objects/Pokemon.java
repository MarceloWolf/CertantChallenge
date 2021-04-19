package objects;

import java.util.List;

public class Pokemon {

    private String name;
    private List <String> types;
    private Integer level;
    private List <Abilitie> abilities;
    private List <Evolution> evolutions;

    public Pokemon(String name, List<String> types, Integer level) {
        this.name = name;
        this.types = types;
        this.level = level;
    }

    public Pokemon(String name, List<String> types, Integer level, List<Abilitie> abilities, List<Evolution> evolutions) {
        this.name = name;
        this.types = types;
        this.level = level;
        this.abilities = abilities;
        this.evolutions = evolutions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public List<Abilitie> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<Abilitie> abilities) {
        this.abilities = abilities;
    }

    public List<Evolution> getEvolutions() {
        return evolutions;
    }

    public void setEvolutions(List<Evolution> evolutions) {
        this.evolutions = evolutions;
    }

    public void addType(String type){
        this.types.add(type);
    }
    public void removeType(String type){
        this.types.remove(type);
    }

    public void addEvolution(Evolution evolution){
        this.evolutions.add(evolution);
    }

    public void removeEvolution(Evolution evolution){
        this.evolutions.remove(evolution);
    }


    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", types=" + types +
                ", level=" + level +
                ", abilities=" + abilities +
                ", evolutions=" + evolutions +
                '}';
    }

    public String toStringAttributes() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", types=" + types +
                ", level=" + level +
                '}';
    }

    public String toStringAspects() {
        return "Pokemon{" +
                "abilities=" + abilities +
                ", evolutions=" + evolutions +
                '}';
    }
}
