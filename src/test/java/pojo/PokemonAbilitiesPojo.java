package pojo;

import java.util.List;
import java.util.Map;

public class PokemonAbilitiesPojo {

    private PokemonAbilityPojo ability;
    private boolean is_hidden;
    private int slot;

    public PokemonAbilitiesPojo(){};

    public PokemonAbilityPojo getAbility() {
        return ability;
    }

    public void setAbility(PokemonAbilityPojo ability) {
        this.ability = ability;
    }

    public boolean getIs_hidden() {
        return is_hidden;}

    public void setIs_hidden(boolean is_hidden) {
        this.is_hidden = is_hidden;}

    public int getSlot() {
        return slot;}

    public void setSlot(int slot) {
        this.slot = slot;}
}
