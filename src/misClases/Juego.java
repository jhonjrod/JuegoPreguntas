/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misClases;

import java.util.Random;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Milton Rodriguez
 */
public class Juego {
    public String[][] banco = new String[17][16];
    public int puntaje=0;
    public int nums_aleatorios[];
    public int[]resp = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    public int [] resp_correctas = {0,2,3,1,0,1,1,2,0,3,0,1,3,2,1,2};
    
    
    
    public void cargarJuego(){
        Pregunta arreglo_pregunta[] = new Pregunta[16];
        
        Pregunta pregunta1 = new Pregunta();
        pregunta1.setInterrogante("¿Cuál es el nombre del río más largo del mundo?");
        pregunta1.setOpciones("Amazonas-Nilo-Danubio-Cali-50/50-Saltar");
        arreglo_pregunta[0] = pregunta1;
        
        Pregunta pregunta2 = new Pregunta();
        pregunta2.setInterrogante("¿Cuál es el océano más grande del mundo?");
        pregunta2.setOpciones("Indico-Atlantico-Pacifico-Mediterraneo-50/50-Saltar");
        arreglo_pregunta[1] = pregunta2;
        
        Pregunta pregunta3 = new Pregunta();
        pregunta3.setInterrogante("¿Cuál es el país más grande del mundo?");
        pregunta3.setOpciones("China-Colombia-India-Rusia-50/50-Saltar");
        arreglo_pregunta[2] = pregunta3;
        
        Pregunta pregunta4 = new Pregunta();
        pregunta4.setInterrogante("¿Cuál es el país que tiene forma de bota?");
        pregunta4.setOpciones("España-Italia-Honduras-Chile-50/50-Saltar");
        arreglo_pregunta[3] = pregunta4;
        
        Pregunta pregunta5 = new Pregunta();
        pregunta5.setInterrogante("¿Cuál es el país más poblado de la tierra?");
        pregunta5.setOpciones("China-EEUU-Rusia-Argentina-50/50-Saltar");
        arreglo_pregunta[4] = pregunta5;
        
        Pregunta pregunta6 = new Pregunta();
        pregunta6.setInterrogante("¿Cuál es la ciudad de los rascacielos?");
        pregunta6.setOpciones("Tokyo-NY-Hong Kong-Londres-50/50-Saltar");
        arreglo_pregunta[5] = pregunta6;
        
        Pregunta pregunta7 = new Pregunta();
        pregunta7.setInterrogante("¿Cuándo terminó la II Guerra Mundial?");
        pregunta7.setOpciones("1947-1945-1943-1949-50/50-Saltar");
        arreglo_pregunta[6] = pregunta7;
        
        Pregunta pregunta8 = new Pregunta();
        pregunta8.setInterrogante("¿En qué año llegó Cristobal Colón a América?");
        pregunta8.setOpciones("1592-1497-1492-1657-50/50-Saltar");
        arreglo_pregunta[7] = pregunta8;
        
        Pregunta pregunta9 = new Pregunta();
        pregunta9.setInterrogante("¿Quién era el general de los Nazis en la Segunda Guerra Mundial?");
        pregunta9.setOpciones("Hitler-Mussolini-Himmler-Goebbels-50/50-Saltar");
        arreglo_pregunta[8] = pregunta9;
        
        Pregunta pregunta10 = new Pregunta();
        pregunta10.setInterrogante("¿Cuál es el idioma más antiguo que pervive en Europa?");
        pregunta10.setOpciones("Castellano-Ingles-Frances-Vasco-50/50-Saltar");
        arreglo_pregunta[9] = pregunta10;
        
        Pregunta pregunta11 = new Pregunta();
        pregunta11.setInterrogante("¿Cómo se llama la primera mujer que viajó al espacio?");
        pregunta11.setOpciones("Valentina Tereshkova-Alexandra Tereshkova-Amanda Tereshkova-Vera Alentova-50/50-Saltar");
        arreglo_pregunta[10] = pregunta11;
        
        Pregunta pregunta12 = new Pregunta();
        pregunta12.setInterrogante("¿Quién escribió La Odisea?");
        pregunta12.setOpciones("Virgilio-Homero-Cervantes-Julio Cortazar-50/50-Saltar");
        arreglo_pregunta[11] = pregunta12;
        
        Pregunta pregunta13 = new Pregunta();
        pregunta13.setInterrogante("¿Cómo se llama el Himno Nacional de Francia?");
        pregunta13.setOpciones("La Internacional-La llanera-La solitaria-La Marsellesa-50/50-Saltar");
        arreglo_pregunta[12] = pregunta13;
        
        Pregunta pregunta14 = new Pregunta();
        pregunta14.setInterrogante("¿Qué es un melómano?");
        pregunta14.setOpciones("Un amante del cine-Un amante de los cómics-Un amante de la música-Un amante de los libros-50/50-Saltar");
        arreglo_pregunta[13] = pregunta14;
        
        Pregunta pregunta15 = new Pregunta();
        pregunta15.setInterrogante("¿En qué año murió Kurt Cobain?");
        pregunta15.setOpciones("1996-1994-1998-1992-50/50-Saltar");
        arreglo_pregunta[14] = pregunta15;
        
        Pregunta pregunta16 = new Pregunta();
        pregunta16.setInterrogante("¿Cuál es el elemento químico más abundante en la corteza terrestre?");
        pregunta16.setOpciones("Nitrógeno-Carbono-Oxígeno-Adrenocromo-50/50-Saltar");
        arreglo_pregunta[15] = pregunta16;
        
        for(int i=0;i<=15;i++){
            banco[0][i] = arreglo_pregunta[i].getInterrogante();
        
        }
        
        final Pattern space = Pattern.compile("-");
        
        for(int i=0;i<=15;i++){
            banco[i+1] = space.split(arreglo_pregunta[i].getOpciones());
        
        }
        
        
        //System.out.println("Interrogantes:");
        //for(int i=0;i<=15;i++){
            //System.out.println(banco[0][i]);
            
        //}
        
        iniciarJuego();
    
    }
    
