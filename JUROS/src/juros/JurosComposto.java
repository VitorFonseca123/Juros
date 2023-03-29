
package juros;

/**
 *
 * @author vitor
 */
public class JurosComposto implements calcularjuros{
    private double capital;
    private double taxa;
    private int tempo;
    

    public JurosComposto() {
    }

    public JurosComposto(double capital, double taxa, int tempo) {
        this.capital = capital;
        this.taxa = taxa;
        this.tempo = tempo;
    }
    
    
    public double calcularJuros(){
        
        return capital * Math.pow(1 + taxa/ 100, tempo);
    }
}
