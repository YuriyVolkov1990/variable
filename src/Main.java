public class Main {
    public static void main (String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);//задача 1
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);//задача 2
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);//задача 3
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);//задача 4
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);//задача 5
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var summaryBoxersWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес двух бойцов = " + summaryBoxersWeight +" кг.");
        var differenceWeight = firstBoxerWeight - secondBoxerWeight;
        System.out.println("Разница в весе бойцов составляет " + differenceWeight + " кг.");//задача 6
        differenceWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Правильная разница в весе бойцов составляет " + differenceWeight + " кг.");
        differenceWeight = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница в весе бойцов через остаток от деления составляет " + differenceWeight + " кг.");//задача 7
        var totalHours = 640;
        var personalHours = 8;
        var totalWorkers = totalHours / personalHours;
        System.out.println("Всего работников в компании — " + totalWorkers + " человек");
        totalWorkers = totalWorkers + 94;
        totalHours = totalWorkers * personalHours;
        System.out.println("Если в компании работает " + totalWorkers + " человек, то всего " + totalHours + " часов работы может быть поделено между сотрудниками.");//задача 8
    }
}
