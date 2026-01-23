package com.robinhood.shared.trade.crypto.p397ui.taxLots.strategy;

import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nummus.p512v1.TaxLotStrategyTypeDto;

/* compiled from: CryptoTaxLotStrategySelectionBottomSheetComposable.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/strategy/TaxLotStrategySelectionRowState;", "", "state", "Lcom/robinhood/compose/bento/component/rows/BentoSelectionRowState;", "type", "Lnummus/v1/TaxLotStrategyTypeDto;", "<init>", "(Lcom/robinhood/compose/bento/component/rows/BentoSelectionRowState;Lnummus/v1/TaxLotStrategyTypeDto;)V", "getState", "()Lcom/robinhood/compose/bento/component/rows/BentoSelectionRowState;", "getType", "()Lnummus/v1/TaxLotStrategyTypeDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TaxLotStrategySelectionRowState {
    public static final int $stable = BentoSelectionRowState.$stable;
    private final BentoSelectionRowState state;
    private final TaxLotStrategyTypeDto type;

    public static /* synthetic */ TaxLotStrategySelectionRowState copy$default(TaxLotStrategySelectionRowState taxLotStrategySelectionRowState, BentoSelectionRowState bentoSelectionRow3, TaxLotStrategyTypeDto taxLotStrategyTypeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            bentoSelectionRow3 = taxLotStrategySelectionRowState.state;
        }
        if ((i & 2) != 0) {
            taxLotStrategyTypeDto = taxLotStrategySelectionRowState.type;
        }
        return taxLotStrategySelectionRowState.copy(bentoSelectionRow3, taxLotStrategyTypeDto);
    }

    /* renamed from: component1, reason: from getter */
    public final BentoSelectionRowState getState() {
        return this.state;
    }

    /* renamed from: component2, reason: from getter */
    public final TaxLotStrategyTypeDto getType() {
        return this.type;
    }

    public final TaxLotStrategySelectionRowState copy(BentoSelectionRowState state, TaxLotStrategyTypeDto type2) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(type2, "type");
        return new TaxLotStrategySelectionRowState(state, type2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxLotStrategySelectionRowState)) {
            return false;
        }
        TaxLotStrategySelectionRowState taxLotStrategySelectionRowState = (TaxLotStrategySelectionRowState) other;
        return Intrinsics.areEqual(this.state, taxLotStrategySelectionRowState.state) && this.type == taxLotStrategySelectionRowState.type;
    }

    public int hashCode() {
        return (this.state.hashCode() * 31) + this.type.hashCode();
    }

    public String toString() {
        return "TaxLotStrategySelectionRowState(state=" + this.state + ", type=" + this.type + ")";
    }

    public TaxLotStrategySelectionRowState(BentoSelectionRowState state, TaxLotStrategyTypeDto type2) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(type2, "type");
        this.state = state;
        this.type = type2;
    }

    public final BentoSelectionRowState getState() {
        return this.state;
    }

    public final TaxLotStrategyTypeDto getType() {
        return this.type;
    }
}
