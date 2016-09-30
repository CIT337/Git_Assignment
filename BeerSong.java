package beersong;

public class Beersong implements SongImplement {

    public static void main(String[] args) {
        Beersong song = new Beersong();
       song.Ninety_Nine_Bottles_of_Beer();  
    }
    
    public void Ninety_Nine_Bottles_of_Beer(){
 for(int i=99; i>0; i--){ 
      System.out.println(i + " bottles of beer on the wall " + i + " bottles of beer. Take one down pass it around " + (i-1) + " bottles of beer on the wall");
 }
 
}
}
