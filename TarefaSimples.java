class TarefaSimples extends Tarefa {
    public TarefaSimples(String descricao) {
        super(descricao);
    }

    @Override
    public void exibirTarefa() {
        System.out.println("[ " + (concluida ? "X" : " ") + " ] " + descricao);
    }
}
