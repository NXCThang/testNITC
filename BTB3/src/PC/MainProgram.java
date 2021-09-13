package PC;

import java.util.ArrayList;
import java.util.Scanner;

import PC.CPU;
import PC.ID;
import PC.PC;
import PC.Mainbroad;
import PC.Ram;

public class MainProgram {
	public static void main(String[] args) {
		ArrayList<ID> lst_ID = new ArrayList<ID>();
		lst_ID.add(new ID(1));
		lst_ID.add(new ID(2));
		lst_ID.add(new ID(3));
		
		ArrayList<CPU> lst_Cpu = new ArrayList<CPU>();
        lst_Cpu.add(new CPU("Ryzen 3 3500", lst_ID.get(0)));
        lst_Cpu.add(new CPU("Ryzen 4 3500", lst_ID.get(1)));
        lst_Cpu.add(new CPU("Intel core i 5 11500",lst_ID.get(2)));

        ArrayList<Ram> lst_Ram = new ArrayList<Ram>();
        lst_Ram.add(new Ram("2600 Ghz 8GB", lst_ID.get(0)));
        lst_Ram.add(new Ram("2700 Ghz 12GB", lst_ID.get(1)));
        lst_Ram.add(new Ram("3200 Ghz 16GB", lst_ID.get(2)));

        ArrayList<Mainbroad> lst_Main = new ArrayList<Mainbroad>();
        lst_Main.add(new Mainbroad("X881", lst_ID.get(0)));
        lst_Main.add(new Mainbroad("Z772", lst_ID.get(1)));
        lst_Main.add(new Mainbroad("B450M", lst_ID.get(2)));

        ArrayList<PC> lst_pc = new ArrayList<PC>();
        lst_pc.add(new PC(lst_Cpu.get(0), lst_Ram.get(0),lst_Main.get(0), lst_ID.get(0), 5));

        System.out.printf("%s %s %s %d", lst_pc.get(0).getCpu().getName(), lst_pc.get(0).getRam().getName(),
                lst_pc.get(0).getMainbroad().getName(), lst_pc.get(0).getSoLuong());
	}
}
