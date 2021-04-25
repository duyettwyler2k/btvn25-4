import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TuyenSinh {
    List<ThiSinh> thiSinhList=new ArrayList<>();
    //Nhap thong tin this sinh
    public void inputThiSinh(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ban muon nhap thong tin this sinh Ban nao?");
        System.out.println("1. Ban A");
        System.out.println("2. Ban B");
        System.out.println("3. Ban C");
        int choice=scanner.nextInt();
        scanner.nextLine();
        switch (choice){
            case 1:{
                BanA banA=new BanA();
                banA.inputInFoBanA();
                thiSinhList.add(banA);
                break;
            }
            case 2:{
                BanB banB=new BanB();
                banB.inputInfoBanB();
                thiSinhList.add(banB);
                break;
            }
            case 3:{
                BanC banC=new BanC();
                banC.inputInFoBanC();
                thiSinhList.add(banC);
                break;
            }
        }

    }
    //hien thi thong tin cua thi sinh
    public void showThiSinh(){
        for (ThiSinh thiSinh:thiSinhList){
            thiSinh.showInfoThiSinh();
        }
    }
    //hien thi thong tin  1 thi sinh
   public void show1ThiSinh(){
        Scanner scanner=new Scanner(System.in);
       System.out.println("Nhap ten thi sinh ban muon tim");
       String name=scanner.nextLine();
        for (ThiSinh thiSinh:thiSinhList){
            if(thiSinh.getName().equals(name)){
                thiSinh.showInfoThiSinh();
            }
        }
   }
   //sap xep
    public void sapxep(TuyenSinh tuyenSinh){
        for (int i = 0; i <thiSinhList.size()-1 ; i++) {
            ThiSinh thiSinhMin=thiSinhList.get(i);
            int minIndex=i;
            for (int j = 0; j <thiSinhList.size() ; j++) {
                if (thiSinhMin.getName().charAt(0)>thiSinhList.get(j).getName().charAt(0)){
                    thiSinhMin=thiSinhList.get(j);
                    minIndex=j;
                }
            }
            if (minIndex!=i){
                thiSinhList.set(minIndex,thiSinhList.get(i));
                thiSinhList.set(i,thiSinhMin);
            }
        }
    }
    //tim kiem theo ma nhi phan
    public void findThiSinh(int number){
   int left=0;
   int right=thiSinhList.size()-1;
   int index=0;
   do {
       int mid=(left+right)/2;
       if (number==thiSinhList.get(mid).getId()){
           index=thiSinhList.get(mid).getId();
           System.out.println(thiSinhList.get(mid));
           return;
       }
       if (number>thiSinhList.get(mid).getId()){
           left=mid+1;
       } else if (number<thiSinhList.get(mid).getId()){
           right=mid-1;
       }
   } while (left<=right);
   if (index==0){
       System.out.println("khong thay");
   }
    }
    //chinh sua thong tin
    public void chinhsua(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap id thi sinh ban muon sua");
        int id=scanner.nextInt();
        for (ThiSinh thiSinh:thiSinhList){
            if(thiSinh.getId()==id){
                thiSinh.inputInFoThiSinh();
            }
        }
    }
    public void xoaSinhVien(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap id thi sinh ban muon xoa");
        int id=scanner.nextInt();
        for (ThiSinh thiSinh:thiSinhList){
            if (thiSinh.getId()==id){
                thiSinhList.remove(thiSinh);
                break;
            }
        }
    }
}
