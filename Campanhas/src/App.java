/// RA:10443768 Guilherme Sampaio Silva 
public class App {
    public static void main(String[] args) {
       CampanhaRede campanhaSocial = new CampanhaRede("321321314512","Twitter","O Twitter é uma rede social que permite aos utilizadores partilhar mensagens curtas, chamadas tweets, com uma audiência global."
       ,40000000.00  );
    
    campanhaSocial.configurar();
    campanhaSocial.executar();
    campanhaSocial.atualizarMetrica("Likes:", 36172);
    campanhaSocial.atualizarMetrica("Compartilhamentos:", 1200);
    campanhaSocial.avaliarCampanha();
    
    CampanhaEmail campanhaEmail = new CampanhaEmail("48109248120","g.ssampai@yahoo.com","Email de Serviço",7000.00  );

     
       campanhaEmail.configurar();
       campanhaEmail.executar();
       campanhaEmail.atualizarMetrica("Taxa de abertura:", 24);
       campanhaEmail.atualizarMetrica("Taxa de cliques", 10);
       campanhaEmail.avaliarCampanha();
       
    
    }


    


   
}
