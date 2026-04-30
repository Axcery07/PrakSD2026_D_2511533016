package Pekan4_2511533016;
public class AntrianLoket_2511533016 {
	int front_3016, rear_3016, size_3016;
	int max_3016;
	String queue_3016[];
	
	
	public AntrianLoket_2511533016(int max_3016) {
		this.max_3016 = max_3016;;
		front_3016 = -1;
		rear_3016 = -1;
		queue_3016 = new String [this.max_3016];
	}

	boolean isFull_3016(AntrianLoket_2511533016 queue_3016) {
		return (queue_3016.rear_3016 == -queue_3016.max_3016 - 1);
	}

	boolean isEmpty_3016(AntrianLoket_2511533016 queue_3016) {
		return (queue_3016.front_3016 == -1);
	}
	
	void enqueue_3016(String namapelanggan_3016) {
		if (isFull_3016(this))
			return;
		if (this.front_3016 == -1)
		    this.front_3016 = 0;
		this.rear_3016 = (this.rear_3016 + 1) % this.max_3016;
		this.queue_3016[this.rear_3016] = namapelanggan_3016;
		System.out.println("Data berhasil ditambahkan ke antrian ");
	}
	
	String dequeue_3016() {
		if(isEmpty_3016(this))
			return null;	
		String namapelanggan_3016 = this.queue_3016[this.front_3016];
		 if (this.front_3016 == this.rear_3016) {
		        this.front_3016 = -1;
		        this.rear_3016 = -1;
		    } else {
		        this.front_3016 = (this.front_3016 + 1) % this.max_3016;
		    }
		return namapelanggan_3016;
	}
	
	void display_3016() {
		int number_3016 = 1;
		if (isEmpty_3016(this)) {
			System.out.println("Antrian Kosong");
			return;
		}
		
		for (int i_3016 = front_3016; i_3016 <= rear_3016; i_3016++) {
			System.out.println(number_3016 + ". " + queue_3016[i_3016]);
			number_3016++;
		}
		System.out.println();
	}
	
	String front_3016() {
		if (isEmpty_3016 (this))
			return null;
		return this.queue_3016[this.rear_3016];
	}
	
	void reverse_3016() {
	    String[] temp = new String[max_3016];
	    int count = 0;

	    while (!isEmpty_3016(this)) {
	        temp[count++] = dequeue_3016();
	    }

	    for (int i = count - 1; i >= 0; i--) {
	        enqueue_3016(temp[i]);
	    }
	}
}
