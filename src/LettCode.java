import bean.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * lettcode 习题
 */
public class LettCode {

    private class ListNode{
        int val;
        ListNode next;
        ListNode(int x){val = x;}
    }

    /**
     * LettCode 习题
     * Serial: 21
     * difficulty: 简单
     * Description: 有序链表合并
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode first = l1;
        ListNode second = l2;
        if(first == null){
            return second;
        }
        if(second == null){
            return first;
        }
        ListNode newList;
        if(first.val<second.val){
            newList = first;
            first = first.next;
        }else {
            newList = second;
            second = second.next;
        }
        ListNode p = newList;


        while (first!=null && second!=null){
            if(first.val<second.val){
                p.next = first;
                first = first.next;
            }else {
                p.next = second;
                second = second.next;
            }
            p=p.next;
        }

        if(first!=null){
            p.next = first;
        }
        if(second!=null){
            p.next = second;
        }

        return newList;
    }


    /**
     * LettCode 习题
     * Serial: 26
     * difficulty:
     * Description: 删除有序数组重复元素(双指针)
     */
    public int removeDuplicates2(int[] nums){
        if(nums == null){
            return 0;
        }
        if(nums.length == 1){
            return 1;
        }
        int i=0,j=1;
        while (j<nums.length){
            if(nums[i] == nums[j]){
                j++;
            }else {
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        return i+1;
    }

    /**
     * LettCode 习题
     * Serial: 35
     * difficulty:
     * Description: 模式匹配
     */
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(target <=nums[i]){
                return i;
            }
        }
        return nums.length;
    }

    /**
     * LettCode 习题
     * Serial: 35
     * difficulty:
     * Description: 二分查找好一些
     */
    public int searchInsert(int[] nums,int target,int x){
        int left = 0;
        int right = nums.length-1;

        while (left<=right){
            int mid = left+(right-left)>>1;
            if(target == nums[mid]){
                return mid;
            }else if(target<nums[mid]){
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return left;
    }

    /**
     * LettCode 习题
     * Serial: 94
     * difficulty: 中等
     * Description: 二叉树的中序遍历
     */
    List<Integer> contanins = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return contanins;
    }

    private void inorder(TreeNode treeNode){
        if (treeNode == null){
            return;
        }
        inorder(treeNode.left);
        contanins.add(treeNode.val);
        inorder(treeNode.right);
    }






}
