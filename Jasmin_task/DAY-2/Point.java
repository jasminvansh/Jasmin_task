public class Point {
    private double x;
    private double y;

    public Point(int x,int y){
        this.x = x;
        this.y = y;
        System.out.println("Constructur with int parameter");
        System.out.println("x: "+ this.x + " " +"y:"+this.y);   
    
    }
    public Point(double x,double y){
        this.x = x;
        this.y = y;
        System.out.println("Constructur with Double parameter");
        System.out.println("x:" + this.x + " " + "y:" +  this.y);
    }




    public static void main(String[] args){
        Point point1 = new Point(10,20);

        Point point2 = new Point(1.1,0.7);

    }
}
