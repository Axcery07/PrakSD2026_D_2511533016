package Pekan6_2511533016;

public class Lagu_2511533016 {
    String judul_3016;
    String penyanyi_3016;
    Lagu_2511533016 next_3016;
    Lagu_2511533016 prev_3016;

    // Constructor
    public Lagu_2511533016(String judul_3016, String penyanyi_3016) {
        this.judul_3016 = judul_3016;
        this.penyanyi_3016 = penyanyi_3016;
        this.next_3016 = null;
        this.prev_3016 = null;
    }

    // Getter 
    public String getJudul_3016() { 
    	return judul_3016; 
    	}
    public String getPenyanyi_3016() { 
    	return penyanyi_3016; 
    	}
    
    // Setter
    public void setJudul_3016 (String judul_3016) {
    	this.judul_3016 = judul_3016;
    }
    public void setPenyanyi_3016 (String penyanyi_3016) {
    	this.penyanyi_3016 = penyanyi_3016;
    }
}