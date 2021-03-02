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
class Subject {
    private String maLop, tenMH, ngayThi, phongThi, xepLoai;
    private int caThi, soCBCT;
    private float soSV;
    
    public Subject(String maLop, String tenMH, String ngayThi, int caThi, String phongThi, float soSV, int soCBCT, String xepLoai){
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
    public float getSoSV(){
        return soSV;
    }
    public int getSoCBCT(){
        return soCBCT;
    }
}
