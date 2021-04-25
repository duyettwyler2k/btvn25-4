import java.util.Scanner;

public class BanC extends ThiSinh{
    private double Van;
    private double Su;
    private double Dia;
    public BanC(){}

    public BanC(double van, double su, double dia) {
        Van = van;
        Su = su;
        Dia = dia;
    }

    public BanC(int id, String name, String adress, String dienuutien, double van, double su, double dia) {
        super(id, name, adress, dienuutien);
        Van = van;
        Su = su;
        Dia = dia;
    }

    public double getVan() {
        return Van;
    }

    public void setVan(double van) {
        Van = van;
    }

    public double getSu() {
        return Su;
    }

    public void setSu(double su) {
        Su = su;
    }

    public double getDia() {
        return Dia;
    }

    public void setDia(double dia) {
        Dia = dia;
    }
    public void inputInFoBanC(){
        super.inputInFoThiSinh();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap diem mon Van :");
        this.Van=scanner.nextDouble();
        System.out.println("Nhap diem mon Su :");
        this.Su=scanner.nextDouble();
        System.out.println("Nhap diem mon Dia :");
        this.Dia=scanner.nextDouble();
    }
    public void showInFoBanC(){
        super.showInfoThiSinh();
        System.out.printf("Diem mon Van la  :%s, Diem mon Su la: %s, Diem mon Dia la: %s",this.Van,this.Su,this.Dia);
    }
}
