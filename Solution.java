package NiuKe;

import java.util.ArrayList;
import java.util.Stack;

//在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
//每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
//判断数组中是否含有该整数
public class Solution {
    public boolean Find(int target, int [][] array) {

       for (int i = 0; i < array.length; i++) {
		
    	  int low = 0;
    	  int high = array[i].length - 1;
    	  int mid = 0;
    	  
    	  while(low <= high) {
    		 mid = (low + high) / 2;
    		 
    		 if (array[i][mid] > target) {
				
    			 high = mid - 1;
			}else if(array[i][mid] < target) {
    		  low = mid + 1; 
    	  }else {
    		  return true;
    	  }
	}
    }
       return false;
}
    
    
//    请实现一个函数，将一个字符串中的每个空格替换成“%20”。
//    例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
    public String replaceSpace(StringBuffer str) {
    	
    	if (str == null) {
			return null;
		}
    	
    	for (int i = 0; i < str.length(); i++) {
			
    		if (str.charAt(i) == ' ') {
				str.replace(i, i+1, "%20");
			}
		}
    	String string = str.toString();
    	return string;
    	
    }
    
//   输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        
	 //初始化对象
	 Stack<Integer> stack = new Stack<>();
	 
	 //链表不等于空的时候 把值压入栈
     while (listNode != null) {
    	 //压栈
         stack.push(listNode.val);
         //改变列表位置
         listNode = listNode.next;
     }

     //定义一个ArrayList
     ArrayList<Integer> list = new ArrayList<>();
     
     //把栈中的值放到arraylist中
     while (!stack.isEmpty()) {
         list.add(stack.pop());
     }
     return list; 
	 
    }
    
 public String removeOuterParentheses(String S) {
     int max = S.length();
     StringBuffer sb = new StringBuffer(S);
     sb.replace(0, 1, "");
     sb.replace(max,max+1,"");
     return sb.toString();
 }
 
 
// 大家都知道斐波那契数列，现在要求输入一个整数n，
// 请你输出斐波那契数列的第n项（从0开始，第0项为0）
 public int Fibonacci(int n) {

	 if (n <= 0) {
		return 0;
	}
	 if (n == 1 || n == 2) {
		return 1; 
	}
	 
	 int temp = 0;
	 int f1 = 1;
	 int f2 = 1;
	 
	 for(int i = 0 ; i < n ; i ++) {
	 temp = f2;
	 f2 = f1 + f2 ;
	 f1 = temp;
	 }
	 
	 return f2;
 }
 
 //一只青蛙一次可以跳上1级台阶，也可以跳上2级
// 。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 public int JumpFloor(int target) {
	        //排除特殊情况
	        if (target <= 0)  return 0;
	        if (target == 1)  return 1;
	        if (target == 2)  return 2;
	        //斐波那契数列规律
	        int first = 1, second = 2, third = 0;
	        for (int i = 3; i <= target; i++) {
	            third = first + second;
	            first = second;
	            second = third;
	        }
	        return third;
	    }
	 
 }