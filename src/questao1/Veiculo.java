
package questao1;

public class Veiculo {
   protected String modelo;
   protected String marca;
   
   public Veiculo(String modelo, String marca){
   this.marca = marca;
   this.modelo = modelo;
   
   }
   public String descrever(){
   return "veiculo da marca" + marca + ", modelo" + modelo + ".";
   
   }
   
   
}
