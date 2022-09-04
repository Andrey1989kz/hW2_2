 public class Griffindor extends Hogwarts   {
   private int nobility;// благородство
   private int honor;//честь
   private int bravery;// храбрость



    public Griffindor(String name, String faculty, int transgress, int witchcraft, int nobility, int honor, int bravery) {
        super(name, faculty, transgress, witchcraft);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }
    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return  "Имя: " + name +
                "\n Факультет: " + faculty +
                "\n Телепорт = " + transgress +
                "\n Благородство =" + nobility +
                "\n Честь = " + honor +
                "\n Храбрость  = " + bravery +
                "\n Колдовство = " + witchcraft;

    }
    public void compareGriffindor (Griffindor studentSecond){
        int powerFirst = this.nobility+this.honor+ this.bravery;
        int powerSecond = studentSecond.nobility + studentSecond.honor + studentSecond.bravery;
        if (powerFirst > powerSecond) {
            System.out.println("Сравнение студентов факультета Гриффиндор:" +
                    "\n" + this.name + " сильнее чем " + studentSecond.name);
        } else if (powerFirst < powerSecond) {
            System.out.println("Сравнение студентов факультета Гриффиндор:" +
                    "\n" + studentSecond.name + " сильнее чем " + this.name);
        } else {
            System.out.println("Сравнение студентов факультета Гриффиндор:" +
                    "\n" + this.name + " одинаковы по силе " + studentSecond.name);}
    }
}
