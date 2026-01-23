package com.robinhood.android.p148fx.tooltip;

import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FxDataState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/fx/tooltip/FxDataState;", "", "fxQuoteState", "Lcom/robinhood/android/fx/tooltip/FxQuoteState;", "usdAmount", "Lcom/robinhood/models/util/Money;", "<init>", "(Lcom/robinhood/android/fx/tooltip/FxQuoteState;Lcom/robinhood/models/util/Money;)V", "getFxQuoteState", "()Lcom/robinhood/android/fx/tooltip/FxQuoteState;", "getUsdAmount", "()Lcom/robinhood/models/util/Money;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-fx-tooltip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FxDataState {
    public static final int $stable = 8;
    private final FxQuoteState fxQuoteState;
    private final Money usdAmount;

    /* JADX WARN: Multi-variable type inference failed */
    public FxDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ FxDataState copy$default(FxDataState fxDataState, FxQuoteState fxQuoteState, Money money, int i, Object obj) {
        if ((i & 1) != 0) {
            fxQuoteState = fxDataState.fxQuoteState;
        }
        if ((i & 2) != 0) {
            money = fxDataState.usdAmount;
        }
        return fxDataState.copy(fxQuoteState, money);
    }

    /* renamed from: component1, reason: from getter */
    public final FxQuoteState getFxQuoteState() {
        return this.fxQuoteState;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getUsdAmount() {
        return this.usdAmount;
    }

    public final FxDataState copy(FxQuoteState fxQuoteState, Money usdAmount) {
        return new FxDataState(fxQuoteState, usdAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FxDataState)) {
            return false;
        }
        FxDataState fxDataState = (FxDataState) other;
        return Intrinsics.areEqual(this.fxQuoteState, fxDataState.fxQuoteState) && Intrinsics.areEqual(this.usdAmount, fxDataState.usdAmount);
    }

    public int hashCode() {
        FxQuoteState fxQuoteState = this.fxQuoteState;
        int iHashCode = (fxQuoteState == null ? 0 : fxQuoteState.hashCode()) * 31;
        Money money = this.usdAmount;
        return iHashCode + (money != null ? money.hashCode() : 0);
    }

    public String toString() {
        return "FxDataState(fxQuoteState=" + this.fxQuoteState + ", usdAmount=" + this.usdAmount + ")";
    }

    public FxDataState(FxQuoteState fxQuoteState, Money money) {
        this.fxQuoteState = fxQuoteState;
        this.usdAmount = money;
    }

    public /* synthetic */ FxDataState(FxQuoteState fxQuoteState, Money money, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fxQuoteState, (i & 2) != 0 ? null : money);
    }

    public final FxQuoteState getFxQuoteState() {
        return this.fxQuoteState;
    }

    public final Money getUsdAmount() {
        return this.usdAmount;
    }
}
