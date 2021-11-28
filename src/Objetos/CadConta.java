package Objetos;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class CadConta {    
    private Scanner entrada;
    
    private ArrayList<Conta> listaContas = new ArrayList<>();

    public CadConta(){}

    public boolean Cadastrar(Conta novaConta){
        for (int i=0; i<listaContas.size(); i++){
            if (novaConta.getNumeroConta() == listaContas.get(i).getNumeroConta()){
                return false;
            }
        }
        this.listaContas.add(novaConta);
        return true;
    }
    
    public void Salvar(String diretorio) throws IOException {
        try{            
            File myFile = new File(diretorio);
            FileWriter filew = new FileWriter(diretorio, false);
            BufferedWriter buffw = new BufferedWriter(filew);
            
            if (!myFile.exists()){
                myFile.createNewFile();
            }else{
                try{
                myFile.delete();
                } catch(Error e){
                  throw new Error(e);
                }                
            }
            
            try{
                this.entrada = new Scanner(new File(diretorio));
            }
            catch (FileNotFoundException e){
                throw new FileNotFoundException("Arquivo não encontrado ao Analisar Conteudo");
            } 
            for (int i=0; i<this.listaContas.size(); i++){
                buffw.write(listaContas.get(i).toString());
                buffw.newLine();
            }
            filew.flush();
            buffw.flush();
            filew.close();
            buffw.close();
        }catch(Error e){
            throw new Error(e);
        }
    }

    public ArrayList<Conta> LerArquivo(String diretorio) throws FileNotFoundException, ArrayIndexOutOfBoundsException, NumberFormatException{
        try{
            try{
                File myFile = new File(diretorio);
                if (!myFile.exists()){
                    myFile.createNewFile();
                }
            }catch(IOException e){
                throw new Error(e);
            }
            this.entrada = new Scanner(new File(diretorio));
        }
        catch (FileNotFoundException e){
            System.out.println(diretorio);
            throw new FileNotFoundException("Arquivo não encontrado ao LerArquivo()");
        }        
        
        ArrayList<Conta> registros = new ArrayList<>();
        //As informações lidas serão armazenadas nessa ArrayList.
        String linha;
        String[] vetorLinha = null;
        while(this.entrada.hasNext()){
            linha = this.entrada.nextLine();
            try{
                vetorLinha = linha.split(";");  //Divide as informações usando o ; como parâmetro
                registros.add(new Conta(Integer.parseInt(vetorLinha[0]), vetorLinha[1], Double.parseDouble(vetorLinha[2])));
            }
            catch(ArrayIndexOutOfBoundsException erro){
                throw new ArrayIndexOutOfBoundsException("REGISTRO TEM " +vetorLinha.length+ " INFORMAÇÕES.");                
            }catch(NumberFormatException erro){
                throw new NumberFormatException("ALGUM LONG FOI ZOADO AÍ");
            }
        }
        return registros;
    }
    
    public ArrayList getArrayList(){
        return this.listaContas;
    }
    public void setArrayList(ArrayList<Conta> listaNova){
        this.listaContas = listaNova;
    }
}