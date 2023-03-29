
package juros;

/**
 *
 * @author vitor
 */
public class JurosSimples implements calcularjuros{
    private double capital;
    private double taxa;
    private int tempo;
   

    public JurosSimples() {
    }

    public JurosSimples(double capital, double taxa, int tempo) {
        this.capital = capital;
        this.taxa = taxa;
        this.tempo = tempo;
    }
    
    
    public double calcularJuros(){  
 
        return (this.capital*((this.taxa)/100)*this.tempo)+this.capital;
    }
}
