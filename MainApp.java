package advance.dev;

public class MainApp {
   public static void main(String[] args) {
	   Shape shape = null;
	   Shape shape1 = null;
	   Shape shape2 = null;
	   shape = new Triangle(5, 6, 7);
	   shape1 = new Circle(10);
	   shape2 = new Rectangle(10, 5);
	   System.out.println("chu vi hình tam giác: "+shape.chuvi());
	   System.out.println("diện tích hình tam giác: "+shape.dientich());
	   System.out.println("chu vi hình tròn: "+shape1.chuvi());
	   System.out.println("diện tich hình tròn: "+shape1.dientich());
	   System.out.println("chu vi hình chữ nhật: "+shape2.chuvi());
	   System.out.println("diện tích hình chữ nhật: "+shape2.dientich());
   }
}
