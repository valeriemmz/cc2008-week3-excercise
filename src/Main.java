import java.util.List;

public class Main{
    public static void main(String[] args){
        HashUtil util= new HashUtil();

        String hash = util.sha256("uvg");
        System.out.println(hash);

        Transaction tx = new Transaction ("Alex", "Otto", 2.3);
        Transaction tx1= new Transaction("Henru", "mario", 0.5);
        System.out.println(tx);

        Mempool mempool =new Mempool();
        mempool.submit(tx);
        System.out.println("mempool has" + mempool.size()+"texs");

        List<Transaction> pending=mempool.take(5);
        for(Transaction tmp: pending) {
            System.out.println(tmp);
        }
    }
}
