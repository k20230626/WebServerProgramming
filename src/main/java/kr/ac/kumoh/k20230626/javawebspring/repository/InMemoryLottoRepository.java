package kr.ac.kumoh.k20230626.javawebspring.repository;

import kr.ac.kumoh.k20230626.javawebspring.model.LottoNumber;
import org.springframework.stereotype.Repository;

@Repository
public class InMemoryLottoRepository implements LottoRepository{
    private LottoNumber storedLottoNumber;
    @Override
    public LottoNumber save(LottoNumber lottoNumber) {
        this.storedLottoNumber = lottoNumber;
        return storedLottoNumber;
    }

    @Override
    public LottoNumber find() {
        return this.storedLottoNumber;
    }
}
