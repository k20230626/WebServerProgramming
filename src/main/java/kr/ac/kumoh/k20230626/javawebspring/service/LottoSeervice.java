package kr.ac.kumoh.k20230626.javawebspring.service;

import kr.ac.kumoh.k20230626.javawebspring.model.LottoNumber;
import kr.ac.kumoh.k20230626.javawebspring.repository.LottoRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@Service
public class LottoSeervice {
    private final LottoRepository lottoRepository;
    private final Random random = new Random();
    public LottoSeervice(LottoRepository lottoRepository) {
        this.lottoRepository = lottoRepository;
    }

    public LottoNumber getLuckNumber() {
        Set<Integer> numbers = new HashSet<>();
        while (numbers.size() < 6) {
            numbers.add(random.nextInt(45) + 1);
        }
        int[] numberArray = numbers.stream().mapToInt(Integer::intValue).toArray();
        LottoNumber lottoNumber = new LottoNumber(numberArray);
        lottoRepository.save(lottoNumber);
        return lottoNumber;
    }
}
