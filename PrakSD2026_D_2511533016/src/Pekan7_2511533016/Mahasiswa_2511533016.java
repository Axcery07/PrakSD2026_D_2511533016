package Pekan7_2511533016;

public class Mahasiswa_2511533016 {
	 // Atribut
    private String nama_3016;
    private String nim_3016;
    private String prodi_3016;
 
    // Constructor
    public Mahasiswa_2511533016(String nama_3016, String nim_3016, String prodi_3016) {
        this.nama_3016 = nama_3016;
        this.nim_3016 = nim_3016;
        this.prodi_3016 = prodi_3016;
    }
 
    // Getter
    public String getNama_3016() { return nama_3016; }
    public String getNim_3016() { return nim_3016; }
    public String getProdi_3016() { return prodi_3016; }
 
    // Setter
    public void setNama_3016(String nama_3016) { this.nama_3016 = nama_3016; }
    public void setNim_3016(String nim_3016) { this.nim_3016 = nim_3016; }
    public void setProdi_3016(String prodi_3016) { this.prodi_3016 = prodi_3016; }
 
    // toString
    @Override
    public String toString() {
        return nama_3016 + " | " + nim_3016 + " | " + prodi_3016;
    }
}