/// RA:10443768 Guilherme Sampaio Silva 
import java.util.HashMap;
import java.util.Map;

public abstract class Campanha {
protected String id;
protected String nome;
protected String descricao;
protected double orcamento; 
protected Map<String, Integer> metricas;

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

public abstract void avaliarCampanha();
public abstract void configurar();
public abstract void executar();
}
