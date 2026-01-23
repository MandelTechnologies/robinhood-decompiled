package com.robinhood.android.redesign.accounttab.store;

import com.robinhood.models.serverdriven.experimental.api.Direction;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountPerformance.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/redesign/accounttab/store/AccountPerformance;", "", "baseBalance", "Ljava/math/BigDecimal;", "balance", "direction", "Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/robinhood/models/serverdriven/experimental/api/Direction;)V", "getBaseBalance", "()Ljava/math/BigDecimal;", "getBalance", "getDirection", "()Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "delta", "getDelta", "percentageDelta", "getPercentageDelta", "lib-account-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class AccountPerformance {
    public static final int $stable = 8;
    private final BigDecimal balance;
    private final BigDecimal baseBalance;
    private final BigDecimal delta;
    private final Direction direction;
    private final BigDecimal percentageDelta;

    public AccountPerformance(BigDecimal baseBalance, BigDecimal balance, Direction direction) {
        Intrinsics.checkNotNullParameter(baseBalance, "baseBalance");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.baseBalance = baseBalance;
        this.balance = balance;
        this.direction = direction;
        BigDecimal bigDecimalSubtract = balance.subtract(baseBalance);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        this.delta = bigDecimalSubtract;
        BigDecimal bigDecimalDivide = BigDecimal.ZERO;
        if (!Intrinsics.areEqual(baseBalance, bigDecimalDivide)) {
            bigDecimalDivide = bigDecimalSubtract.divide(baseBalance, 4, RoundingMode.HALF_UP);
            Intrinsics.checkNotNull(bigDecimalDivide);
        } else {
            Intrinsics.checkNotNull(bigDecimalDivide);
        }
        this.percentageDelta = bigDecimalDivide;
    }

    public final BigDecimal getBaseBalance() {
        return this.baseBalance;
    }

    public final BigDecimal getBalance() {
        return this.balance;
    }

    public final Direction getDirection() {
        return this.direction;
    }

    public final BigDecimal getDelta() {
        return this.delta;
    }

    public final BigDecimal getPercentageDelta() {
        return this.percentageDelta;
    }
}
