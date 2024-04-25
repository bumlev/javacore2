package Trie;

public class Main {

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("ate");
        trie.insert("ants");
        trie.insert("cat");
        trie.insert("car");
        trie.insert("cart");
        trie.insert("cartoon");
        trie.insert("co");
        trie.insert("con");

        // Search for some words
        System.out.println(trie.search("cat")); // true
        System.out.println(trie.search("cartoon")); // true
        System.out.println(trie.search("carpet")); // false
    }
}
