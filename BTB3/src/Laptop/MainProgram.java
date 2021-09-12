package Laptop;

import java.util.ArrayList;

public class MainProgram {
	public static void main(String[] args) {
		ArrayList<Hang> lst_Hang = new ArrayList<Hang>();
		lst_Hang.add(new Hang("Dell"));
		lst_Hang.add(new Hang("Asus"));
		lst_Hang.add(new Hang("MSI"));
		
		ArrayList<CPU> lst_Cpu = new ArrayList<CPU>();
        lst_Cpu.add(new CPU("Ryzen 3 3500", lst_Hang.get(1)));
        lst_Cpu.add(new CPU("Ryzen 4 3500", lst_Hang.get(1)));
        lst_Cpu.add(new CPU("Intel core i 5 11500", lst_Hang.get(2)));

        ArrayList<Ram> lst_Ram = new ArrayList<Ram>();
        lst_Ram.add(new Ram("2600 Ghz 8GB", lst_Hang.get(0)));
        lst_Ram.add(new Ram("2700 Ghz 12GB", lst_Hang.get(1)));
        lst_Ram.add(new Ram("3200 Ghz 16GB", lst_Hang.get(2)));

        ArrayList<Mainbroad> lst_Main = new ArrayList<Mainbroad>();
        lst_Main.add(new Mainbroad("X881", lst_Hang.get(2)));
        lst_Main.add(new Mainbroad("Z772", lst_Hang.get(2)));
        lst_Main.add(new Mainbroad("B450M", lst_Hang.get(0)));

        ArrayList<Laptop> lst_lapTop = new ArrayList<Laptop>();
        lst_lapTop.add(new Laptop(lst_Cpu.get(0), lst_Ram.get(1), lst_Main.get(2), lst_Hang.get(0), 5));

        System.out.printf("%s %s %s %d", lst_lapTop.get(0).getCpu().getName(), lst_lapTop.get(0).getRam().getName(),
                lst_lapTop.get(0).getMainbroad().getName(), lst_lapTop.get(0).getSoLuong());
    }
}
