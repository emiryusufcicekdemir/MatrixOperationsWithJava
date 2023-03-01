import java.util.Scanner;

public class matrisler {

    public static void main(String[] args) {
        System.out.println("Yapmak istediginiz islemi giriniz");
        System.out.println("1-Toplama islemi icin 1'i");
        System.out.println("2-Cikarma islemi icin 2'yi");
        System.out.println("3-Carpma islemi icin 3'u");
        System.out.println("4-Sabit sayi ile carpma icin 4'u");
        System.out.println("5-Determinant hesaplama icin 5'i");
        System.out.println("6-Matrisin tersini alma icin 6'yi");
        System.out.println("7-Involutif inceleme icin 7'yi");
        System.out.println("8-Cikis yapmak icin 8'i seciniz.");
        int secim = 0;
        Scanner klavye = new Scanner(System.in);
        secim = klavye.nextInt();
        while (secim != 8) {
            switch (secim) {
                case 1:
                    double[][] matris1 = new double[3][3];
                    double[][] matris2 = new double[3][3];
                    double[][] matrisToplam = new double[3][3];

                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.println("Lutfen 1. matris icin [" + i + "][" + j + "] konumundaki elemani yazin");
                            matris1[i][j] = klavye.nextDouble();
                            matrisToplam[i][j] += matris1[i][j];
                        }
                    }
                    for (int i=0; i<3; i++)
                        for(int j=0; j<3; j++){
                            System.out.println("Lutfen 2. matris icin [" + i + "][" + j + "] konumundaki elemani yazin");
                            matris2[i][j] = klavye.nextDouble();
                            matrisToplam[i][j] += matris2[i][j];
                        }
                    System.out.println("matris1 ve matris2'nin toplami:");

                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(matrisToplam[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    double[][] Matris1 = new double[3][3];
                    double[][] Matris2 = new double[3][3];
                    double[][] MatrisCikarma = new double[3][3];

                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.println("Lutfen 1. matris icin [" + i + "][" + j + "] konumundaki elemani yazin");
                            Matris1[i][j] = klavye.nextDouble();
                            MatrisCikarma[i][j] += Matris1[i][j];
                        }
                    }
                    for (int i = 0; i < 3; i++)
                        for (int j = 0; j < 3; j++) {
                            System.out.println("Lutfen 2. matris icin ["+i+"]["+j+"] konumundaki elemani yazin");
                            Matris2[i][j]=klavye.nextDouble();
                            MatrisCikarma[i][j] -= Matris2[i][j];
                        }


                    System.out.println("matris1 ve matris2'nin toplami:");

                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(MatrisCikarma[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    double A[][] = new double[3][3];
                    double B[][] = new double[3][3];
                    double C[][] = new double[3][3];
                    for (int i = 0; i < 3; i++)
                        for (int j = 0; j < 3; j++) {
                            System.out.printf("A[" + i + "][" + j + "]");
                            A[i][j] = klavye.nextDouble();
                        }
                    System.out.printf("\n");
                    for (int i = 0; i < 3; i++)
                        for (int j = 0; j < 3; j++) {
                            System.out.printf("B[" + i + "][" + j + "]=");
                            B[i][j] = klavye.nextDouble();
                        }
                    for (int i = 0; i < 3; i++)
                        for (int j = 0; j < 3; j++)
                            for (int k = 0; k < 3; k++)
                                C[i][j] += A[i][k] * B[k][j];

                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++)
                            System.out.printf(C[i][j] + "\t");
                        System.out.printf("\n");
                    }

                    break;

                case 4:
                    double d[][] = new double[3][3];
                    double sabitsayi = 0;
                    for (int i = 0; i < 3; i++)
                        for (int j = 0; j < 3; j++) {
                            System.out.printf("A[" + i + "][" + j + "]=");
                            d[i][j] = klavye.nextDouble();
                        }
                    System.out.println("Matrisi carpmak istediginiz sabit sayiyi giriniz: ");
                    sabitsayi = klavye.nextDouble();
                    for (int i = 0; i < 3; i++)
                        for (int j = 0; j < 3; j++) {
                            d[i][j] = d[i][j] * sabitsayi;
                        }
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(d[i][j] + " ");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 5:
                    double m[][] = new double[3][3];
                    double determinant = 0;
                    System.out.println("Determinantini alacaginiz matrisi giriniz");
                    for (int i = 0; i < 3; i++)
                        for (int j = 0; j < 3; j++) {
                            System.out.printf("A[" + i+ "][" + j + "]=");
                            m[i][j] = klavye.nextDouble();
                        }
                    determinant = (m[0][0] * m[1][1] * m[2][2]) + (m[1][0] * m[2][1] * m[0][2])
                            + (m[2][0] * m[0][1] * m[1][2]) - ((m[0][2] * m[1][1] * m[2][0])
                            + (m[1][2] * m[2][1] * m[0][0]) + (m[2][2] * m[0][1] * m[1][0]));
                    System.out.println("Girdiginiz matrisin determinanti= " + determinant);
                    break;
                case 6:
                    double q[][] = new double[3][3];
                    for (int i = 0; i < 3; i++)
                        for (int j = 0; j < 3; j++) {
                            System.out.printf("A["+i+"]["+j+"]=");
                            q[i][j] = klavye.nextDouble();
                        }
                    double w[][] = {
                            { q[1][1] * q[2][2] - q[1][2] * q[2][1], q[0][2] * q[2][1] - q[0][1] * q[2][2],
                                    q[0][1] * q[1][2] - q[0][2] * q[1][1] },
                            { q[1][2] * q[2][0] - q[1][0] * q[2][2], q[0][0] * q[2][2] - q[0][2] * q[2][0],
                                    q[0][2] * q[1][0] - q[0][0] * q[1][2] },
                            { q[1][0] * q[2][1] - q[1][1] * q[2][0], q[0][2] * q[2][0] - q[0][0] * q[2][1],
                                    q[0][0] * q[1][1] - q[0][1] * q[1][0] } };
                    System.out.println("Girdiginiz matrisin tersi= ");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.printf(w[i][j] + " ");
                        }
                        System.out.println(" ");
                    }
                    break;

                case 7:
                    double inv[][] = new double[3][3];
                    double son[][] = new double[3][3];
                    for (int i = 0; i < 3; i++)
                        for (int j = 0; j < 3; j++) {
                            System.out.printf("A["+i+"]["+j+"]=");
                            inv[i][j] = klavye.nextDouble();
                        }
                    for (int i = 0; i < 3; i++)
                        for (int j = 0; j < 3; j++)
                            for (int k = 0; k < 3; k++)
                                son[i][j] += inv[i][k] * inv[k][j];

                    if (son[0][0] == 1) {
                        if (son[1][1] == 1) {
                            if (son[2][2] == 1) {
                                for (int i = 0; i < 3; i++) {
                                    for (int j = 0; j < 3; j++)
                                        System.out.printf(son[i][j]+"\t");
                                    System.out.printf("\n");

                                }
                                System.out.println("Girdiginiz matris involutiftir");
                            }
                        }
                    } else {
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 3; j++)
                                System.out.printf(son[i][j]+"\t");
                            System.out.printf("\n");
                        }
                        System.out.println("Girdiginiz matris involutif degildir!!!");

                    }
                    break;

            }
            System.out.println("---------------------------------------------------------------1");
            System.out.println("Yapmak istediginiz islemi giriniz");
            System.out.println("1-Toplama islemi icin 1'i");
            System.out.println("2-Cikarma islemi icin 2'yi");
            System.out.println("3-Carpma islemi icin 3'u");
            System.out.println("4-Sabit sayi ile carpma icin 4'u");
            System.out.println("5-Determinant hesaplama icin 5'i");
            System.out.println("6-Matrisin tersini alma icin 6'yi");
            System.out.println("7-Involutif inceleme icin 7'yi");
            System.out.println("8-Cikis yapmak icin 8'i seciniz.");
            secim = klavye.nextInt();
        }

    }
}