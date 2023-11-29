public class Ex1 {
    public static void main (String [] args){
        //создать по 4 переменные всех целочисленных типов данных и записанть их в разных системах счисления
        byte b1 = 12,b2 = 0b1100,b3 = 014,b4 = 0xC;//10b, 2b, 8b, 16b
        short sh1 = 1300,sh2 = 0b10100010100,sh3 = 02424,sh4 = 0x514;
        int i1 = 0,i2 = 0b0,i3 = 00,i4 = 0x0;
        long l1 = 12345678,l2 = 0b101111000110000101001110,l3 = 057060516,l4 = 0xbc614e;
        //вывести на экран
        System.out.println("\n____byte____ \n10-ичная - "+b1+"\n2-ичная - "+b2+"\n8-ичная - "+b3+"\n16-ичная - "+b4);
        System.out.println("\n____short____ \n10-chnaya - "+sh1+"\n2-ichnaya - "+sh2+"\n8-ichnaya - "+sh3+"\n16-ichnaya - "+sh4);
        System.out.println("\n____int____ \n10-chnaya - "+i1+"\n2-ichnaya - "+i2+"\n8-ichnaya - "+i3+"\n16-ichnaya - "+i4);
        System.out.println("\n____long____ \n10-chnaya - "+l1+"\n2-ichnaya - "+l2+"\n8-ichnaya - "+l3+"\n16-ichnaya - "+l4);

    }
}
