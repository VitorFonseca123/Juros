
package juros;

/**
 *
 * @author vitor
 */
public class JUROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        calcularjuros j= new JurosSimples(100, 1, 10);
        System.out.println("Juros simples: "+j.calcularJuros());
        
        calcularjuros j2= new JurosComposto(100,1,10);
        System.out.printf("Juros composto: %.1f\r\n", j2.calcularJuros());
    }
    
}
