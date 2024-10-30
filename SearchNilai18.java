import java.util.Scanner;
public class SearchNilai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hasil =0,key,jmlhNilai;
        System.out.print("Masukkan banyaknya nilai yg akan diinput : ");
        jmlhNilai = sc.nextInt();
        int [] arrNilai=new int[jmlhNilai];
        for(int i =0 ; i<jmlhNilai;i++){
            System.out.print("Masukkan nilai mahasiswa ke-" +(i+1)+ " : ");
            arrNilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yg ingin dicari : ");
        key = sc.nextInt();
        for(int i =0; i < arrNilai.length;i++){
            if (key == arrNilai[i]) {
                hasil = i;
                System.out.println();
                System.out.println("Nilai "+ key + " ketemu, merupakan nilai mahasiswa ke-"+ hasil);
                System.out.println();
                break;
            }
        }
        if (hasil == 0) {
            System.out.println();
            System.out.println("Nilai yg dicari tidak ditemukan ");
            System.out.println();
        }
        
    }
}