    public void formatearOpciones(int valor,int valor2){
        if(valor==1){
            banco[1] = new String[] {"Amazonas","Nilo"};
            if(valor2==1){
                banco[2] = new String[] {"Indico","Atlantico","Pacifico","Mediterraneo"};
                banco[3] = new String[] {"China","Colombia","India","Rusia"};
                banco[4] = new String[] {"España","Italia","Honduras","Chile"};
                banco[5] = new String[] {"China","EEUU","Rusia","Argentina"};
                banco[6] = new String[] {"Tokyo","NY","Hong Kong","Londres"};
                banco[7] = new String[] {"1947","1945","1943","1949"};
                banco[8] = new String[] {"1592","1497","1492","1657"};
                banco[9] = new String[] {"Hitler","Mussolini","Himmler","Goebbels"};
                banco[10] = new String[] {"Castellano","Ingles","Frances","Vasco"};
                banco[11] = new String[] {"Valentina Tereshkova","Alexandra Tereshkova","Amanda Tereshkova","Vera Alentova"};
                banco[12] = new String[] {"Virgilio","Homero","Cervantes","Julio Cortazar"};
                banco[13] = new String[] {"La Internacional","La llanera","La solitaria","La Marsellesa"};
                banco[14] = new String[] {"Un amante del cine","Un amante de los cómics","Un amante de la música","Un amante de los libros"};
                banco[15] = new String[] {"1996","1994","1998","1992"};
                banco[16] = new String[] {"Nitrógeno","Carbono","Oxígeno","Adrenocromo"};
            }else{
                banco[2] = new String[] {"Indico","Atlantico","Pacifico","Mediterraneo","Saltar"};
                banco[3] = new String[] {"China","Colombia","India","Rusia","Saltar"};
                banco[4] = new String[] {"España","Italia","Honduras","Chile","Saltar"};
                banco[5] = new String[] {"China","EEUU","Rusia","Argentina","Saltar"};
                banco[6] = new String[] {"Tokyo","NY","Hong Kong","Londres","Saltar"};
                banco[7] = new String[] {"1947","1945","1943","1949","Saltar"};
                banco[8] = new String[] {"1592","1497","1492","1657","Saltar"};
                banco[9] = new String[] {"Hitler","Mussolini","Himmler","Goebbels","Saltar"};
                banco[10] = new String[] {"Castellano","Ingles","Frances","Vasco","Saltar"};
                banco[11] = new String[] {"Valentina Tereshkova","Alexandra Tereshkova","Amanda Tereshkova","Vera Alentova","Saltar"};
                banco[12] = new String[] {"Virgilio","Homero","Cervantes","Julio Cortazar","Saltar"};
                banco[13] = new String[] {"La Internacional","La llanera","La solitaria","La Marsellesa","Saltar"};
                banco[14] = new String[] {"Un amante del cine","Un amante de los cómics","Un amante de la música","Un amante de los libros","Saltar"};
                banco[15] = new String[] {"1996","1994","1998","1992","Saltar"};
                banco[16] = new String[] {"Nitrógeno","Carbono","Oxígeno","Adrenocromo","Saltar"};
            
            }
            
        }
        if(valor==2){
            banco[2] = new String[] {"Indico","Atlantico"};
            if(valor2==1){
                banco[1] = new String[] {"Amazonas","Nilo","Danubio","Cali"};
                banco[3] = new String[] {"China","Colombia","India","Rusia"};
                banco[4] = new String[] {"España","Italia","Honduras","Chile"};
                banco[5] = new String[] {"China","EEUU","Rusia","Argentina"};
                banco[6] = new String[] {"Tokyo","NY","Hong Kong","Londres"};
                banco[7] = new String[] {"1947","1945","1943","1949"};
                banco[8] = new String[] {"1592","1497","1492","1657"};
                banco[9] = new String[] {"Hitler","Mussolini","Himmler","Goebbels"};
                banco[10] = new String[] {"Castellano","Ingles","Frances","Vasco"};
                banco[11] = new String[] {"Valentina Tereshkova","Alexandra Tereshkova","Amanda Tereshkova","Vera Alentova"};
                banco[12] = new String[] {"Virgilio","Homero","Cervantes","Julio Cortazar"};
                banco[13] = new String[] {"La Internacional","La llanera","La solitaria","La Marsellesa"};
                banco[14] = new String[] {"Un amante del cine","Un amante de los cómics","Un amante de la música","Un amante de los libros"};
                banco[15] = new String[] {"1996","1994","1998","1992"};
                banco[16] = new String[] {"Nitrógeno","Carbono","Oxígeno","Adrenocromo"};
            }else{
                banco[1] = new String[] {"Amazonas","Nilo","Danubio","Cali","Saltar"};
                banco[3] = new String[] {"China","Colombia","India","Rusia","Saltar"};
                banco[4] = new String[] {"España","Italia","Honduras","Chile","Saltar"};
                banco[5] = new String[] {"China","EEUU","Rusia","Argentina","Saltar"};
                banco[6] = new String[] {"Tokyo","NY","Hong Kong","Londres","Saltar"};
                banco[7] = new String[] {"1947","1945","1943","1949","Saltar"};
                banco[8] = new String[] {"1592","1497","1492","1657","Saltar"};
                banco[9] = new String[] {"Hitler","Mussolini","Himmler","Goebbels","Saltar"};
                banco[10] = new String[] {"Castellano","Ingles","Frances","Vasco","Saltar"};
                banco[11] = new String[] {"Valentina Tereshkova","Alexandra Tereshkova","Amanda Tereshkova","Vera Alentova","Saltar"};
                banco[12] = new String[] {"Virgilio","Homero","Cervantes","Julio Cortazar","Saltar"};
                banco[13] = new String[] {"La Internacional","La llanera","La solitaria","La Marsellesa","Saltar"};
                banco[14] = new String[] {"Un amante del cine","Un amante de los cómics","Un amante de la música","Un amante de los libros","Saltar"};
                banco[15] = new String[] {"1996","1994","1998","1992","Saltar"};
                banco[16] = new String[] {"Nitrógeno","Carbono","Oxígeno","Adrenocromo","Saltar"};
            
            }
            
        }
        if(valor==3){
            banco[3] = new String[] {"China","Colombia"};
            if(valor2==1){
                banco[2] = new String[] {"Indico","Atlantico","Pacifico","Mediterraneo"};
                banco[1] = new String[] {"Amazonas","Nilo","Danubio","Cali"};
                banco[4] = new String[] {"España","Italia","Honduras","Chile"};
                banco[5] = new String[] {"China","EEUU","Rusia","Argentina"};
                banco[6] = new String[] {"Tokyo","NY","Hong Kong","Londres"};
                banco[7] = new String[] {"1947","1945","1943","1949"};
                banco[8] = new String[] {"1592","1497","1492","1657"};
                banco[9] = new String[] {"Hitler","Mussolini","Himmler","Goebbels"};
                banco[10] = new String[] {"Castellano","Ingles","Frances","Vasco"};
                banco[11] = new String[] {"Valentina Tereshkova","Alexandra Tereshkova","Amanda Tereshkova","Vera Alentova"};
                banco[12] = new String[] {"Virgilio","Homero","Cervantes","Julio Cortazar"};
                banco[13] = new String[] {"La Internacional","La llanera","La solitaria","La Marsellesa"};
                banco[14] = new String[] {"Un amante del cine","Un amante de los cómics","Un amante de la música","Un amante de los libros"};
                banco[15] = new String[] {"1996","1994","1998","1992"};
                banco[16] = new String[] {"Nitrógeno","Carbono","Oxígeno","Adrenocromo"};
            }else{
                banco[2] = new String[] {"Indico","Atlantico","Pacifico","Mediterraneo","Saltar"};
                banco[1] = new String[] {"Amazonas","Nilo","Danubio","Cali","Saltar"};
                banco[4] = new String[] {"España","Italia","Honduras","Chile","Saltar"};
                banco[5] = new String[] {"China","EEUU","Rusia","Argentina","Saltar"};
                banco[6] = new String[] {"Tokyo","NY","Hong Kong","Londres","Saltar"};
                banco[7] = new String[] {"1947","1945","1943","1949","Saltar"};
                banco[8] = new String[] {"1592","1497","1492","1657","Saltar"};
                banco[9] = new String[] {"Hitler","Mussolini","Himmler","Goebbels","Saltar"};
                banco[10] = new String[] {"Castellano","Ingles","Frances","Vasco","Saltar"};
                banco[11] = new String[] {"Valentina Tereshkova","Alexandra Tereshkova","Amanda Tereshkova","Vera Alentova","Saltar"};
                banco[12] = new String[] {"Virgilio","Homero","Cervantes","Julio Cortazar","Saltar"};
                banco[13] = new String[] {"La Internacional","La llanera","La solitaria","La Marsellesa","Saltar"};
                banco[14] = new String[] {"Un amante del cine","Un amante de los cómics","Un amante de la música","Un amante de los libros","Saltar"};
                banco[15] = new String[] {"1996","1994","1998","1992","Saltar"};
                banco[16] = new String[] {"Nitrógeno","Carbono","Oxígeno","Adrenocromo","Saltar"};
            
            }
            
        }
        if(valor==4){
            banco[4] = new String[] {"España","Italia"};
            if(valor2==1){
                banco[2] = new String[] {"Indico","Atlantico","Pacifico","Mediterraneo"};
                banco[3] = new String[] {"China","Colombia","India","Rusia"};
                banco[1] = new String[] {"Amazonas","Nilo","Danubio","Cali"};
                banco[5] = new String[] {"China","EEUU","Rusia","Argentina"};
                banco[6] = new String[] {"Tokyo","NY","Hong Kong","Londres"};
                banco[7] = new String[] {"1947","1945","1943","1949"};
                banco[8] = new String[] {"1592","1497","1492","1657"};
                banco[9] = new String[] {"Hitler","Mussolini","Himmler","Goebbels"};
                banco[10] = new String[] {"Castellano","Ingles","Frances","Vasco"};
                banco[11] = new String[] {"Valentina Tereshkova","Alexandra Tereshkova","Amanda Tereshkova","Vera Alentova"};
                banco[12] = new String[] {"Virgilio","Homero","Cervantes","Julio Cortazar"};
                banco[13] = new String[] {"La Internacional","La llanera","La solitaria","La Marsellesa"};
                banco[14] = new String[] {"Un amante del cine","Un amante de los cómics","Un amante de la música","Un amante de los libros"};
                banco[15] = new String[] {"1996","1994","1998","1992"};
                banco[16] = new String[] {"Nitrógeno","Carbono","Oxígeno","Adrenocromo"};
            }else{
                banco[2] = new String[] {"Indico","Atlantico","Pacifico","Mediterraneo","Saltar"};
                banco[3] = new String[] {"China","Colombia","India","Rusia","Saltar"};
                banco[1] = new String[] {"Amazonas","Nilo","Danubio","Cali","Saltar"};
                banco[5] = new String[] {"China","EEUU","Rusia","Argentina","Saltar"};
                banco[6] = new String[] {"Tokyo","NY","Hong Kong","Londres","Saltar"};
                banco[7] = new String[] {"1947","1945","1943","1949","Saltar"};
                banco[8] = new String[] {"1592","1497","1492","1657","Saltar"};
                banco[9] = new String[] {"Hitler","Mussolini","Himmler","Goebbels","Saltar"};
                banco[10] = new String[] {"Castellano","Ingles","Frances","Vasco","Saltar"};
                banco[11] = new String[] {"Valentina Tereshkova","Alexandra Tereshkova","Amanda Tereshkova","Vera Alentova","Saltar"};
                banco[12] = new String[] {"Virgilio","Homero","Cervantes","Julio Cortazar","Saltar"};
                banco[13] = new String[] {"La Internacional","La llanera","La solitaria","La Marsellesa","Saltar"};
                banco[14] = new String[] {"Un amante del cine","Un amante de los cómics","Un amante de la música","Un amante de los libros","Saltar"};
                banco[15] = new String[] {"1996","1994","1998","1992","Saltar"};
                banco[16] = new String[] {"Nitrógeno","Carbono","Oxígeno","Adrenocromo","Saltar"};
            
            }
            
        }
        if(valor==5){
            banco[5] = new String[] {"China","EEUU"};
            if(valor2==1){
                banco[2] = new String[] {"Indico","Atlantico","Pacifico","Mediterraneo"};
                banco[3] = new String[] {"China","Colombia","India","Rusia"};
                banco[4] = new String[] {"España","Italia","Honduras","Chile"};
                banco[1] = new String[] {"Amazonas","Nilo","Danubio","Cali"};
                banco[6] = new String[] {"Tokyo","NY","Hong Kong","Londres"};
                banco[7] = new String[] {"1947","1945","1943","1949"};
                banco[8] = new String[] {"1592","1497","1492","1657"};
                banco[9] = new String[] {"Hitler","Mussolini","Himmler","Goebbels"};
                banco[10] = new String[] {"Castellano","Ingles","Frances","Vasco"};
                banco[11] = new String[] {"Valentina Tereshkova","Alexandra Tereshkova","Amanda Tereshkova","Vera Alentova"};
                banco[12] = new String[] {"Virgilio","Homero","Cervantes","Julio Cortazar"};
                banco[13] = new String[] {"La Internacional","La llanera","La solitaria","La Marsellesa"};
                banco[14] = new String[] {"Un amante del cine","Un amante de los cómics","Un amante de la música","Un amante de los libros"};
                banco[15] = new String[] {"1996","1994","1998","1992"};
                banco[16] = new String[] {"Nitrógeno","Carbono","Oxígeno","Adrenocromo"};
            }else{
                banco[2] = new String[] {"Indico","Atlantico","Pacifico","Mediterraneo","Saltar"};
                banco[3] = new String[] {"China","Colombia","India","Rusia","Saltar"};
                banco[4] = new String[] {"España","Italia","Honduras","Chile","Saltar"};
                banco[1] = new String[] {"Amazonas","Nilo","Danubio","Cali","Saltar"};
                banco[6] = new String[] {"Tokyo","NY","Hong Kong","Londres","Saltar"};
                banco[7] = new String[] {"1947","1945","1943","1949","Saltar"};
                banco[8] = new String[] {"1592","1497","1492","1657","Saltar"};
                banco[9] = new String[] {"Hitler","Mussolini","Himmler","Goebbels","Saltar"};
                banco[10] = new String[] {"Castellano","Ingles","Frances","Vasco","Saltar"};
                banco[11] = new String[] {"Valentina Tereshkova","Alexandra Tereshkova","Amanda Tereshkova","Vera Alentova","Saltar"};
                banco[12] = new String[] {"Virgilio","Homero","Cervantes","Julio Cortazar","Saltar"};
                banco[13] = new String[] {"La Internacional","La llanera","La solitaria","La Marsellesa","Saltar"};
                banco[14] = new String[] {"Un amante del cine","Un amante de los cómics","Un amante de la música","Un amante de los libros","Saltar"};
                banco[15] = new String[] {"1996","1994","1998","1992","Saltar"};
                banco[16] = new String[] {"Nitrógeno","Carbono","Oxígeno","Adrenocromo","Saltar"};
            
            }
            
        }
        if(valor==6){
            banco[6] = new String[] {"Tokyo","NY"};
            if(valor2==1){
                banco[2] = new String[] {"Indico","Atlantico","Pacifico","Mediterraneo"};
                banco[3] = new String[] {"China","Colombia","India","Rusia"};
                banco[4] = new String[] {"España","Italia","Honduras","Chile"};
                banco[5] = new String[] {"China","EEUU","Rusia","Argentina"};
                banco[1] = new String[] {"Amazonas","Nilo","Danubio","Cali"};
                banco[7] = new String[] {"1947","1945","1943","1949"};
                banco[8] = new String[] {"1592","1497","1492","1657"};
                banco[9] = new String[] {"Hitler","Mussolini","Himmler","Goebbels"};
                banco[10] = new String[] {"Castellano","Ingles","Frances","Vasco"};
                banco[11] = new String[] {"Valentina Tereshkova","Alexandra Tereshkova","Amanda Tereshkova","Vera Alentova"};
                banco[12] = new String[] {"Virgilio","Homero","Cervantes","Julio Cortazar"};
                banco[13] = new String[] {"La Internacional","La llanera","La solitaria","La Marsellesa"};
                banco[14] = new String[] {"Un amante del cine","Un amante de los cómics","Un amante de la música","Un amante de los libros"};
                banco[15] = new String[] {"1996","1994","1998","1992"};
                banco[16] = new String[] {"Nitrógeno","Carbono","Oxígeno","Adrenocromo"};
            }else{
                banco[2] = new String[] {"Indico","Atlantico","Pacifico","Mediterraneo","Saltar"};
                banco[3] = new String[] {"China","Colombia","India","Rusia","Saltar"};
                banco[4] = new String[] {"España","Italia","Honduras","Chile","Saltar"};
                banco[5] = new String[] {"China","EEUU","Rusia","Argentina","Saltar"};
                banco[1] = new String[] {"Amazonas","Nilo","Danubio","Cali","Saltar"};
                banco[7] = new String[] {"1947","1945","1943","1949","Saltar"};
                banco[8] = new String[] {"1592","1497","1492","1657","Saltar"};
                banco[9] = new String[] {"Hitler","Mussolini","Himmler","Goebbels","Saltar"};
                banco[10] = new String[] {"Castellano","Ingles","Frances","Vasco","Saltar"};
                banco[11] = new String[] {"Valentina Tereshkova","Alexandra Tereshkova","Amanda Tereshkova","Vera Alentova","Saltar"};
                banco[12] = new String[] {"Virgilio","Homero","Cervantes","Julio Cortazar","Saltar"};
                banco[13] = new String[] {"La Internacional","La llanera","La solitaria","La Marsellesa","Saltar"};
                banco[14] = new String[] {"Un amante del cine","Un amante de los cómics","Un amante de la música","Un amante de los libros","Saltar"};
                banco[15] = new String[] {"1996","1994","1998","1992","Saltar"};
                banco[16] = new String[] {"Nitrógeno","Carbono","Oxígeno","Adrenocromo","Saltar"};
            
            }
            
        }
        if(valor==7){
            banco[7] = new String[] {"1947","1945"};
            if(valor2==1){
                banco[2] = new String[] {"Indico","Atlantico","Pacifico","Mediterraneo"};
                banco[3] = new String[] {"China","Colombia","India","Rusia"};
                banco[4] = new String[] {"España","Italia","Honduras","Chile"};
                banco[5] = new String[] {"China","EEUU","Rusia","Argentina"};
                banco[6] = new String[] {"Tokyo","NY","Hong Kong","Londres"};
                banco[1] = new String[] {"Amazonas","Nilo","Danubio","Cali"};
                banco[8] = new String[] {"1592","1497","1492","1657"};
                banco[9] = new String[] {"Hitler","Mussolini","Himmler","Goebbels"};
                banco[10] = new String[] {"Castellano","Ingles","Frances","Vasco"};
                banco[11] = new String[] {"Valentina Tereshkova","Alexandra Tereshkova","Amanda Tereshkova","Vera Alentova"};
                banco[12] = new String[] {"Virgilio","Homero","Cervantes","Julio Cortazar"};
                banco[13] = new String[] {"La Internacional","La llanera","La solitaria","La Marsellesa"};
                banco[14] = new String[] {"Un amante del cine","Un amante de los cómics","Un amante de la música","Un amante de los libros"};
                banco[15] = new String[] {"1996","1994","1998","1992"};
                banco[16] = new String[] {"Nitrógeno","Carbono","Oxígeno","Adrenocromo"};
            }else{
                banco[2] = new String[] {"Indico","Atlantico","Pacifico","Mediterraneo","Saltar"};
                banco[3] = new String[] {"China","Colombia","India","Rusia","Saltar"};
                banco[4] = new String[] {"España","Italia","Honduras","Chile","Saltar"};
                banco[5] = new String[] {"China","EEUU","Rusia","Argentina","Saltar"};
                banco[6] = new String[] {"Tokyo","NY","Hong Kong","Londres","Saltar"};
                banco[1] = new String[] {"Amazonas","Nilo","Danubio","Cali","Saltar"};
                banco[8] = new String[] {"1592","1497","1492","1657","Saltar"};
                banco[9] = new String[] {"Hitler","Mussolini","Himmler","Goebbels","Saltar"};
                banco[10] = new String[] {"Castellano","Ingles","Frances","Vasco","Saltar"};
                banco[11] = new String[] {"Valentina Tereshkova","Alexandra Tereshkova","Amanda Tereshkova","Vera Alentova","Saltar"};
                banco[12] = new String[] {"Virgilio","Homero","Cervantes","Julio Cortazar","Saltar"};
                banco[13] = new String[] {"La Internacional","La llanera","La solitaria","La Marsellesa","Saltar"};
                banco[14] = new String[] {"Un amante del cine","Un amante de los cómics","Un amante de la música","Un amante de los libros","Saltar"};
                banco[15] = new String[] {"1996","1994","1998","1992","Saltar"};
                banco[16] = new String[] {"Nitrógeno","Carbono","Oxígeno","Adrenocromo","Saltar"};
            
            }
            
        }
        if(valor==8){
            banco[8] = new String[] {"1592","1497"};
            if(valor2==1){
                banco[2] = new String[] {"Indico","Atlantico","Pacifico","Mediterraneo"};
                banco[3] = new String[] {"China","Colombia","India","Rusia"};
                banco[4] = new String[] {"España","Italia","Honduras","Chile"};
                banco[5] = new String[] {"China","EEUU","Rusia","Argentina"};
                banco[6] = new String[] {"Tokyo","NY","Hong Kong","Londres"};
                banco[7] = new String[] {"1947","1945","1943","1949"};
                banco[1] = new String[] {"Amazonas","Nilo","Danubio","Cali"};
                banco[9] = new String[] {"Hitler","Mussolini","Himmler","Goebbels"};
                banco[10] = new String[] {"Castellano","Ingles","Frances","Vasco"};
                banco[11] = new String[] {"Valentina Tereshkova","Alexandra Tereshkova","Amanda Tereshkova","Vera Alentova"};
                banco[12] = new String[] {"Virgilio","Homero","Cervantes","Julio Cortazar"};
                banco[13] = new String[] {"La Internacional","La llanera","La solitaria","La Marsellesa"};
                banco[14] = new String[] {"Un amante del cine","Un amante de los cómics","Un amante de la música","Un amante de los libros"};
                banco[15] = new String[] {"1996","1994","1998","1992"};
                banco[16] = new String[] {"Nitrógeno","Carbono","Oxígeno","Adrenocromo"};
            }else{
                banco[2] = new String[] {"Indico","Atlantico","Pacifico","Mediterraneo","Saltar"};
                banco[3] = new String[] {"China","Colombia","India","Rusia","Saltar"};
                banco[4] = new String[] {"España","Italia","Honduras","Chile","Saltar"};
                banco[5] = new String[] {"China","EEUU","Rusia","Argentina","Saltar"};
                banco[6] = new String[] {"Tokyo","NY","Hong Kong","Londres","Saltar"};
                banco[7] = new String[] {"1947","1945","1943","1949","Saltar"};
                banco[1] = new String[] {"Amazonas","Nilo","Danubio","Cali","Saltar"};
                banco[9] = new String[] {"Hitler","Mussolini","Himmler","Goebbels","Saltar"};
                banco[10] = new String[] {"Castellano","Ingles","Frances","Vasco","Saltar"};
                banco[11] = new String[] {"Valentina Tereshkova","Alexandra Tereshkova","Amanda Tereshkova","Vera Alentova","Saltar"};
                banco[12] = new String[] {"Virgilio","Homero","Cervantes","Julio Cortazar","Saltar"};
                banco[13] = new String[] {"La Internacional","La llanera","La solitaria","La Marsellesa","Saltar"};
                banco[14] = new String[] {"Un amante del cine","Un amante de los cómics","Un amante de la música","Un amante de los libros","Saltar"};
                banco[15] = new String[] {"1996","1994","1998","1992","Saltar"};
                banco[16] = new String[] {"Nitrógeno","Carbono","Oxígeno","Adrenocromo","Saltar"};
            
            }
            
        }
        if(valor==9){
            banco[9] = new String[] {"Hitler","Mussolini"};
            if(valor2==1){
                banco[2] = new String[] {"Indico","Atlantico","Pacifico","Mediterraneo"};
                banco[3] = new String[] {"China","Colombia","India","Rusia"};
                banco[4] = new String[] {"España","Italia","Honduras","Chile"};
                banco[5] = new String[] {"China","EEUU","Rusia","Argentina"};
                banco[6] = new String[] {"Tokyo","NY","Hong Kong","Londres"};
                banco[7] = new String[] {"1947","1945","1943","1949"};
                banco[8] = new String[] {"1592","1497","1492","1657"};
                banco[1] = new String[] {"Amazonas","Nilo","Danubio","Cali"};
                banco[10] = new String[] {"Castellano","Ingles","Frances","Vasco"};
                banco[11] = new String[] {"Valentina Tereshkova","Alexandra Tereshkova","Amanda Tereshkova","Vera Alentova"};
                banco[12] = new String[] {"Virgilio","Homero","Cervantes","Julio Cortazar"};
                banco[13] = new String[] {"La Internacional","La llanera","La solitaria","La Marsellesa"};
                banco[14] = new String[] {"Un amante del cine","Un amante de los cómics","Un amante de la música","Un amante de los libros"};
                banco[15] = new String[] {"1996","1994","1998","1992"};
                banco[16] = new String[] {"Nitrógeno","Carbono","Oxígeno","Adrenocromo"};
            }else{
                banco[2] = new String[] {"Indico","Atlantico","Pacifico","Mediterraneo","Saltar"};
                banco[3] = new String[] {"China","Colombia","India","Rusia","Saltar"};
                banco[4] = new String[] {"España","Italia","Honduras","Chile","Saltar"};
                banco[5] = new String[] {"China","EEUU","Rusia","Argentina","Saltar"};
                banco[6] = new String[] {"Tokyo","NY","Hong Kong","Londres","Saltar"};
                banco[7] = new String[] {"1947","1945","1943","1949","Saltar"};
                banco[8] = new String[] {"1592","1497","1492","1657","Saltar"};
                banco[1] = new String[] {"Amazonas","Nilo","Danubio","Cali","Saltar"};
                banco[10] = new String[] {"Castellano","Ingles","Frances","Vasco","Saltar"};
                banco[11] = new String[] {"Valentina Tereshkova","Alexandra Tereshkova","Amanda Tereshkova","Vera Alentova","Saltar"};
                banco[12] = new String[] {"Virgilio","Homero","Cervantes","Julio Cortazar","Saltar"};
                banco[13] = new String[] {"La Internacional","La llanera","La solitaria","La Marsellesa","Saltar"};
                banco[14] = new String[] {"Un amante del cine","Un amante de los cómics","Un amante de la música","Un amante de los libros","Saltar"};
                banco[15] = new String[] {"1996","1994","1998","1992","Saltar"};
                banco[16] = new String[] {"Nitrógeno","Carbono","Oxígeno","Adrenocromo","Saltar"};
            
            }
            
        }
        if(valor==10){
            banco[10] = new String[] {"Castellano","Ingles"};
            if(valor2==1){
                banco[2] = new String[] {"Indico","Atlantico","Pacifico","Mediterraneo"};
                banco[3] = new String[] {"China","Colombia","India","Rusia"};
                banco[4] = new String[] {"España","Italia","Honduras","Chile"};
                banco[5] = new String[] {"China","EEUU","Rusia","Argentina"};
                banco[6] = new String[] {"Tokyo","NY","Hong Kong","Londres"};
                banco[7] = new String[] {"1947","1945","1943","1949"};
                banco[8] = new String[] {"1592","1497","1492","1657"};
                banco[9] = new String[] {"Hitler","Mussolini","Himmler","Goebbels"};
                banco[1] = new String[] {"Amazonas","Nilo","Danubio","Cali"};
                banco[11] = new String[] {"Valentina Tereshkova","Alexandra Tereshkova","Amanda Tereshkova","Vera Alentova"};
                banco[12] = new String[] {"Virgilio","Homero","Cervantes","Julio Cortazar"};
                banco[13] = new String[] {"La Internacional","La llanera","La solitaria","La Marsellesa"};
                banco[14] = new String[] {"Un amante del cine","Un amante de los cómics","Un amante de la música","Un amante de los libros"};
                banco[15] = new String[] {"1996","1994","1998","1992"};
                banco[16] = new String[] {"Nitrógeno","Carbono","Oxígeno","Adrenocromo"};
            }else{
                banco[2] = new String[] {"Indico","Atlantico","Pacifico","Mediterraneo","Saltar"};
                banco[3] = new String[] {"China","Colombia","India","Rusia","Saltar"};
                banco[4] = new String[] {"España","Italia","Honduras","Chile","Saltar"};
                banco[5] = new String[] {"China","EEUU","Rusia","Argentina","Saltar"};
                banco[6] = new String[] {"Tokyo","NY","Hong Kong","Londres","Saltar"};
                banco[7] = new String[] {"1947","1945","1943","1949","Saltar"};
                banco[8] = new String[] {"1592","1497","1492","1657","Saltar"};
                banco[9] = new String[] {"Hitler","Mussolini","Himmler","Goebbels","Saltar"};
                banco[1] = new String[] {"Amazonas","Nilo","Danubio","Cali","Saltar"};
                banco[11] = new String[] {"Valentina Tereshkova","Alexandra Tereshkova","Amanda Tereshkova","Vera Alentova","Saltar"};
                banco[12] = new String[] {"Virgilio","Homero","Cervantes","Julio Cortazar","Saltar"};
                banco[13] = new String[] {"La Internacional","La llanera","La solitaria","La Marsellesa","Saltar"};
                banco[14] = new String[] {"Un amante del cine","Un amante de los cómics","Un amante de la música","Un amante de los libros","Saltar"};
                banco[15] = new String[] {"1996","1994","1998","1992","Saltar"};
                banco[16] = new String[] {"Nitrógeno","Carbono","Oxígeno","Adrenocromo","Saltar"};
            
            }
            
        }
        if(valor==11){
            banco[11] = new String[] {"Valentina Tereshkova","Alexandra Tereshkova"};
            if(valor2==1){
                banco[2] = new String[] {"Indico","Atlantico","Pacifico","Mediterraneo"};
                banco[3] = new String[] {"China","Colombia","India","Rusia"};
                banco[4] = new String[] {"España","Italia","Honduras","Chile"};
                banco[5] = new String[] {"China","EEUU","Rusia","Argentina"};
                banco[6] = new String[] {"Tokyo","NY","Hong Kong","Londres"};
                banco[7] = new String[] {"1947","1945","1943","1949"};
                banco[8] = new String[] {"1592","1497","1492","1657"};
                banco[9] = new String[] {"Hitler","Mussolini","Himmler","Goebbels"};
                banco[10] = new String[] {"Castellano","Ingles","Frances","Vasco"};
                banco[1] = new String[] {"Amazonas","Nilo","Danubio","Cali"};
                banco[12] = new String[] {"Virgilio","Homero","Cervantes","Julio Cortazar"};
                banco[13] = new String[] {"La Internacional","La llanera","La solitaria","La Marsellesa"};
                banco[14] = new String[] {"Un amante del cine","Un amante de los cómics","Un amante de la música","Un amante de los libros"};
                banco[15] = new String[] {"1996","1994","1998","1992"};
                banco[16] = new String[] {"Nitrógeno","Carbono","Oxígeno","Adrenocromo"};
            }else{
                banco[2] = new String[] {"Indico","Atlantico","Pacifico","Mediterraneo","Saltar"};
                banco[3] = new String[] {"China","Colombia","India","Rusia","Saltar"};
                banco[4] = new String[] {"España","Italia","Honduras","Chile","Saltar"};
                banco[5] = new String[] {"China","EEUU","Rusia","Argentina","Saltar"};
                banco[6] = new String[] {"Tokyo","NY","Hong Kong","Londres","Saltar"};
                banco[7] = new String[] {"1947","1945","1943","1949","Saltar"};
                banco[8] = new String[] {"1592","1497","1492","1657","Saltar"};
                banco[9] = new String[] {"Hitler","Mussolini","Himmler","Goebbels","Saltar"};
                banco[10] = new String[] {"Castellano","Ingles","Frances","Vasco","Saltar"};
                banco[1] = new String[] {"Amazonas","Nilo","Danubio","Cali","Saltar"};
                banco[12] = new String[] {"Virgilio","Homero","Cervantes","Julio Cortazar","Saltar"};
                banco[13] = new String[] {"La Internacional","La llanera","La solitaria","La Marsellesa","Saltar"};
                banco[14] = new String[] {"Un amante del cine","Un amante de los cómics","Un amante de la música","Un amante de los libros","Saltar"};
                banco[15] = new String[] {"1996","1994","1998","1992","Saltar"};
                banco[16] = new String[] {"Nitrógeno","Carbono","Oxígeno","Adrenocromo","Saltar"};
            
            }
            
        }
        if(valor==12){
            banco[12] = new String[] {"Virgilio","Homero"};
            if(valor2==1){
                banco[2] = new String[] {"Indico","Atlantico","Pacifico","Mediterraneo"};
                banco[3] = new String[] {"China","Colombia","India","Rusia"};
                banco[4] = new String[] {"España","Italia","Honduras","Chile"};
                banco[5] = new String[] {"China","EEUU","Rusia","Argentina"};
                banco[6] = new String[] {"Tokyo","NY","Hong Kong","Londres"};
                banco[7] = new String[] {"1947","1945","1943","1949"};
                banco[8] = new String[] {"1592","1497","1492","1657"};
                banco[9] = new String[] {"Hitler","Mussolini","Himmler","Goebbels"};
                banco[10] = new String[] {"Castellano","Ingles","Frances","Vasco"};
                banco[11] = new String[] {"Valentina Tereshkova","Alexandra Tereshkova","Amanda Tereshkova","Vera Alentova"};
                banco[1] = new String[] {"Amazonas","Nilo","Danubio","Cali"};
                banco[13] = new String[] {"La Internacional","La llanera","La solitaria","La Marsellesa"};
                banco[14] = new String[] {"Un amante del cine","Un amante de los cómics","Un amante de la música","Un amante de los libros"};
                banco[15] = new String[] {"1996","1994","1998","1992"};
                banco[16] = new String[] {"Nitrógeno","Carbono","Oxígeno","Adrenocromo"};
            }else{
                banco[2] = new String[] {"Indico","Atlantico","Pacifico","Mediterraneo","Saltar"};
                banco[3] = new String[] {"China","Colombia","India","Rusia","Saltar"};
                banco[4] = new String[] {"España","Italia","Honduras","Chile","Saltar"};
                banco[5] = new String[] {"China","EEUU","Rusia","Argentina","Saltar"};
                banco[6] = new String[] {"Tokyo","NY","Hong Kong","Londres","Saltar"};
                banco[7] = new String[] {"1947","1945","1943","1949","Saltar"};
                banco[8] = new String[] {"1592","1497","1492","1657","Saltar"};
                banco[9] = new String[] {"Hitler","Mussolini","Himmler","Goebbels","Saltar"};
                banco[10] = new String[] {"Castellano","Ingles","Frances","Vasco","Saltar"};
                banco[11] = new String[] {"Valentina Tereshkova","Alexandra Tereshkova","Amanda Tereshkova","Vera Alentova","Saltar"};
                banco[1] = new String[] {"Amazonas","Nilo","Danubio","Cali","Saltar"};
                banco[13] = new String[] {"La Internacional","La llanera","La solitaria","La Marsellesa","Saltar"};
                banco[14] = new String[] {"Un amante del cine","Un amante de los cómics","Un amante de la música","Un amante de los libros","Saltar"};
                banco[15] = new String[] {"1996","1994","1998","1992","Saltar"};
                banco[16] = new String[] {"Nitrógeno","Carbono","Oxígeno","Adrenocromo","Saltar"};
            
            }
            
        }
        if(valor==13){
            banco[13] = new String[] {"La Internacional","La llanera"};
            if(valor2==1){
                banco[2] = new String[] {"Indico","Atlantico","Pacifico","Mediterraneo"};
                banco[3] = new String[] {"China","Colombia","India","Rusia"};
                banco[4] = new String[] {"España","Italia","Honduras","Chile"};
                banco[5] = new String[] {"China","EEUU","Rusia","Argentina"};
                banco[6] = new String[] {"Tokyo","NY","Hong Kong","Londres"};
                banco[7] = new String[] {"1947","1945","1943","1949"};
                banco[8] = new String[] {"1592","1497","1492","1657"};
                banco[9] = new String[] {"Hitler","Mussolini","Himmler","Goebbels"};
                banco[10] = new String[] {"Castellano","Ingles","Frances","Vasco"};
                banco[11] = new String[] {"Valentina Tereshkova","Alexandra Tereshkova","Amanda Tereshkova","Vera Alentova"};
                banco[12] = new String[] {"Virgilio","Homero","Cervantes","Julio Cortazar"};
                banco[1] = new String[] {"Amazonas","Nilo","Danubio","Cali"};
                banco[14] = new String[] {"Un amante del cine","Un amante de los cómics","Un amante de la música","Un amante de los libros"};
                banco[15] = new String[] {"1996","1994","1998","1992"};
                banco[16] = new String[] {"Nitrógeno","Carbono","Oxígeno","Adrenocromo"};
            }else{
                banco[2] = new String[] {"Indico","Atlantico","Pacifico","Mediterraneo","Saltar"};
                banco[3] = new String[] {"China","Colombia","India","Rusia","Saltar"};
                banco[4] = new String[] {"España","Italia","Honduras","Chile","Saltar"};
                banco[5] = new String[] {"China","EEUU","Rusia","Argentina","Saltar"};
                banco[6] = new String[] {"Tokyo","NY","Hong Kong","Londres","Saltar"};
                banco[7] = new String[] {"1947","1945","1943","1949","Saltar"};
                banco[8] = new String[] {"1592","1497","1492","1657","Saltar"};
                banco[9] = new String[] {"Hitler","Mussolini","Himmler","Goebbels","Saltar"};
                banco[10] = new String[] {"Castellano","Ingles","Frances","Vasco","Saltar"};
                banco[11] = new String[] {"Valentina Tereshkova","Alexandra Tereshkova","Amanda Tereshkova","Vera Alentova","Saltar"};
                banco[12] = new String[] {"Virgilio","Homero","Cervantes","Julio Cortazar","Saltar"};
                banco[1] = new String[] {"Amazonas","Nilo","Danubio","Cali","Saltar"};
                banco[14] = new String[] {"Un amante del cine","Un amante de los cómics","Un amante de la música","Un amante de los libros","Saltar"};
                banco[15] = new String[] {"1996","1994","1998","1992","Saltar"};
                banco[16] = new String[] {"Nitrógeno","Carbono","Oxígeno","Adrenocromo","Saltar"};
            
            }
            
        }
        if(valor==14){
            banco[14] = new String[] {"Un amante del cine","Un amante de los cómics"};
            if(valor2==1){
                banco[2] = new String[] {"Indico","Atlantico","Pacifico","Mediterraneo"};
                banco[3] = new String[] {"China","Colombia","India","Rusia"};
                banco[4] = new String[] {"España","Italia","Honduras","Chile"};
                banco[5] = new String[] {"China","EEUU","Rusia","Argentina"};
                banco[6] = new String[] {"Tokyo","NY","Hong Kong","Londres"};
                banco[7] = new String[] {"1947","1945","1943","1949"};
                banco[8] = new String[] {"1592","1497","1492","1657"};
                banco[9] = new String[] {"Hitler","Mussolini","Himmler","Goebbels"};
                banco[10] = new String[] {"Castellano","Ingles","Frances","Vasco"};
                banco[11] = new String[] {"Valentina Tereshkova","Alexandra Tereshkova","Amanda Tereshkova","Vera Alentova"};
                banco[12] = new String[] {"Virgilio","Homero","Cervantes","Julio Cortazar"};
                banco[13] = new String[] {"La Internacional","La llanera","La solitaria","La Marsellesa"};
                banco[1] = new String[] {"Amazonas","Nilo","Danubio","Cali"};
                banco[15] = new String[] {"1996","1994","1998","1992"};
                banco[16] = new String[] {"Nitrógeno","Carbono","Oxígeno","Adrenocromo"};
            }else{
                banco[2] = new String[] {"Indico","Atlantico","Pacifico","Mediterraneo","Saltar"};
                banco[3] = new String[] {"China","Colombia","India","Rusia","Saltar"};
                banco[4] = new String[] {"España","Italia","Honduras","Chile","Saltar"};
                banco[5] = new String[] {"China","EEUU","Rusia","Argentina","Saltar"};
                banco[6] = new String[] {"Tokyo","NY","Hong Kong","Londres","Saltar"};
                banco[7] = new String[] {"1947","1945","1943","1949","Saltar"};
                banco[8] = new String[] {"1592","1497","1492","1657","Saltar"};
                banco[9] = new String[] {"Hitler","Mussolini","Himmler","Goebbels","Saltar"};
                banco[10] = new String[] {"Castellano","Ingles","Frances","Vasco","Saltar"};
                banco[11] = new String[] {"Valentina Tereshkova","Alexandra Tereshkova","Amanda Tereshkova","Vera Alentova","Saltar"};
                banco[12] = new String[] {"Virgilio","Homero","Cervantes","Julio Cortazar","Saltar"};
                banco[13] = new String[] {"La Internacional","La llanera","La solitaria","La Marsellesa","Saltar"};
                banco[1] = new String[] {"Amazonas","Nilo","Danubio","Cali","Saltar"};
                banco[15] = new String[] {"1996","1994","1998","1992","Saltar"};
                banco[16] = new String[] {"Nitrógeno","Carbono","Oxígeno","Adrenocromo","Saltar"};
            
            }
            
        }
        if(valor==15){
            banco[15] = new String[] {"1996","1994"};
            if(valor2==1){
                banco[2] = new String[] {"Indico","Atlantico","Pacifico","Mediterraneo"};
                banco[3] = new String[] {"China","Colombia","India","Rusia"};
                banco[4] = new String[] {"España","Italia","Honduras","Chile"};
                banco[5] = new String[] {"China","EEUU","Rusia","Argentina"};
                banco[6] = new String[] {"Tokyo","NY","Hong Kong","Londres"};
                banco[7] = new String[] {"1947","1945","1943","1949"};
                banco[8] = new String[] {"1592","1497","1492","1657"};
                banco[9] = new String[] {"Hitler","Mussolini","Himmler","Goebbels"};
                banco[10] = new String[] {"Castellano","Ingles","Frances","Vasco"};
                banco[11] = new String[] {"Valentina Tereshkova","Alexandra Tereshkova","Amanda Tereshkova","Vera Alentova"};
                banco[12] = new String[] {"Virgilio","Homero","Cervantes","Julio Cortazar"};
                banco[13] = new String[] {"La Internacional","La llanera","La solitaria","La Marsellesa"};
                banco[14] = new String[] {"Un amante del cine","Un amante de los cómics","Un amante de la música","Un amante de los libros"};
                banco[1] = new String[] {"Amazonas","Nilo","Danubio","Cali"};
                banco[16] = new String[] {"Nitrógeno","Carbono","Oxígeno","Adrenocromo"};
            }else{
                banco[2] = new String[] {"Indico","Atlantico","Pacifico","Mediterraneo","Saltar"};
                banco[3] = new String[] {"China","Colombia","India","Rusia","Saltar"};
                banco[4] = new String[] {"España","Italia","Honduras","Chile","Saltar"};
                banco[5] = new String[] {"China","EEUU","Rusia","Argentina","Saltar"};
                banco[6] = new String[] {"Tokyo","NY","Hong Kong","Londres","Saltar"};
                banco[7] = new String[] {"1947","1945","1943","1949","Saltar"};
                banco[8] = new String[] {"1592","1497","1492","1657","Saltar"};
                banco[9] = new String[] {"Hitler","Mussolini","Himmler","Goebbels","Saltar"};
                banco[10] = new String[] {"Castellano","Ingles","Frances","Vasco","Saltar"};
                banco[11] = new String[] {"Valentina Tereshkova","Alexandra Tereshkova","Amanda Tereshkova","Vera Alentova","Saltar"};
                banco[12] = new String[] {"Virgilio","Homero","Cervantes","Julio Cortazar","Saltar"};
                banco[13] = new String[] {"La Internacional","La llanera","La solitaria","La Marsellesa","Saltar"};
                banco[14] = new String[] {"Un amante del cine","Un amante de los cómics","Un amante de la música","Un amante de los libros","Saltar"};
                banco[1] = new String[] {"Amazonas","Nilo","Danubio","Cali","Saltar"};
                banco[16] = new String[] {"Nitrógeno","Carbono","Oxígeno","Adrenocromo","Saltar"};
            
            }
            
        }
        if(valor==16){
            banco[16] = new String[] {"Nitrógeno","Carbono"};
            if(valor2==1){
                banco[2] = new String[] {"Indico","Atlantico","Pacifico","Mediterraneo"};
                banco[3] = new String[] {"China","Colombia","India","Rusia"};
                banco[4] = new String[] {"España","Italia","Honduras","Chile"};
                banco[5] = new String[] {"China","EEUU","Rusia","Argentina"};
                banco[6] = new String[] {"Tokyo","NY","Hong Kong","Londres"};
                banco[7] = new String[] {"1947","1945","1943","1949"};
                banco[8] = new String[] {"1592","1497","1492","1657"};
                banco[9] = new String[] {"Hitler","Mussolini","Himmler","Goebbels"};
                banco[10] = new String[] {"Castellano","Ingles","Frances","Vasco"};
                banco[11] = new String[] {"Valentina Tereshkova","Alexandra Tereshkova","Amanda Tereshkova","Vera Alentova"};
                banco[12] = new String[] {"Virgilio","Homero","Cervantes","Julio Cortazar"};
                banco[13] = new String[] {"La Internacional","La llanera","La solitaria","La Marsellesa"};
                banco[14] = new String[] {"Un amante del cine","Un amante de los cómics","Un amante de la música","Un amante de los libros"};
                banco[15] = new String[] {"1996","1994","1998","1992"};
                banco[1] = new String[] {"Amazonas","Nilo","Danubio","Cali"};
            }else{
                banco[2] = new String[] {"Indico","Atlantico","Pacifico","Mediterraneo","Saltar"};
                banco[3] = new String[] {"China","Colombia","India","Rusia","Saltar"};
                banco[4] = new String[] {"España","Italia","Honduras","Chile","Saltar"};
                banco[5] = new String[] {"China","EEUU","Rusia","Argentina","Saltar"};
                banco[6] = new String[] {"Tokyo","NY","Hong Kong","Londres","Saltar"};
                banco[7] = new String[] {"1947","1945","1943","1949","Saltar"};
                banco[8] = new String[] {"1592","1497","1492","1657","Saltar"};
                banco[9] = new String[] {"Hitler","Mussolini","Himmler","Goebbels","Saltar"};
                banco[10] = new String[] {"Castellano","Ingles","Frances","Vasco","Saltar"};
                banco[11] = new String[] {"Valentina Tereshkova","Alexandra Tereshkova","Amanda Tereshkova","Vera Alentova","Saltar"};
                banco[12] = new String[] {"Virgilio","Homero","Cervantes","Julio Cortazar","Saltar"};
                banco[13] = new String[] {"La Internacional","La llanera","La solitaria","La Marsellesa","Saltar"};
                banco[14] = new String[] {"Un amante del cine","Un amante de los cómics","Un amante de la música","Un amante de los libros","Saltar"};
                banco[15] = new String[] {"1996","1994","1998","1992","Saltar"};
                banco[1] = new String[] {"Amazonas","Nilo","Danubio","Cali","Saltar"};
            
            }
            
        }
        
        
        
    
    }
    
