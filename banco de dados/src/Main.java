import db.SQLite;
import entities.Pessoa;

public class Main {

    public static void main(String[] args){
        try{
            SQLite dbcon = new SQLite();

            System.out.println("Inserindo pessoa na tabela");
            dbcon.insertPessoa(new Pessoa("Rodrigo", "Della Justina", 39, "38464968768"));
            dbcon.insertPessoa(new Pessoa("Matheus", "Assis Viera", 19, "5743876684648"));
            dbcon.insertPessoa(new Pessoa("Diogo", "Borges Kompier", 24, "31688348744893"));
            dbcon.insertPessoa(new Pessoa("Tiago", "Delfino da Silva", 34, "4548464968768"));
            dbcon.insertPessoa(new Pessoa("Marcello", "Di Silvestro", 34, "0632716846389"));

            for (Pessoa people : dbcon.getAllPessoa()){
                System.out.println(people.getNome() + " | " + people.getSobreNome() + " | " + people.getIdade());
            }

            System.out.println("");
            System.out.println("");
            System.out.println("Atualizando Tiago..");

            Pessoa pessoAtualiza = new Pessoa("Tiago", "da Silva", 25, "4548464968768");
            dbcon.updatePessoa(pessoAtualiza);

            for (Pessoa people : dbcon.getAllPessoa()){
                System.out.println(people.getNome() + " | " + people.getSobreNome() + " | " + people.getIdade());
            }

            System.out.println("");
            System.out.println("");
            System.out.println("Eliminando Marcello..");

            Pessoa pessoaDelete = new Pessoa("", "", 35, "0632716846389");
            dbcon.eliminarPessoa(pessoaDelete);

            for (Pessoa people : dbcon.getAllPessoa()){
                System.out.println(people.getNome() + " | " + people.getSobreNome() + " | " + people.getIdade());
            }


        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
