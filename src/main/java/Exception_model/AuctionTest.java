package Exception_model;


public class AuctionTest {

    public void bid() throws AuctionException {
        int money = 10;
        try {
            var a = 10;
        }catch (Exception e){
            e.printStackTrace();

            throw new AuctionException("输入不合法，不能有汉字");
        }

        if (money != 10){
            throw new AuctionException("出价不合理");
        }
    }

    public static void main(String[] args) {
        try{
            AuctionTest auctionTest = new AuctionTest();
            auctionTest.bid();
        }catch (AuctionException e){
            System.out.println(e.getMessage());
        }
    }

    //正常的业务逻辑写一个异常处理是这个样子的
    public void calSal() throws AuctionException {
        try{
            //业务
            int a = 0;
            if (a == 0){
                throw new AuctionException("一个异常");
            }
        }catch (AuctionException aue){
            //log(aue)
            throw new AuctionException(aue);
        }catch (Exception e){
            throw new AuctionException(e);
        }
    }
}
