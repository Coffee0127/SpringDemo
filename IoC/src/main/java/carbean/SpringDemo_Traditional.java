package carbean;

public class SpringDemo_Traditional {
    public static void main(String[] args) {
        carbean.TravelBusiness travelBusiness = new carbean.TravelBusiness();
        // 若未設定 Car 則執行時期拋出 java.lang.RuntimeException
        // 由程式決定 Car 種類則使得 TravelBusiness 依賴於 Car
        // 且未來無法彈性更改
        /*carbean.Car car = new carbean.CarBenz();
        travelBusiness.setCar(car);*/
        travelBusiness.travel();
    }
}
