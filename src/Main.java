public class Main {
    public static void main(String[] args) {
        //Задача 1. Объявление и инициализация переменных.
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        //Задача 2. Увеличение значений переменных на 4.
        dog = dog + 4;
        System.out.println("dog = " + dog);
        cat = cat + 4;
        System.out.println("cat = " + cat);
        paper = paper + 4;
        System.out.println("paper = " + paper);
        //Задача 3. Уменьшение значений переменных.
        dog = dog - 3.5;
        System.out.println("dog = " + dog);
        cat = cat - 1.6;
        System.out.println("cat = " + cat);
        paper = paper - 7639;
        System.out.println("paper = " + paper);
        //Задача 4. Объявление и инициализация переменных. Увеличение и деление.
        var friend = 19;
        System.out.println("friend = " + friend);
        friend = friend + 2;
        System.out.println("friend = " + friend);
        friend = friend / 7;
        System.out.println("friend = " + friend);
        //Задача 5. Объявление и инициализация переменных. Умножение, деление, сложение.
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog = " + frog);
        frog = frog / 3.5;
        System.out.println("frog = " + frog);
        frog = frog + 4;
        System.out.println("frog = " + frog);
        //Задача 6. Боксеры.
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        System.out.println("Вес первого боксера = " + boxer1Weight + " кг");
        System.out.println("Вес второго боксера = " + boxer2Weight + " кг");
        var totalBoxersWeight = boxer1Weight + boxer2Weight;
        System.out.println("Общий вес бойцов равен = " + totalBoxersWeight + " кг");
        var weightDiff = boxer2Weight - boxer1Weight;
        System.out.println("Разница в весе бойцов составляет = " + weightDiff + " кг");
        //Задача 7. Способы вычисления разницы в весе.
        var weightDiffV1 = boxer2Weight - boxer1Weight;
        System.out.println("Разница в весе бойцов составляет = " + weightDiffV1 + " кг (вычислено вычитанием)");
        var weightDiffV2 = boxer2Weight % boxer1Weight;
        System.out.println("Разница в весе бойцов составляет = " + weightDiffV2 + " кг (вычислено остатком от деления)");
        //Задача 8.
        var totalTime = 640;
        var oneWorkerTime = 8;
        var totalWorkers = totalTime / oneWorkerTime;
        System.out.println("Если компании нужно отработать 640 часов с выработкой на одного сотрудника 8 ч, то");
        System.out.println("Всего работников в компании = " + totalWorkers + " человек");
        var totalWorkersMore = totalWorkers + 94;
        var totalTimeMore = totalWorkersMore * oneWorkerTime;
        System.out.println("Если в компании работает = " + totalWorkersMore + " человек, то всего " + totalTimeMore + " часов может быть поделено между сотрудниками");

    }
}