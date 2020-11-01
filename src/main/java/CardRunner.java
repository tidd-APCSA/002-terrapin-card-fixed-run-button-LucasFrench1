public class CardRunner {
    public static void main(String args[]){
        // ☕
        TerrapinCard billy = new TerrapinCard(20);
        TerrapinCard brian = new TerrapinCard(30);

        System.out.println("Billy: "+billy.payGourmet());
        System.out.println("Brian: "+brian.payEconomical());

        System.out.println("Billy: "+billy.loadMoney(20));
        System.out.println("Brian: "+brian.payGourmet());
        
        billy.payEconomical();
        System.out.println("Billy: "+billy.payEconomical());
        System.out.println("Brian: "+brian.loadMoney(50));
    }
}
