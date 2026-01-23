package com.robinhood.librobinhood.data.store;

import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p355ui.UiOptionChain;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: OptionChainLandingStore.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u0011\u0010 \u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\"\u0010!R\u0011\u0010#\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0013\u0010&\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionChainPageState;", "", "Lcom/robinhood/models/ui/UiOptionChain;", "uiOptionChain", "j$/time/LocalDate", "expirationDate", "", "originalIndex", "<init>", "(Lcom/robinhood/models/ui/UiOptionChain;Lj$/time/LocalDate;I)V", "component1", "()Lcom/robinhood/models/ui/UiOptionChain;", "component2", "()Lj$/time/LocalDate;", "component3", "()I", "copy", "(Lcom/robinhood/models/ui/UiOptionChain;Lj$/time/LocalDate;I)Lcom/robinhood/librobinhood/data/store/OptionChainPageState;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/ui/UiOptionChain;", "getUiOptionChain", "Lj$/time/LocalDate;", "getExpirationDate", "I", "getOriginalIndex", "isEquityChain", "()Z", "isIndexAMChain", "isIndexPMChain", "getSelloutTimeToExpiration", "()Ljava/lang/Integer;", "selloutTimeToExpiration", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OptionChainPageState {
    private final LocalDate expirationDate;
    private final int originalIndex;
    private final UiOptionChain uiOptionChain;

    public static /* synthetic */ OptionChainPageState copy$default(OptionChainPageState optionChainPageState, UiOptionChain uiOptionChain, LocalDate localDate, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            uiOptionChain = optionChainPageState.uiOptionChain;
        }
        if ((i2 & 2) != 0) {
            localDate = optionChainPageState.expirationDate;
        }
        if ((i2 & 4) != 0) {
            i = optionChainPageState.originalIndex;
        }
        return optionChainPageState.copy(uiOptionChain, localDate, i);
    }

    /* renamed from: component1, reason: from getter */
    public final UiOptionChain getUiOptionChain() {
        return this.uiOptionChain;
    }

    /* renamed from: component2, reason: from getter */
    public final LocalDate getExpirationDate() {
        return this.expirationDate;
    }

    /* renamed from: component3, reason: from getter */
    public final int getOriginalIndex() {
        return this.originalIndex;
    }

    public final OptionChainPageState copy(UiOptionChain uiOptionChain, LocalDate expirationDate, int originalIndex) {
        Intrinsics.checkNotNullParameter(uiOptionChain, "uiOptionChain");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        return new OptionChainPageState(uiOptionChain, expirationDate, originalIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionChainPageState)) {
            return false;
        }
        OptionChainPageState optionChainPageState = (OptionChainPageState) other;
        return Intrinsics.areEqual(this.uiOptionChain, optionChainPageState.uiOptionChain) && Intrinsics.areEqual(this.expirationDate, optionChainPageState.expirationDate) && this.originalIndex == optionChainPageState.originalIndex;
    }

    public int hashCode() {
        return (((this.uiOptionChain.hashCode() * 31) + this.expirationDate.hashCode()) * 31) + Integer.hashCode(this.originalIndex);
    }

    public String toString() {
        return "OptionChainPageState(uiOptionChain=" + this.uiOptionChain + ", expirationDate=" + this.expirationDate + ", originalIndex=" + this.originalIndex + ")";
    }

    public OptionChainPageState(UiOptionChain uiOptionChain, LocalDate expirationDate, int i) {
        Intrinsics.checkNotNullParameter(uiOptionChain, "uiOptionChain");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        this.uiOptionChain = uiOptionChain;
        this.expirationDate = expirationDate;
        this.originalIndex = i;
    }

    public final UiOptionChain getUiOptionChain() {
        return this.uiOptionChain;
    }

    public final LocalDate getExpirationDate() {
        return this.expirationDate;
    }

    public final int getOriginalIndex() {
        return this.originalIndex;
    }

    public final boolean isEquityChain() {
        return this.uiOptionChain.getUnderlyingType() == OptionChain.UnderlyingType.EQUITY;
    }

    public final boolean isIndexAMChain() {
        return this.uiOptionChain.getUnderlyingType() == OptionChain.UnderlyingType.INDEX && this.uiOptionChain.getOptionChain().getSettleOnOpen();
    }

    public final boolean isIndexPMChain() {
        return this.uiOptionChain.getUnderlyingType() == OptionChain.UnderlyingType.INDEX && !this.uiOptionChain.getOptionChain().getSettleOnOpen();
    }

    public final Integer getSelloutTimeToExpiration() {
        return this.uiOptionChain.getOptionChain().getSelloutTimeToExpiration();
    }
}
