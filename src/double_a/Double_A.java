/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package double_a;

import static double_a.penalties.sleep;
import java.io.Serializable;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;





/**
 *
 * @author Mark
 */
public class Double_A {
    
    public  Double_A() {
      
}
     
    public static void main(String[] args) {   
       // Calendar cal=new Calendar();
    //int day = cal.get(Calendar.DATE);
    
      Calendar cal =Calendar.getInstance();
        int month =cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(month);
    }
    

}
