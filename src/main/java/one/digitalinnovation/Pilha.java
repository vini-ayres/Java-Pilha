package one.digitalinnovation;

public class Pilha {
    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(No novoNo) {
        // Armazena a referência atual do topo da pilha
        No refAuxiliar = refNoEntradaPilha;

        // Atualiza a referência do topo da pilha para o novo nó
        refNoEntradaPilha = novoNo;

        // Define a referência do novo nó para o nó anterior (anterior topo)
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No pop() {
        // Verifica se a pilha não está vazia
        if (!this.isEmpty()) {
            // Armazena o nó que está no topo da pilha (a ser removido)
            No noPoped = refNoEntradaPilha;

            // Atualiza a referência do topo da pilha para o próximo nó na pilha
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();

            // Retorna o nó que foi removido (anterior topo)
            return noPoped;
        }

        // Se a pilha estiver vazia, retorna null
        return null;
    }

    public No top() {
        return refNoEntradaPilha;
    }

    public boolean isEmpty() {
        return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "-------------\n";
        stringRetorno += "    Pilha\n";
        stringRetorno += "-------------\n";
        No noAuxiliar = refNoEntradaPilha;
        while (true) {
            if (noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            } else{
                break;
            }
        }
        stringRetorno += "=============\n";
        return stringRetorno;
    }
}
