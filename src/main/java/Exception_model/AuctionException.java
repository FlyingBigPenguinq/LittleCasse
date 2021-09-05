package Exception_model;

public class AuctionException extends Exception{
    public AuctionException(){
        super();
    }

    public AuctionException(String msg){
        super(msg);
    }

    public AuctionException(Throwable t){
        super(t);
    }
}
