public class praktikum {
    public static void main(String[]args){
        // nama dan nim
        String nama = "Muhammad Fadhillah";
        String nim = "0110222299";
        
        // input nilai
        int a = 1;
        int b = 2;
        int y = 3;

        // rumus
        float c =  (float) Math.sqrt((a * a + b * b) - (2 * a * b * Math.cos(y)));
        
        // output
        System.out.println("Nama : " + nama);
        System.out.println("Nim : " + nim);
        System.out.print("Hasil = " + c );
        
    }
}
