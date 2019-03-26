/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infostorage;

public class storedata {
    static int shown;
    public static void initialize1(int showname)
    {
        shown=showname;
    }
    public int returnname()
    {
        return shown;
    }
}
