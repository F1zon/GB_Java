/**
 * Класс Ноутбук для хранения данных.
 * Реализованны геттеры и сеттеры.
 * Добавленны 2 конструктора.
 * 
 * @author Nikita korolev
 * @version 1.0
 */
public class NoteBook {
    private String ozu;
    private String shd;
    private String os;
    private String color;

    public NoteBook(String ozu, String shd, String os, String color) {
        this.ozu = ozu;
        this.shd = shd;
        this.os = os;
        this.color = color;
    }

    public NoteBook() {};

    public void setOzu(String ozu) {
        this.ozu = ozu;
    }

    public void setShd(String shd) {
        this.shd = shd;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOzu() {
        return ozu;
    }

    public String getShd() {
        return shd;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "NoteBook [ozu=" + ozu + ", shd=" + shd + ", os=" + os + ", color=" + color + "]";
    }

    
}
