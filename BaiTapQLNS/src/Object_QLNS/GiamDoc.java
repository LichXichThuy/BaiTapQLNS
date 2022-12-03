package Object_QLNS;

public class GiamDoc extends NhanVien{
    int coPhan;

    public GiamDoc(){
        super();
        this.luongMotNgay = 300;
    }

    public int getCoPhan() {
        return coPhan;
    }

    public void setCoPhan(int coPhan) {
        this.coPhan = coPhan;
    }
}
