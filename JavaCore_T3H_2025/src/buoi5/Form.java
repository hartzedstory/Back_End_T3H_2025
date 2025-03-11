package buoi5;

import java.util.Optional;

public class Form
{
    private int tu;
    private int mau;

    public Form(int tu, int mau)
    {
        this.tu = tu;
        this.mau = mau;
    }

    public Form() {
        System.out.println("Init");
    }

    public void cong2PhanSo(Form secondaryNumber) {
        if (this.mau == secondaryNumber.mau) {
            int value = this.getTu() + secondaryNumber.getTu();
            System.out.println(String.format("Tu: %d, Mau: %d", value, this.mau));
            return;
        }
            int commonMau = this.getTu() * secondaryNumber.getTu();
            int finalTu1 = secondaryNumber.getMau() * this.getTu();
            int finalTu2 = this.getMau() * secondaryNumber.getTu();
            int sumFinal =  finalTu1 + finalTu2;
            System.out.println(String.format("Tu: %d, Mau: %d", sumFinal, commonMau));

            String a = "a";
            if (a == null) ;


    }



    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }
}
