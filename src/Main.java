import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TuyenSinh tuyenSinh = new TuyenSinh();
        System.out.println("Nhap lua chon cua ban:");
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            menu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    tuyenSinh.inputThiSinh();
                    break;
                }
                case 2:{
                    tuyenSinh.showThiSinh();
                    break;
                }
                case 3: {
                 tuyenSinh.show1ThiSinh();
                 break;
                }
                case 4: {
                    System.out.println("Danh sach thi sinh sau khi sap xep");
                    tuyenSinh.sapxep(tuyenSinh);
                    tuyenSinh.showThiSinh();
                    break;
                }
                case 5:{
                    findByID(tuyenSinh,scanner);
                    break;
                }
                case 6:{
                    tuyenSinh.chinhsua();
                    break;
                }
                case 7:{
                    tuyenSinh.xoaSinhVien();
                    break;
                }

            }

        } while (choice != 0);

    }

    private static void menu() {
        System.out.println("Nhập lựa chọn của bạn : ");
        System.out.println("1. Nhập thông tin thi sinh");
        System.out.println("2. Hiển thị thông tin thi sinh");
        System.out.println("3. Hiển thị thông tin 1 thi sinh");
        System.out.println("4 .Sap xep thi sinh theo ten");
        System.out.println("5 .Tìm kiếm theo số báo danh tìm kiếm nhị phân");
        System.out.println("6. Chinh sua thong tin sinh vien bang ID");
        System.out.println("7. Xoa 1 sinh vien");


    }
    public static void findByID(TuyenSinh tuyenSinh,Scanner scanner){
        System.out.println("Nhap so bao danh muon tim:");
        int id=scanner.nextInt();
        tuyenSinh.findThiSinh(id);
        tuyenSinh.showThiSinh();
    }
}
