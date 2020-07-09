/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderthongbao;

/**
 *
 * @author Administrator
 */
public class BuilderThongBao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ThongBao thongBao = new ThongBao.Builder().addtieuDe("hòn bầu đuồi")
                .addicon("đạt óc cu").addnoiDung("nhạc phéc cơ").addtenUngDung("long bú buồi").build();
        System.out.println(thongBao.toString());
//        ThongBao thongBao1 = new ThongBao.Builder().getInstance().addtieuDe("hòn 12321 bầu đuồi")
//                .addicon("đạt óc cu").addnoiDung("nhạc phéc cơ").addtenUngDung("long bú buồi").build();
//        System.out.println(thongBao1.toString());
//        
        ThongBao thongBaoSingleton1 = ThongBao.createInstance();
        thongBaoSingleton1.setThongBao(thongBao);
        System.out.println(thongBaoSingleton1.toString());
        ThongBao thongBaoSingleton2 = ThongBao.createInstance();
        System.out.println(thongBaoSingleton2.toString());
       
     
    }
    
}
