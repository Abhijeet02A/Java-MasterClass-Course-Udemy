package Section5;

public class Main {
    public static void main(String[] args) {
        //callDayOfWeek();
        //callNumberInWord();
        //callNumberOfDaysInMonth();
        //callsumOfDivisibleByTF();
        //callSumOdd();
        //callDigitSumChallange();
        //callIsPalindrome();
        //callSumFirstAndLastDigit();
        //callGetEvenDigitSum();
        //callHasSharedDigit();
        //callHasSameLastDigit();
        //callGetGreatestCommonDivisor();
        //callPrintFactors();
        //callIsPerfectNumber();
        //callNumberToWords();
        //callCanPack();
        //callGetLargestPrime();
        //callPrintSquareStar();
        //callInputThenPrintSumAndAverage();
        callGetBucketCount();

    }
    static void callGetBucketCount() {
        System.out.println(PaintJob.getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(PaintJob.getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println(PaintJob.getBucketCount(-3.4, 2.1, 1.5));
        System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5));
        System.out.println(PaintJob.getBucketCount(7.25, 4.3, 2.35));
        System.out.println(PaintJob.getBucketCount(3.4, 1.5));
        System.out.println(PaintJob.getBucketCount(6.26, 2.2));
        System.out.println(PaintJob.getBucketCount(3.26, 0.75));
        
    }
    static void callInputThenPrintSumAndAverage() {
        InputCalculator.inputThenPrintSumAndAverage();
    }
    static void callPrintSquareStar() {
        DiagonalStar.printSquareStar(8);
    }
    static void callGetLargestPrime() {
        System.out.println(LargestPrime.getLargestPrime(6578));
    }
    static void callCanPack() {
        System.out.println(FlourPacker.canPack (1, 0, 4));
        System.out.println(FlourPacker.canPack (1, 0, 5));
        System.out.println(FlourPacker.canPack (0, 5, 4));
        System.out.println(FlourPacker.canPack (2, 2, 11));
        System.out.println(FlourPacker.canPack (-3, 2, 12));

    }
    static void callNumberToWords() {
        NumberToWords.numberToWords(100);
        NumberToWords.numberToWords(123);
        NumberToWords.numberToWords(-78);
        System.out.println(NumberToWords.getDigitCount(0012));
    }
    static void callIsPerfectNumber() {
        System.out.println(PerfectNumber.isPerfectNumber(6));
        System.out.println(PerfectNumber.isPerfectNumber(28));
        System.out.println(PerfectNumber.isPerfectNumber(5));
        System.out.println(PerfectNumber.isPerfectNumber(-1));
    }
    static void callDayOfWeek() {
        DayOfWeek.printDayOfTheWeek(1);
        DayOfWeek.printDayOfTheWeek(3);
        DayOfWeek.printDayOfTheWeek('c');
        DayOfWeek.printDayOfTheWeek(6);
        DayOfWeek.printDayOfTheWeek(123);
    }
    static void callNumberInWord() {
        NumberInWord.printNumberInWord(4);
        NumberInWord.printNumberInWord(54);
    }
    static void callNumberOfDaysInMonth() {
        System.out.println(NumberOfDaysInMonth.isLeapYear(2017));
        System.out.println(NumberOfDaysInMonth.isLeapYear(-2016));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2000));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2017));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, -2012));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(13, 2012));
    }
    static void callsumOfDivisibleByTF(){
        ThreeAndFiveChallange.sumOfDivisibleByTF();
    }
    static void callSumOdd() {
       System.out.println( SumOddRange.sumOdd(-1, 100) + " " +
        SumOddRange.sumOdd(100, 100)+ " " +
        SumOddRange.sumOdd(13, 13)+ " " +
        SumOddRange.sumOdd(100, -100) + " "+
        SumOddRange.sumOdd(100, 1000));
    }
    static void callDigitSumChallange() {
        System.out.println(DigitSumChallange.sumDigits(5));
        System.out.println(DigitSumChallange.sumDigits(456));
    }
    static void callIsPalindrome() {
        System.out.println(NumberPalindrome.isPalindrome(-121));
        System.out.println(NumberPalindrome.isPalindrome(11221));
    }
    static void callSumFirstAndLastDigit() {
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(-257));
    }
    static void callGetEvenDigitSum() {
        System.out.println(EvenDigitSum.getEvenDigitSum(123456));
    }
    static void callHasSharedDigit() {
        System.out.println(SharedDigit.hasSharedDigit(-32, 33));
        
    }
    static void callHasSameLastDigit() {
        System.out.println(LastDigitChecker.hasSameLastDigit(12, 65, 72));
        System.out.println(LastDigitChecker.hasSameLastDigit(12, 62, 74));
        System.out.println(LastDigitChecker.hasSameLastDigit(12, 65, 75));
        System.out.println(LastDigitChecker.hasSameLastDigit(12, 7, 72));
    }
    static void callGetGreatestCommonDivisor() {
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(12, 24));
    }
    static void callPrintFactors() {
        FactorPrinter.printFactors(-6);
    }
}
