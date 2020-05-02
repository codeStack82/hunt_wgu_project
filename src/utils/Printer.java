package utils;

public class Printer {

    private String val = "none";

    public Printer() { }
    public Printer(String val){
        this.val = val;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public void print(){
        System.out.println(this.getVal());
    }
}
