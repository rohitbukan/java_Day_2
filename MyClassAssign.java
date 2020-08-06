class Shape{
    int height;
    int width;
    void disp(){
        System.out.println("Height = "+this.height+"\t"+"width ="+this.width);
    }

}
public class MyClassAssign{
    public static void main(String args[]){
        Shape h1=new Shape();
        
        h1.height=44;
        h1.width=33;
        h1.disp();
        

    }
}