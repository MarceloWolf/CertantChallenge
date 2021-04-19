package objects;

import java.util.List;

public abstract class  Aspect {
    private String name;
    private List <String> types;
    private Integer level;

   public Aspect(){

   }

    public Aspect(String name, List<String> types, Integer level) {
        this.name = name;
        this.types = types;
        this.level = level;
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

    @Override
    public String toString() {
        return "Aspect{" +
                "name='" + name + '\'' +
                ", types=" + types +
                ", level=" + level +
                '}';
    }
}



