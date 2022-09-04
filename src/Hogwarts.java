public abstract class Hogwarts {
   protected String name;
   protected String faculty;
     protected int transgress;
     protected int witchcraft;// колдовство

    public Hogwarts(String name, String faculty, int transgress, int witchcraft) {
        this.name = name;
        this.faculty = faculty;
        this.transgress = transgress;
        this.witchcraft = witchcraft;
    }
    public String getName() {
        return name;
    }


    public String getFaculty() {
        return faculty;
    }


    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public void setWitchcraft(int witchcraft) {
        this.witchcraft = witchcraft;
    }
    public void compareStudent (Hogwarts studentSecond){
        int powerFirst = this.transgress + this.witchcraft;
        int powerSecond = studentSecond.transgress + studentSecond.witchcraft;
        if (powerFirst > powerSecond) {
            System.out.println(this.name + " сильнее чем " + studentSecond.name);
        }else if (powerFirst < powerSecond){
            System.out.println(studentSecond.name + " сильнее чем " + this.name);
        }else {
            System.out.println(this.name + " одинаковы по силе " + studentSecond);
        }
    }
}

