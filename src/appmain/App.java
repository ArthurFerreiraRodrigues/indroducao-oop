package appmain;

import helper.Read;
import helper.Print;

public class App {
    public static void main(String[] args) throws Exception {
        int close = 0;

        do {
            Menu.options();
            int option = Read.menu();
            switch (option) {
                case 1:
                    Menu.case1();
                    break;
                case 2:
                    Menu.case2();
                    break;
                case 3:
                    Menu.case3();
                    break;
                case 4:
                    Menu.case4();
                    break;
                case 5:
                    Menu.case5();
                    break;
                case 6:
                    Menu.case6();
                    break;
                case 7:
                    close = Menu.case7();
                    break;
                default:
                    Print.split();
                    System.out.println("ERRO: Número fora do intervalo! Digite novamente.");
                    break;
            }
        } while (close == 0);
    }
}
