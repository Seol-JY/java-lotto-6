package strategy;

import lotto.domain.Lotto;

public interface IssuanceStrategy {
    public Lotto issue();
}