public class Puffenduy extends Hogwarts {
    int industriousness;//трудолюибе
    int loyalty;// верность
    int honesty;//честность

    public Puffenduy(String name, String faculty, int transgress, int witchcraft, int industriousness, int loyalty, int honesty) {
        super(name, faculty, transgress, witchcraft);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {

        return "Имя: " + name +
                "\n Факультет - " + faculty +
                "\n Телепорт = " + transgress +
                "\n Трудолюбие = " + industriousness +
                "\n Верность = " + loyalty +
                "\n Честность  = " + honesty +
                "\n Колдовство = " + witchcraft;

    }

    public void comparePuffenduy(Puffenduy studentSecond) {
        int powerFirst = this.industriousness + this.loyalty + this.honesty;
        int powerSecond = studentSecond.industriousness + studentSecond.loyalty + studentSecond.honesty;
        if (powerFirst > powerSecond) {
            System.out.println("Сравнение студентов факультета Пуффендуй:" +
                    "\n" + this.name + " сильнее чем " + studentSecond.name);
        } else if (powerFirst < powerSecond) {
            System.out.println("Сравнение студентов факультета Пуффендуй:" +
                    "\n" + studentSecond.name + " сильнее чем " + this.name);
        } else {
            System.out.println("Сравнение студентов факультета Пуффендуй:" +
                    "\n" + this.name + " одинаковы по силе " + studentSecond);
        }
    }
}
