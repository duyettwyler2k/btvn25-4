import java.util.Scanner;

public class ThiSinh {
    private int Id;
    private String name;
    private String adress;
    private String dienuutien;

    public ThiSinh() {
    }

    public ThiSinh(int id, String name, String adress, String dienuutien) {
        Id = id;
        this.name = name;
        this.adress = adress;
        this.dienuutien = dienuutien;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getDienuutien() {
        return dienuutien;
    }

    public void setDienuutien(String dienuutien) {
        this.dienuutien = dienuutien;
    }
    public void inputInFoThiSinh(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap so bao danh thi sinh:");
        this.Id=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap ho ten:");
        this.name=scanner.nextLine();
        System.out.println("Nhap dia chi:");
        this.adress=scanner.nextLine();
        System.out.println("Nhap vung uu tien:");
        this.dienuutien=scanner.nextLine();
    }
    public void showInfoThiSinh(){
        System.out.printf("So bao danh la : %s, Ho ten la %s ,Dia chi la : %s, Dien uu tien la  :%s \n",Id,name,adress,dienuutien);
    }
}
