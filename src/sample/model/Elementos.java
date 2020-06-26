package sample.model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Elementos {
    private final SimpleIntegerProperty elto;
    private final SimpleIntegerProperty n1;
    private final SimpleIntegerProperty n2;
    private final SimpleIntegerProperty n3;
    private final SimpleIntegerProperty n4;

    public Elementos(Integer elto, Integer n1, Integer n2,Integer n3,Integer n4) {
        this.elto = new SimpleIntegerProperty(elto);
        this.n1 = new SimpleIntegerProperty(n1);
        this.n2 = new SimpleIntegerProperty(n2);
        this.n3 = new SimpleIntegerProperty(n3);
        this.n4 = new SimpleIntegerProperty(n4);
    }

    public Integer getElto() {
        return elto.get();
    }

    public void setElto(Integer e) {
        elto.set(e);
    }

    public Integer getN1() { return n1.get(); }
    public void setN1(Integer n) {
        n1.set(n);
    }

    public Integer getN2() {
        return n2.get();
    }
    public void setN2(Integer n) {
        n2.set(n);
    }

    public Integer getN3() {
        return n3.get();
    }
    public void setN3(Integer n) {
        n3.set(n);
    }

    public Integer getN4() {
        return n4.get();
    }
    public void setN4(Integer n) {
        n4.set(n);
    }

}
