public class Main {
    public static void main(String[] args) {
        // 1 задание
        byte one = 1;
        System.out.println("Значение переменной one с типом byte равно " + one );
        short two = 20000;
        System.out.println("Значение переменной two с типом short равно " + two );
        int three = 33000;
        System.out.println("Значение переменной three с типом int равно " + three );
        long four= 4000000L;
        System.out.println("Значение переменной four с типом long равно " + four );
        float five = 5.12345F;
        System.out.println("Значение переменной five с типом float равно " + five );
        double six= 6.12345678;
        System.out.println("Значение переменной six с типом double равно " + six );

        // 2 задание
        float f = 27.12F;
        System.out.println(f);
        long l = 987678965549L;
        System.out.println(l);
        double d = 2.786;
        System.out.println(d);
        short s  = 569;
        System.out.println(s);
        short sh = - 159;
        System.out.println(sh);
        int i = 27897;
        System.out.println(i);
        byte b = 67;
        System.out.println(b);

        // 3 задание
        byte lP = 23;
        byte aS = 27;
        byte eA = 30;
        short totaPaper = 480;
        int studentPaper = totaPaper / (lP + aS + eA);
        System.out.println("На каждого ученика рассчитано " + studentPaper + " листов бумаги");

        // 4 задание
        byte bottleTwoMinute = 16;
        byte minute = 2;
        int bottleTwentyMinute = (bottleTwoMinute / minute) * 20;
        System.out.println("За 20 минут машина произвела " + bottleTwentyMinute + " штук бутылок");
        short minuteDay = 1440;
        int bottleOneDay = (bottleTwoMinute / 2) * minuteDay;
        System.out.println("За 1 сутки машина произвела " + bottleOneDay + " штук бутылок");
        int bottleThreeDay = bottleOneDay * 3;
        System.out.println("За 3 дня машина произвела " + bottleThreeDay + " штук бутылок");
        int bottleOneMonth = bottleOneDay * 30;
        System.out.println("За 30 дней машина произвела " + bottleOneMonth + " штук бутылок");

        // 5 задание
        byte totalPaintJar = 120;
        byte whitePaintJarOneClass = 2;
        byte brownPaintJarOneClass = 4;
        int totalClass = totalPaintJar / (whitePaintJarOneClass + brownPaintJarOneClass);
        int totalWhitePaintJar = whitePaintJarOneClass * totalClass;
        int totalBrownPaintJar = brownPaintJarOneClass * totalClass;
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhitePaintJar + " банок белой краски и " + totalBrownPaintJar + " банок коричневой краски");

        // 6 Задача
        byte bananas = 5;
        byte weightOneBanana = 80;
        short milk = 200;
        short weightOneHundredMlMilk = 105;
        byte iceCream = 2;
        byte weightOneIceCream = 100;
        byte eggs = 4;
        byte weightOneEgg = 70;
        int totalWeightBananas = bananas * weightOneBanana;
        int totalWeightMilk = weightOneHundredMlMilk * (milk / 100);
        int totalWeightIceCream = iceCream * weightOneIceCream;
        int totalWeightEggs = eggs * weightOneEgg;
        int totalWeightProduct = totalWeightBananas + totalWeightMilk + totalWeightIceCream + totalWeightEggs;
        System.out.println("Вес завтрака составляет " + totalWeightProduct + " грамм");
        float totalWeightProductKilo = totalWeightProduct / 1000F;
        System.out.println("Вес завтрака составляет " + totalWeightProductKilo + " килограмм");


    }
}