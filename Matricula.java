import java.util.Scanner;

public class Matricula{
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o seu registro de aluno:");
        int registro_aluno = scanner.nextInt();
        
        System.out.println("\nInsira o seu CEP:");
        int cep = scanner.nextInt(); // *
        
        scanner.nextLine();
        
        System.out.println("\nInsira o seu CPF:");
        String cpf = scanner.nextLine(); // *
        
        System.out.println("\nInsira o seu nome completo:");
        String nome_aluno = scanner.nextLine();
        
        System.out.println("\nInsira o seu numero de telefone:");
        String telefone = scanner.nextLine();
        
        System.out.println("\nInsira o seu email:");
        String email = scanner.nextLine();
         
        System.out.println("\nVoce esta cursando:");
        String curso = scanner.nextLine(); // * 
        
        System.out.println("\nInsira o seu endereco:");
        String endereco = scanner.nextLine(); // * 
        
        System.out.println("\nInsira seu genero:");
        char sexo = scanner.nextLine().charAt(0); 
        
        
        Aluno aluno1 = new Aluno(
                registro_aluno, 
                cep, 
                cpf, 
                nome_aluno, 
                telefone, 
                email, 
                curso, 
                endereco, 
                sexo
        );
        
        if(aluno1.validacaoEmail(email) == true){
            System.out.println("\nO email inserido e valido!\n");
        }
        else{
            System.out.println("\nO email inserido e invalido!\n");
        }
        
        aluno1.campoNaoNulo(registro_aluno, cep, cpf, nome_aluno, telefone, email, curso, endereco, sexo);
        
        aluno1.mostrarInfos(registro_aluno, cep, cpf, nome_aluno, telefone, email, curso, endereco, sexo);
    }
    
}