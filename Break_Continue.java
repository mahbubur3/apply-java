// public class Break_Continue {

//     public static void main(String[] args) {

//         for (int i = 1; i <= 20; i++) {
//             if (i == 9) {
//                 break;
//             }
//             System.out.println(i);
//         }
//     }
// }

// public class Break_Continue {

//     public static void main(String[] args) {

//         for (int i = 1; i <= 20; i++) {
//             if (i == 9) {
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }

public class Break_Continue {
    public static void main(String[] args) {

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
            if (i == 5) {
                break;
            }
        }
    }
}