
package btvn.buoi4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    
    public static Book[] books = new Book[5];
    public static int number = 5;
    
    public static void themSach() {
        System.out.println("Nhap thong tin sach:");
        
        System.out.print("Nhap ma sach: ");
        int maSach = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Nhap ten sach: ");
        String tenSach = scanner.nextLine();
        
        System.out.print("Nhap ten tac gia: ");
        String tenTacGia = scanner.nextLine();
        
        System.out.print("Nhap nam xuat ban: ");
        int namSanXuat = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Nhap tom tat noi dung: ");
        String tomTatNoiDung = scanner.nextLine();
        
        System.out.print("Nhap gia: ");
        double giaTien = scanner.nextDouble();
        
        Book newbook = new Book(maSach, tenSach, tenTacGia, namSanXuat, tomTatNoiDung, giaTien);
        
        books = Arrays.copyOf(books, number + 1);
        books[number] = newbook;
        number++;
        System.out.println("Them thanh cong vao danh sach !"); 
    }
    
    public static void chinhSuaThongTin() {
        System.out.print ("Nhap ma sach can chinh sua: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        Book bookEdit = null;
        for (Book book : books) {
            if (book.getMaSach() == id) {
                bookEdit = book;
                break;
            }
        }
        
        if (bookEdit == null)
            System.out.println("Khong tim thay sach can chinh sua.");
        else {
            System.out.print("Nhap ten sach moi: ");
            bookEdit.setTenSach(scanner.nextLine());
        
            System.out.print("Nhap ten tac gia moi: ");
            bookEdit.setTenTacGia(scanner.nextLine());
        
            System.out.print("Nhap nam xuat ban moi: ");
            bookEdit.setNamSanXuat(scanner.nextInt());
            scanner.nextLine();
        
            System.out.print("Nhap tom tat noi dung moi: ");
            bookEdit.setTomTatNoiDung(scanner.nextLine());
        
            System.out.print("Nhap gia moi: ");
            bookEdit.setGiaTien(scanner.nextDouble());
            
            System.out.println("Chinh sua sach thanh cong");
        }
    }
    
    public static void inDS() {
        for (Book book : books) {
            book.display();
        }
    }
    
    public static void sachLauDoi() {
        int oldest = Integer.MAX_VALUE;
        
        for (Book book : books) {
            oldest = Math.min(oldest, book.getNamSanXuat());
        }
        
        System.out.println("Cuon sach lau doi nhat: ");
        for (Book book : books) {
            if (book.getNamSanXuat() == oldest)
                book.display();
        }
    }
    
    public static void sachVuaGiaTien() {
        System.out.print("Nhap gia tien: ");
        double cost = scanner.nextDouble();
        
        int test = 0;
        System.out.println("Sach phu hop voi gia tien: ");
        for (Book book : books) {
            if (book.getGiaTien() <= cost) {
                book.display();
                test = 1;
            }                
        }
        if (test == 0)
            System.out.println("Khong co sach nao phu hop voi gia tien");
    }
    
    public static void sapXepTheoTen() {
        Arrays.sort(books, (b1, b2) -> b1.getTenSach().compareTo(b2.getTenSach()));
        System.out.println("Sap xep tang dan thanh cong");   
    }
    
    public static void sapXepTheoGia() {
        Arrays.sort(books, (b1, b2) -> Double.compare(b1.getGiaTien(), b2.getGiaTien()));
        System.out.println("Sap xep tang dan thanh cong");
    }
    
    public static void main(String[] args) {       
        books[0] = new Book(1, "Toan", "A", 2020, "Mo ta Toan", 80);
        books[1] = new Book(2, "Ngu Van", "B", 2023, "Mo ta Ngu Van", 85);
        books[2] = new Book(3, "Tieng Anh", "C", 2020, "Mo ta Tieng Anh", 100);
        books[3] = new Book(4, "Vat Ly", "D", 2024, "Mo ta Vat Ly", 70);
        books[4] = new Book(5, "Hoa Hoc", "E", 2022, "Mo ta Hoa Hoc", 70);
        
        int choice;        
        do {
            System.out.println("\n-----MENU-----");
            System.out.println("1. Them sach moi");
            System.out.println("2. Chinh sua thong tin sach");
            System.out.println("3. In ra danh sach cac cuon sach");
            System.out.println("4. In ra cuon sach lau doi nhat");
            System.out.println("5. In ra cuon sach phu hop voi gia tien");
            System.out.println("6. Sap xep (theo ten hoac theo gia)");
            System.out.println("7. Thoat");
            System.out.print("Lua chon cua ban: ");
            
            choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1: 
                    themSach();
                    break;
                case 2:
                    chinhSuaThongTin();
                    break;
                case 3:
                    inDS();
                    break;
                case 4:
                    sachLauDoi();
                    break;
                case 5:
                    sachVuaGiaTien();
                    break;
                case 6:
                    System.out.println("Chon cach muon sap xep(1 hoac 2):\n1. Theo ten\n2. Theo gia tien");
                    int selection;                    
                    do {
                        System.out.print("Nhap lua chon: ");
                        selection = scanner.nextInt();
                        
                        if (selection == 1)
                            sapXepTheoTen();
                        else if (selection == 2)
                            sapXepTheoGia();
                        else
                            System.out.println("Lua chon khong hop le. Vui long nhap lai: ");
                    } 
                    while (selection != 1 && selection != 2);                    
                    break;
                case 7:
                    System.out.println("Thoat");
                    System.exit(0);
                default:
                    System.out.println("Lua chon khong hop le. Vui long nhap lai: ");
            }
        }
        while (choice > 7 || choice < 1);
        scanner.close();
    }    
}