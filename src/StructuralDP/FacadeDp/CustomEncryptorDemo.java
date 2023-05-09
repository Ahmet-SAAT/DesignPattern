package StructuralDP.FacadeDp;

public class CustomEncryptorDemo {
    public static void main(String[] args) {

        String text="Content";

        //KOTU DIZAYN ORNEGI kullanicinin keyi bilmesi gerekmez
        AESEnc aesEnc=new AESEnc();
        aesEnc.encrypt(text);

         MD5Enc md5Enc=new MD5Enc();
         md5Enc.encrypt(text,"key");

         SHAEn shaEn=new SHAEn();
         shaEn.encrypt(text,"key",true);
         shaEn.encrypt(text,"key",false);


         //IYI DIZAYN ORNEGI

        EncFacade encFacade=new EncFacade();
        encFacade.encryt(text, EncFacade.EncType.AES);



    }




}
