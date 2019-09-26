package tree;
public class MyBinTreeMain{
public static void main(String[] args){
  MyBinTree tree = new MyBinTree();
  if (tree.isEmpty()) {
    System.out.println("空木です");
  }
  else {
    System.out.print("空木ではありません");
  }
  MyBinTreeNode node;
  node=tree.getRoot();
  if (node == null) {
    System.out.println("空木です");
  }
  else{
    System.out.println("空木ではありません");
  }

  MyBinTreeNode root = new MyBinTreeNode("A");
  boolean isSuccess = tree.setRoot(root);

  if (isSuccess) {
    System.out.println("根のセットに成功");
  }
  else {
    System.out.println("根のセットに失敗");
  }
  MyBinTreeNode root2 = tree.getRoot();

  if (root2 == root) {
    System.out.println("根のセットに成功");
  }
  else {
   System.out.println("根のセットに失敗");
  }
  
  MyBinTreeNode nodel1=new MyBinTreeNode("B");
  root2.setLeft(nodel1);
  System.out.println("根の左の子の値:" + root2.getLeft().getValue());
  MyBinTreeNode noder1=new MyBinTreeNode("C");
  root2.setRight(noder1);
  System.out.println("根の右の子の値:" + root2.getRight().getValue());
  System.out.println("根の右の子の親の値:" + root2.getRight().getParent().getValue());
  MyBinTree tree2 = new MyBinTree();
  MyBinTreeNode na = new MyBinTreeNode("A");
  MyBinTreeNode nb = new MyBinTreeNode("B");
  MyBinTreeNode nc = new MyBinTreeNode("C");
  MyBinTreeNode nd = new MyBinTreeNode("D");
  MyBinTreeNode ne = new MyBinTreeNode("E");
  MyBinTreeNode nf = new MyBinTreeNode("F");
  MyBinTreeNode ng = new MyBinTreeNode("G");
  MyBinTreeNode nh = new MyBinTreeNode("H");
  MyBinTreeNode ni = new MyBinTreeNode("I");
  na.setLeft(nb);
  na.setRight(ng);
  nb.setLeft(nc);
  nb.setRight(nd);
  nc.setLeft(ne);
  nc.setRight(nf);
  ng.setLeft(nh);
  ng.setRight(ni);
  tree2.setRoot(na);
  tree2.dfs("I",0);
 }
}