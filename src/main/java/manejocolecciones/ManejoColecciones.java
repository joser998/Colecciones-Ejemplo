package manejocolecciones;
import java.util.*;
public class ManejoColecciones {
    public static void main(String[] args) {
    //Variables de tipo: List    
        List miLista = new ArrayList();
        miLista.add(1);
        miLista.add("Soy el numero 2");
        miLista.add(3);
        
        miLista.add(3); //Elemento repetido...
        
        
        //Llamamos al metodo imprimir y le pasamos la lista que habiamos creado aqui arriba
     //   imprimir(miLista);
        
        
        
        
    //Variables de tipo: Set    
        Set miSet = new HashSet();  
        miSet.add("100");
        miSet.add("200");
        miSet.add("300");
        miSet.add("100"); //Elemento duplicado--en esta ocasion no toma el elemento duplicado y no lo imprime
        
        //Impresion de variables de tipo Set
        //imprimir(miSet);
        
        
        
        
        
        
        
        
        
        
    //Variables de tipo: Mapa -- viene de la interfaz de tipo Mapa
        Map miMapa = new HashMap();
        //Los mapas manejan el concepto de llave, valor
        //esto significa que el primer parametro es la llave y el segundo es el valor.
        miMapa.put("Valor1: ", "Jose");
        miMapa.put("Valor2: ", "Luis");
        miMapa.put("Valor3: ", "Monica");
        miMapa.put("Valor3: ", "Jose"); //--Elemento duplicado
        
        
        //Impresion de todas las Llaves
        //Seguimos usando el metodo imprimir y le pasamos miMapa y le decimos que unicamente imprima las llaves: keySet
        imprimir(miMapa.keySet());
        //Volvemos a llamar el metodo imprimir pero esta vez imprimimos los valores: values()
        imprimir(miMapa.values());
        
        //Imprimir el valor asociado a una llave: en este caso la llave Valor3:
        System.out.println(miMapa.get("Valor3: "));
    }
    
    
    
    
    
    //Collection es la Clase Padre de Mapas, Listas y Mapas
    //La variable llamada coleccion va a poder apuntar a todos los tipos de la Interfaz Collection 
    private static void imprimir (Collection coleccion){
        for(Object elemento: coleccion){
            System.out.println("Elemento: "+elemento);
        }
    }
}