package serialization;

import java.io.*;

@SuppressWarnings("serial")
public class Notepad implements Serializable {

    public static String writeLocation = "D:\\Visual Code\\Java\\Full\\streams\\streamsjava\\EmpDetails\\emp.txt"; 
    
    public static void main(String[] args) throws ClassNotFoundException,IOException  {

        EmployeePOJO ep = new EmployeePOJO();
        FileOutputStream of = new FileOutputStream(writeLocation);
        FileInputStream fi = new FileInputStream(writeLocation);
        ObjectOutputStream ob = new ObjectOutputStream(of);
        ObjectInputStream ib = new ObjectInputStream(fi);
        ep.setId(101);
        ep.setName("Venkat");
        ep.setSal(25000.50);
        ob.writeObject(ep);
        ob.flush();     
        System.out.println(ib.readObject());
        of.close();
        fi.close();
        ob.close();
        ib.close();
    
    }
}