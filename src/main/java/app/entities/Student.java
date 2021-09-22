package app.entities;

public class Student {

    public Student(String name, float mark, boolean blockchain){
        this.mark = mark;
        this.name = name;
        this.isBlockChainKnown = blockchain;
    }


    private boolean isBlockChainKnown;
    private float mark;
    private String name;


    public boolean isBlockChainKnown() {
        return isBlockChainKnown;
    }

    public void setBlockChainKnown(boolean blockChainKnown) {
        isBlockChainKnown = blockChainKnown;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
