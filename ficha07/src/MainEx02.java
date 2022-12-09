import java.util.Comparator;

public class MainEx02 {
    public static void main(String[] args) {
        BinaryTree<String> binaryTree = new BinaryTree<>();
        binaryTree.insere("D");
        binaryTree.insere("B");
        binaryTree.insere("A");
        binaryTree.insere("E");
        binaryTree.insere("C");
        binaryTree.insere("F");
        binaryTree.insere("H");
        binaryTree.insere("G");
        binaryTree.imprimeNiveis();

        BinaryTree<String> binaryTree1 = new BinaryTree<>((o1, o2) -> o1.length() - o2.length());
        binaryTree1.insere("abcd");
        binaryTree1.insere("abc");
        binaryTree1.insere("abcde");
        binaryTree1.insere("ab");
        binaryTree1.insere("abcdeg");
        binaryTree1.insere("a");
        //binaryTree1.imprimeNiveis();
        binaryTree1.imprimePorNiveis();
        binaryTree1.remove("abcde");
        binaryTree1.imprimePorNiveis();
    }
}
