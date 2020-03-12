package t0305;

public class candle{
	public int[] distributeCandies(int candies, int num_people) {
		int[] res = new int[num_people];

        // ���ǹ����������� 1 ��ʼ����
        int cnt = 1;
        // ÿ�����ǹ���С���ѵ�С�꣨�� num_people ȡ�ࣩ
        int index = 0;
        // ʣ���ǹ���
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
            // ������һλС����
            index++;
        }
        return res;
	}
}
