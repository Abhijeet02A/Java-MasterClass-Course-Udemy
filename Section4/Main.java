package Section4;

public class Main {
    public static void main(String[] args) {
        //callSpeedConverter();
        //callMegaBytesConverter();
        //callShouldWakeUp();
        //callLeapYear();
        //callDecimalComparator();
        //callEqualSumChecker();
        //callTeenNumberChecker();
        //callSecondMinute();
        //callAreaCalculator();
        //callMinutesToYearsDaysCalculator();
        //callIntEqualityPrinter();
        callPlayingCat();
    }
    static void callSpeedConverter() {
        SpeedConvertor.printConversion(1.5);
        SpeedConvertor.printConversion(10.25);
        SpeedConvertor.printConversion(-5.6);
        SpeedConvertor.printConversion(25.42);
        SpeedConvertor.printConversion(75.114);
    }
    static void callMegaBytesConverter() {
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
        MegaBytesConverter.printMegaBytesAndKiloBytes(1024);
    }
    static void callShouldWakeUp() {
        System.out.println(BarkingDog.shouldWakeUp(true, 1));
        System.out.println( BarkingDog.shouldWakeUp(false, 2));
        System.out.println(BarkingDog.shouldWakeUp(true, 8));
        System.out.println(BarkingDog.shouldWakeUp(true, -1));
    }
    static void callLeapYear() {      
        System.out.println(LeapYear.isLeapYear(1700));
        System.out.println(LeapYear.isLeapYear(2500));
        System.out.println(LeapYear.isLeapYear(2000));
    }
    static void callDecimalComparator() {
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.176));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.175, 3.175));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.0, -3.0));
    }
    static void callEqualSumChecker() {
        System.out.println(EqualSumChecker.hasEqualSum(1, 1, 1));
        System.out.println(EqualSumChecker.hasEqualSum(1, 1, 2));
        System.out.println(EqualSumChecker.hasEqualSum(1, -1, 0));
        System.out.println(EqualSumChecker.hasEqualSum(1, -1, 1));
    }
    static void callTeenNumberChecker() {
        System.out.println(TeenNumberChecker.hasTeen(9, 99, 19));
        System.out.println(TeenNumberChecker.hasTeen(23, 15, 42));
        System.out.println(TeenNumberChecker.hasTeen(22, 23, 34));
        System.out.println(TeenNumberChecker.isTeen(9));
        System.out.println(TeenNumberChecker.isTeen(13));
        System.out.println(TeenNumberChecker.isTeen(42));
    }
    static void callSecondMinute(){
        System.out.println(SecondMinute.getDurationString(3600));
        System.out.println(SecondMinute.getDurationString(30000));
        System.out.println(SecondMinute.getDurationString(75000));
    }
    static void callAreaCalculator() {
        System.out.println(AreaCalculator.area(5.0));
        System.out.println(AreaCalculator.area(5.0, 4.0));
        System.out.println(AreaCalculator.area(-1));
    }
    static void callMinutesToYearsDaysCalculator() {
        MinutesToYearsDaysCalculator.printYearsAndDays(-525600);
        MinutesToYearsDaysCalculator.printYearsAndDays(1051200);
        MinutesToYearsDaysCalculator.printYearsAndDays(561600);
    }
    static void callIntEqualityPrinter() {
        IntEqualityPrinter.printEqual(1, 1, 1);
        IntEqualityPrinter.printEqual(1, 1, 2);
        IntEqualityPrinter.printEqual(-1, -1, -1);
        IntEqualityPrinter.printEqual(1, 2, 3);
    }
    static void callPlayingCat() {
        System.out.println(PlayingCat.isCatPlaying(true, 10));
        System.out.println(PlayingCat.isCatPlaying(false, 36));
        System.out.println(PlayingCat.isCatPlaying(false, 35));
    }
}
