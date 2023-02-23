/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;


    public Node() {}


    public Node(int _val) {
        val = _val;
    }


    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/


class Solution {
    List<Integer> preorderArray = new ArrayList<>();
    List<Integer> inorderArray = new ArrayList<>();
    List<Integer> postorderArray = new ArrayList<>();
   
    public List<Integer> preorder(Node root) {
      if(root!=null && root.children!=null){
       preorderArray.add(root.val);
       
            for(int i=0; i<root.children.size();i++){
               
                preorder(root.children.get(i));
               
            }


           
        }
           
     
        return preorderArray;
    }


   
//added post order just in case


         public List<Integer> postorder(Node root) {
      if(root!=null && root.children!=null){
     
       
            for(int i=0; i<root.children.size();i++){
             
                postorder(root.children.get(i));
               
            }
         postorderArray.add(root.val);
        }
           
     
        return postorderArray;
    }
}
