package dev.kim;

public class Main {
	public static void main(String[] args) {
		
		Queue queue = new Queue(8);
		
		queue.show();
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(6);
		queue.enqueue(7);
		queue.enqueue(8);
		queue.enqueue(9);
		
		queue.show();
		
		queue.dequeue();
		
		queue.show();
		
		queue.enqueue(9);
		
		queue.show();
		
		queue.dequeue();
		System.out.println(queue.isEmpty());
		System.out.println(queue.isFull());
		queue.show();
		
		System.out.println("");
		System.out.println("เกมจ้ำจี้มะเขือเปาะแปะ");
		Queue q = new Queue(15);
		int lifeA = 5;
		int lifeB = 5;
		int lifeC = 5;
		
		//สมมติว่ามีคนเล่น 3 คน คนละ 5 นิ้ว
		// 1-5 6-10 11-15
		for(int i=1;i<15;i++) {
			q.enqueue(i);
		}
		
		while (lifeA > 0 && lifeB > 0 && lifeC > 0) {
			//มี 50 พยางค์
			// 49 พยางค์
			for(int i=0;i<50-1;i++) {
				int c = q.dequeue();
				q.enqueue(c);
			}
			// พยางค์ที่ 50 นิ้วหายไป
			int last = q.dequeue();
			System.out.println("last = " + last);
			
			if(last >= 1 && last <= 5) lifeA--;
			if(last >= 6 && last <= 10) lifeB--;
			if(last >= 11 && last <= 15) lifeC--;
			
			q.show();
		}
		
		System.out.println("A: "+lifeA);
		System.out.println("B: "+lifeB);
		System.out.println("C: "+lifeC);
		
		if( lifeA == 0 ) System.out.println("A Lose");
		else if( lifeB == 0 ) System.out.println("B Lose");
		else if( lifeC == 0 ) System.out.println("C Lose");
	}
}
