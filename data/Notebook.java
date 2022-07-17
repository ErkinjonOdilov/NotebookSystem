package UZ.WAXA.HomeTask.notebook.data;

import java.util.ArrayList;
import java.util.List;

public class Notebook {
    private String name;
    private Notebook notebook;
    private String model;
    private String color;
    private String display;
    private String memory;
    private String ozu;
    private String ssd;
    private String hdd;
    private String gpu;
    private String chastota;

    public Notebook(String model, String color, String display, String memory, String ozu, String ssd, String hdd, String gpu, String chastota) {
        this.model = model;
        this.color = color;
        this.display = display;
        this.memory = memory;
        this.ozu = ozu;
        this.ssd = ssd;
        this.hdd = hdd;
        this.gpu = gpu;
        this.chastota = chastota;
    }


    public Notebook() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getOzu() {
        return ozu;
    }

    public void setOzu(String ozu) {
        this.ozu = ozu;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getChastota() {
        return chastota;
    }

    public void setChastota(String chastota) {
        this.chastota = chastota;
    }

    public Notebook getNotebook() {
        return notebook;
    }

    public void setNotebook(Notebook notebook) {
        this.notebook = notebook;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", display='" + display + '\'' +
                ", memory='" + memory + '\'' +
                ", ozu='" + ozu + '\'' +
                ", ssd='" + ssd + '\'' +
                ", hdd='" + hdd + '\'' +
                ", gpu='" + gpu + '\'' +
                ", chastota='" + chastota + '\'' +
                '}';
    }
}

