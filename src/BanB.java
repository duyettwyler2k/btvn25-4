import java.util.Scanner;

public class BanB extends ThiSinh{
    private double Toan;
    private double Hoa;
    private double Sinh;

    public BanB(){}

    public BanB(double toan, double hoa, double sinh) {
        Toan = toan;
        Hoa = hoa;
        Sinh = sinh;
    }

    public BanB(int id, String name, String adress, String dienuutien, double toan, double hoa, double sinh) {
        super(id, name, adress, dienuutien);
        Toan = toan;
        Hoa = hoa;
        Sinh = sinh;
    }

    public double getToan() {
        return Toan;
    }

    public void setToan(double toan) {
        Toan = toan;
    }

    public double getHoa() {
        return Hoa;
    }

    public void setHoa(double hoa) {
        Hoa = hoa;
    }

    public double getSinh() {
        return Sinh;
    }

    public void setSinh(double sinh) {
        Sinh = sinh;
    }
    public void inputInfoBanB(){
        super.inputInFoThiSinh();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap diem mon toan :");
        this.Toan=scanner.nextDouble();
        System.out.println("Nhap diem mon hoa :");
        this.Hoa=scanner.nextDouble();
        System.out.println("Nhap diem mon sinh :");
        this.Sinh=scanner.nextDouble();
    }
    public void showInFoBanB(){
        super.showInfoThiSinh();
        System.out.printf("Diem mon toan la: %s, Diem mon hoa la :%s ,Diem mon sinh la :%s",this.Toan,this.Hoa,this.Sinh);
    }

}