    public void formatearOpciones2(){
        banco[1] = new String[]{"Amazonas","Nilo","Danubio","Cali"};
        banco[2] = new String[]{"Indico","Atlantico","Pacifico","Mediterraneo"};
        banco[3] = new String[]{"China","Colombia","India","Rusia"};
        banco[4] = new String[]{"España","Italia","Honduras","Chile"};
        banco[5] = new String[]{"China","EEUU","Rusia","Argentina"};
        banco[6] = new String[]{"Tokyo","NY","Hong Kong","Londres"};
        banco[7] = new String[]{"1947","1945","1943","1949"};
        banco[8] = new String[]{"1592","1497","1492","1657"};
        banco[9] = new String[]{"Hitler","Mussolini","Himmler","Goebbels"};
        banco[10] = new String[]{"Castellano","Ingles","Frances","Vasco"};
        banco[11] = new String[]{"Valentina Tereshkova","Alexandra Tereshkova","Amanda Tereshkova","Vera Alentova"};
        banco[12] = new String[]{"Virgilio","Homero","Cervantes","Julio Cortazar"};
        banco[13] = new String[]{"La Internacional","La llanera","La solitaria","La Marsellesa"};
        banco[14] = new String[]{"Un amante del cine","Un amante de los cómics","Un amante de la música","Un amante de los libros"};
        banco[15] = new String[]{"1996","1994","1998","1992"};
        banco[16] = new String[]{"Nitrógeno","Carbono","Oxígeno","Adrenocromo"};
    }
    
