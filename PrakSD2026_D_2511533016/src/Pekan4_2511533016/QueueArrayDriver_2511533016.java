package Pekan4_2511533016;

public class QueueArrayDriver_2511533016 {

	public static void main(String[] args) {
		QueueArray_2511533016 queue_3016 = new QueueArray_2511533016(1000);
		queue_3016.enqueue(10);
		queue_3016.enqueue(20);
		queue_3016.enqueue(30);
		queue_3016.enqueue(40);
		System.out.println("Item di depan " + queue_3016.front_3016() );
		System.out.println("Item di paling belakang "+ queue_3016.rear_3016());
		System.out.println("Tampilan queue");
		queue_3016.display_3016();
		System.out.println();
		System.out.println(queue_3016.dequeue_3016() + " dihapus dari queue ");
		System.out.println("Item didepan: " + queue_3016.front_3016());
		System.out.println("Item dibelakang: " + queue_3016.rear_3016());
		System.out.println("Tampilan queue setelah satu data dihapus ");
		queue_3016.display_3016();
	}
	

}
