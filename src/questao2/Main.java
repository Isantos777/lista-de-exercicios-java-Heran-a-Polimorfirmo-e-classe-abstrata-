
package questao2;

import java.util.ArrayList;


public class Main {

    
    public static void main(String[] args) {
       ArrayList<Animal> animais = new ArrayList<>();
       
       animais.add(new Cachorro());
       animais.add(new Gato());
       animais.add(new Pato());
       
       
       for(Animal animal : animais){
       animal.emitirSom();
       
       }
    }
    
}
