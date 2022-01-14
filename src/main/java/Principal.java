import controller.*;
import model.*;
import net.sf.jasperreports.engine.JRException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) throws JRException {

        LocalDateTime localDateTime = LocalDateTime.now();

//        AtendenteController ac = new AtendenteController();
//        Atendente a1 = new Atendente();
//        a1.setNome("Luiz Felipe 2");
//        a1.setRg("76443244");
//        a1.setCpf("12345678");
//        a1.setEmail("felipe@gmail.com");
//        a1.setTelefone("(12)988868883");
//        a1.setCep("1245000");
//        a1.setEndereco("Pinhalzinho");
//        a1.setDataDeNascimento("12/02/2021");
//        a1.setSalario(2000);
//        a1.setUltimoPagamento(localDateTime);
//
//        ac.adiciona(a1);


        //AtendenteController ac = new AtendenteController();
        //ac.buscaNome("Allan");
        //ac.buscaCPF("3247623544");
        //ac.buscaID(3);
        //ac.mostrarTodos();
        
//        AtendenteController ac = new AtendenteController();
//        ac.mostrarTodos();

        AdministradorController administradorController = new AdministradorController();
        Administrador administrador = new Administrador();
        administrador.setNome("Admin");
        administrador.setLogin("Admin");
        administrador.setSenha("Admin");
        administradorController.adiciona(administrador);

        /*CaixaController cc = new CaixaController();
        Caixa caixa = new Caixa();
        caixa.setSaldo((float) 200.414);
        cc.adiciona(caixa);*/

        /*entityManager.getTransaction().begin();
        entityManager.persist(a1);
        entityManager.getTransaction().commit();
        entityManager.close();*/

        //------------------------------------------------------------------------

        /*Categoria categoria = new Categoria();
        categoria.setNome("Consoles");
        CategoriaController categoriaController = new CategoriaController();
        categoriaController.adiciona(categoria);

        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome("Sony");
        fornecedor.setCnpj("46572148");
        fornecedor.setTelefone("1298645632");
        fornecedor.setEndereco("Rua Marquês de Olinda");
        FornecedorController fornecedorController = new FornecedorController();
        fornecedorController.adiciona(fornecedor);

        Insumo insumo = new Insumo();
        insumo.setNome("PS4");
        insumo.setPreco(2000);
        insumo.setCategoria(categoria);
        insumo.setFornecedor(fornecedor);
        insumo.setDescrição("Console da Sony");
        insumo.setSolicitacoes(0);
        insumo.setQuantidadeTotal(20);
        insumo.setQuantidadeMinima(2);
        InsumoController insumoController = new InsumoController();
        insumoController.adiciona(insumo);*/

        //-----------------------------------------------------------

        /*Categoria categoria = new Categoria();
        categoria.setNome("teste");

        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome("Fernando");
        fornecedor.setCnpj("7824762");
        fornecedor.setTelefone("1298466235");
        fornecedor.setEndereco("Rua Fulano De Tal");
        Insumo insumo = new Insumo();
        insumo.setNome("Teste");
        insumo.setPreco(78.79);
        insumo.setQuantidadeMinima(1);
        insumo.setQuantidadeTotal(4);
        insumo.setDescrição("Ambiente de teste");
        insumo.setCategoria(categoria);
        insumo.setFornecedor(fornecedor);

        InsumoController insumoController = new InsumoController();
        //insumoController.buscar(2);

        insumoController.adiciona(insumo);*/

        //---------------------------------------------------------------

        /*AtendenteController atendenteController = new AtendenteController();
        ClienteController clienteController = new ClienteController();
        String atendente = atendenteController.buscaId(1).getNome();

        Veiculo veiculo = new Veiculo();
        veiculo.setNome("Polo");
        veiculo.setAno(2009);
        veiculo.setCor("Cinza");
        veiculo.setMarca("Woksvagen");
        veiculo.setPlaca("gts-6274");
        veiculo.setTipo("Ratch");
        veiculo.setObservacoes("Veiculo precisando arrunar a porta");
        VeiculoController veiculoController = new VeiculoController();
        veiculoController.adiciona(veiculo);

        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();
        listaVeiculos.add(veiculo);
        Cliente cliente = new Cliente();
        cliente.setNome("Henrique");
        cliente.setCep("12450000");
        cliente.setCpf("47234674");
        cliente.setEndereco("Santana");
        cliente.setTelefone("129723663");
        cliente.setDataCadastro(localDateTime);
        cliente.setDataDeNascimento(localDateTime);
        cliente.setEmail("henrique@hotmail.com");
        cliente.setNumeroDaCasa(12);
        cliente.setRg("83457264572");
        cliente.setNomeAtendente(atendente);
        cliente.setVeiculo(listaVeiculos);
        clienteController.adiciona(cliente);*/

        /*ClienteController clienteController = new ClienteController();
        clienteController.mostrarTodos();*/


        /*Colaborador colaborador = new Colaborador();
        colaborador.setNome("Primeiro Colaborador");
        colaborador.setCpf("348648757");
        colaborador.setRg("6787632745");
        colaborador.setCep("12450000");
        colaborador.setEndereco("Rua dos colaboradores");
        colaborador.setEmail("colaborador@gmail.com");
        colaborador.setTelefone("1298643546");
        colaborador.setDataDeNascimento(localDateTime);
        colaborador.setDataDeEntrada(localDateTime);
        colaborador.setTempoServico(localDateTime);
        colaborador.setSalario(1000);
        ColaboradorController colaboradorController = new ColaboradorController();
        colaboradorController.adiciona((Colaborador) colaborador);*/

        //---------------------------------------------------------------------------

        /*CaixaController caixaController = new CaixaController();
        caixaController.atualizaCaixa(40);*/

        //-----------------------------------------------------------------------------

        /*Credor credor = new Credor();
        credor.setNome("Fulano Credor");
        credor.setCnpj("7283645");
        credor.setTelefone("12973254634");
        credor.setEmail("credor@gmail.com");
        credor.setDescricao("Divida de teste");

        CredorController credorController = new CredorController();
        credorController.adiciona(credor);

        ContasPagar contasPagar = new ContasPagar();
        contasPagar.setCnpj("472736452");
        contasPagar.setDataVencimento(localDateTime);
        contasPagar.setFormaPagamento("Cartão");
        contasPagar.setQuantidadeParcelas(12);
        contasPagar.setEmAtraso(false);
        contasPagar.setMensalidade((float) 59.99);
        contasPagar.setValor(1000);
        contasPagar.setSituacaoPago(false);
        contasPagar.setCredor(credor);

        ContasPagarController contasPagarController = new ContasPagarController();
        contasPagarController.adiciona(contasPagar);*/

        //------------------------------------------------------------------------

        /*ColaboradorController colaboradorController = new ColaboradorController();
        Colaborador colaborador = colaboradorController.buscarId(1);*/

        /*ColaboradorController colaboradorController = new ColaboradorController();
        Colaborador colaborador = colaboradorController.buscarId(2);
        System.out.println(colaborador);*/


        /*Adiantamento adiantamento = new Adiantamento();
        adiantamento.setColaborador(colaborador);
        adiantamento.setValor(200);
        adiantamento.setData(localDateTime);
        AdiantamentoController adiantamentoController = new AdiantamentoController();
        adiantamentoController.adiciona(adiantamento);*/

        //-------------------------------------------------------------------------------

//        TesteRelatorio testeRelatorio = new TesteRelatorio();
//        testeRelatorio.gerar();

    }

}
