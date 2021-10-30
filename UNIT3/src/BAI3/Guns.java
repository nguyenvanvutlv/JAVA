package BAI3;

public class Guns {
    private String WeaponName;
    private int AmmoNumber;
    public Guns(){

    }
    public Guns(String WeaponName,int AmmoNumber){
        this.WeaponName = WeaponName;
        this.AmmoNumber = AmmoNumber;
    }
    public void Load(int x){
        WeaponName+=x;
    }
    public void Shoot(int x){
        if(AmmoNumber >= x){
            AmmoNumber -= x;
        }else{
            System.out.println("Hết đoạn rồi");
        }
    }
    public String getWeaponName() {
        return WeaponName;
    }

    public void setWeaponName(String weaponName) {
        WeaponName = weaponName;
    }

    public int getAmmoNumber() {
        return AmmoNumber;
    }

    public void setAmmoNumber(int ammoNumber) {
        AmmoNumber = ammoNumber;
    }
}
