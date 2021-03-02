/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlylichthicuoiky;

/**
 *
 * @author hamvu
 */
class Search {
    private String maLop, tenMH, ngayThi, phongThi, xepLoai;
    private int caThi, soSV, soCBCT;
    
    public Search(String maLop, String tenMH, String ngayThi, int caThi, String phongThi, int soSV, int soCBCT, String xepLoai){
        this.maLop=maLop;
        this.tenMH=tenMH;
        this.ngayThi=ngayThi;
        this.phongThi=phongThi;
        this.xepLoai=xepLoai;
        this.caThi=caThi;
        this.soSV=soSV;
        this.soCBCT=soCBCT;
    }
    
    public String getMaLop() {
        return maLop;
    }
    public String getTenMH() {
        return tenMH;
    }
    public String getNgayThi() {
        return ngayThi;
    }
    public String getPhongThi() {
        return phongThi;
    }
    public String getXepLoai() {
        return xepLoai;
    }
    public int getCaThi(){
        return caThi;
    }
    public int getSoSV(){
        return soSV;
    }
    public int getSoCBCT(){
        return soCBCT;
    }
}
