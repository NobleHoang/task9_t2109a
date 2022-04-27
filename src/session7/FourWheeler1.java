package session7;

public class FourWheeler1 extends Vehicle1{
    private boolean powerSteer;
    public FourWheeler1(String vId,String vName,int numWheels,boolean pSteer){
        super(vId,vName,numWheels);
        powerSteer=pSteer;
    }
    public void showDetails(){
        System.out.println("Vehicle no:"+vehicleNo);
        System.out.println("Vehicle Name"+vehicleName);
        System.out.println("Number of Wheels"+wheels);
        if (powerSteer==true)
            System.out.println("Power Steering:Yes");
        else
            System.out.println("Power Steering:No");
    }

    public static void main(String[] args) {
        FourWheeler objFour=new FourWheeler("LA-09 cs-1406","volkswagen",4,true);
        objFour.showDetails();
        objFour.accelerate(200);
    }
}
