package pojo;

import java.util.List;
import java.util.Map;

public class PokemonAbPojo {

    private List<PokemonAbilitiesPojo> abilities;

    private String base_experience;

    private List<Map<String, String>> forms;

    private List<Map<String, Object>> game_indices;

    private int height;

    private List<Object> held_items;

    private int id;

    private boolean is_default;

    private String location_area_encounters;

    private List<Map<String, Object>> moves;

    private String name;

    private int order;

    private List<Object> past_types;

    private Map<String, String> species;



    public List<PokemonAbilitiesPojo> getAbilities() {
        return abilities;
    }

    public PokemonAbPojo(){};

    public void setAbilities(List<PokemonAbilitiesPojo> abilities) {
        this.abilities = abilities;
    }
}
