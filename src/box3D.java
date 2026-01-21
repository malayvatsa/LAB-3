//A Plastic manufacturer sells plastic in different shapes like 2D sheet and 3D box. The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per cubic ft. Implement it in Java to calculate the cost of plastic as per the dimensions given by the user where 3D inherits from 2D.
import java.util.Scanner;
class sheet2D{
    int l,b;
    int cost,area;
    sheet2D(int l,int b){
        this.l=l;
        this.b=b;
        cost=0;
        area=0;
    }
    void cost(){
        area=l*b;
        cost=40*area;
        System.out.println("Cost of sheet of plastic is: "+cost);
    }
}
class box3D extends sheet2D {
    int h,vol;
    box3D(int l,int b,int h){
        super(l,b);
        this.h=h;
        vol=0;
    }
    void cost() {
        super.cost();
        vol = l * b * h;
        cost = 60 * vol;
        System.out.println("Cost of box of plastic is: " + cost);
    }
}
class PlasticDemo{
    public static void main(String args[]){
        int l,b,h;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of sheet required: ");
        l=sc.nextInt();
        System.out.print("Enter the breadth of sheet required: ");
        b=sc.nextInt();
        System.out.print("Enter the height of sheet required: ");
        h=sc.nextInt();
        box3D obj=new box3D(l,b,h);
        obj.cost();
    }
}