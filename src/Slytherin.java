public class Slytherin extends Hogwarts {
  private   int theTrick;//хитрость
    private int determination;//решительность
    private int ambition;
    private int resourcefulness;//находчивость
    private int lustForPower;// жажда власти

    public Slytherin(String name, String faculty, int transgress, int witchcraft, int theTrick, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, faculty, transgress, witchcraft);
        this.theTrick = theTrick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getTheTrick() {
        return theTrick;
    }

    public void setTheTrick(int theTrick) {
        this.theTrick = theTrick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
    @Override
    public String toString() {
        return  "Имя: " + name +
                "\n Факультет - " + faculty +
                "\n Телепорт = " + transgress +
                "\n Хитрость = " + theTrick +
                "\n Решительность = " + determination +
                "\n Амбициозность  = " + ambition +
                "\n Находчивость  = " + resourcefulness +
                "\n Жажда Власти = " + lustForPower +
                "\n Колдовство = " + witchcraft;
    }
    public void compareSlytherin (Slytherin studentSecond){
        int powerFirst = this.theTrick + this.determination + this.ambition + this.resourcefulness + this.lustForPower;
        int powerSecond = studentSecond.theTrick + studentSecond.determination + studentSecond.ambition+this.resourcefulness+this.lustForPower;
        if (powerFirst > powerSecond) {
            System.out.println("Сравнение студентов факультета Слизерин:" +
                    "\n" +this.name + " сильнее чем " + studentSecond.name);
        }else if (powerFirst < powerSecond){
            System.out.println("Сравнение студентов факультета Слизерин:" +
                    "\n" + studentSecond.name + " сильнее чем " + this.name);
        }else {
            System.out.println("Сравнение студентов факультета Слизерин:" +
                    "\n" + this.name + " одинаковы по силе " + studentSecond.name);
        }
    }
}
