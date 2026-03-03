import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aluno {
    private int registro_aluno;
    private int cep; // *
    private String cpf; // *
    private String nome_aluno; 
    private String telefone;
    private String email;
    private String curso; // * 
    private String endereco; // * 
    private char sexo; // *
    
    public int getRegistro(){
        return registro_aluno;
    }
    public void setRegistro(int registro_aluno){
        this.registro_aluno = registro_aluno;
    }
    public int getCep(){
        return cep;
    }
    public void setCep(int cep){
        this.cep = cep;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getNome(){
        return nome_aluno;
    }
    public void setNome(String nome_aluno){
        this.nome_aluno = nome_aluno;
    }
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getCurso(){
        return curso;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public char getSexo(){
        return sexo;
    }
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    
    // Método construtor
    public Aluno(int registro_aluno, int cep, String cpf, String nome_aluno, String telefone, String email, String curso, String endereco, char sexo){
        super();
        this.registro_aluno = registro_aluno;
        this.cep = cep;
        this.cpf = cpf;
        this.nome_aluno = nome_aluno;
        this.telefone = telefone;
        this.email = email;
        this.curso = curso;
        this.endereco = endereco;
        this.sexo = sexo;
    }
    
    private final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    private final Pattern PATTERN = Pattern.compile(EMAIL_REGEX);
    
    public boolean validacaoEmail(String email){
        if(this.email == null) return false;
        Matcher matcher = PATTERN.matcher(this.email);
        return matcher.matches();
    }
    
    public boolean campoNaoNulo(int registro_aluno, int cep, String cpf, String nome_aluno, String telefone, String email, String curso, String endereco, char sexo){
        int[] numerosCadastro = {this.registro_aluno, this.cep};
        String[] nomenclaturasNumeros = {"Registro do aluno", "CEP"};
        
        String[] stringsCadastro = {this.cpf, this.nome_aluno, this.telefone, this.email, this.curso, this.endereco};
        String[] nomenclaturasStrings = {"CPF", "Nome do aluno", "Telefone", "Email", "Curso", "Endereco"};
        
        for(int i = 0; i < numerosCadastro.length; i++){
            if(numerosCadastro[i] <= 0){
                System.out.println("Voce obrigatoriamente precisa inserir o seguinte numero: " + nomenclaturasNumeros[i]);
                return false;
            }
        }
        
        for(int i = 0; i < stringsCadastro.length; i++){
            if(stringsCadastro[i].isEmpty() == true){
                System.out.println("Voce obrigatoriamente precisa inserir a seguinte informacao: " + nomenclaturasStrings[i]);
                return false;
            }
        }
        System.out.println("Todos as informacoes foram inseridas corretamente!");
        return true;
    }
    
    public void mostrarInfos(int registro_aluno, int cep, String cpf, String nome_aluno, String telefone, String email, String curso, String endereco, char sexo){
        System.out.println("\nNome do aluno: " + this.nome_aluno + "\nRegistro do aluno: " + this.registro_aluno + "\nCPF: " + this.cpf + "\nCursando: " + this.curso + "\nTelefone: " + this.telefone + "\nEmail: " + this.email + "\nCEP: " + this.cep + "\nEndereco: " + this.endereco + "\nSexo: " + this.sexo);
    }
}
