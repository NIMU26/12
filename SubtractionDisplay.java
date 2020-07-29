package kadai12;

public class SubtractionDisplay implements TimeAdmin{
	int countDownValue = 100;

	@Override
	public void update(Subject subject) {
		// TODO 自動生成されたメソッド・スタブ
		countDownValue -= 1;

		System.out.println(countDownValue);
	}
}
