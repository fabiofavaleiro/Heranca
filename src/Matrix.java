import javax.swing.*;

public class Matrix {
    public static void main(String[] args) {

        int matrix[][][][][][]= new int[6][6][6][6][6][6];

        for (int i1 = 0; i1 < matrix.length; i1++) {
            for (int i2 = 0; i2 < 6; i2++) {
                for (int i3 = 0; i3 < 6; i3++) {
                    for (int i4 = 0; i4 < 6; i4++) {
                        for (int i5 = 0; i5 < 6; i5++) {
                            for (int i6 = 0; i6 < 6; i6++) {
                                 matrix[i1][i2][i3][i4][i5][i6] = i1 * i2 * i3 * i4 * i5 * i6;
                            }
                        }
                    }
                }
            }
        }
        for (int i1 = 0; i1 < matrix.length; i1++) {
            for (int i2 = 0; i2 < 6; i2++) {
                for (int i3 = 0; i3 < 6; i3++) {
                    for (int i4 = 0; i4 < 6; i4++) {
                        for (int i5 = 0; i5 < 6; i5++) {
                            for (int i6 = 0; i6 < 6; i6++) {
                                JOptionPane.showInternalMessageDialog( null,matrix[i1][i2][i3][i4][i5][i6]);
                            }
                        }
                    }
                }
            }
        }


    }


}
