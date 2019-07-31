public class MyClass {
    public static void main(String[] args) {
        //System.out.println("Hello world");
        //System.out.println("Hello \n\t\"Thu Xinh\"");
        /*
        String name="HungDKa";//đây là khai báo biến name
        int Tuoi=23;
        System.out.println(name);
        System.out.println(Tuoi);

        String name1= "Pi";
        float GiaTri = 3.14f;
        System.out.println(name1);
        System.out.println(GiaTri);
        */
        int a = 20;
        int b = 30;
        int c = a+b;
        System.out.println("Sum:"+c);
        int d = b - c;
        System.out.println("subtract:"+d);
        int e = d * c;
        System.out.println("muntipal:" + e);
        double f =(double)a/b;
        System.out.println("devide:"+ f);
        //devide:0.6666666865348816bye
        int b1= 2147483647;
        int b2 = 1;
        int b3 = b1+b2;
        System.out.println(b3);

        float f1 = 34E3f;
        double d1 = 34E3d;
        System.out.println("f1 = "+ f1 + ", d1 = "+d1);
    }
}
