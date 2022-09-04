public class Koktevran extends Hogwarts {
    int mind;// ум
    int wisdom;//мудрость
    int wit;// остроумие
    int creativity;

    public Koktevran(String name, String faculty, int transgress, int witchcraft, int mind, int wisdom, int wit, int creativity) {
        super(name, faculty, transgress, witchcraft);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Имя: " + name +
                "\n Факультет - " + faculty +
                "\n Телепорт = " + transgress +
                "\n Благородство = " + mind +
                "\n Мудрость = " + wisdom +
                "\n Остроумие  = " + wit +
                "\n Творчество  = " + creativity +
                "\n Колдовство = " + witchcraft;

    }
    public void compareKoktevran(Koktevran studentSecond) {
        int powerFirst = this.mind + this.wisdom + this.wit + this.creativity;
        int powerSecond = studentSecond.mind + studentSecond.wisdom + studentSecond.wit + studentSecond.creativity;
        if (powerFirst > powerSecond) {
            System.out.println("Сравнение студентов факультета Коктевран:" +
                    "\n" + this.name + " сильнее чем " + studentSecond.name);
        } else if (powerFirst < powerSecond) {
            System.out.println("Сравнение студентов факультета Коктевран:" +
                    "\n" + studentSecond.name + " сильнее чем " + this.name);
        } else {
            System.out.println("Сравнение студентов факультета Коктевран:" +
                    "\n" + this.name + " одинаковы по силе " + studentSecond);
        }
    }
}
