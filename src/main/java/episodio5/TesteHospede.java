package episodio5;

import java.util.ArrayList;
import java.util.Date;

public class TesteHospede {
    public static void main(String[] args) {
        Hospede rodrigo = new Hospede();
        rodrigo.setNome("Rodrigo");
        rodrigo.setSobrenome("Martins Pagliares");

        // exibindo o estado do objeto
        System.out.println("Nome...: " + rodrigo.getNome());
        System.out.println("Sobrenome..: " + rodrigo.getSobrenome());

        Hospede mariana = new Hospede();
        mariana.setNome("Mariana");
        mariana.setSobrenome("Pereira");

        // exibindo o estado do objeto
        System.out.println("Nome...: " + mariana.getNome());
        System.out.println("Sobrenome..: " + mariana.getSobrenome());

        Date data = new Date();
        ArrayList lista = new ArrayList();


    }
}
