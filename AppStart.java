
/**
 * Write a description of class AppStart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AppStart {

    public static void main(String[] args) {
        Size size = Size.MEDIUM;
        
        System.out.println("Name         : "+size.name());
        System.out.println("toString()   : \""+size.toString().trim()+"\"");
        System.out.println("Ordem        : "+size.ordinal());
        System.out.println("Valor minimo : "+size.getMinValue());
        System.out.println("Valor maximo : "+size.getMaxValue());
        System.out.println("Código       : \'"+size.getCode()+"\'");
        
        
    }
    
}
