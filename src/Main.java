import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {        
        ArrayList<Latihan>listlatihan = new ArrayList();
        Scanner scan = new Scanner (System.in);
        Scanner scanx = new Scanner (System.in);
        Latihan l1 = new Latihan();
        Latihan l2 = new Latihan();
        Latihan l3 = new Latihan();
        listlatihan.add(l1);
        listlatihan.add(l2);
        listlatihan.add(l3);        
        System.out.println("================================");
        System.out.println("======== DAFTAR MEMBER =========");
        System.out.println("================================");
        System.out.print("Nama : ");
        listlatihan.get(0).setNama(scanx.nextLine());
        System.out.print("Team : ");
        listlatihan.get(0).setTeam(scanx.nextLine());
        System.out.print("Umur : ");
        listlatihan.get(0).setUmur(scan.nextInt());
        System.out.print("Penampilan : ");
        listlatihan.get(0).setPenampilan(scan.nextInt());
        System.out.print("Suara : ");
        listlatihan.get(0).setSuara(scan.nextInt());
        System.out.print("Atitude : ");
        listlatihan.get(0).setAtitude(scan.nextInt());
        System.out.println("================================");
        System.out.print("Nama : ");
        listlatihan.get(1).setNama(scanx.nextLine());
        System.out.print("Team : ");
        listlatihan.get(1).setTeam(scanx.nextLine());
        System.out.print("Umur : ");
        listlatihan.get(1).setUmur(scan.nextInt());
        System.out.print("Penampilan : ");
        listlatihan.get(1).setPenampilan(scan.nextInt());
        System.out.print("Suara : ");
        listlatihan.get(1).setSuara(scan.nextInt());
        System.out.print("Atitude : ");
        listlatihan.get(1).setAtitude(scan.nextInt());
        System.out.println("================================");
        System.out.print("Nama : ");
        listlatihan.get(2).setNama(scanx.nextLine());
        System.out.print("Team : ");
        listlatihan.get(2).setTeam(scanx.nextLine());
        System.out.print("Umur : ");
        listlatihan.get(2).setUmur(scan.nextInt());
        System.out.print("Penampilan : ");
        listlatihan.get(2).setPenampilan(scan.nextInt());
        System.out.print("Suara : ");
        listlatihan.get(2).setSuara(scan.nextInt());
        System.out.print("Atitude : ");
        listlatihan.get(2).setAtitude(scan.nextInt());
        System.out.println("");
        System.out.println("-------- DAFTAR MEMBER --------");
        for (int i = 0; i <= 2; i++){
            System.out.println("Nama : " +listlatihan.get(i).getNama());
            System.out.println("Team : " +listlatihan.get(i).getTeam());
            System.out.println("Umur : " +listlatihan.get(i).getUmur());
            System.out.println("Rata - rata nilai : " +listlatihan.get(i).getNilai());
            System.out.println("-------------------------------");
        }
    }    
}

