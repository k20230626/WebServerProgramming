package kr.ac.kumoh.k20230626.javawebspring.model;

public class LottoNumber {
    private final int[] numbers;

    public LottoNumber(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }
}
