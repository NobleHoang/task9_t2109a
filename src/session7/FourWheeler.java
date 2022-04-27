package session7;

public class FourWheeler extends Vehicle{
    private boolean powerSteer;
    public FourWheeler(String vId,String vName,int numWheels,boolean pSteer){
        vehicleNo=vId;
        vehicleName=vName;
        wheels=numWheels;
        powerSteer=pSteer;
    }
    public void showDetails(){
        System.out.println("Vehicle no :"+vehicleNo);
        System.out.println("Vehicle Name :"+vehicleName);
        System.out.println(" Number of Wheels :"+wheels);
        if (powerSteer==true)
            System.out.println("Power Steering:Yes");
        else
            System.out.println("Power Steering:No");
    }

    public static void main(String[] args) {
        FourWheeler objFour=new FourWheeler("LA-09cs-1406","Volkswagne",4,true);
        objFour.showDetails();
        objFour.accelerate(200);
    }
}
