import java.util.*;

// Trie
public class Solution{
class Trie {
    int count  =  0; // 前缀出现的次数
    boolean exist = false; //
    HashMap<Character, Trie> children = new HashMap<Character, Trie>();
}

// main
public static void main(String[]  args) {
    Trie tries = new Trie();
    String str[] = {"abc",  "abd","b","abcd"};

    for(int i = 0;i<str.length;i++){
        insertNode(str[i]);
    }
}

// Trie insert

public static boolean insertNode(String str, Trie head){
    if(str==null ||str.length()==0) return false;
    char chs[] =str.toCharArray();
    int i=0;
    Trie cur = head;
    while(i<str.length()){
        if(!cur.children.containsKey(chs[i]){
//如果当前节点中的子树节点中不包含当前字符，新建一个子节点。
            cur.children.put(chs[i],new Trie());

        }
        cur = cur.children.get(chs[i]);
        if(cur.exist){
            return true;
        // 前缀树中是否有字符串为当前字符串的前缀
        }
        i++;
    }
    cur.exist = true;
    if(cur.chlidren.size()>0){
        return true;
        //判断当前字符串是否是前缀树中的某个字符的前缀
    }
    return false;
}
}
