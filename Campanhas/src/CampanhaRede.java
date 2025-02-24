 class CampanhaRede extends Campanha {
   private String plataforma;
    public CampanhaRede(String id, String nome,String descricao, double orcamento, String plataforma){
        super(id, nome, descricao, orcamento, plataforma);
        this.plataforma = plataforma;


    }


    @Override
    public void exibirCampanha(){
        System.out.println("Campanha");
    }
}
