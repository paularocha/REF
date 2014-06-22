/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testemvc;

import beans.EspacoBean;
import java.util.ArrayList;
import junit.framework.TestCase;

/**
 *
 * @author edivandro
 */
public class MoccIT extends TestCase {
    
    public MoccIT(String testName) {
        super(testName);
    }

    /**
     * Test of getBd method, of class Mocc.
     */
    public void testGetBd() {
       System.out.println("getBd");
Mocc instance = new Mocc();
        
ArrayList<EspacoBean> result = instance.getBd();
assertEquals("Lab-40", result.get(0).getNome());
        
    }
    
}
