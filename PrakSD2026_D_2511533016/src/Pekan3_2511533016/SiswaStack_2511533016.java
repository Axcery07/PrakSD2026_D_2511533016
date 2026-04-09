package Pekan3_2511533016;

import java.util.ArrayList;
class Siswa_2511533016 {
	String nama_3016;
	int nim_3016;
	
	public Siswa_2511533016(String nama_3016, int nim_3016) {
		this.nama_3016 = nama_3016;
		this.nim_3016 = nim_3016;
	}
	
	@Override
	public String toString() {
		return "Nim: " + nim_3016 + ", Nama: " + nama_3016;
	}
}
public class SiswaStack_2511533016 {
	private ArrayList<Siswa_2511533016> stack_3016;

	public SiswaStack_2511533016() {
		stack_3016 = new ArrayList<>();
	}
	
	public void push(Siswa_2511533016 mhs_3016) {
		stack_3016.add(mhs_3016);
	}
	
	public Siswa_2511533016 pop() {
		if (!isEmpty()) {
			return stack_3016.remove(stack_3016.size() - 1);
	}
	return null;
	}
	
	public Siswa_2511533016 peek() {
		if (!isEmpty()) {
			return stack_3016.get(stack_3016.size() - 1);
		}
		return null;
	}
	
	public boolean isEmpty() {
		return stack_3016.isEmpty();
	}
	
	public void tampilkanSiswa_2511533016() {
		for (int i = stack_3016.size() - 1; i >= 0; i--) {
			System.out.println(stack_3016.get(i));
		}
	}
	public static void main(String[] args) {
		SiswaStack_2511533016 studentStack_3016 = new SiswaStack_2511533016();
		
		Siswa_2511533016 mhs1_3016 = new Siswa_2511533016("Ali", 1);
		Siswa_2511533016 mhs2_3016 = new Siswa_2511533016("Boby", 2);
		Siswa_2511533016 mhs3_3016 = new Siswa_2511533016("Charles", 3);
		
		studentStack_3016.push(mhs1_3016);
		studentStack_3016.push(mhs2_3016);
		studentStack_3016.push(mhs3_3016);

		System.out.println("Siswa di dalam stack:");
		studentStack_3016.tampilkanSiswa_2511533016();
		
		System.out.println("siswa teratas" + studentStack_3016.peek());
		System.out.println("Mengeluarkan siswa teratas dari stack: " + studentStack_3016.pop());
		System.out.println("Mendaftar siswa setelah di pop : ");
		studentStack_3016.tampilkanSiswa_2511533016();
	}

}
