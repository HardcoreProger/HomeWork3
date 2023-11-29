public class Ex3 {
    public static void main (String [] args){
        /* создать n переменных char всеми возможными способами и вывести их на экран*/

        char zahl = 100;
        // Сотый по счёту символ в таблице
        char octal = '\u039A';
        // Вызов определённого символа кодом
        char zeichen = 'A';
        // Буква A
        char tabulator = '\t'; // В русском языке клавиша называется "Таб"
        // Табулятор
        char phi = '\u03A6';
        // Греческая буквая Фита - PHI


        System.out.println(zahl);
        System.out.println(octal);
        System.out.println(zeichen);
        System.out.print(tabulator);
        System.out.println(phi);
    }
}
