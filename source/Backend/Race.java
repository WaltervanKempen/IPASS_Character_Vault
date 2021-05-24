package Backend;

import java.util.ArrayList;

public class Race {
    private String naam;
    private ArrayList<Skill> Eigenschappen = new ArrayList<Skill>();

    public Race(String NM, ArrayList<Skill> Skills){
        this.naam = NM;
        this.Eigenschappen = Skills;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public ArrayList<Skill> getEigenschappen() {
        return Eigenschappen;
    }

    public void setEigenschappen(ArrayList<Skill> eigenschappen) {
        Eigenschappen = eigenschappen;
    }
}


