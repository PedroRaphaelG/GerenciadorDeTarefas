abstract class Tarefa implements InterfaceTarefa {
    protected String descricao;
    protected boolean concluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public void marcarComoConcluida() {
        this.concluida = true;
    }

    public String BuscarDescricao() {
        return descricao;
    }

    public boolean EstaConcluida() {
        return concluida;
    }

    public abstract void exibirTarefa();
}
