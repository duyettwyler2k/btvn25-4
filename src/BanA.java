import java.util.Scanner;

public class BanA extends ThiSinh{
    private double Toan;
    private double Li;
    private double Hoa;
    public BanA(){}

    public BanA(double toan, double li, double hoa) {
        Toan = toan;
        Li = li;
        Hoa = hoa;
    }

    public BanA(int id, String name, String adress, String dienuutien, double toan, double li, double hoa) {
        super(id, name, adress, dienuutien);
        Toan = toan;
        Li = li;
        Hoa = hoa;
    }

    public double getToan() {
        return Toan;
    }

    public void setToan(double toan) {
        Toan = toan;
    }

    public double getLi() {
        return Li;
    }

    public void setLi(double li) {
        Li = li;
    }

    public double getHoa() {
        return Hoa;
    }

    public void setHoa(double hoa) {
        Hoa = hoa;
    }
    public void inputInFoBanA(){
        super.inputInFoThiSinh();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap diem mon toan :");
        this.Toan=scanner.nextDouble();
        System.out.println("Nhap diem mon li : ");
        this.Li=scanner.nextDouble();
        System.out.println("Nhap diem mon hoa :");
        this.Hoa=scanner.nextDouble();
    }
    public void showInFoBanA(){
        super.showInfoThiSinh();
        System.out.printf("Diem mon Toan la: %s, Diem mon Li la :%s, Diem mon Hoa la :%s ",this.Toan,this.Li,this.Hoa);
    }
}
