package Backend;

import java.util.ArrayList;

public class Skill {
    private String Naam;
    private String Description;
    private ArrayList<String> Modifiers;
    private ArrayList<String> Abilities;

    public Skill(String NM, String DESC){
        this.Naam = NM;
        this.Description = DESC;
    }

    public Skill(String NM, String DESC, ArrayList<String> MOD){
        this.Naam = NM;
        this.Description = DESC;
        this.Modifiers = MOD;
    }

    public Skill(String NM, String DESC, ArrayList<String> MOD, ArrayList<String> ABS){
        this.Naam = NM;
        this.Description = DESC;
        this.Modifiers = MOD;
        this.Abilities = ABS;
    }

    public String getNaam() {
        return Naam;
    }

    public void setNaam(String naam) {
        Naam = naam;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public ArrayList<String> getModifiers() {
        return Modifiers;
    }

    public void setModifiers(ArrayList<String> modifiers) {
        Modifiers = modifiers;
    }

    public ArrayList<String> getAbilities() {
        return Abilities;
    }

    public void setAbilities(ArrayList<String> abilities) {
        Abilities = abilities;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "Naam='" + Naam + '\'' +
                ", Description='" + Description + '\'' +
                ", Modifiers=" + Modifiers +
                ", Abilities=" + Abilities +
                '}';
    }
}

