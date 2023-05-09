package StructuralDP.FacadeDp;

public class EncFacade {

    private AESEnc aesEnc = new AESEnc();
    private MD5Enc md5Enc = new MD5Enc();
    private SHAEn shaEn = new SHAEn();


    public void encryt(String text,EncType encType) {

        switch (encType){
            case AES: aesEnc.encrypt(text);break;
            case MD5: md5Enc.encrypt(text,"Key");break;
            case SHA: shaEn.encrypt(text,"KEY",true);break;
            default:throw new IllegalArgumentException(encType.toString());
        }
    }

    public enum EncType{
        SHA,
        MD5,
        AES
    }
}
