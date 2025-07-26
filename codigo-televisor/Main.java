public class Main {
    public static void main(String[] args) {
        Televisor tv = new Televisor(5, 20);

        tv.ligar();                
        tv.aumentarVolume(10);     
        tv.setCanal(12);         
        tv.ligar();               
        tv.desligar();           
        tv.setCanal(7);            
        tv.aumentarVolume(5);      
        tv.desligar();            
    }
}
