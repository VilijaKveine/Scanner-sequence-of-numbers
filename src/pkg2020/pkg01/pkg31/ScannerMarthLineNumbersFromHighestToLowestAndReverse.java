   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2020.pkg01.pkg31;

/**
 *
 * @author vilij
 */
public class ScannerMarthLineNumbersFromHighestToLowestAndReverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //rusiavimas
        int[] c = {1, 2, 3, 4, 5, 6,};
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                System.out.print(c[(i + j) % c.length]);//lauztiniuose skliaustuose parasom kuri elementa turim paimti
                System.out.print(' ');
            }
            System.out.println();
        }

        int[] g = {1, 2, 3, 4, 5, 6,};
        for (int i = 0; i < g.length - 1; i++) {
            for (int j = i + 1; j < g.length; j++) {
                if (g[i] < g[j]) {//jeigu cia parasysim > zenkla-ruziuos didejancia tvarka
                    int temp = g[i];
                    g[i] = g[j];
                    g[j] = temp;//temp=temporary
                }
            }
        }
        for (int i = 0; i < g.length; i++) {
            System.out.print(g[i] + "  ");
        }

        System.out.println("----------");
        int[][] q = {{1, 2, 3},
        {12, -2}
        };
        int num = 0;
        for (int i = 0; i < q.length; i++) {
            num += q[i].length;
        }
        int[] nm = new int[num];//sukuriamas naujas masyvas su num reiksme
        num = 0;
        for (int i = 0; i < q.length; i++) {
            for (int j = 0; j < q[i].length; j++) {
                nm[num++] = q[i][j];//m[i][j]=nm[num++];
            }
        }
                //rusiavimas
// num = 0;
//        for (int i= 0; i<q.length; i++){
//            for(int j=0; j<q[i].length; j++);
//            nm[num++]=q[i][j];
//lenteles generavimas
                int size = 50;
                char[][] field = new char[size][size];
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {  //Math.random() generuoja [0;1)   
                        if (Math.random() < 0.25) {
                            field[i][j] = 'X';
                        } else {
                            field[i][j] = '.';
                        }
                    }
                }
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        System.out.print(field[i][j]);
                    }
                    System.out.println();
                }
                for (int i=0; i<50; i++){
                    char [][] newField = new char[size][size];
                    //einam per visus field elementus, tam reikes dar dvieju ciklu cikle
            
        //kinatmuju gyvenimas
        //is pradziu turi deklaruoti, o tada naudotis , pvz int a=10; (int tipo), 
        //antra karta negalim deklaruot to paties kintamojo, gyvena skaupe{} nuo pradzios iki pabaigos
        //vienu metu viename skaupe negali buti dvieju vienodu kintamuju;
        //niuansas : ciklas for yra isskirtinis, bet jis turi savo skaupa, kuriame deklaruoajme kintamuosius,ir viduj kiekviena karta kuriamas kunas, vykdomas ciklas;
        //niuansas su masyvais: pvz int [] outer ={1,2};
        //if(true) {
        //int [] inner = {4,5,6};
        //outer=inner; po sito veiksmo abu rodo i ta pati antra masyva inner, pati reiksme guli toliau, saugoma nuoroda, inner - anuliuojasi, jo duomenis perima outer
        //}
    }
    }
}
    
    
    