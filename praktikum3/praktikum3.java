public class praktikum3 {
    public static void main(String[]args){
        // nama nim dan kelas
        String nama = "Zia Zakariyya Al-Ghanny";
        String nim = "0110222024";
        String kelas = "TI 13 / SE01";
        // membuat variable
        int floor = 14;
        int actualFloor;
        // membuat kondisi if else
        if (floor > 13){
            actualFloor = floor - 1;
        }
        else {
            actualFloor = floor;
        }

        System.out.println("Nama : " + nama);
        System.out.println("Nim :" + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("Lantai Sekarang adalah Lantai  " + actualFloor);
        

    }
}