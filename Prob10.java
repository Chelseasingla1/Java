import java.util.*;

public class Prob10 {
    
    public static void main(String[] args) {
   
Random r = new Random();


int rank = r.nextInt(14);
System.out.println("rank is " + rank);
int suit = r.nextInt(4);
System.out.println("suit is " + suit);

switch(rank){
    case 1:
    if(suit == 0){
        System.out.println("Ace of Clubs" );}
        else if(suit == 1){
        System.out.println("Ace of Diamonds"  );}
        else if(suit == 2){
        System.out.println("Ace of Hearts"  );}
        else if(suit == 3){
        System.out.println("Ace of Spades");}
        break;
    case 2:
    if(suit== 0){
        System.out.println(rank + "  of Clubs"  );}
        else if(suit== 1){
        System.out.println(rank + " of Diamonds" );}
        else if(suit ==2){
        System.out.println(rank + "  of Hearts" );}
        else if(suit == 3){
        System.out.println(rank + "of Spades" );}
        break;
        case 3:
        if(suit== 0){
            System.out.println(rank + "  of Clubs"  );}
            else if(suit== 1){
            System.out.println(rank + " of Diamonds" );}
            else if(suit ==2){
            System.out.println(rank + "  of Hearts" );}
            else if(suit == 3){
            System.out.println(rank + "of Spades" );}
            break;  
            case 4:
            if(suit== 0){
                System.out.println(rank + "  of Clubs"  );}
                else if(suit== 1){
                System.out.println(rank + " of Diamonds" );}
                else if(suit ==2){
                System.out.println(rank + "  of Hearts" );}
                else if(suit == 3){
                System.out.println(rank + "of Spades" );}
        break;
        case 5:
        if(suit== 0){
            System.out.println(rank + "  of Clubs"  );}
            else if(suit== 1){
            System.out.println(rank + " of Diamonds" );}
            else if(suit ==2){
            System.out.println(rank + "  of Hearts" );}
            else if(suit == 3){
            System.out.println(rank + "of Spades" );}
        break;
        case 6:
        if(suit== 0){
            System.out.println(rank + "  of Clubs"  );}
            else if(suit== 1){
            System.out.println(rank + " of Diamonds" );}
            else if(suit ==2){
            System.out.println(rank + "  of Hearts" );}
            else if(suit == 3){
            System.out.println(rank + "of Spades" );}
        break;
        case 7:
        if(suit== 0){
            System.out.println(rank + "  of Clubs"  );}
            else if(suit== 1){
            System.out.println(rank + " of Diamonds" );}
            else if(suit ==2){
            System.out.println(rank + "  of Hearts" );}
            else if(suit == 3){
            System.out.println(rank + "of Spades" );}
        break;
        case 8:
        if(suit== 0){
            System.out.println(rank + "  of Clubs"  );}
            else if(suit== 1){
            System.out.println(rank + " of Diamonds" );}
            else if(suit ==2){
            System.out.println(rank + "  of Hearts" );}
            else if(suit == 3){
            System.out.println(rank + "of Spades" );}
        break;
        case 9:
        if(suit== 0){
            System.out.println(rank + "  of Clubs"  );}
            else if(suit== 1){
            System.out.println(rank + " of Diamonds" );}
            else if(suit ==2){
            System.out.println(rank + "  of Hearts" );}
            else if(suit == 3){
            System.out.println(rank + "of Spades" );}
        break;
        case 10:
        if(suit== 0){
            System.out.println(rank + "  of Clubs"  );}
            else if(suit== 1){
            System.out.println(rank + " of Diamonds" );}
            else if(suit ==2){
            System.out.println(rank + "  of Hearts" );}
            else if(suit == 3){
            System.out.println(rank + "of Spades" );}
        break;
        case 11:
        if(suit == 0){
            System.out.println("Jack of Clubs" );}
            else if(suit == 1){
            System.out.println("Jack  of Diamonds"  );}
            else if(suit == 2){
            System.out.println("Jack  of Hearts"  );}
            else if(suit == 3){
            System.out.println("Jack  of Spades");}
        break;
        case 12:
        if(suit == 0){
            System.out.println("Queen of Clubs" );}
            else if(suit == 1){
            System.out.println("Queen  of Diamonds"  );}
            else if(suit == 2){
            System.out.println("Queen of Hearts"  );}
            else if(suit == 3){
            System.out.println("Queen  of Spades");}
        break;
        case 13:
        if(suit == 0){
            System.out.println("King of Clubs" );}
            else if(suit == 1){
            System.out.println("King  of Diamonds"  );}
            else if(suit == 2){
            System.out.println("King  of Hearts"  );}
            else if(suit == 3){
            System.out.println("King  of Spades");}
        break;

}
    }
}
