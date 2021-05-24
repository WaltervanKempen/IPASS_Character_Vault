package Backend;

import java.util.ArrayList;

public class Character {
    private String Name;
    private int Level;
    private int HTM;
    private int CHP;
    private int THP;
    private int ProficiencyBonus;
    private ArrayList<String> Proficiencies = new ArrayList<String>();
    private String Allignment;
    private int STR;
    private int DEX;
    private int CON;
    private int INT;
    private int WIS;
    private int CHA;
    private ArrayList<String> skillmodifiers = new ArrayList<String>();
    private Race ras;
    //private Class Class;
    //private ArrayList<Items> Invetaris = new ArrayList<Items>();

    public Character(String Nm, int lvl, ArrayList<String> Prof, String All, int str, int dex, int con, int Int, int wis, int cha){
        this.Name = Nm;
        this.Level = lvl;
        if (lvl <= 4){ this.ProficiencyBonus = 2; }
        else if (lvl >= 5 && lvl <= 8){ this.ProficiencyBonus = 3; }
        else if (lvl >= 9 && lvl <= 12){ this.ProficiencyBonus = 4; }
        else if (lvl >= 13 && lvl <= 16){ this.ProficiencyBonus = 5; }
        else if (lvl >= 17){ this.ProficiencyBonus = 6; }
        this.Proficiencies = Prof;
        this.Allignment = All;
        this.STR = str;
        this.DEX = dex;
        this.CON = con;
        this.INT = Int;
        this.WIS = wis;
        this.CHA = cha;
        this.HTM = (Class.hitdice + 0/*hitpoinst modifier*/ + skillMod(con, 0));
    }
    
    public int skillMod(int skill, int modifier){
        int out = 0;
        if (skill <= 1){ out = -5; }
        else if (skill >= 2 && skill <= 3){ out = -4; }
        else if (skill >= 4 && skill <= 5){ out = -3; }
        else if (skill >= 6 && skill <= 7){ out = -2; }
        else if (skill >= 8 && skill <= 9){ out = -1; }
        else if (skill >= 10 && skill <= 11){ out = 0; }
        else if (skill >= 12 && skill <= 13){ out = 1; }
        else if (skill >= 14 && skill <= 15){ out = 2; }
        else if (skill >= 16 && skill <= 17){ out = 3; }
        else if (skill >= 18 && skill <= 19){ out = 4; }
        else if (skill >= 20 && skill <= 21){ out = 5; }
        else if (skill >= 22 && skill <= 23){ out = 6; }
        else if (skill >= 24 && skill <= 25){ out = 7; }
        else if (skill >= 26 && skill <= 27){ out = 8; }
        else if (skill >= 28 && skill <= 29){ out = 9; }
        else if (skill >= 30){ out = 10; }
        out += modifier;
        return out;
    }
}
