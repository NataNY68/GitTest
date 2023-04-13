package pojo;

import java.util.List;
import java.util.Map;

public class PokemonAbilitiesPojo {

    private PokemonAbilityPojo ability;
    private String is_hidden;
    private String slot;

    public PokemonAbilitiesPojo(){};

    public PokemonAbilityPojo getAbility() {
        return ability;
    }

    public void setAbility(PokemonAbilityPojo ability) {
        this.ability = ability;
    }

    public String getIs_hidden() {
        return is_hidden;}

    public void setIs_hidden(String is_hidden) {
        this.is_hidden = is_hidden;}

    public String getSlot() {
        return slot;}

    public void setSlot(String slot) {
        this.slot = slot;}
}
