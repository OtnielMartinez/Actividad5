/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad5;

import java.util.Scanner;

/**
 *
 * @author lampi
 */
public class Actividad5 {
    /**
     * @param args the command line arguments
     */
    public static void semana(){
        System.out.println("------------------------[Ejercicio 1]-----------------------------");
        System.out.println("Dias de la semana");
        String [] dSemana;
        dSemana = new String [7];
        dSemana [0] = "Lunes";
        dSemana [1] = "Martes";
        dSemana [2] = "Miercoles";
        dSemana [3] = "Jueves";
        dSemana [4] = "Viernes";
        dSemana [5] = "Sabado";
        dSemana [6] = "Domingo";
    
        for (int i = 0; i < dSemana.length; i++) {
            System.out.println(dSemana[i]);    
        }
    }
    public static void pStarwars(){
    System.out.println("------------------------[Ejercicio 2]-----------------------------");
        System.out.println("Personajes de Star Wars");
        String[][] starwars;
        starwars = new String[10][2];
        starwars [0][0] = "Darth Vader";
        starwars [0][1] = "Yoda";
        starwars [1][0] = "Chewbacca";
        starwars [1][1] = "R2-D2";
        starwars [2][0] = "Obi-Wan Kenobi";
        starwars [2][1] = "Anakin Skywalker";
        starwars [3][0] = "Luke Skywalker";
        starwars [3][1] = "C3PO";
        starwars [4][0] = "Han Solo";
        starwars [4][1] = "Leia Skywalker";
        starwars [5][0] = "BB8";
        starwars [5][1] = "Kylo Ren";
        starwars [6][0] = "Rey";
        starwars [6][1] = "Padme Amidala";
        starwars [7][0] = "Darth Sidious";
        starwars [7][1] = "Finn";
        starwars [8][0] = "Poe Dameron";
        starwars [8][1] = "Snoke";
        starwars [9][0] = "General Hux";
        starwars [9][1] = "Jabba el Hutt";
        for (int i = 0; i < starwars.length; i++) {
            for (int j = 0; j < starwars[i].length; j++) {
                System.out.print(starwars[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void morce() {
        System.out.println("------------------------[Ejercicio 3]-----------------------------");
        String[][] aCodigo;
        aCodigo = new String[26][2];
        aCodigo[0][0] = "A";
        aCodigo[1][0] = "B";
        aCodigo[2][0] = "C";
        aCodigo[3][0] = "D";
        aCodigo[4][0] = "E";
        aCodigo[5][0] = "F";
        aCodigo[6][0] = "G";
        aCodigo[7][0] = "H";
        aCodigo[8][0] = "I";
        aCodigo[9][0] = "J";
        aCodigo[10][0] = "K";
        aCodigo[11][0] = "L";
        aCodigo[12][0] = "M";
        aCodigo[13][0] = "N";
        aCodigo[14][0] = "O";
        aCodigo[15][0] = "P";
        aCodigo[16][0] = "Q";
        aCodigo[17][0] = "R";
        aCodigo[18][0] = "S";
        aCodigo[19][0] = "T";
        aCodigo[20][0] = "U";
        aCodigo[21][0] = "V";
        aCodigo[22][0] = "W";
        aCodigo[23][0] = "X";
        aCodigo[24][0] = "Y";
        aCodigo[25][0] = "Z";
        aCodigo[0][1] = ".-";
        aCodigo[1][1] = "-...";
        aCodigo[2][1] = "-.-.";
        aCodigo[3][1] = "-..";
        aCodigo[4][1] = ".";
        aCodigo[5][1] = "..-.";
        aCodigo[6][1] = "--.";
        aCodigo[7][1] = "...";
        aCodigo[8][1] = "..";
        aCodigo[9][1] = ".---";
        aCodigo[10][1] = "-.-";
        aCodigo[11][1] = ".-..";
        aCodigo[12][1] = "--";
        aCodigo[13][1] = "-.";
        aCodigo[14][1] = "---";
        aCodigo[15][1] = ".--.";
        aCodigo[16][1] = "--.-";
        aCodigo[17][1] = ".-.";
        aCodigo[18][1] = "...";
        aCodigo[19][1] = "-";
        aCodigo[20][1] = "..-";
        aCodigo[21][1] = "...-";
        aCodigo[22][1] = ".--";
        aCodigo[23][1] = "-..-";
        aCodigo[24][1] = "-.--";
        aCodigo[25][1] = "--..";
        for (int i = 0; i < aCodigo.length; i++) {
            for (int j = 0; j < aCodigo[i].length; j++) {
                System.out.print(aCodigo[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void palabra(){
    System.out.println("------------------------[Ejercicio 4]-----------------------------");    
    System.out.println("Ingrese una palabra");
    System.out.println("Favor de NO ingresar espacios");
    Scanner miConsola = new Scanner( System.in);
    String palabra = miConsola.next();
    char [] aChar = palabra.toCharArray();
        for (int i = 0; i < aChar.length; i++) {
            System.out.println(aChar[i]);
        }
    }
    public static void pPagar(){
        System.out.println("------------------------[Ejercicio 5]-----------------------------");   
        String aCodigo[][]  = new String[26][2];
        aCodigo[0][0] = "A";
        aCodigo[1][0] = "B";
        aCodigo[2][0] = "C";
        aCodigo[3][0] = "D";
        aCodigo[4][0] = "E";
        aCodigo[5][0] = "F";
        aCodigo[6][0] = "G";
        aCodigo[7][0] = "H";
        aCodigo[8][0] = "I";
        aCodigo[9][0] = "J";
        aCodigo[10][0] = "K";
        aCodigo[11][0] = "L";
        aCodigo[12][0] = "M";
        aCodigo[13][0] = "N";
        aCodigo[14][0] = "O";
        aCodigo[15][0] = "P";
        aCodigo[16][0] = "Q";
        aCodigo[17][0] = "R";
        aCodigo[18][0] = "S";
        aCodigo[19][0] = "T";
        aCodigo[20][0] = "U";
        aCodigo[21][0] = "V";
        aCodigo[22][0] = "W";
        aCodigo[23][0] = "X";
        aCodigo[24][0] = "Y";
        aCodigo[25][0] = "Z";
        aCodigo[0][1] = ".-";
        aCodigo[1][1] = "-...";
        aCodigo[2][1] = "-.-.";
        aCodigo[3][1] = "-..";
        aCodigo[4][1] = ".";
        aCodigo[5][1] = "..-.";
        aCodigo[6][1] = "--.";
        aCodigo[7][1] = "...";
        aCodigo[8][1] = "..";
        aCodigo[9][1] = ".---";
        aCodigo[10][1] = "-.-";
        aCodigo[11][1] = ".-..";
        aCodigo[12][1] = "--";
        aCodigo[13][1] = "-.";
        aCodigo[14][1] = "---";
        aCodigo[15][1] = ".--.";
        aCodigo[16][1] = "--.-";
        aCodigo[17][1] = ".-.";
        aCodigo[18][1] = "...";
        aCodigo[19][1] = "-";
        aCodigo[20][1] = "..-";
        aCodigo[21][1] = "...-";
        aCodigo[22][1] = ".--";
        aCodigo[23][1] = "-..-";
        aCodigo[24][1] = "-.--";
        aCodigo[25][1] = "--..";
        Scanner miConsola = new Scanner(System.in);
        System.out.println("Escriba una palabra en MAYUSCULA por favor:");
        String palabra = miConsola.next();
        int pago = 10;
        int asciiValue;
        char cChar;
        int x=0;
        char [] aChar = palabra.toCharArray();
        for (int i = 0; i < aChar.length; i++) {
            cChar = aChar[i];
            asciiValue= (int) cChar;
            x=i;  
            switch (asciiValue) {
                case 65: System.out.println("A:"+aCodigo[65-65][1]);
                    break;
                case 66: System.out.println("B:"+aCodigo[66-65][1]);
                    break;
                case 67: System.out.println("C:"+aCodigo[67-65][1]);
                    break;
                case 68: System.out.println("D:"+aCodigo[68-65][1]);
                    break;
                case 69: System.out.println("E:"+aCodigo[68-65][1]);
                    break;
                case 70: System.out.println("F:"+aCodigo[69-65][1]);
                    break;
                case 71: System.out.println("G:"+aCodigo[70-65][1]);
                    break;
                case 72: System.out.println("H:"+aCodigo[71-65][1]);
                    break;
                case 73: System.out.println("I:"+aCodigo[72-65][1]);
                    break;
                case 74: System.out.println("J:"+aCodigo[73-65][1]);
                    break;
                case 75: System.out.println("K:"+aCodigo[74-65][1]);
                    break;
                case 76: System.out.println("L:"+aCodigo[75-65][1]);
                     break;
                case 77: System.out.println("M:"+aCodigo[76-65][1]);
                     break;
                case 78: System.out.println("N:"+aCodigo[77-65][1]);
                     break;
                case 79: System.out.println("O:"+aCodigo[78-65][1]);
                    break;
                case 80: System.out.println("P:"+aCodigo[79-65][1]);
                    break;
                case 81: System.out.println("Q:"+aCodigo[80-65][1]);
                    break;
                case 82: System.out.println("R:"+aCodigo[81-65][1]);
                    break;
                case 83: System.out.println("S:"+aCodigo[82-65][1]);
                    break;
                case 84: System.out.println("T:"+aCodigo[83-65][1]);
                    break;
                case 85: System.out.println("U:"+aCodigo[84-65][1]);
                    break;
                case 86:  System.out.println("V:"+aCodigo[85-65][1]);
                    break;
                case 87: System.out.println("W:"+aCodigo[86-65][1]);
                    break;
                case 88: System.out.println("X:"+aCodigo[87-65][1]);
                    break;
                case 89: System.out.println("Y:"+aCodigo[88-65][1]);
                    break;
                case 90: System.out.println("Z:"+aCodigo[89-65][1]);
                    break;
            }
        }
        if (x<=aChar.length) {
                if (x<=4) {
                    System.out.println("total a pagar ="+ pago);
                }
                else{
                    int extra = x-4;
                    for (int j = 0; j < extra; j++) {
                        pago=pago +3;
                    }
                    System.out.println("total a pagar mas el extra ="+pago);
                }
            }
    }
    public static void personajesSW(){
    System.out.println("------------------------[Ejercicio 6]-----------------------------"); 
    System.out.println("ingresa un sexo:");
        Scanner miConsola = new Scanner(System.in);
        String sWar[][] = new String[3][10];
        sWar[0][0]="Darth Vader";
        sWar[1][0]="2,03 m";
        sWar[2][0]="male";      
        sWar[0][1]="Luke Skywalker";
        sWar[1][1]="1.72 m";
        sWar[2][1]="male";        
        sWar[0][2]="Han solo";
        sWar[1][2]="1.8 m";
        sWar[2][2]="male";       
        sWar[0][3]="Lea Organa";
        sWar[1][3]="2,03 m";
        sWar[2][3]="female";        
        sWar[0][4]="Asoka Tano";
        sWar[1][4]="1.88 m";
        sWar[2][4]="female";      
        sWar[0][5]="Rey Skywalker";
        sWar[1][5]="1.7 m";
        sWar[2][5]="female";
        sWar[0][6]="Jabba el Hutt";
        sWar[1][6]="3,9 m";
        sWar[2][6]="hermafrodita";        
        sWar[0][7]="Zorba Desilijic";
        sWar[1][7]="3,03 m";
        sWar[2][7]="hermafrodita";
        sWar[0][8]="R2-D2";
        sWar[1][8]="2,03 m";
        sWar[2][8]="programming";
        sWar[0][9]="C-3PO";
        sWar[1][9]="2,03 m";
        sWar[2][9]="programming";
        String nameS = miConsola.next();
        switch(nameS){
            case "male": 
                for (int i = 0; i < 3; i++) {
                    System.out.println(sWar[0][i]);
                }
                break;
            case "femele":
                for (int i = 3; i < 5; i++) {
                    System.out.println(sWar[0][i]);
                }
                break;
            case "hermafrodita":
                for (int i = 5; i < 7; i++) {
                    System.out.println(sWar[0][i]);
                }
                break;
            case "programming":
                for (int i = 7; i < 9; i++) {
                    System.out.println(sWar[0][i]);
                }
                break;
            
        }
    }
    public static void imprimirMensaje(String msg){
            System.out.println(msg);
    }
    public static void main(String[] args) {
        int num;
        do {
            imprimirMensaje("---------------------------------MENU--------------------------------");
            imprimirMensaje("1) Ejercicio 1: Dias de la Semana");
            imprimirMensaje("2) Ejercicio 2: Codigo Morce");
            imprimirMensaje("3) Ejercicio 3: Personajes de Star wars");
            imprimirMensaje("4) Ejercicio 4: Leer palabra");
            imprimirMensaje("5) Ejercicio 5: Cobrar por ingresar palabra");
            imprimirMensaje("6) Ejercicio 6: Sexo de Personajes de Star wars");
            imprimirMensaje("9) ---SALIR---");  
            Scanner miConsola = new Scanner( System.in);
            imprimirMensaje("Ingrese su opcion");
            num =  miConsola.nextInt();
            switch (num) {
            case 1:
                semana();
                break;
            case 2:
                pStarwars();
                break;
            case 3:
                morce();
                break;  
            case 4:
                palabra();
                break;
            case 5:
                pPagar();
                break;
            case 6:
                personajesSW();
                break;    
            default:
                throw new AssertionError();
        }
        }while (num!=9);
    }
}