    public void formatearOpciones3(){
        banco[1] = new String[]{"Amazonas","Nilo","Danubio","Cali","50/50"};
        banco[2] = new String[]{"Indico","Atlantico","Pacifico","Mediterraneo","50/50"};
        banco[3] = new String[]{"China","Colombia","India","Rusia","50/50"};
        banco[4] = new String[]{"España","Italia","Honduras","Chile","50/50"};
        banco[5] = new String[]{"China","EEUU","Rusia","Argentina","50/50"};
        banco[6] = new String[]{"Tokyo","NY","Hong Kong","Londres","50/50"};
        banco[7] = new String[]{"1947","1945","1943","1949","50/50"};
        banco[8] = new String[]{"1592","1497","1492","1657","50/50"};
        banco[9] = new String[]{"Hitler","Mussolini","Himmler","Goebbels","50/50"};
        banco[10] = new String[]{"Castellano","Ingles","Frances","Vasco","50/50"};
        banco[11] = new String[]{"Valentina Tereshkova","Alexandra Tereshkova","Amanda Tereshkova","Vera Alentova","50/50"};
        banco[12] = new String[]{"Virgilio","Homero","Cervantes","Julio Cortazar","50/50"};
        banco[13] = new String[]{"La Internacional","La llanera","La solitaria","La Marsellesa","50/50"};
        banco[14] = new String[]{"Un amante del cine","Un amante de los cómics","Un amante de la música","Un amante de los libros","50/50"};
        banco[15] = new String[]{"1996","1994","1998","1992","50/50"};
        banco[16] = new String[]{"Nitrógeno","Carbono","Oxígeno","Adrenocromo","50/50"};
    }
    
