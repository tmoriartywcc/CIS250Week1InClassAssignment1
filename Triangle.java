public class Triangle {
   private double base;
   private double height;
   
   //TODO: Complete two argument constructor for Triangle
   //TODO: Complete 0 argument constructor for Triangle

   public void setBase(double userBase){
      base = userBase;
   }
   public void setHeight(double userHeight) {
      height = userHeight;
   }
   
   public double getArea() {
      // TODO: complete area of a triangle method.
   }
   
   public void printInfo() {
      System.out.printf("Base: %.2f\n", base);
      System.out.printf("Height: %.2f\n", height);
      System.out.printf("Area: %.2f\n", getArea());
   }
}