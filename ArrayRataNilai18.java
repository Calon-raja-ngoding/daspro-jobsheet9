import java.util.Scanner;
public class ArrayRataNilai18 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int lulus = 0,tdklulus = 0,jmlhMhs;
        double total= 0,rata2,rata2lulus,rata2tdklulus,totallulus=0,totaltdklulus=0;
        System.out.print("Masukkan jumlah mahasiswa : ");
        jmlhMhs = sc.nextInt();
        int nilaiMhs[]=new int[jmlhMhs];
        for (int i =0; i< nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" +(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i =0; i< nilaiMhs.length; i++){
            total+= nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                lulus++;
                totallulus+= nilaiMhs[i];
            }else{
                tdklulus++;
                totaltdklulus += nilaiMhs[i];
            }
        }
        rata2 = total/nilaiMhs.length;
        rata2lulus=totallulus/lulus;
        rata2tdklulus=totaltdklulus/tdklulus;
        System.out.println("Rata-rata nilai = " + rata2);
        System.out.println("Jumlah mahasiswa yg lulus : "+ lulus);
        System.out.println("Rata-rata nilai mahasiswa yg lulus = "+rata2lulus);
        System.out.println("Jumlah mahasiswa yg tidak lulus : "+ tdklulus);
        System.out.println("Rata-rata nilai mahasiswa yg tidak lulus = "+rata2tdklulus);
    }
}