    public void comprobar(int x){
        
        if(resp[x]==resp_correctas[x]){
            puntaje+=100;
        }else{
            if(resp[x]!=4&&resp[x]!=5){
                JOptionPane.showMessageDialog(null,"Error :( el puntaje acumulado es: "+puntaje);
            }
        
        }
        if(puntaje==1500){
            JOptionPane.showMessageDialog(null,"Fin del juego. Ha ganado! :) Puntaje: "+puntaje);
        }//else{
            //JOptionPane.showMessageDialog(null,"Ha perdido con un puntaje de: "+puntaje);
        //}
        
    }
    
    public int validar5050(int valor){//antes de pregunta 5050
        int b=0;
        if(resp_correctas[valor]!=0&&resp_correctas[valor]!=1){
            if(valor+1==1){
                banco[1] = new String[]{"Amazonas","Nilo"};
                b++;
            }
            if(valor+1==2){
                banco[2] = new String[]{"Indico","Pacifico"};
                b++;
            }
            if(valor+1==3){
                banco[3] = new String[]{"Rusia","India"};
                b++;
            }
            if(valor+1==4){
                banco[4] = new String[]{"Italia","Honduras"};
                b++;
            }
            if(valor+1==5){
                banco[5] = new String[]{"China","Rusia"};
                b++;
            }
            if(valor+1==6){
                banco[6] = new String[]{"Tokio","NY"};
                b++;
            }
            if(valor+1==7){
                banco[7] = new String[]{"1945","1947"};
                b++;
            }
            if(valor+1==8){
                banco[8] = new String[]{"1492","1592"};
                b++;
            }
            if(valor+1==9){
                banco[9] = new String[]{"Mussolini","Hitler"};
                b++;
            }
            if(valor+1==10){
                banco[10] = new String[]{"Vasco","Castellano"};
                b++;
            }
            if(valor+1==11){
                banco[11] = new String[]{"Vera Alentova","Valentina Tereshkova"};
                b++;
            }
            if(valor+1==12){
                banco[12] = new String[]{"Homero","Virgilio"};
                b++;
            }
            if(valor+1==13){
                banco[13] = new String[]{"La Internacional","La Marsellesa"};
                b++;
            }
            if(valor+1==14){
                banco[14] = new String[]{"Un amante de la música","Un amante del cine"};
                b++;
            }
            if(valor+1==15){
                banco[15] = new String[]{"1994","1996"};
                b++;
            }
            if(valor+1==16){
                banco[16] = new String[]{"Nitrógeno","Oxígeno"};
                b++;
            }
            
        }
        return b;
    
    }
    
