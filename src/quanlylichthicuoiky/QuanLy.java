package quanlylichthicuoiky;

import java.util.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public final class QuanLy extends javax.swing.JFrame {
    public QuanLy() {
        initComponents();
        initTable();
        
    }
    
    public ArrayList<Subject> subjectList(){
        ArrayList<Subject> subjectsList = new ArrayList<>();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost;databaseName=QLLTCK;integratedSecurity=true;";
            Connection connection = DriverManager.getConnection(url);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM PHANCONG");

            while(resultSet.next()){
                Subject subject = new Subject(resultSet.getString("maLop"), resultSet.getString("tenMH"), 
                        resultSet.getString("ngayThi"), resultSet.getInt("caThi"), resultSet.getString("phongThi"), 
                        resultSet.getFloat("soSV"), resultSet.getInt("soCBCT"), resultSet.getString("xepLoai"));
                subjectsList.add(subject);
            }
        }
        catch(Exception sqlex){
            sqlex.printStackTrace();
        }        
        return subjectsList;
    }
    
    public void initTable(){
        ArrayList<Subject> list = subjectList();
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        Object[] row = new Object[8];
        for(int i = 0; i < list.size(); i++){
            row[0] = list.get(i).getMaLop();
            row[1] = list.get(i).getTenMH();
            row[2] = list.get(i).getNgayThi();
            row[3] = list.get(i).getCaThi();
            row[4] = list.get(i).getPhongThi();
            row[5] = list.get(i).getSoSV();
            row[6] = list.get(i).getSoCBCT();
            row[7] = list.get(i).getXepLoai();
            model.addRow(row);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        group = new javax.swing.ButtonGroup();
        groupXepLoai = new javax.swing.ButtonGroup();
        ScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        txtPhongThi = new javax.swing.JTextField();
        txtSoSV = new javax.swing.JTextField();
        txtSoCBCT = new javax.swing.JTextField();
        lblMaLop = new javax.swing.JLabel();
        lblTenMH = new javax.swing.JLabel();
        lblNgayThi = new javax.swing.JLabel();
        lblCaThi = new javax.swing.JLabel();
        txtMaLop = new javax.swing.JTextField();
        lblPhongThi = new javax.swing.JLabel();
        lblSoSV = new javax.swing.JLabel();
        txtTenMH = new javax.swing.JTextField();
        lblSoCBCT = new javax.swing.JLabel();
        txtCaThi = new javax.swing.JTextField();
        txtNgayThi = new javax.swing.JTextField();
        lblXepLoai = new javax.swing.JLabel();
        rdbDat = new javax.swing.JRadioButton();
        rdbKhongDat = new javax.swing.JRadioButton();
        btnOKAdd = new javax.swing.JButton();
        btnOKEdit = new javax.swing.JButton();
        btnOKDelete = new javax.swing.JButton();
        lblTimKiem = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtTongMon = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTongPhong = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTongCBCT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDaThi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtChuaThi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMin = new javax.swing.JTextField();
        txtMax = new javax.swing.JTextField();
        btnThongKe = new javax.swing.JButton();
        JMenuBar = new javax.swing.JMenuBar();
        system = new javax.swing.JMenu();
        about = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        function = new javax.swing.JMenu();
        subjects = new javax.swing.JMenu();
        se214 = new javax.swing.JRadioButtonMenuItem();
        se327 = new javax.swing.JRadioButtonMenuItem();
        se108 = new javax.swing.JRadioButtonMenuItem();
        se104 = new javax.swing.JRadioButtonMenuItem();
        se215 = new javax.swing.JRadioButtonMenuItem();
        it002 = new javax.swing.JRadioButtonMenuItem();
        se330 = new javax.swing.JRadioButtonMenuItem();
        all = new javax.swing.JRadioButtonMenuItem();
        reset = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Lịch Thi Cuối Kỳ");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Lớp", "Tên Môn Học", "Ngày Thi", "Ca Thi", "Phòng Thi", "Số Sinh Viên", "Số Cán Bộ Coi Thi", "Xếp Loại"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        ScrollPane1.setViewportView(table);

        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setText("Sửa");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        panel.setEnabled(false);

        txtPhongThi.setEnabled(false);

        txtSoSV.setEnabled(false);

        txtSoCBCT.setEnabled(false);

        lblMaLop.setText("Mã Lớp:");
        lblMaLop.setEnabled(false);

        lblTenMH.setText("Tên Môn Học:");
        lblTenMH.setEnabled(false);

        lblNgayThi.setText("Ngày Thi (yyyy-mm-dd):");
        lblNgayThi.setEnabled(false);

        lblCaThi.setText("Ca Thi:");
        lblCaThi.setEnabled(false);

        txtMaLop.setEnabled(false);

        lblPhongThi.setText("Phòng Thi:");
        lblPhongThi.setEnabled(false);

        lblSoSV.setText("Số Sinh Viên:");
        lblSoSV.setEnabled(false);

        txtTenMH.setEnabled(false);

        lblSoCBCT.setText("Số Cán Bộ Coi Thi:");
        lblSoCBCT.setEnabled(false);

        txtCaThi.setEnabled(false);

        txtNgayThi.setEnabled(false);

        lblXepLoai.setText("Xếp Loại:");
        lblXepLoai.setEnabled(false);

        groupXepLoai.add(rdbDat);
        rdbDat.setText("Đạt");
        rdbDat.setEnabled(false);

        groupXepLoai.add(rdbKhongDat);
        rdbKhongDat.setSelected(true);
        rdbKhongDat.setText("Không Đạt");
        rdbKhongDat.setEnabled(false);

        btnOKAdd.setText("OK");
        btnOKAdd.setEnabled(false);
        btnOKAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKAddActionPerformed(evt);
            }
        });

        btnOKEdit.setText("OK");
        btnOKEdit.setEnabled(false);
        btnOKEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKEditActionPerformed(evt);
            }
        });

        btnOKDelete.setText("OK");
        btnOKDelete.setEnabled(false);
        btnOKDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSoCBCT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSoSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMaLop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTenMH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNgayThi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCaThi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPhongThi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblXepLoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaLop)
                    .addComponent(txtTenMH)
                    .addComponent(txtCaThi)
                    .addComponent(txtPhongThi)
                    .addComponent(txtSoSV)
                    .addComponent(txtSoCBCT)
                    .addComponent(txtNgayThi)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(rdbDat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdbKhongDat))))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnOKAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOKEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOKDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaLop)
                    .addComponent(txtMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenMH)
                    .addComponent(txtTenMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgayThi)
                    .addComponent(txtNgayThi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCaThi)
                    .addComponent(txtCaThi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhongThi)
                    .addComponent(txtPhongThi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoSV)
                    .addComponent(txtSoSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoCBCT)
                    .addComponent(txtSoCBCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblXepLoai)
                    .addComponent(rdbDat)
                    .addComponent(rdbKhongDat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOKDelete)
                    .addComponent(btnOKEdit)
                    .addComponent(btnOKAdd))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        lblTimKiem.setText("Tìm Kiếm:");

        btnSearch.setText("Tìm Kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnClear.setText("Xóa Tìm Kiếm");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel1.setText("Tổng Số Môn Thi:");

        txtTongMon.setEditable(false);
        txtTongMon.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel2.setText("Số Phòng Được Xếp Lịch:");

        txtTongPhong.setEditable(false);
        txtTongPhong.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel3.setText("Số Cán Bộ Được Phân Công:");

        txtTongCBCT.setEditable(false);
        txtTongCBCT.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel4.setText("Tổng Số Môn Đã Thi (so với 11-01-2019):");

        txtDaThi.setEditable(false);
        txtDaThi.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel5.setText("Tổng Số Môn Chưa Thi (so với 11-01-2019):");

        txtChuaThi.setEditable(false);
        txtChuaThi.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel6.setText("Phòng Ít Sinh Viên Nhất:");

        jLabel7.setText("Phòng Nhiều Sinh Viên Nhất:");

        txtMin.setEditable(false);
        txtMin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtMax.setEditable(false);
        txtMax.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnThongKe.setText("Thống Kê");
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        system.setText("Hệ Thống");

        about.setText("Thông Tin");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        system.add(about);

        exit.setText("Thoát");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        system.add(exit);

        JMenuBar.add(system);

        function.setText("Chức Năng");

        subjects.setText("Môn Học");

        group.add(se214);
        se214.setText("Công Nghệ Phần Mềm Chuyên Sâu");
        se214.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                se214ActionPerformed(evt);
            }
        });
        subjects.add(se214);

        group.add(se327);
        se327.setText("Phát Triển Và Vận Hành Game");
        se327.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                se327ActionPerformed(evt);
            }
        });
        subjects.add(se327);

        group.add(se108);
        se108.setText("Kiểm Chứng Phần Mềm");
        se108.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                se108ActionPerformed(evt);
            }
        });
        subjects.add(se108);

        group.add(se104);
        se104.setText("Nhập Môn Công Nghệ Phần Mềm");
        se104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                se104ActionPerformed(evt);
            }
        });
        subjects.add(se104);

        group.add(se215);
        se215.setText("Giao Tiếp Người Máy");
        se215.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                se215ActionPerformed(evt);
            }
        });
        subjects.add(se215);

        group.add(it002);
        it002.setText("Lập Trình Hướng Đối Tượng");
        it002.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                it002ActionPerformed(evt);
            }
        });
        subjects.add(it002);

        group.add(se330);
        se330.setText("Ngôn Ngữ Lập Trình Java");
        se330.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                se330ActionPerformed(evt);
            }
        });
        subjects.add(se330);

        group.add(all);
        all.setSelected(true);
        all.setText("All");
        all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allActionPerformed(evt);
            }
        });
        subjects.add(all);

        function.add(subjects);

        reset.setText("Làm Mới Bảng");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        function.add(reset);

        JMenuBar.add(function);

        setJMenuBar(JMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnClear)
                            .addComponent(txtTimKiem))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(ScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTongMon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTongPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTongCBCT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtDaThi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtChuaThi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMax, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTimKiem)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(btnClear))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addComponent(ScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtTongMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtTongPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtTongCBCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDaThi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(txtChuaThi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(txtMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        panel.setEnabled(true);
        lblMaLop.setEnabled(true);
        lblTenMH.setEnabled(true);
        lblNgayThi.setEnabled(true);
        lblCaThi.setEnabled(true);
        lblPhongThi.setEnabled(true);
        lblSoSV.setEnabled(true);
        lblSoCBCT.setEnabled(true);
        lblXepLoai.setEnabled(false);
        txtMaLop.setEnabled(true);
        txtTenMH.setEnabled(true);
        txtNgayThi.setEnabled(true);
        txtCaThi.setEnabled(true);
        txtPhongThi.setEnabled(true);
        txtSoSV.setEnabled(true);
        txtSoCBCT.setEnabled(true);
        rdbDat.setEnabled(false);
        rdbKhongDat.setEnabled(false);
        btnOKAdd.setEnabled(true);
        btnOKEdit.setEnabled(false);
        btnOKDelete.setEnabled(false);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        panel.setEnabled(true);
        lblMaLop.setEnabled(true);
        lblTenMH.setEnabled(true);
        lblNgayThi.setEnabled(true);
        lblCaThi.setEnabled(true);
        lblPhongThi.setEnabled(true);
        lblSoSV.setEnabled(true);
        lblSoCBCT.setEnabled(true);
        lblXepLoai.setEnabled(true);
        txtMaLop.setEnabled(true);
        txtTenMH.setEnabled(true);
        txtNgayThi.setEnabled(true);
        txtCaThi.setEnabled(true);
        txtPhongThi.setEnabled(true);
        txtSoSV.setEnabled(true);
        txtSoCBCT.setEnabled(true);
        rdbDat.setEnabled(true);
        rdbKhongDat.setEnabled(true);
        btnOKAdd.setEnabled(false);
        btnOKEdit.setEnabled(true);
        btnOKDelete.setEnabled(false);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        panel.setEnabled(true);
        lblMaLop.setEnabled(true);
        lblTenMH.setEnabled(false);
        lblNgayThi.setEnabled(false);
        lblCaThi.setEnabled(false);
        lblPhongThi.setEnabled(false);
        lblSoSV.setEnabled(false);
        lblSoCBCT.setEnabled(false);
        lblXepLoai.setEnabled(false);
        txtMaLop.setEnabled(true);
        txtTenMH.setEnabled(false);
        txtNgayThi.setEnabled(false);
        txtCaThi.setEnabled(false);
        txtPhongThi.setEnabled(false);
        txtSoSV.setEnabled(false);
        txtSoCBCT.setEnabled(false);
        rdbDat.setEnabled(false);
        rdbKhongDat.setEnabled(false);
        btnOKAdd.setEnabled(false);
        btnOKEdit.setEnabled(false);
        btnOKDelete.setEnabled(true);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        JOptionPane.showMessageDialog(null, "Version 1.0.0");
    }//GEN-LAST:event_aboutActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        table.setAutoCreateRowSorter(true);
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(table.getModel());
        table.setRowSorter(sorter);
        sorter.setRowFilter(null);
        model.setRowCount(0);
        initTable();
        all.setSelected(true);       
    }//GEN-LAST:event_resetActionPerformed

    private void btnOKAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKAddActionPerformed
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost;databaseName=QLLTCK;integratedSecurity=true;";
            Connection connection = DriverManager.getConnection(url);
            String query = "INSERT INTO PHANCONG (maLop,tenMH,ngayThi,caThi,phongThi,soSV,soCBCT,xepLoai) VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setString(1, txtMaLop.getText());
            pst.setString(2, txtTenMH.getText());
            pst.setString(3, txtNgayThi.getText());
            pst.setInt(4, Integer.parseInt(txtCaThi.getText()));
            pst.setString(5, txtPhongThi.getText());
            pst.setFloat(6, Float.parseFloat(txtSoSV.getText()));
            pst.setInt(7, Integer.parseInt(txtSoCBCT.getText()));
            float sosv = Float.parseFloat(txtSoSV.getText());
            int socbct = Integer.parseInt(txtSoCBCT.getText());
            String xepLoai = "";
            if((sosv/socbct)<=2){
                xepLoai+="Đạt";
            }
            if((sosv/socbct)>2){
                xepLoai+="Không Đạt";
            }
            pst.setString(8, xepLoai);
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            initTable();
            JOptionPane.showMessageDialog(null, "Thêm phòng thi thành công!");
        }
        catch(Exception sqlex){
            JOptionPane.showMessageDialog(null, sqlex);
        }  
        
        panel.setEnabled(true);
        lblMaLop.setEnabled(false);
        lblTenMH.setEnabled(false);
        lblNgayThi.setEnabled(false);
        lblCaThi.setEnabled(false);
        lblPhongThi.setEnabled(false);
        lblSoSV.setEnabled(false);
        lblSoCBCT.setEnabled(false);
        lblXepLoai.setEnabled(false);
        txtMaLop.setEnabled(false);
        txtMaLop.setText("");
        txtTenMH.setEnabled(false);
        txtTenMH.setText("");
        txtNgayThi.setEnabled(false);
        txtNgayThi.setText("");
        txtCaThi.setEnabled(false);
        txtCaThi.setText("");
        txtPhongThi.setEnabled(false);
        txtPhongThi.setText("");
        txtSoSV.setEnabled(false);
        txtSoSV.setText("");
        txtSoCBCT.setEnabled(false);
        txtSoCBCT.setText("");
        rdbDat.setEnabled(false);
        rdbKhongDat.setEnabled(false);
        btnOKAdd.setEnabled(false);
        btnOKEdit.setEnabled(false);
        btnOKDelete.setEnabled(false);
    }//GEN-LAST:event_btnOKAddActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int i = table.getSelectedRow();
        TableModel model = table.getModel();
        txtMaLop.setText(model.getValueAt(i,0).toString());
        txtTenMH.setText(model.getValueAt(i,1).toString());
        txtNgayThi.setText(model.getValueAt(i,2).toString());
        txtCaThi.setText(model.getValueAt(i,3).toString());
        txtPhongThi.setText(model.getValueAt(i,4).toString());
        txtSoSV.setText(model.getValueAt(i,5).toString());
        txtSoCBCT.setText(model.getValueAt(i,6).toString());
        String XepLoai = model.getValueAt(i,7).toString();
        if(XepLoai.equals("Đạt")){
            rdbDat.setSelected(true);
        }
        else{
            rdbKhongDat.setSelected(true);
        }
    }//GEN-LAST:event_tableMouseClicked

    private void btnOKEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKEditActionPerformed
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost;databaseName=QLLTCK;integratedSecurity=true;";
            Connection connection = DriverManager.getConnection(url);
            String query = "UPDATE PHANCONG SET tenMH=?,ngayThi=?,caThi=?,phongThi=?,soSV=?,soCBCT=?,xepLoai=? WHERE maLop=?";
            PreparedStatement pst = connection.prepareStatement(query);            
            pst.setString(1, txtTenMH.getText());
            pst.setString(2, txtNgayThi.getText());
            pst.setInt(3, Integer.parseInt(txtCaThi.getText()));
            pst.setString(4, txtPhongThi.getText());
            pst.setFloat(5, Float.parseFloat(txtSoSV.getText()));
            pst.setInt(6, Integer.parseInt(txtSoCBCT.getText()));
            String xepLoai = "";
            if(rdbDat.isSelected()){
                xepLoai+="Đạt";
            }
            if(rdbKhongDat.isSelected()){
                xepLoai+="Không Đạt";
            }
            pst.setString(7, xepLoai);
            pst.setString(8, txtMaLop.getText());
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            initTable();
            JOptionPane.showMessageDialog(null, "Sửa phòng thi thành công!");
        }
        catch(Exception sqlex){
            JOptionPane.showMessageDialog(null, sqlex);
        }  
        
        panel.setEnabled(true);
        lblMaLop.setEnabled(false);
        lblTenMH.setEnabled(false);
        lblNgayThi.setEnabled(false);
        lblCaThi.setEnabled(false);
        lblPhongThi.setEnabled(false);
        lblSoSV.setEnabled(false);
        lblSoCBCT.setEnabled(false);
        lblXepLoai.setEnabled(false);
        txtMaLop.setEnabled(false);
        txtMaLop.setText("");
        txtTenMH.setEnabled(false);
        txtTenMH.setText("");
        txtNgayThi.setEnabled(false);
        txtNgayThi.setText("");
        txtCaThi.setEnabled(false);
        txtCaThi.setText("");
        txtPhongThi.setEnabled(false);
        txtPhongThi.setText("");
        txtSoSV.setEnabled(false);
        txtSoSV.setText("");
        txtSoCBCT.setEnabled(false);
        txtSoCBCT.setText("");
        rdbDat.setEnabled(false);
        rdbKhongDat.setEnabled(false);
        btnOKAdd.setEnabled(false);
        btnOKEdit.setEnabled(false);
        btnOKDelete.setEnabled(false);
    }//GEN-LAST:event_btnOKEditActionPerformed

    private void btnOKDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKDeleteActionPerformed
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost;databaseName=QLLTCK;integratedSecurity=true;";
            Connection connection = DriverManager.getConnection(url);
            String query = "DELETE FROM PHANCONG WHERE maLop=?";
            PreparedStatement pst = connection.prepareStatement(query);            
            pst.setString(1, txtMaLop.getText());         
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            initTable();
            JOptionPane.showMessageDialog(null, "Xóa phòng thi thành công!");
        }
        catch(Exception sqlex){
            JOptionPane.showMessageDialog(null, sqlex);
        }  
        
        panel.setEnabled(true);
        lblMaLop.setEnabled(false);
        lblTenMH.setEnabled(false);
        lblNgayThi.setEnabled(false);
        lblCaThi.setEnabled(false);
        lblPhongThi.setEnabled(false);
        lblSoSV.setEnabled(false);
        lblSoCBCT.setEnabled(false);
        lblXepLoai.setEnabled(false);
        txtMaLop.setEnabled(false);
        txtMaLop.setText("");
        txtTenMH.setEnabled(false);
        txtTenMH.setText("");
        txtNgayThi.setEnabled(false);
        txtNgayThi.setText("");
        txtCaThi.setEnabled(false);
        txtCaThi.setText("");
        txtPhongThi.setEnabled(false);
        txtPhongThi.setText("");
        txtSoSV.setEnabled(false);
        txtSoSV.setText("");
        txtSoCBCT.setEnabled(false);
        txtSoCBCT.setText("");
        rdbDat.setEnabled(false);
        rdbKhongDat.setEnabled(false);
        btnOKAdd.setEnabled(false);
        btnOKEdit.setEnabled(false);
        btnOKDelete.setEnabled(false);
    }//GEN-LAST:event_btnOKDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        table.setAutoCreateRowSorter(true);
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(table.getModel());
        table.setRowSorter(sorter);
        String text = txtTimKiem.getText();
        if(text.length()==0){
            sorter.setRowFilter(null);
        }
        else {
            sorter.setRowFilter(RowFilter.regexFilter(text));
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        table.setAutoCreateRowSorter(true);
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(table.getModel());
        table.setRowSorter(sorter);
        txtTimKiem.setText("");
        sorter.setRowFilter(null);
    }//GEN-LAST:event_btnClearActionPerformed

    private void se214ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_se214ActionPerformed
        table.setAutoCreateRowSorter(true);
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(table.getModel());
        table.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter("Công nghệ phần mềm chuyên sâu"));
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");        
            String url = "jdbc:sqlserver://localhost;databaseName=QLLTCK;integratedSecurity=true;";
            Connection connection = DriverManager.getConnection(url);
            String sql = "SELECT SUM(soSV) AS sumSoSV FROM PHANCONG WHERE tenMH = N'Công nghệ phần mềm chuyên sâu'";
            String sql2 = "SELECT COUNT(phongThi) AS PhongThi FROM PHANCONG WHERE tenMH = N'Công nghệ phần mềm chuyên sâu'";
            String sql3 = "SELECT SUM(soCBCT) AS sumSoCBCT FROM PHANCONG WHERE tenMH = N'Công nghệ phần mềm chuyên sâu'";
            PreparedStatement pst = connection.prepareStatement(sql); 
            PreparedStatement pst2 = connection.prepareStatement(sql2); 
            PreparedStatement pst3 = connection.prepareStatement(sql3); 
            ResultSet rs = pst.executeQuery();
            ResultSet rs2 = pst2.executeQuery();
            ResultSet rs3 = pst3.executeQuery();
            if(rs.next()){
                if(rs2.next()){
                    if(rs3.next()){
                        int SumSoSV = rs.getInt("sumSoSV");
                        int SumSoPhong = rs2.getInt("PhongThi");
                        int SumSoCBCT = rs3.getInt("sumSoCBCT");
                        JOptionPane.showMessageDialog(null,"<html>Số sinh viên dự thi: " + SumSoSV + ".<br>Số phòng thi: " + SumSoPhong + ".<br>Số cán bộ coi thi: " + SumSoCBCT + "</html>");
                    }
                }
            }
        }
        catch(Exception sqlex){
            JOptionPane.showMessageDialog(null, sqlex);
        }
    }//GEN-LAST:event_se214ActionPerformed

    private void se327ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_se327ActionPerformed
        table.setAutoCreateRowSorter(true);
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(table.getModel());
        table.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter("Phát triển và vận hành game"));
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");        
            String url = "jdbc:sqlserver://localhost;databaseName=QLLTCK;integratedSecurity=true;";
            Connection connection = DriverManager.getConnection(url);
            String sql = "SELECT SUM(soSV) AS sumSoSV FROM PHANCONG WHERE tenMH = N'Phát triển và vận hành game'";
            String sql2 = "SELECT COUNT(phongThi) AS PhongThi FROM PHANCONG WHERE tenMH = N'Phát triển và vận hành game'";
            String sql3 = "SELECT SUM(soCBCT) AS sumSoCBCT FROM PHANCONG WHERE tenMH = N'Phát triển và vận hành game'";
            PreparedStatement pst = connection.prepareStatement(sql); 
            PreparedStatement pst2 = connection.prepareStatement(sql2); 
            PreparedStatement pst3 = connection.prepareStatement(sql3); 
            ResultSet rs = pst.executeQuery();
            ResultSet rs2 = pst2.executeQuery();
            ResultSet rs3 = pst3.executeQuery();
            if(rs.next()){
                if(rs2.next()){
                    if(rs3.next()){
                        int SumSoSV = rs.getInt("sumSoSV");
                        int SumSoPhong = rs2.getInt("PhongThi");
                        int SumSoCBCT = rs3.getInt("sumSoCBCT");
                        JOptionPane.showMessageDialog(null,"<html>Số sinh viên dự thi: " + SumSoSV + ".<br>Số phòng thi: " + SumSoPhong + ".<br>Số cán bộ coi thi: " + SumSoCBCT + "</html>");
                    }
                }
            }
        }
        catch(Exception sqlex){
            JOptionPane.showMessageDialog(null, sqlex);
        }
    }//GEN-LAST:event_se327ActionPerformed

    private void se108ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_se108ActionPerformed
        table.setAutoCreateRowSorter(true);
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(table.getModel());
        table.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter("Kiểm chứng phần mềm"));
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");        
            String url = "jdbc:sqlserver://localhost;databaseName=QLLTCK;integratedSecurity=true;";
            Connection connection = DriverManager.getConnection(url);
            String sql = "SELECT SUM(soSV) AS sumSoSV FROM PHANCONG WHERE tenMH = N'Kiểm chứng phần mềm'";
            String sql2 = "SELECT COUNT(phongThi) AS PhongThi FROM PHANCONG WHERE tenMH = N'Kiểm chứng phần mềm'";
            String sql3 = "SELECT SUM(soCBCT) AS sumSoCBCT FROM PHANCONG WHERE tenMH = N'Kiểm chứng phần mềm'";
            PreparedStatement pst = connection.prepareStatement(sql); 
            PreparedStatement pst2 = connection.prepareStatement(sql2); 
            PreparedStatement pst3 = connection.prepareStatement(sql3); 
            ResultSet rs = pst.executeQuery();
            ResultSet rs2 = pst2.executeQuery();
            ResultSet rs3 = pst3.executeQuery();
            if(rs.next()){
                if(rs2.next()){
                    if(rs3.next()){
                        int SumSoSV = rs.getInt("sumSoSV");
                        int SumSoPhong = rs2.getInt("PhongThi");
                        int SumSoCBCT = rs3.getInt("sumSoCBCT");
                        JOptionPane.showMessageDialog(null,"<html>Số sinh viên dự thi: " + SumSoSV + ".<br>Số phòng thi: " + SumSoPhong + ".<br>Số cán bộ coi thi: " + SumSoCBCT + "</html>");
                    }
                }
            }
        }
        catch(Exception sqlex){
            JOptionPane.showMessageDialog(null, sqlex);
        }
    }//GEN-LAST:event_se108ActionPerformed

    private void se104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_se104ActionPerformed
        table.setAutoCreateRowSorter(true);
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(table.getModel());
        table.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter("Nhập môn Công nghệ phần mềm"));
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");        
            String url = "jdbc:sqlserver://localhost;databaseName=QLLTCK;integratedSecurity=true;";
            Connection connection = DriverManager.getConnection(url);
            String sql = "SELECT SUM(soSV) AS sumSoSV FROM PHANCONG WHERE tenMH = N'Nhập môn Công nghệ phần mềm'";
            String sql2 = "SELECT COUNT(phongThi) AS PhongThi FROM PHANCONG WHERE tenMH = N'Nhập môn Công nghệ phần mềm'";
            String sql3 = "SELECT SUM(soCBCT) AS sumSoCBCT FROM PHANCONG WHERE tenMH = N'Nhập môn Công nghệ phần mềm'";
            PreparedStatement pst = connection.prepareStatement(sql); 
            PreparedStatement pst2 = connection.prepareStatement(sql2); 
            PreparedStatement pst3 = connection.prepareStatement(sql3); 
            ResultSet rs = pst.executeQuery();
            ResultSet rs2 = pst2.executeQuery();
            ResultSet rs3 = pst3.executeQuery();
            if(rs.next()){
                if(rs2.next()){
                    if(rs3.next()){
                        int SumSoSV = rs.getInt("sumSoSV");
                        int SumSoPhong = rs2.getInt("PhongThi");
                        int SumSoCBCT = rs3.getInt("sumSoCBCT");
                        JOptionPane.showMessageDialog(null,"<html>Số sinh viên dự thi: " + SumSoSV + ".<br>Số phòng thi: " + SumSoPhong + ".<br>Số cán bộ coi thi: " + SumSoCBCT + "</html>");
                    }
                }
            }
        }
        catch(Exception sqlex){
            JOptionPane.showMessageDialog(null, sqlex);
        }
    }//GEN-LAST:event_se104ActionPerformed

    private void se215ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_se215ActionPerformed
        table.setAutoCreateRowSorter(true);
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(table.getModel());
        table.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter("Giao tiếp người máy"));
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");        
            String url = "jdbc:sqlserver://localhost;databaseName=QLLTCK;integratedSecurity=true;";
            Connection connection = DriverManager.getConnection(url);
            String sql = "SELECT SUM(soSV) AS sumSoSV FROM PHANCONG WHERE tenMH = N'Giao tiếp người máy'";
            String sql2 = "SELECT COUNT(phongThi) AS PhongThi FROM PHANCONG WHERE tenMH = N'Giao tiếp người máy'";
            String sql3 = "SELECT SUM(soCBCT) AS sumSoCBCT FROM PHANCONG WHERE tenMH = N'Giao tiếp người máy'";
            PreparedStatement pst = connection.prepareStatement(sql); 
            PreparedStatement pst2 = connection.prepareStatement(sql2); 
            PreparedStatement pst3 = connection.prepareStatement(sql3); 
            ResultSet rs = pst.executeQuery();
            ResultSet rs2 = pst2.executeQuery();
            ResultSet rs3 = pst3.executeQuery();
            if(rs.next()){
                if(rs2.next()){
                    if(rs3.next()){
                        int SumSoSV = rs.getInt("sumSoSV");
                        int SumSoPhong = rs2.getInt("PhongThi");
                        int SumSoCBCT = rs3.getInt("sumSoCBCT");
                        JOptionPane.showMessageDialog(null,"<html>Số sinh viên dự thi: " + SumSoSV + ".<br>Số phòng thi: " + SumSoPhong + ".<br>Số cán bộ coi thi: " + SumSoCBCT + "</html>");
                    }
                }
            }
        }
        catch(Exception sqlex){
            JOptionPane.showMessageDialog(null, sqlex);
        }
    }//GEN-LAST:event_se215ActionPerformed

    private void it002ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_it002ActionPerformed
        table.setAutoCreateRowSorter(true);
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(table.getModel());
        table.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter("Lập trình hướng đối tượng"));
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");        
            String url = "jdbc:sqlserver://localhost;databaseName=QLLTCK;integratedSecurity=true;";
            Connection connection = DriverManager.getConnection(url);
            String sql = "SELECT SUM(soSV) AS sumSoSV FROM PHANCONG WHERE tenMH = N'Lập trình hướng đối tượng'";
            String sql2 = "SELECT COUNT(phongThi) AS PhongThi FROM PHANCONG WHERE tenMH = N'Lập trình hướng đối tượng'";
            String sql3 = "SELECT SUM(soCBCT) AS sumSoCBCT FROM PHANCONG WHERE tenMH = N'Lập trình hướng đối tượng'";
            PreparedStatement pst = connection.prepareStatement(sql); 
            PreparedStatement pst2 = connection.prepareStatement(sql2); 
            PreparedStatement pst3 = connection.prepareStatement(sql3); 
            ResultSet rs = pst.executeQuery();
            ResultSet rs2 = pst2.executeQuery();
            ResultSet rs3 = pst3.executeQuery();
            if(rs.next()){
                if(rs2.next()){
                    if(rs3.next()){
                        int SumSoSV = rs.getInt("sumSoSV");
                        int SumSoPhong = rs2.getInt("PhongThi");
                        int SumSoCBCT = rs3.getInt("sumSoCBCT");
                        JOptionPane.showMessageDialog(null,"<html>Số sinh viên dự thi: " + SumSoSV + ".<br>Số phòng thi: " + SumSoPhong + ".<br>Số cán bộ coi thi: " + SumSoCBCT + "</html>");
                    }
                }
            }
        }
        catch(Exception sqlex){
            JOptionPane.showMessageDialog(null, sqlex);
        }
    }//GEN-LAST:event_it002ActionPerformed

    private void se330ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_se330ActionPerformed
        table.setAutoCreateRowSorter(true);
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(table.getModel());
        table.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter("Ngôn ngữ lập trình Java"));
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");        
            String url = "jdbc:sqlserver://localhost;databaseName=QLLTCK;integratedSecurity=true;";
            Connection connection = DriverManager.getConnection(url);
            String sql = "SELECT SUM(soSV) AS sumSoSV FROM PHANCONG WHERE tenMH = N'Ngôn ngữ lập trình Java'";
            String sql2 = "SELECT COUNT(phongThi) AS PhongThi FROM PHANCONG WHERE tenMH = N'Ngôn ngữ lập trình Java'";
            String sql3 = "SELECT SUM(soCBCT) AS sumSoCBCT FROM PHANCONG WHERE tenMH = N'Ngôn ngữ lập trình Java'";
            PreparedStatement pst = connection.prepareStatement(sql); 
            PreparedStatement pst2 = connection.prepareStatement(sql2); 
            PreparedStatement pst3 = connection.prepareStatement(sql3); 
            ResultSet rs = pst.executeQuery();
            ResultSet rs2 = pst2.executeQuery();
            ResultSet rs3 = pst3.executeQuery();
            if(rs.next()){
                if(rs2.next()){
                    if(rs3.next()){
                        int SumSoSV = rs.getInt("sumSoSV");
                        int SumSoPhong = rs2.getInt("PhongThi");
                        int SumSoCBCT = rs3.getInt("sumSoCBCT");
                        JOptionPane.showMessageDialog(null,"<html>Số sinh viên dự thi: " + SumSoSV + ".<br>Số phòng thi: " + SumSoPhong + ".<br>Số cán bộ coi thi: " + SumSoCBCT + "</html>");
                    }
                }
            }
        }
        catch(Exception sqlex){
            JOptionPane.showMessageDialog(null, sqlex);
        }
    }//GEN-LAST:event_se330ActionPerformed

    private void allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allActionPerformed
        table.setAutoCreateRowSorter(true);
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(table.getModel());
        table.setRowSorter(sorter);
        sorter.setRowFilter(null);
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");        
            String url = "jdbc:sqlserver://localhost;databaseName=QLLTCK;integratedSecurity=true;";
            Connection connection = DriverManager.getConnection(url);
            String sql = "SELECT SUM(soSV) AS sumSoSV FROM PHANCONG";
            String sql2 = "SELECT COUNT(phongThi) AS PhongThi FROM PHANCONG";
            String sql3 = "SELECT SUM(soCBCT) AS sumSoCBCT FROM PHANCONG";
            PreparedStatement pst = connection.prepareStatement(sql); 
            PreparedStatement pst2 = connection.prepareStatement(sql2); 
            PreparedStatement pst3 = connection.prepareStatement(sql3); 
            ResultSet rs = pst.executeQuery();
            ResultSet rs2 = pst2.executeQuery();
            ResultSet rs3 = pst3.executeQuery();
            if(rs.next()){
                if(rs2.next()){
                    if(rs3.next()){
                        int SumSoSV = rs.getInt("sumSoSV");
                        int SumSoPhong = rs2.getInt("PhongThi");
                        int SumSoCBCT = rs3.getInt("sumSoCBCT");
                        JOptionPane.showMessageDialog(null,"<html>Số sinh viên dự thi: " + SumSoSV + ".<br>Số phòng thi: " + SumSoPhong + ".<br>Số cán bộ coi thi: " + SumSoCBCT + "</html>");
                    }
                }
            }
        }
        catch(Exception sqlex){
            JOptionPane.showMessageDialog(null, sqlex);
        }
    }//GEN-LAST:event_allActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");        
            String url = "jdbc:sqlserver://localhost;databaseName=QLLTCK;integratedSecurity=true;";
            Connection connection = DriverManager.getConnection(url);
            String sql1 = "SELECT COUNT(DISTINCT tenMH) AS TenMH FROM PHANCONG";
            String sql2 = "SELECT COUNT(DISTINCT phongThi) AS PhongThi FROM PHANCONG";
            String sql3 = "SELECT SUM(soCBCT) AS SoCBCT FROM PHANCONG";
            String sql4 = "SELECT phongThi AS Max FROM PHANCONG WHERE soSV=(SELECT MAX(soSV) FROM PHANCONG)";
            String sql5 = "SELECT phongThi AS Min FROM PHANCONG WHERE soSV=(SELECT MIN(soSV) FROM PHANCONG)";
            String sql6 = "SELECT COUNT(DISTINCT tenMH) AS before FROM PHANCONG WHERE ngayThi < '2019-01-11'";
            String sql7 = "SELECT COUNT(DISTINCT tenMH) AS after FROM PHANCONG WHERE ngayThi > '2019-01-11'";
            PreparedStatement pst1 = connection.prepareStatement(sql1); 
            PreparedStatement pst2 = connection.prepareStatement(sql2); 
            PreparedStatement pst3 = connection.prepareStatement(sql3); 
            PreparedStatement pst4 = connection.prepareStatement(sql4); 
            PreparedStatement pst5 = connection.prepareStatement(sql5); 
            PreparedStatement pst6 = connection.prepareStatement(sql6); 
            PreparedStatement pst7 = connection.prepareStatement(sql7); 
            ResultSet rs1 = pst1.executeQuery();
            ResultSet rs2 = pst2.executeQuery();
            ResultSet rs3 = pst3.executeQuery();
            ResultSet rs4 = pst4.executeQuery();
            ResultSet rs5 = pst5.executeQuery();
            ResultSet rs6 = pst6.executeQuery();
            ResultSet rs7 = pst7.executeQuery();
            if(rs1.next()){
                if(rs2.next()){
                    if(rs3.next()){
                        if(rs4.next()){         
                            if(rs5.next()){
                                if(rs6.next()){
                                    if(rs7.next()){
                                        String TenMH = rs1.getString("TenMH");
                                        txtTongMon.setText(TenMH.toString());
                                        String SoPhong = rs2.getString("PhongThi");
                                        txtTongPhong.setText(SoPhong.toString());
                                        String SoCBCT = rs3.getString("SoCBCT"); 
                                        txtTongCBCT.setText(SoCBCT.toString());                                               
                                        String Max = rs4.getString("Max");
                                        txtMax.setText(Max.toString());
                                        String Min = rs5.getString("Min");
                                        txtMin.setText(Min.toString());
                                        String Before = rs6.getString("before");
                                        txtDaThi.setText(Before.toString());
                                        String After = rs7.getString("after");
                                        txtChuaThi.setText(After.toString());
                                    } 
                                }
                            }
                        }
                    }
                }
            }
        }
        catch(Exception sqlex){
            JOptionPane.showMessageDialog(null, sqlex);
        }
    }//GEN-LAST:event_btnThongKeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar JMenuBar;
    private javax.swing.JScrollPane ScrollPane1;
    private javax.swing.JMenuItem about;
    private javax.swing.JRadioButtonMenuItem all;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnOKAdd;
    private javax.swing.JButton btnOKDelete;
    private javax.swing.JButton btnOKEdit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu function;
    private javax.swing.ButtonGroup group;
    private javax.swing.ButtonGroup groupXepLoai;
    private javax.swing.JRadioButtonMenuItem it002;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblCaThi;
    private javax.swing.JLabel lblMaLop;
    private javax.swing.JLabel lblNgayThi;
    private javax.swing.JLabel lblPhongThi;
    private javax.swing.JLabel lblSoCBCT;
    private javax.swing.JLabel lblSoSV;
    private javax.swing.JLabel lblTenMH;
    private javax.swing.JLabel lblTimKiem;
    private javax.swing.JLabel lblXepLoai;
    private javax.swing.JPanel panel;
    private javax.swing.JRadioButton rdbDat;
    private javax.swing.JRadioButton rdbKhongDat;
    private javax.swing.JMenuItem reset;
    private javax.swing.JRadioButtonMenuItem se104;
    private javax.swing.JRadioButtonMenuItem se108;
    private javax.swing.JRadioButtonMenuItem se214;
    private javax.swing.JRadioButtonMenuItem se215;
    private javax.swing.JRadioButtonMenuItem se327;
    private javax.swing.JRadioButtonMenuItem se330;
    private javax.swing.JMenu subjects;
    private javax.swing.JMenu system;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtCaThi;
    private javax.swing.JTextField txtChuaThi;
    private javax.swing.JTextField txtDaThi;
    private javax.swing.JTextField txtMaLop;
    private javax.swing.JTextField txtMax;
    private javax.swing.JTextField txtMin;
    private javax.swing.JTextField txtNgayThi;
    private javax.swing.JTextField txtPhongThi;
    private javax.swing.JTextField txtSoCBCT;
    private javax.swing.JTextField txtSoSV;
    private javax.swing.JTextField txtTenMH;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtTongCBCT;
    private javax.swing.JTextField txtTongMon;
    private javax.swing.JTextField txtTongPhong;
    // End of variables declaration//GEN-END:variables
}
