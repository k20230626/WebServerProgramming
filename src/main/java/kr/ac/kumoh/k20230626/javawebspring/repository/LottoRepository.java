package kr.ac.kumoh.k20230626.javawebspring.repository;

import kr.ac.kumoh.k20230626.javawebspring.model.LottoNumber;

public interface LottoRepository {
    LottoNumber save(LottoNumber lottoNumber);
    LottoNumber find();
}
