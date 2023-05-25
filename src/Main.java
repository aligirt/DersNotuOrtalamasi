import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kat = 0;
        double mat,tur,fiz,kim,muz,ort;
        String note = null;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz :");
        mat = inp.nextInt();
            if(mat>100){
                mat =0;
                note = "\nMatematik Notu Yanlış !";
            }
            else{
                kat++;
            }

        System.out.print("Türkçe Notunuz :");
        tur = inp.nextInt();
            if(tur>100){
                tur =0;
                note += "\nTürkçe Notu Yanlış !";
            }
            else{
                kat++;
            }

        System.out.print("Fizik Notunuz :");
        fiz = inp.nextInt();
            if(fiz>100){
                fiz =0;
                note += "\nFizik Notu Yanlış!";
            }
            else{
                kat++;
            }

        System.out.print("Kimya Notunuz :");
        kim = inp.nextInt();
            if(kim>100){
                kim =0;
                note += "\nKimya Notunu Yanlış !";
            }
            else{
                kat++;
            }

        System.out.print("Müzik Notunuz :");
        muz = inp.nextInt();
            if(muz>100){
                muz =0;
                note += "\nMüzik Notunuz Yanlış !";
            }
            else{
                kat++;
            }

        if(kat>0){
            ort = (mat+tur+fiz+kim+muz)/kat;
            switch(kat) {
                case 1:
                    System.out.print(note);
                    break;
                case 2:
                    System.out.print(note);
                    break;
                case 3:
                    System.out.print(note);
                    break;
                case 4:
                    System.out.print(note);
                    break;
            }
            if(ort > 55){
                System.out.println("\n\nOrtalama Notunuz :"+ort+"\nSınıfı Geçtiniz.");
            }
            else{
                System.out.println("\n\nOrtalama Notunuz :"+ort+"\nSınıfta Kaldınız.");
            }
        }
        else{
            System.out.println("\n\nBütün Notları Hatalı Girdiniz. Programı Yeniden Başlatınız. (Crtl+F5)");
        }
    }
}