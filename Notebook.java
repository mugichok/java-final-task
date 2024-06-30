import java.util.Objects;

public class Notebook {
    private String name;
    private int ram;
    private int ssd;
    private String operationSystem;
    private String color;
    private int numberCoresProc;
    private int frecuencyProc;

    public Notebook(String name, int ram, int ssd, String operationSystem, String color, int numberCoresProc, int frecuencyProc) {
        this.name = name;
        this.ram = ram;
        this.ssd = ssd;
        this.operationSystem = operationSystem;
        this.color = color;
        this.numberCoresProc = numberCoresProc;
        this.frecuencyProc = frecuencyProc;
    }

    public int getRam(){
        return ram;
    }

    public int getSsd(){
        return ssd;
    }

    public String getOperationSystem(){
        return operationSystem;
    }

    public String getColor(){
        return color;
    }

    public int getNumnerCoresProc(){
        return numberCoresProc;
    }

    public int getFrecuenceProc(){
        return frecuencyProc;
    }

    public void setRam(int ram){
        this.ram = ram;
    }
    public void setSdd(int ssd){
        this.ssd = ssd;
    }
    public void setOperationSystem(String operationSystem){
        this.operationSystem = operationSystem;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setNumberProcCores(int numberCoresProc){
        this.numberCoresProc = numberCoresProc;
    }
    public void setFrecuenceProc(int frecuencyProc){
        this.frecuencyProc = frecuencyProc;
    }
    
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Notebook nb = (Notebook) obj;
        return ram== nb.ram && 
            ssd== nb.ssd && 
            operationSystem.equals(nb.operationSystem) && 
            color.equals(nb.color) && 
            numberCoresProc== nb.numberCoresProc && 
            frecuencyProc == nb.frecuencyProc;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ram, ssd, color, operationSystem, numberCoresProc, frecuencyProc);
    }

    @Override
    public String toString() {
        return name + " Оперативная память: " + ram + ", Объём жёсткого диска: " + ssd + ", Операционная система: " + operationSystem + ", Цвет: " + color + ", Количество ядер процессора: " + numberCoresProc + ", Частота процессора: " + frecuencyProc + "\n";
    }
}
