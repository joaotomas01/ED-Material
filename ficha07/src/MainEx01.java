public class MainEx01 {
    public static void main(String[] args) {
        BinaryTree<Double> binaryTree = new BinaryTree<>();
        binaryTree.insere(3.5);
        binaryTree.insere(2.0);
        binaryTree.insere(3.0);
        binaryTree.insere(4.0);
        binaryTree.insere(5.0);

        System.out.println("Contem: " + binaryTree.contem(3.0));
        System.out.println("Profundidade: " + binaryTree.profundidadeDe(4.0));
        System.out.println("Ordem:");
        binaryTree.imprimeOrdem();
        System.out.println("Profundidade: " + binaryTree.profundidade());
        System.out.println("Tamanho: " + binaryTree.tamanho());
        binaryTree.imprimeNiveis();
    }
}