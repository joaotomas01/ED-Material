import java.util.*;

public class BinaryTree<T extends Comparable<T>> {
    private Node<T> root = null;
    private Comparator<T> comparator;

    public BinaryTree() {
        comparator = new Comparator<T>() {
            @Override
            public int compare(T t1, T t2) {
                return t1.compareTo(t2);
            }
        };
    }

    public BinaryTree(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    //método público
    public void insere(T data) {
        Node<T> n = new Node<>(data);
        root = insere(root, n);
    }

    //método privado recursivo
    private Node<T> insere(Node<T> root, Node<T> newNode) {
        // novo nó passa a ser raiz da árvore
        if (root == null)
            return newNode;
        int cmp = comparator.compare(newNode.get(), root.get());
        if (cmp == 0)
            throw new RuntimeException(); //valor duplicado
        if (cmp > 0)
            root.setRight(insere(root.getRight(), newNode));
        else
            root.setLeft(insere(root.getLeft(), newNode));

        return root;
    }

    public boolean contem(T data) {
        return contem(root, data);
    }

    private boolean contem(Node<T> root, T data) {
        if (root == null)
            return false;
        int cmp = comparator.compare(data, root.get());
        if (cmp == 0)
            return true;
        if (cmp < 0)
            return contem(root.getLeft(), data);

        return contem(root.getRight(), data);
    }

    public int profundidadeDe(T data) {
        return profundidadeDe(root, data);
    }

    private int profundidadeDe(Node<T> n, T data) {
        int d, r;
        if (n==null)
            return 0;
        r = data.compareTo(n.get());
        if (r==0)
            return 1;
        if (r<0) {
            d = profundidadeDe(n.getLeft(), data);
            if (d > 0)
                return d + 1;
        }
        d = profundidadeDe(n.getRight(), data);
        if (d > 0)
            return d + 1;
        return 0;
    }

    public void imprimeOrdem() {
        imprimeOrdem(root.getLeft());
        System.out.println("\t" + root.get());
        imprimeOrdem(root.getRight());
    }

    private void imprimeOrdem(Node<T> root) {
        if (root == null)
            return;
        imprimeOrdem(root.getLeft());
        System.out.println("\t" + root.get());
        imprimeOrdem(root.getRight());
    }

    private void ordemList(Node<T> root, List<T> list) {
        if (root == null)
            return;
        ordemList(root.getLeft(), list);
        list.add(root.get());
        ordemList(root.getRight(), list);
    }

    public int profundidade() {
        return profundidade(root);
    }

    private int profundidade(Node<T> n) {
        if (n==null)
            return 0;
        int dl = profundidade(n.getLeft());
        int dr = profundidade(n.getRight());
        return dl>dr ? dl+1 : dr+1;
    }

    public int tamanho() {
        return tamanho(root);
    }

    private int tamanho (Node<T> n) {
        if (n == null)
            return 0;
        return 1 + tamanho(n.getLeft()) + tamanho(n.getRight());
    }


    public void imprimeNiveis() {
        LinkedList<Node<T>> list = new LinkedList<>();
        list.add(root); // acrescenta nodo à lista - a partir de agora terminamos quando a lista estiver vazia

        System.out.println("====CONTEUDO DA ARVORE====");

        while (!list.isEmpty()) {
            Node<T> n = list.remove(0);
            System.out.print(n.get() + " "); // mostra valor

            // acrescenta descendentes à lista
            if (n.getLeft()!=null)
                list.add(n.getLeft());
            if (n.getRight()!=null)
                list.add(n.getRight());
        }
        System.out.println();
    }

    public void imprimeNivel(Node<T> t, List<T> list, int nivel) {
        T item;
        System.out.println("----Nivel " + nivel + "----");
        ListIterator<T> li = list.listIterator();
        while (li.hasNext()) {
            item = (T)li.next();
            if (profundidadeDe(root, item) == nivel)
                System.out.println("["+nivel+"] " + item);
        }
    }

    public void imprimePorNiveis() {
        int nivel = profundidade(root);
        List<T> list = new ArrayList<>();
        ordemList(root, list);
        System.out.println("====CONTEUDO DA ARVORE====");
        for (int i = 1; i < nivel; i++) {
            imprimeNivel(root, list, i);
        }
        System.out.println("==========================");
    }

    public Node<T> minElement(Node<T> root) {
        if (root.getLeft() == null)
            return root;
        return minElement(root.getLeft());
    }

    public Node<T> maxElement(Node<T> root) {
        if (root.getRight() == null)
            return root;
        return minElement(root.getRight());
    }

    public void remove(T value) {
        root = remove(root, value);
    }

    private Node<T> remove(Node<T> root, T value) {
        if (root == null)
            return null;

        int cmp = comparator.compare(value, root.get());
        if (cmp < 0) {
            root.setLeft(remove(root.getLeft(), value));
            return root;
        } else if (cmp > 0) {
            root.setRight(remove(root.getRight(), value));
            return root;
        }

        // cmp == 0
        if (root.getLeft() == null && root.getRight() == null)
            return null; // nao tem filhos


        // pelo menos um dos filhos nao é null
        if (root.getLeft() == null)
            return root.getRight(); //só tem o filho direito
        if (root.getRight() == null)
            return root.getLeft(); //só tem o filho esquerdo

        System.out.println("Tem dois filhos");  // se chegarmos aqui tem dois filhos
        Node <T> min = minElement(root.getRight()); // encontrar o minimo na subarvore direita para substituir pai
        root.set(min.get());
        root.setRight(remove(root.getRight(), min.get()));
        return root;
    }
}
