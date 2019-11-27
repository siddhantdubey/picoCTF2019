public class Four{

    public static void main(String[] args){
        byte[] myBytes = {
            106 , 85  , 53  , 116 , 95  , 52  , 95  , 98  ,
            0x55, 0x6e, 0x43, 0x68, 0x5f, 0x30, 0x66, 0x5f,
            0142, 0131, 0164, 063 , 0163, 0137, 070 , 060 ,
            'f' , '8' , 'e' , '1' , 'e' , '0' , '4' , '7' ,
        };

        for(int i=0; i<32; i++){
            System.out.println((char) myBytes[i]);
        }
    }
}