public class Test{
   
    static int index = -1;

    public static Node createTree(int []nodes){
        index++;
        if(nodes[index]==-1)
            return null;
        
        Node root = new Node(nodes[index]);

        root.left = createTree(nodes);
        root.right = createTree(nodes);

        return root;
    }
}