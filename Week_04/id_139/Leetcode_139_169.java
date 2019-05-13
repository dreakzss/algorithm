class Solution {
    public int majorityElement(int[] nums) {
      Map<Integer,Integer> map = new HashMap<>();         // hash存数字和出现的次数
        for (int num:nums) {
            if (map.containsKey(num)){                    // 包含该数字
                int count = map.get(num)+1;               // +1
                if(count > nums.length >> 1 ) return num; // 成功找到退出
                else map.put(num,count);                  // 继续加
            }else map.put(num,1);                         // 第一次遇到该数字            
        }
        return nums[0];                                   // 数组长度太小的情况
    }
}
