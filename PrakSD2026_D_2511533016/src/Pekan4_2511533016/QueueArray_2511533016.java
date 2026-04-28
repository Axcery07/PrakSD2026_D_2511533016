package Pekan4_2511533016;

public class QueueArray_2511533016 {
	int front_3016, rear_3016, size_3016;
	int capacity_3016;
	int array_3016[];
	
	public QueueArray_2511533016(int capacity_3016) {
		this.capacity_3016 = capacity_3016;;
		front_3016 = this.size_3016 = 0;
		array_3016 = new int [this.capacity_3016];
	}

	boolean isFull(QueueArray_2511533016 queue) {
		return (queue.size_3016 == queue.capacity_3016);
	}

	boolean isEmpty(QueueArray_2511533016 queue) {
		return (queue.size_3016 == 0);
	}

	void enqueue(int item_3016) {
		if (isFull(this))
			return;
		this.rear_3016 = (this.rear_3016 + 1 ) % this.capacity_3016;
		this.array_3016[this.rear_3016] = item_3016;
		this.size_3016 = this.size_3016 + 1;
		System.out.println(item_3016 + " enqueue to queue");
	}

	int dequeue_3016() {
		if(isEmpty(this))
			return Integer.MIN_VALUE;
		int item_3016 = this.array_3016[this.front_3016];
		this.front_3016 = (this.front_3016 + 1) % this.capacity_3016 ;
		this.size_3016 = this.size_3016 - 1;
		return item_3016;
	}
	
	int front_3016() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;
		
		return this.array_3016[this.front_3016];
	}
	
	int rear_3016() {
		if(isEmpty(this))
			return Integer.MIN_VALUE;
		return this.array_3016 [this.rear_3016];
	}
	
	void display_3016() {
		int i;
		if (front_3016 == rear_3016) {
			System.out.println("\nAntrian Kosong \n");
			return;
		}
	
	
	//kunjungi dari belakang dan cetak
	for (i = front_3016; i < rear_3016; i++) {
		System.out.printf(" %d <== ", array_3016[i]);
		}
	}
	
	
}
	