/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e31191826_stack; //class berada pada package ini
import java.util.ArrayList; //sintax untuk mengimport arraylist
import java.util.List; //sintax untuk mengimport list

/**
 *
 * @author Taqiy
 */
public class E31191826_Stack {

    /**
     * @param args the command line arguments
     */
        private List<Object> list=new ArrayList<Object>(); //inisialisasi list
        private int Index=-1; //inisialisasi Index sebagai integer
    
    public void push(Object object){ //void untuk menambahkan object stack
        list.add(object); //list merupakan tambahkan object
        Index++; //Index +1
    }
    
    public Object pop(){ //void untuk menghapus object stack
        Object object=list.remove(Index); //object merupakan hapus list dari Index
        Index--; //Index -1
        return object; //sintax untuk kembali ke object yang ada
    }
    
    public int count(){ //void untuk menampilkan banyak array pada stack
        return list.size(); //sintax untuk kembali pada panjang list
    }
    
    public Object peek(){ //void untuk menampilkan array terakhir pada stack
        return list.get(Index); //sintax untuk kembali pada list yang didapatkan dari Index
    }
}

class run
{
    public static void main( String[] args ){ //sintax main method
        E31191826_Stack stack=new E31191826_Stack(); //memanggil class E31191826_Stack
        stack.push("Muhammad");  //object di tambahkan kedalam stack
        stack.push("Taqiy");  //object di tambahkan kedalam stack
        stack.push("Sulthon A.P");  //object di tambahkan kedalam stack
        
        System.out.println("************************************************");
        
        int count=stack.count(); //memanggil void count pada class E31190731_Stack
        Object object=stack.peek(); //object memanggil void peek
        System.out.println("Jumlah Data Pada Stack : "+count);
        System.out.println("Data Teratas Pada Stack : "+object);
        
        System.out.println("************************************************");
        
        object=stack.pop(); //object memanggil void pop
        System.out.println("Objek yang dikeluarkan (Pop) : "+object);
        count=stack.count(); //object memanggil void count
        System.out.println("Jumlah Data Pada Stack setelah Pop: "+count);
        
        System.out.println("************************************************");
        
        object=stack.pop(); //object memanggil void pop
        System.out.println("Objek yang dikeluarkan (Pop) : "+object);
        count=stack.count(); //object memanggil void count
        System.out.println("Jumlah Data Pada Stack setelah Pop: "+count);
        
        System.out.println("************************************************");
        
        object=stack.peek(); //object memanggil void peek
        System.out.println("Data Teratas Pada Stack setelah Pop: "+object);
    }
}   