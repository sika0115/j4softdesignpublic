package tree;

public class MyBinTree {
  private MyBinTreeNode root;
  public MyBinTree() {
    root = null;

  }
  public MyBinTreeNode getRoot() {
    return root;
  }
  public boolean isEmpty() {
    return root == null ;
  }
  public boolean setRoot(MyBinTreeNode r){
    if(isEmpty()) {
      root =r;
      return true;
    } else {
      return false;
    }
  }
 }

private MyBinTreeNode dfs(Object value, int type, MyBinTreeNode node) {
    if(type == 0) {
      System.out.println(node.getValue) ;
      if(node.getValue().equals(value)) {
        return node;
      }
    }
    if(node.getLeft() != null) {
      MyBinNode result = dfs(value, type, node.getLeft());
      if(result != null) {
        return result;
      }
    }
    if(type == 1) {
      System.out.println(node.getValue());
      if(node.getValue().equals(value)) {
        return node;
      }
    }
    if(node.getRight() != null) {
      MyBinTreeNode result = dfs(value, type, node.getLeft());
      
      if(result != null) {
        return result;
      }
    }
    if(type == 2) {
      System.out.println(node.getValue());
      if(node.getValue().equals(value)) {
        return node;
      }
    }
    return null;
  } 
  public MyBinTreeBode  bef(Object value) {
    return null;
  }
