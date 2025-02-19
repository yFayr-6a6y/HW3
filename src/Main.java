public class Main {
    public static void main(String[] args) {
        int x = 1000000;
        byte a = 67;
        short p = 27897;
        long b = 987678965549L;
        double l = 27.12;
        float s = 2.786f;
        System.out.println("Значение переменной x с типом int равно " + x);
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной p с типом short равно " + p);
        System.out.println("Значение переменной b с типом long равно " + b);
        System.out.println("Значение переменной l с типом double равно " + l);
        System.out.println("Значение переменной s с типом float равно " + s);




        byte lP = 23;
        byte aS = 27;
        byte eA = 30;
        short paper = 480;
        int pFH = paper / (lP + aS + eA);
        System.out.println("На каждого ученика рассчитано " + pFH + " листов бумаги");



        byte bFM = 8;
        byte fM = 20;
        short sM = 1440;
        short tM = 4320;
        int foM = 43200;
        System.out.println("За " + fM +" минут машина произвела " + fM*bFM + " штук бутылок");
        System.out.println("За " + sM +" минут машина произвела " + sM*bFM + " штук бутылок");
        System.out.println("За " + tM +" минут машина произвела " + tM*bFM + " штук бутылок");
        System.out.println("За " + foM +" минут машина произвела " + foM*bFM + " штук бутылок");



        byte nC = 120;
        byte bC = 4;
        byte wC = 2;
        int clss = nC/(bC + wC);
        System.out.println("В школе, где " + clss + " классов, нужно " + clss*wC + " банок белой краски и " + clss*bC + " банок коричневой краски");



        byte gbanana = 80;
        byte gmilk = 105;
        byte gice = 100;
        byte gegg = 70;
        int breakfast = 5*gbanana + 2*gmilk + 2*gice + 4*gegg;
        System.out.println((double)breakfast /1000);



        short purpose = 7000;
        short fPP = 250;
        short sPP = 500;
        System.out.println("Если сбрасывать по " + fPP + " граммов за день, то понадобится " + purpose/fPP + " дней");
        System.out.println("Если сбрасывать по " + sPP + " граммов за день, то понадобится " + purpose/sPP + " дней");



        int masha = 67760;
        int denis = 83690;
        int kris = 76230;
        double newmasha = masha + (masha*0.1);
        double newdenis = denis + (denis*0.1);
        double newkris = kris + (kris*0.1);
        System.out.println("Маша теперь получает " + newmasha + " рублей. Годовой доход вырос на " + masha*0.1 +  " рублей");
        System.out.println("Денис теперь получает " + newdenis + " рублей. Годовой доход вырос на " + denis*0.1 +  " рублей");
        System.out.println("Кристина теперь получает " + newkris + " рублей. Годовой доход вырос на " + kris*0.1 +  " рублей");

    }
}