    public void validar5050_2(int valor){//despues de pregunta 5050, si b retorno 1, manda aqui para respuesta correcta
        if(valor+1==1){
            if(resp[valor]==0){
                resp[valor]=resp_correctas[valor];
            }
            
        }
        if(valor+1==2){
            if(resp[valor]==1){
                resp[valor]=resp_correctas[valor];
            }
            
        }
        if(valor+1==3){
            if(resp[valor]==0){
                resp[valor]=resp_correctas[valor];
            }
            
        }
        if(valor+1==4){
            if(resp[valor]==0){
                resp[valor]=resp_correctas[valor];
            }
            
        }
        if(valor+1==5){
            if(resp[valor]==0){
                resp[valor]=resp_correctas[valor];
            }
            
        }
        if(valor+1==6){
            if(resp[valor]==1){
                resp[valor]=resp_correctas[valor];
            }
            
        }
        if(valor+1==7){
            if(resp[valor]==0){
                resp[valor]=resp_correctas[valor];
            }
            
        }
        if(valor+1==8){
            if(resp[valor]==0){
                resp[valor]=resp_correctas[valor];
            }
            
        }
        if(valor+1==9){
            if(resp[valor]==1){
                resp[valor]=resp_correctas[valor];
            }
            
        }
        if(valor+1==10){
            if(resp[valor]==0){
                resp[valor]=resp_correctas[valor];
            }
            
        }
        if(valor+1==11){
            if(resp[valor]==1){
                resp[valor]=resp_correctas[valor];
            }
            
        }
        if(valor+1==12){
            if(resp[valor]==0){
                resp[valor]=resp_correctas[valor];
            }
            
        }
        if(valor+1==13){
            if(resp[valor]==1){
                resp[valor]=resp_correctas[valor];
            }
            
        }
        if(valor+1==14){
            if(resp[valor]==0){
                resp[valor]=resp_correctas[valor];
            }
            
        }
        if(valor+1==15){
            if(resp[valor]==0){
                resp[valor]=resp_correctas[valor];
            }
            
        }
        if(valor+1==16){
            if(resp[valor]==1){
                resp[valor]=resp_correctas[valor];
            }
            
        }
        
    }
    
