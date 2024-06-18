package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List <Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List <Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa tarefa : tarefaList){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
            tarefasParaRemover.add(tarefa);
            }

        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricaoTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 3");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());


        listaTarefa.obterDescricaoTarefas();

    }
}

