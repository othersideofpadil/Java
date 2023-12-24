class ABC {
    // mengintansiasi variable di class ABC
    int x = 9;
}

    public class ShallowCopyExample {
        // main method 
        public static void main(String argvs[]) {
            // membuat objek
            ABC obj1 = new ABC();

            // membuat objek baru obj2
            ABC obj2 = new ABC();

            // menggunakan obj2
            obj2.x = 45;

            // output
            System.out.println("The value of x is : " + obj1.x);;
            
        } 
    }