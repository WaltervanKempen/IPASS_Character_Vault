package Backend;

import java.util.ArrayList;

public class Account {
    private String Username;
    private String Password;
    private String EmailAdress;
    private ArrayList<Character> Personas = new ArrayList<Character>();

    public Account(String UN, String Pass, String EM){
        this.Username = UN;
        this.Password = Pass;
        this.EmailAdress = EM;
    }

    public boolean logIn(String UN, String Pass){
        if (UN.equals(Username) && Pass.equals(Password)){
            return true;
        }
        return false;
    }

    public String getUsername() {
        return Username;
    }

    public String getEmailAdress() {
        return EmailAdress;
    }

    public void setEmailAdress(String EM) {
        EmailAdress = EM;
    }

    public void addPersona(Character Persona){
        Personas.add(Persona);
    }
}
