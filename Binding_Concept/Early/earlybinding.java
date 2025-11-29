
package Binding_Concept.Early;
public class earlybinding extends HondaBreak{
    public static void main(String[] args) {
         BreakExample h=new BreakExample();
         BreakExample h1=new HondaBreak(); 
        /* 
        early binding is a concept when parent class method is static and the OBJECT will decide which method will be called
        */
        h.display();
        h1.display();

        HondaBreak h2=new HondaBreak();
        h2.applybreak();
       
     }
}
 