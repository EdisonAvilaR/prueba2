package sar.microservicio.servicio;

import org.springframework.stereotype.Component;


@Component
public class ServiceGetSet {
    private String readLine;
    private String mensajeSalida;
    private String plainStr;
    private String text;
    private char firstChar;
    private int converSub;
    private int count;
    private char secondChar;

    //Metodos getter y setter
    public String getReadLine() {
        return readLine;
    }
    public void setReadLine(String readLine) {
        this.readLine = readLine;
    }
    public String getMensajeSalida() {
        return mensajeSalida;
    }
    public void setMensajeSalida(String mensajeSalida) {
        this.mensajeSalida = mensajeSalida;
    }
    public String getPlainStr() {
        return plainStr;
    }
    public void setPlainStr(String plainStr) {
        this.plainStr = plainStr;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public char getFirstChar() {
        return firstChar;
    }
    public void setFirstChar(char firstChar) {
        this.firstChar = firstChar;
    }
    public char getSecondChar() {
        return secondChar;
    }
    public void setSecondChar(char secondChar) {
        this.secondChar = secondChar;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public int getConverSub() {
        return converSub;
    }
    public void setConverSub(int converSub) {
        this.converSub = converSub;
    }
}
