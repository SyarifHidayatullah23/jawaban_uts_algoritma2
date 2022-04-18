public class instagram {
    public static void main(String[] args) {
        Instagram_Model[] post = new Instagram_Model[3];
        post[0] = new Instagram_Model();
        post[0].user = "Syarif";
        post[0].caption = """
                BJR semakin didepan;
        ArrayList komen0 = new ArrayList<>();
        post[0].komen = komen0;
       
        post[1] = new Instagram_Model();
        post[1].user = "iwan";
        post[1].caption = """
                abimanyu wani perih        
        ArrayList komen1 = new ArrayList<>();
        post[1].komen = komen1;
        post[1].like = 0;

        post[2] = new Instagram_Model();
        post[2].user = "riki";
        post[2].caption = """
                sendakala jos
                #GOONIC""";
        ArrayList komen2 = new ArrayList<>();
        post[2].komen = komen2;
        post[2].like = 0;

        System.out.println("INSTAGRAM");
        System.out.println("---------------");
        System.out.println("\nPostingan 1");
        post[0].post();
        System.out.println("\nPostingan 2");
        post[1].post();
        System.out.println("\nPostingan 3");
        post[2].post();

        Scanner input = new Scanner(System.in);
        char pilihPost = 0;
        do {
            System.out.println("Pilih Postingan (1, 2, 3): ");
            pilihPost = input.next().charAt(0);
            switch (pilihPost) {
                case '1' -> {
                    post[0].postingan();
                    char pilihan = 0;
                    do {
                        System.out.println("Pilih Perintah (0-4): ");
                        pilihan = input.next().charAt(0);
                        switch (pilihan) {
                            case '1' -> {
                                post[0].likes(1);
                                post[0].postingan();
                            }
                            case '2' -> {
                                System.out.print("Masukkan Komentar: ");
                                Scanner input2 = new Scanner(System.in);
                                String komen = input2.nextLine();
                                post[0].Comments(komen);
                                post[0].postingan();
                            }
                            case '3' -> {
                                System.out.println("Daftar Komentar: ");
                                post[0].showComment();
                            }
                            default -> {
                            }
                        }
                    } while (pilihan != '0');
                }
                case '2' -> {
                    post[1].postingan();
                    char pilihan = 0;
                    do {
                        System.out.println("Pilih Perintah (0-4): ");
                        pilihan = input.next().charAt(0);
                        switch (pilihan) {
                            case '1' -> {
                                post[1].likes(1);
                                post[1].postingan();
                            }
                            case '2' -> {
                                System.out.print("Masukkan Komentar: ");
                                Scanner input2 = new Scanner(System.in);
                                String komen = input2.nextLine();
                                post[1].Comments(komen);
                                post[1].postingan();
                            }
                            case '3' -> {
                                System.out.println("Daftar Komentar: ");
                                post[1].showComment();
                            }
                            default -> {
                            }
                        }
                    } while (pilihan != '0');
                }
                case '3' -> {
                    post[2].postingan();
                    char pilihan = 0;
                    do {
                        System.out.println("Pilih Perintah (0-4): ");
                        pilihan = input.next().charAt(0);
                        switch (pilihan) {
                            case '1' -> {
                                post[2].likes(1);
                                post[2].postingan();
                            }
                            case '2' -> {
                                System.out.print("Masukkan Komentar: ");
                                Scanner input2 = new Scanner(System.in);
                                String komen = input2.nextLine();
                                post[2].Comments(komen);
                                post[2].postingan();
                            }
                            case '3' -> {
                                System.out.println("Daftar Komentar: ");
                                post[2].showComment();
                            }
                            default -> {
                            }
                        }
                    } while (pilihan != '0');
                }
            }
        } while (pilihPost != '0');
    }
    
}
