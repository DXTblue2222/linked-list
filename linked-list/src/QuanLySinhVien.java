import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class QuanLySinhVien {
    LinkedList linkedList = new LinkedList();
    private ArrayList<SinhVien> arrayList = new ArrayList<>();

    public void addStudent() {
        System.out.println("Enter code student: ");
        String maSV = new Scanner(System.in).nextLine();
        System.out.println("Enter full name: ");
        String hoTen = new Scanner(System.in).nextLine();
        System.out.println("Enter gender: ");
        String gioiTinh = new Scanner(System.in).nextLine();
        System.out.println("Enter age: ");
        int tuoi = new Scanner(System.in).nextInt();
        System.out.println("Enter score: ");
        float diemTB = new Scanner(System.in).nextFloat();

        SinhVien sinhVien = new SinhVien(maSV, hoTen, gioiTinh, tuoi, diemTB);
        arrayList.add(sinhVien);

        linkedList.push(sinhVien);
        System.out.println("-------------------------------");
        System.out.println("Add a new student successfully!");
        System.out.println("-------------------------------");
    }

    public void deleteStudent() {
        System.out.println("Enter MaSV need to delete: ");
        String maSV = new Scanner(System.in).nextLine();

        SinhVien sinhVien = null;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (arrayList.get(i).getMaSV().equals(maSV)) {
                sinhVien = arrayList.get(i);
                break;
            }
        }
        if (sinhVien != null) {
            for(SinhVien data: arrayList){
                if(data.getMaSV().equals(maSV)){
                    arrayList.remove(data);
                    linkedList.deleteNode(data);
                    break;
                }
            }
            System.out.println("------------------------------");
            System.out.println("Delete a student successfully!");
            System.out.println("------------------------------");
        } else {
            System.out.printf("MaSV = " + maSV + " not exists.\n");
        }
    }

    public void findStudent() {
        System.out.println("Enter maSV need to find: ");
        String maSV = new Scanner(System.in).nextLine();

        boolean search = false;
        for (SinhVien sinhVien : arrayList) {
            if (sinhVien.getMaSV().equals(maSV)) {
                System.out.println(sinhVien.toString());
                search = true;
                break;
            }
        }
        if (!search) {
            System.out.println("Not found the student with MaSV = " + maSV);
        }
    }
}
