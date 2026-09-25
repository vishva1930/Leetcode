/**
 * Definition for a binary tree TreeNode.
 * public class TreeTreeNode {
 *     int val;
 *     TreeTreeNode left;
 *     TreeTreeNode right;
 *     TreeTreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode findtarget(int tar,TreeNode root){
        if(root==null){
            return null ;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            if(curr.val==tar){
                return curr;
            }
            if(curr.left!=null){
            q.add(curr.left);
            }
            if(curr.right!=null){
            q.add(curr.right);
            }  
        }
        return null;
    }

     public Map parent(TreeNode root){
        HashMap<TreeNode,TreeNode> map=new HashMap<>();
         if(root==null){
            return null;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            if(curr.left!=null){
                q.add(curr.left);
                map.put(curr.left,curr);
               // System.out.println(curr.left.val+"-"+curr.val);
            }
            if(curr.right!=null){
                q.add(curr.right);
                map.put(curr.right,curr);
               // System.out.println(curr.right.val+"-"+curr.val);
            }  
        }
        return map;
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Queue<TreeNode> q=new LinkedList<>();
        Set<TreeNode> vis=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        TreeNode tt=findtarget(target.val,root);
        q.add(tt);
        vis.add(tt);
        int dis=0;
        Map<TreeNode,TreeNode> map=new HashMap<>();
        map=parent(root);
        while(!q.isEmpty()){
            int size=q.size();
            if(dis==k){
                while(!q.isEmpty()){
                    list.add(q.poll().val);
                }
                return list;
            }
            for(int i=0;i<size;i++){
                TreeNode t=q.poll();
                if(t.left!=null && !vis.contains(t.left)){
                    q.add(t.left);
                    vis.add(t.left);
                    
                }
                if(t.right!=null && !vis.contains(t.right)){
                    q.add(t.right);
                    vis.add(t.right);
                }
                //if(map.contains(t))
                TreeNode p=map.get(t);
                if(!vis.contains(p) && p!=null){
                    q.add(p);
                    vis.add(p);
                }
            }
            dis++;
        }
     return list;   
    }
}