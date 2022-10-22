package praktikum3.soal1;

public class Dadu {
    private int value;

    public void acakNilai(){
        this.value=(int)(1+Math.random()*(6));
    }
    public int getValue(){
        return this.value;
    }
}
