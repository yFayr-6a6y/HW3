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




        byte ludPav = 23;
        byte annSerg = 27;
        byte ekatAndr = 30;
        short paper = 480;
        int pFH = paper / (ludPav + annSerg + ekatAndr);
        System.out.println("На каждого ученика рассчитано " + pFH + " листов бумаги");



        byte bottleTwoMin = 16;
        int bottleOneMin = bottleTwoMin/2;
        byte firstMin= 20;
        short secondMin = 1440;
        short thirdMin = 4320;
        int fourthMin = 43200;
        int bottleForFirst = firstMin * bottleOneMin;
        int bottleForSecond = secondMin * bottleOneMin;
        int bottleForThird = thirdMin * bottleOneMin;
        int bottleForFourth = fourthMin * bottleOneMin;
        System.out.println("За " + firstMin +" минут машина произвела " + bottleForFirst + " штук бутылок");
        System.out.println("За " + secondMin +" минут машина произвела " + bottleForSecond + " штук бутылок");
        System.out.println("За " + thirdMin +" минут машина произвела " + bottleForThird + " штук бутылок");
        System.out.println("За " + fourthMin +" минут машина произвела " + bottleForFourth + " штук бутылок");



        byte nColor = 120;
        byte brownColor = 4;
        byte whiteColor = 2;
        int clss = nColor /(brownColor + whiteColor);
        System.out.println("В школе, где " + clss + " классов, нужно " + clss* whiteColor + " банок белой краски и " + clss*brownColor + " банок коричневой краски");



        byte gBanana = 80;
        byte gMilk = 105;
        byte gIce = 100;
        byte gEgg = 70;
        int breakfast = 5*gBanana + 2*gMilk + 2*gIce + 4*gEgg;
        System.out.println((double)breakfast /1000 + " кг или " + breakfast + " грамм");



        short purpose = 7000;
        short firstPurpose = 250;
        short secondPurpose = 500;
        System.out.println("Если сбрасывать по " + firstPurpose + " граммов за день, то понадобится " + purpose/ firstPurpose + " дней");
        System.out.println("Если сбрасывать по " + secondPurpose + " граммов за день, то понадобится " + purpose/ secondPurpose + " дней");



        int masha = 67760;
        int denis = 83690;
        int kris = 76230;
        double newMasha = masha + (masha*0.1);
        double newDenis = denis + (denis*0.1);
        double newKris = kris + (kris*0.1);
        System.out.println("Маша теперь получает " + newMasha + " рублей. Годовой доход вырос на " + masha*0.1 +  " рублей");
        System.out.println("Денис теперь получает " + newDenis + " рублей. Годовой доход вырос на " + denis*0.1 +  " рублей");
        System.out.println("Кристина теперь получает " + newKris + " рублей. Годовой доход вырос на " + kris*0.1 +  " рублей");

    }
}