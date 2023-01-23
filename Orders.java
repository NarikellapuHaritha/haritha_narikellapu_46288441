package LambdaAssignment;
	import java.util.ArrayList;
	public class Orders {
		private int price;
		private String status;
		
		public Orders(int price,String status) {
			this.price=price;
			this.status=status;
		}
		 //getters and setters

	public void setStatus(String status) {
		this.status=status;
	}
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public static ArrayList<Orders>listofOrders(ArrayList<Orders>orders){
		ArrayList<Orders>listOrders=new ArrayList<>();
		for(Orders order:orders) {
			if(order.getPrice()>10000&&(order.getStatus().equals("ACCEPTED")) || order.getStatus().equals("COMPLETED")){
				System.out.println("inside if");
				Orders ord=new Orders(order.getPrice(),order.getStatus());
				listOrders.add(ord);
				
			}
		}
		return listOrders;
	}
	public static void main(String[] args) {
		// TODO Auto-generated metho stub
		Orders o1=new Orders(15000,"ACCEPTED");
		Orders o2=new Orders(1000,"COMPLETED");
		Orders o3=new Orders(50000,"REJECTED");
		
		ArrayList<Orders> list=new ArrayList<>();
		list.add(o1);
		list.add(o2);
		list.add(o3);
		System.out.println(list);
		System.out.println(listofOrders(list));
	}

	}

