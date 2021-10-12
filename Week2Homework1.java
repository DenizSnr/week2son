package döngüler;

public class Week2Homework1 {
    public static void main(String[] args){
        int toplam= 0;
        int i = (int) (Math.random()*6 + 1);
        System.out.println("Attığın zar: " + i);
        while (toplam < 50)
        {
        if (i == 1 ){
            System.out.println("Game Over");
            break;
        }
        if (i == 2 ){
            System.out.println("Game Over");
            break;
        }
         if (i == 3){
            System.out.println("Oyun devam eder, ücret kazanamadınız.");
             continue;
        }

        else if (i == 4){
             toplam = i + toplam;
             System.out.println("Toplam Kazandığınız : " + toplam + ("$"));

            continue;
        }
        else if (i == 5){
             toplam = i + toplam;
             System.out.println("Toplam Kazandığınız : " + toplam + ("$"));

            continue;
        }
        else if (i == 6){
            System.out.println("Toplam Kazandığınız : " + i + ("$"));
            continue;
        }

    }
}

}