    public void iniciarJuego(){
        generarAleatorios();
        int conteo=0;
        int l=0;
        int cont=0;
        int a =0;
        
        for(int j=0;j<=14;j++){
            for(int i=0;i<=14;i++){
                if(nums_aleatorios[j]==i+1){
                    for(int x=0;x<=14;x++){
                        if(i==x){
                            conteo++;
                            resp[x] = JOptionPane.showOptionDialog(null,banco[0][x],"Pregunta "+conteo,0,JOptionPane.QUESTION_MESSAGE,null,banco[x+1],null);
                            comprobar(x);
                            if(resp[x]==4){
                                if(cont==0){
                                    formatearOpciones(x+1,a);
                                    int b=validar5050(x);
                                    resp[x] = JOptionPane.showOptionDialog(null,banco[0][x],"Pregunta "+conteo,0,JOptionPane.QUESTION_MESSAGE,null,banco[x+1],null);
                                    if(b==1){
                                        validar5050_2(x);
                                    }
                                    comprobar(x);
                                    cont++;
                                }else{//sp
                                    //logica
                                    formatearOpciones2();
                                }
                            }
                            if(resp[x]==5){
                                //formateo borrar f
                                formatearOpciones3();
                                a++;
                            }
                        }
                    }
                
                }
                
            }
            if(nums_aleatorios[j]==16){
                    conteo++;
                    resp[15] = JOptionPane.showOptionDialog(null,banco[0][15],"Pregunta "+conteo,0,JOptionPane.QUESTION_MESSAGE,null,banco[16],null);
                    comprobar(15);
                    if(resp[15]==4){
                                if(cont==0){
                                    formatearOpciones(16,a);
                                    resp[15] = JOptionPane.showOptionDialog(null,banco[0][15],"Pregunta "+conteo,0,JOptionPane.QUESTION_MESSAGE,null,banco[16],null);
                                    comprobar(15);
                                    cont++;
                                }else{//sp
                                    //logica
                                    formatearOpciones2();
                                }
                            }
                    if(resp[15]==5){
                                //formateo borrar f
                                formatearOpciones3();
                                a++;
                            }
                }
        }
        
        
        for(int i=0;i<=15;i++){
            if(resp[i]==4||resp[i]==5){
                resp[nums_aleatorios[15]-1] = JOptionPane.showOptionDialog(null,banco[0][nums_aleatorios[15]-1],"Pregunta revancha",0,JOptionPane.QUESTION_MESSAGE,null,banco[nums_aleatorios[15]],null);
                comprobar(nums_aleatorios[15]-1);
                l++;
            }
        }
        
        //System.out.println("Puntaje: "+puntaje);
        //System.out.println("Arreglo resp:");
        //for(int i=0;i<=15;i++){
            //System.out.println(resp[i]);
        //}
        
        imprimirResultadosOver(l);
    
    }
    
