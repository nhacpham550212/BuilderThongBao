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
public class ThongBao {
    String str,tieuDe,icon,noiDung,tenUngDung;

    public ThongBao(Builder builder) {
            this.tieuDe = builder.tieuDe;
            this.icon = builder.icon;
            this.noiDung = builder.noiDung;
            this.tenUngDung = builder.tenUngDung;
    }

    @Override
    public String toString() {
        return "ThongBao{" + "tieuDe=" + tieuDe + ", icon=" + icon + ", noiDung=" + noiDung + ", tenUngDung=" + tenUngDung + '}';
    }
    
   
    public static class Builder
    {
        String tieuDe,icon,noiDung,tenUngDung;
        
        
         
        public Builder addtieuDe(String tieude) {
            this.tieuDe = tieude;
            return this;
        }
        public Builder addicon(String icon) {
            this.icon = icon;
            return this;
        }
        public Builder addnoiDung(String noiDung) {
            this.noiDung = noiDung;
            return this;
        }
        public Builder addtenUngDung(String tenUngDung) {
            this.tenUngDung = tenUngDung;
            return this;
        }
        public ThongBao build()
        {
            return new ThongBao(this);
        }
    }
        private static ThongBao instance;

        public ThongBao() {
        }
        
        public static  ThongBao createInstance(){
            if(instance == null)
            {
                instance = new ThongBao();
            }
            return instance;
        }
        public void setThongBao(ThongBao thongBao)
        {
            instance.tieuDe=thongBao.tieuDe;
             instance.icon=thongBao.icon;
              instance.noiDung=thongBao.noiDung;
               instance.tenUngDung=thongBao.tenUngDung;
        }
    
}
