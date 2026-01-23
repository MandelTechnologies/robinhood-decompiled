package com.robinhood.android.trade.equity.p261ui.dialog.notenoughshares;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NotEnoughSharesRowViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/dialog/notenoughshares/NotEnoughSharesRowViewState;", "", "labelRes", "", "value", "Ljava/math/BigDecimal;", "<init>", "(ILjava/math/BigDecimal;)V", "getLabelRes", "()I", "getValue", "()Ljava/math/BigDecimal;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class NotEnoughSharesRowViewState {
    public static final int $stable = 8;
    private final int labelRes;
    private final BigDecimal value;

    public static /* synthetic */ NotEnoughSharesRowViewState copy$default(NotEnoughSharesRowViewState notEnoughSharesRowViewState, int i, BigDecimal bigDecimal, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = notEnoughSharesRowViewState.labelRes;
        }
        if ((i2 & 2) != 0) {
            bigDecimal = notEnoughSharesRowViewState.value;
        }
        return notEnoughSharesRowViewState.copy(i, bigDecimal);
    }

    /* renamed from: component1, reason: from getter */
    public final int getLabelRes() {
        return this.labelRes;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getValue() {
        return this.value;
    }

    public final NotEnoughSharesRowViewState copy(int labelRes, BigDecimal value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new NotEnoughSharesRowViewState(labelRes, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotEnoughSharesRowViewState)) {
            return false;
        }
        NotEnoughSharesRowViewState notEnoughSharesRowViewState = (NotEnoughSharesRowViewState) other;
        return this.labelRes == notEnoughSharesRowViewState.labelRes && Intrinsics.areEqual(this.value, notEnoughSharesRowViewState.value);
    }

    public int hashCode() {
        return (Integer.hashCode(this.labelRes) * 31) + this.value.hashCode();
    }

    public String toString() {
        return "NotEnoughSharesRowViewState(labelRes=" + this.labelRes + ", value=" + this.value + ")";
    }

    public NotEnoughSharesRowViewState(int i, BigDecimal value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.labelRes = i;
        this.value = value;
    }

    public final int getLabelRes() {
        return this.labelRes;
    }

    public final BigDecimal getValue() {
        return this.value;
    }
}
