package org.intern;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Computer comp = new Computer();
        comp.launch("Windows 8.1");
        System.out.println(comp.getOS().getName());

        // не получится изменить ос, так как объект уже создан
        comp.setOS(OS.getInstance("Windows 10"));
        System.out.println(comp.getOS().getName());
    }
}