class Node:
    def __init__(self,data):
        self.right=self.left=None
        self.data = data
class Solution:
    def insert(self,root,data):
        if root==None:
            return Node(data)
        else:
            if data<=root.data:
                cur=self.insert(root.left,data)
                root.left=cur
            else:
                cur=self.insert(root.right,data)
                root.right=cur
        return root

    def getHeight(self,root):
        h_left = 0
        h_right = 0
        
        if root.right != None:
            h_right = Solution.getHeight(self, root.right) + 1
        
        if root.left != None:
            h_left = Solution.getHeight(self, root.left) + 1
            
        return max(h_left, h_right)
            
T=int(input())
