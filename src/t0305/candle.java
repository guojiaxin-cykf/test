package t0305;

public class candle{
	public int[] distributeCandies(int candies, int num_people) {
		int[] res = new int[num_people];

        // 发糖果的数量，从 1 开始自增
        int cnt = 1;
        // 每次拿糖果的小朋友的小标（对 num_people 取余）
        int index = 0;
        // 剩余糖果数
        int remain = candies;

        while (remain > 0) {
            if (remain - cnt >= 0) {
                res[index % num_people] += cnt;
                remain -= cnt;
                cnt++;
            } else {
                res[index % num_people] += remain;
                break;
            }
            // 换到下一位小朋友
            index++;
        }
        return res;
	}
}
