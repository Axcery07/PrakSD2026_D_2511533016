package Pekan5_2511533016;

public class Pasien_2511533016 {
	    String namaPasien_3016;
	    String penyakit_3016;
	    int nomorAntrian_3016;
	    Pasien_2511533016 next_3016;

	    // Constructor
	    public Pasien_2511533016(String nama_3016, String penyakit_3016, int nomor_3016) {
	        this.namaPasien_3016 = nama_3016;
	        this.penyakit_3016 = penyakit_3016;
	        this.nomorAntrian_3016 = nomor_3016;
	        this.next_3016= null;
	    }

	    // Getter
	    public String getNama_3016() {
	        return namaPasien_3016;
	    }

	    public String getPenyakit_3016() {
	        return penyakit_3016;
	    }

	    public int getNomor_3016() {
	        return nomorAntrian_3016;
	    }

	    public Pasien_2511533016 getNext_3016() {
	        return next_3016;
	    }

	    // Setter
	    public void setNext_3016(Pasien_2511533016 next) {
	        this.next_3016 = next;
	    }
	}