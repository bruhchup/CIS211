public class BottlesOBeer{
    public static void main(){
        final int beers = 99; 
        countdown(beers);
    }
    //method to evaluate how many beers are left and decide what to output
    private static void countdown(int n){
        if (n == 0){
            System.out.println("No more bottles of beer on the wall,\nno more bottles of beer,\ncan't take one down, can't pass it around,\ncause there's no more bottles of beer on the wall!");
        }else{
            moreBottles(n);
            countdown(n-1);
        }
    }
    //repeating method to count bottles of beer as they are "passed down"
    private static void moreBottles(int n){
        int leftOver = n - 1;
        System.out.printf("%d bottles of beer on the wall,\n%d bottles of beer,\nTake one down pass it around,\n%d bottles of beer on the wall!\n\n",n,n, leftOver);
    }
}