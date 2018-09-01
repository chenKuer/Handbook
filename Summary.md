
# Binary Tree
## DFS
##### TreeNode structure
```java
// TreeNode Structure
public class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int x) { val = x; }
}
```
#### 1.Recursively DFS
> 序指的是访问root的顺序
- Preorder Traverse (先序遍历)（ root First -> left children -> right children ）
- Inorder Traverse (中序遍历)ß
- Postorder Traverse （后序遍历）

```java
// 三种遍历方式
public class Traverse {
  public void traverseTest(TreeNode root, ArrayList ans){
    if( root == null ) { return;}

    // preorder traversal
    ans.add(root.val);
    traverseTest(root.left, ans);

    // inorder traversal
    ans.add(root.val);
    traverseTest(root.right, ans);

    // postorder traversal
    ans.add(root.val, ans);
  }

 // Test
  public static void main(String[] args) {
    Traverse t = new Traverse();
    ArrayList ans = new ArrayList();
    t.traverseTest(root, ans);
  }

}
```



### Stack
