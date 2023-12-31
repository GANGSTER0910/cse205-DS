class Solution {
    
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> hs=new HashSet<>();
        
        
        TreeNode curr=root;
        
        while(curr!=null){
            if(curr.left==null){
                if(hs.contains(k-curr.val)) return true;
                hs.add(curr.val);
                curr=curr.right;
            }else{
                TreeNode temp=curr.left;
                while(temp.right!=null && temp.right!=curr){
                    temp=temp.right;
                }
                
                if(temp.right==curr){
                    temp.right=null;
                    curr=curr.right;
                }else{
                    if(hs.contains(k-curr.val)) return true;
                    hs.add(curr.val);
                    temp.right=curr;
                    curr=curr.left;
                }
            }
        }
        
        return false;
        
    }
}