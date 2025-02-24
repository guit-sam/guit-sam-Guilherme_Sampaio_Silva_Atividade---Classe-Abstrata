/// RA:10443768 Guilherme Sampaio Silva  
 class CampanhaEmail extends Campanha{
    public CampanhaEmail(String id, String nome,String descricao, double orcamento){
        super(id, nome, descricao, orcamento);
        


    }
    @Override
    public void configurar(){
        System.out.println("🔧 Configurando Campanha do email:" + nome);
        System.out.println();
    }
    
    public void executar(){
        System.out.println(" 🚀 Executando campanha do email:" + nome);
        System.out.println();
    }
    
    
        @Override
        public void avaliarCampanha(){
            System.out.println("📊Campanha");
            System.out.println("Nome: " + nome);
            System.out.println("Métricas: " + metricas);
            System.out.println();
        }
}
