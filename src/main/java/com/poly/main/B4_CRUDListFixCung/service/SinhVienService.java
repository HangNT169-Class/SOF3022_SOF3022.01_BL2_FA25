package com.poly.main.B4_CRUDListFixCung.service;

import com.poly.main.B4_CRUDListFixCung.entity.SinhVien;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SinhVienService {
    // Giong nhu controller => Can danh dau cac class khac thanh 1 bean theo dung chuc nang cua no
    // service => logic , if..else.. for... => @Service
    // controler => BE -> FE va nguoc lai => @Controller
    // repository => Trao doi lam viec truc tiep vs CSDL => @Repostiory

    private List<SinhVien> listSinhVien = new ArrayList<>(); // => size = 0

    // contructor => init(khoi tao) gia tri cua danh sach doi tuong
    public SinhVienService() {
        // thu tu khi tao contructor full ths => thu tu khi khai bao bien (neu dung lombox)
        listSinhVien.add(new SinhVien("Ma01", "Ten01", "Ha noi", 10, true));
        listSinhVien.add(new SinhVien("Ma02", "Ten02", "Ha noi1", 11, false));
        listSinhVien.add(new SinhVien("Ma03", "Ten03", "Ha noi2", 20, false));
        listSinhVien.add(new SinhVien("Ma04", "Ten04", "Ha noi3", 15, true));
        listSinhVien.add(new SinhVien("Ma05", "Ten06", "Ha noi8", 9, false));
    }

    // getter cua bien listSinhVien (chua cac phan tu trong list)
    public List<SinhVien> getListSinhVien() {
        return listSinhVien;
    }

    public void removeSinhVien(String mssv) {
        // C1: for thuan
//        for(SinhVien sv: listSinhVien){
//            if(sv.getMssv().equalsIgnoreCase(mssv)){
//                listSinhVien.remove(sv);
//                break;
//            }
//        }
        // C2: lamda
        listSinhVien.removeIf(sv -> sv.getMssv().equalsIgnoreCase(mssv));
    }

    public void add(SinhVien sv) {
        listSinhVien.add(sv);
    }

    public SinhVien detailSinhVien(String mssv) {
//        for (SinhVien sv : listSinhVien) {
//            if (sv.getMssv().equalsIgnoreCase(mssv)) {
//                return sv;
//            }
//        }
//        return null;
        return listSinhVien.stream()
                .filter(s -> s.getMssv().equalsIgnoreCase(mssv))
                .findFirst().orElse(null);
    }

    public void updateSinhVien(String mssvCanUpdate, SinhVien sinhVienMoi){
        // Cach nay k dung duoc for..each vi chung ta can lay vi tri cua doi tuong can update
        for (int i = 0; i < listSinhVien.size(); i++) {
            // Lay ra thong tin cua sinh vien o vi tri can update(Thong tin ban dau)
            SinhVien sinhVienHienTai = listSinhVien.get(i);
            if(sinhVienHienTai.getMssv().equalsIgnoreCase(mssvCanUpdate)){
                listSinhVien.set(i,sinhVienMoi);
                break;
            }
        }
    }
}
