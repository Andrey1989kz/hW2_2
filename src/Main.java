import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Griffindor haryyPotter = new Griffindor("Гарри Поттер", "Грифиндор", 77, 66, 85, 54, 67);
        Griffindor ronVithly = new Griffindor("Рон Визли", "Грифиндор", 54, 45, 55, 61, 32);
        Griffindor germionaGrenger = new Griffindor("Гермиона Гренджэр", "Грифиндо", 87, 89, 98, 89, 67);

        Puffenduy zahariaSmit = new Puffenduy("Захария Смит", "Пуфендуй", 33, 45, 30, 77, 82);
        Puffenduy sedrikDiggori = new Puffenduy("Седрик Диггори", "Пуфендуй", 28, 99, 59, 88, 80);
        Puffenduy finchFletcher = new Puffenduy("Джастин Финч-Флетчли", "Пуфендуй", 66, 40, 30, 32, 47);

        Koktevran jouChang = new Koktevran("Чжоу Чанг", "Коктевран", 10, 15, 55, 62, 35, 89);
        Koktevran padmaPatil = new Koktevran("Падма Патил", "Коктевран", 40, 32, 23, 56, 65, 44);
        Koktevran marcusBelby = new Koktevran("Маркус Бэлби", "Коктевран", 11, 78, 28, 44, 87, 91);

        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", "Слизерин", 59, 88, 77, 96, 100, 39, 93);
        Slytherin grehemMontegu = new Slytherin("Грэхэм Монтегю", "Слизерин", 46, 64, 58, 98, 81, 18, 44);
        Slytherin gregoryGoiyl = new Slytherin("Грегори Гойл", "Слизерин", 52, 66, 38, 78, 85, 64, 78);

        haryyPotter.compareGriffindor(germionaGrenger);
        zahariaSmit.comparePuffenduy(sedrikDiggori);
        dracoMalfoy.compareSlytherin(gregoryGoiyl);
        haryyPotter.compareStudent(dracoMalfoy);
        System.out.println(zahariaSmit);
        dracoMalfoy.setDetermination(9);
        System.out.println(dracoMalfoy);
        ronVithly.setTransgress(68);
        System.out.println(ronVithly);
    }
}