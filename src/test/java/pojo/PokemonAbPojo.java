package pojo;

import java.util.List;
import java.util.Map;

public class PokemonAbPojo {

    private List<PokemonAbilitiesPojo> abilities;

    private String base_experience;

    private List forms;

    private List game_indices;

    private int height;

    private List held_items;

    private int id;

    private boolean is_default;

    private String location_area_encounters;

    private List moves;

    private String name;

    private int order;

    private List<Object> past_types;

    private Map<String, String> species;

    private Map sprites;

    private List stats;

    private  List types;

    private int weight;


    public String getBase_experience() {
        return base_experience;
    }

    public void setBase_experience(String base_experience) {
        this.base_experience = base_experience;
    }

    public List getForms() {
        return forms;
    }

    public void setForms(List forms) {
        this.forms = forms;
    }

    public List getGame_indices() {
        return game_indices;
    }

    public void setGame_indices(List game_indices) {
        this.game_indices = game_indices;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public List getHeld_items() {
        return held_items;
    }

    public void setHeld_items(List held_items) {
        this.held_items = held_items;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isIs_default() {
        return is_default;
    }

    public void setIs_default(boolean is_default) {
        this.is_default = is_default;
    }

    public String getLocation_area_encounters() {
        return location_area_encounters;
    }

    public void setLocation_area_encounters(String location_area_encounters) {
        this.location_area_encounters = location_area_encounters;
    }

    public List getMoves() {
        return moves;
    }

    public void setMoves(List moves) {
        this.moves = moves;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public List<Object> getPast_types() {
        return past_types;
    }

    public void setPast_types(List<Object> past_types) {
        this.past_types = past_types;
    }

    public Map<String, String> getSpecies() {
        return species;
    }

    public void setSpecies(Map<String, String> species) {
        this.species = species;
    }

    public Map getSprites() {
        return sprites;
    }

    public void setSprites(Map sprites) {
        this.sprites = sprites;
    }

    public List getStats() {
        return stats;
    }

    public void setStats(List stats) {
        this.stats = stats;
    }

    public List getTypes() {
        return types;
    }

    public void setTypes(List types) {
        this.types = types;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public List<PokemonAbilitiesPojo> getAbilities() {
        return abilities;
    }

   // public PokemonAbPojo(){};

    public void setAbilities(List<PokemonAbilitiesPojo> abilities) {
        this.abilities = abilities;
    }
}
