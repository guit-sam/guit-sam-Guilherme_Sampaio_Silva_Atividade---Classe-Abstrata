import java.util.HashMap;
import java.util.Map;

public abstract class Campanha {
public String id;
public String nome;
public String descricao;
public double orcamento; 
private Map<String, Integer> metricas;

public Campanha(String id, String nome, String descricao, double orcamento){
    this.id = id;
    this.nome = nome;
    this.descricao = descricao;
    this.orcamento = orcamento;
    this.metricas = new HashMap<>();
}

public void atualizarMetrica(String nomeMetrica, int valor) {
    metricas.put(nomeMetrica, valor);
}

public abstract void exibirCampanha();
}
