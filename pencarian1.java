import javax.swing.JOptionPane;

public class pencarian1 {
    public static void main(String[] args) {
        int data[] = new int[5];
        int i, angka, cari;
        boolean ketemu;

        for (i = 0; i < data.length; i++){
            angka=Integer.parseInt(JOptionPane.showInputDialog("masukan angka ke-"+(i+1)));
            data[i]=angka;
        }
        System.out.print("angka dimasukan = {");
        for(i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println("}");
        cari = Integer.parseInt(JOptionPane.showInputDialog("masukan angka yang ingin di cari"));
        System.out.println();("angka dicari : "+ cari);
        ketemu = false;
        for (i = 0; i < data.length; i++){
            if (data[i] == cari){
                ketemu = true;
                break;
            }
            if (i==4){
                ketemu=false;
                break;
            }
        }
        if(ketemu) {
            System.out.println("angka ditemukan dalam urutan ke-" + (i+1));
        } else {
            System.out.println("angka tidak ditemukan");
        }

    }
}