    public void imprimirResultadosOver(int v){//si v=0 no se mostro pregunta revancha.
        String mensaje="";
        if(puntaje!=1500){
            JOptionPane.showMessageDialog(null,"Fin del juego. Perdiste :( para la próxima será. Puntaje: "+puntaje);
            if(v==1){
            for(int i=0;i<=15;i++){
                if(resp[nums_aleatorios[i]-1]==resp_correctas[nums_aleatorios[i]-1]){
                    mensaje+="Pregunta "+(i+1)+": Bien."+"/";
                }else{
                    mensaje+="Pregunta "+(i+1)+": Mal."+"/";
                }
            }
        }else{
            for(int i=0;i<=14;i++){
                if(resp[nums_aleatorios[i]-1]==resp_correctas[nums_aleatorios[i]-1]){
                    mensaje+="Pregunta "+(i+1)+": Bien."+"/";
                }else{
                    mensaje+="Pregunta "+(i+1)+": Mal."+"/";
                }
            }
        }
        }else{//puntaje=1500
            if(v==1){
            for(int i=0;i<=15;i++){
                if(resp[nums_aleatorios[i]-1]==resp_correctas[nums_aleatorios[i]-1]){
                    mensaje+="Pregunta "+(i+1)+": Bien."+"/";
                }else{
                    mensaje+="Pregunta "+(i+1)+": Saltada."+"/";
                }
            }
        }else{
            for(int i=0;i<=14;i++){
                if(resp[nums_aleatorios[i]-1]==resp_correctas[nums_aleatorios[i]-1]){
                    mensaje+="Pregunta "+(i+1)+": Bien."+"/";
                }else{
                    mensaje+="Pregunta "+(i+1)+": Mal."+"/";
                }
            }
        }
        }
        
        
        
        
        JOptionPane.showMessageDialog(null,mensaje);
        
        
    }
    
    public void generarAleatorios(){
        Random dado = new Random();
        int num_al;
        int [] arreglo = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};//quiero que aqui queden al final 10 numeros aleatorios no repetidos, del 1 al 10
        
        
        for(int i=0;i<=15;i++){
            if(i==0){
                num_al = 0;
            }else{
                num_al = dado.nextInt(16)+1;
            }
            
            
            
            while(num_al==arreglo[0]||num_al==arreglo[1]||num_al==arreglo[2]||num_al==arreglo[3]||num_al==arreglo[4]||num_al==arreglo[5]||num_al==arreglo[6]||num_al==arreglo[7]||num_al==arreglo[8]||num_al==arreglo[9]||num_al==arreglo[10]||num_al==arreglo[11]||num_al==arreglo[12]||num_al==arreglo[13]||num_al==arreglo[14]||num_al==arreglo[15]){
                num_al = dado.nextInt(16)+1;
            }
            
            arreglo[i] = num_al;
            
        }
        
        
        //System.out.println("Nums aleatorios:");
        //for(int i=0;i<=15;i++){
            //System.out.println(arreglo[i]);
        //}
        
        nums_aleatorios = arreglo;
    
    }
    
    
}



