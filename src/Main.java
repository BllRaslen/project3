public class Main {
    public static void main(String[] args) {

        // أنواع البيانات (Data Types)
        float x = 54.54f;
        Long l = 25L;

        String s = "ali";
        String a = "ahmed";
        String e = "elif";

        // مصفوفة من الأرقام
        int[] numbers = {10, 20, 30, 40};

        // ---------------------- تحويل البيانات (Casting)

        int num = 10;
        double d = num; // تحويل ضمني من int إلى double
        System.out.println("d = " + d);

        double price = 39.99;
        long longPrice = (long) price; // تحويل صريح من double إلى long
        System.out.println("longPrice: " + longPrice);

        // ---------------------- العمليات الحسابية (Arithmetic Operators)

        int num1 = 10;
        int num2 = 6;

        // الجمع
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

        // الطرح
        int num4 = num1 - num2;
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num4 = " + num4);

        // الضرب
        int num5 = num1 * num2;
        System.out.println("num1 * num2 = " + (num1 * num2));
        System.out.println("num5 = " + num5);

        // القسمة
        int num6 = num1 / num2;
        System.out.println("num1 / num2 = " + (num1 / num2));
        System.out.println("num6 = " + num6);

        // باقي القسمة
        int num7 = num1 % num2;
        System.out.println("num1 % num2 = " + (num1 % num2));
        System.out.println("num7 = " + num7);

        // ---------------------- عمليات المقارنة (Comparison Operators)

        int aa = 5, bb = 5, cc = 9;
        System.out.println(aa > bb);   // false
        System.out.println(aa >= bb);  // true
        System.out.println(aa < bb);   // false
        System.out.println(aa <= bb);  // true
        System.out.println(aa != bb);  // false
        System.out.println(aa == bb);  // true

        // ---------------------- العمليات المنطقية (Logical Operators)

        boolean isStudent = false;
        boolean isActive = false;

        System.out.println("&& = " + (isStudent && isActive)); // false
        System.out.println("|| = " + (isStudent || isActive)); // false
        System.out.println("! = " + (!isStudent));              // true

        boolean haveIdCard = false;
        boolean isStudentCard = false;
        System.out.println("have ID or student card: " + (haveIdCard || isStudentCard)); // false

        // ---------------------- عمليات الإسناد (Assignment Operators)

        int bi = 1, so = 2;
        bi += so; // bi = bi + so
        System.out.println("bi بعد الإضافة الأولى: " + bi);
        bi += so; // bi = bi + so مرة ثانية
        System.out.println("bi بعد الإضافة الثانية: " + bi);

        int score = 50;
        score += 10;   // 60
        score *= 2;    // 120
        score -= 5;    // 115
        System.out.println("score النهائي: " + score);

        // ---------------------- ترتيب العمليات

        int result = 10 + 5 * 2; // الضرب قبل الجمع => 10 + 10 = 20
        System.out.println("result = " + result);

        int result2 = (10 + 5) * 2; // الجمع أولاً بسبب الأقواس => 15 * 2 = 30
        System.out.println("result2 = " + result2);

        int result3 = 10 + 6 / 2 % 4; // القسمة ثم باقي القسمة ثم الجمع => 10 + (6 / 2 % 4) => 10 + (3 % 4) => 10 + 3 = 13
        System.out.println("result3 = " + result3);

        // ---------------------- منطق مركب

        int x1 = 10, x2 = 5, x3 = 2;
        boolean result4 = x1 > x2 && x1 > x3; // true && true => true
        System.out.println("result4 = " + result4);

        int result5 = 5;
        result5 += 3 * 2; // 3 * 2 = 6 => result5 = 5 + 6 = 11
        System.out.println("result5 = " + result5);

        int y1 = 8, y2 = 4, y3 = 2;
        // (y1 > y2 || y3 == y2) && !(y1 < y3)
        // (true || false) && !(false) => true && true => true
        boolean result6 = (y1 > y2 || y3 == y2) && !(y1 < y3);
        System.out.println("result6 = " + result6);
    }
}
