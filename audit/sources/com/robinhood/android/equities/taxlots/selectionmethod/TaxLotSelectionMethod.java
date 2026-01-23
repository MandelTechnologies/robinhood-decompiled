package com.robinhood.android.equities.taxlots.selectionmethod;

import equity_trading_tax_lots.proto.p460v1.AvailableSelectionStrategyOption;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TaxLotSelectionMethodRow.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/selectionmethod/TaxLotSelectionMethod;", "", "selectionStrategy", "Lequity_trading_tax_lots/proto/v1/AvailableSelectionStrategyOption;", "isSelected", "", "<init>", "(Lequity_trading_tax_lots/proto/v1/AvailableSelectionStrategyOption;Z)V", "getSelectionStrategy", "()Lequity_trading_tax_lots/proto/v1/AvailableSelectionStrategyOption;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TaxLotSelectionMethod {
    public static final int $stable = 8;
    private final boolean isSelected;
    private final AvailableSelectionStrategyOption selectionStrategy;

    public static /* synthetic */ TaxLotSelectionMethod copy$default(TaxLotSelectionMethod taxLotSelectionMethod, AvailableSelectionStrategyOption availableSelectionStrategyOption, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            availableSelectionStrategyOption = taxLotSelectionMethod.selectionStrategy;
        }
        if ((i & 2) != 0) {
            z = taxLotSelectionMethod.isSelected;
        }
        return taxLotSelectionMethod.copy(availableSelectionStrategyOption, z);
    }

    /* renamed from: component1, reason: from getter */
    public final AvailableSelectionStrategyOption getSelectionStrategy() {
        return this.selectionStrategy;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final TaxLotSelectionMethod copy(AvailableSelectionStrategyOption selectionStrategy, boolean isSelected) {
        Intrinsics.checkNotNullParameter(selectionStrategy, "selectionStrategy");
        return new TaxLotSelectionMethod(selectionStrategy, isSelected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxLotSelectionMethod)) {
            return false;
        }
        TaxLotSelectionMethod taxLotSelectionMethod = (TaxLotSelectionMethod) other;
        return Intrinsics.areEqual(this.selectionStrategy, taxLotSelectionMethod.selectionStrategy) && this.isSelected == taxLotSelectionMethod.isSelected;
    }

    public int hashCode() {
        return (this.selectionStrategy.hashCode() * 31) + Boolean.hashCode(this.isSelected);
    }

    public String toString() {
        return "TaxLotSelectionMethod(selectionStrategy=" + this.selectionStrategy + ", isSelected=" + this.isSelected + ")";
    }

    public TaxLotSelectionMethod(AvailableSelectionStrategyOption selectionStrategy, boolean z) {
        Intrinsics.checkNotNullParameter(selectionStrategy, "selectionStrategy");
        this.selectionStrategy = selectionStrategy;
        this.isSelected = z;
    }

    public final AvailableSelectionStrategyOption getSelectionStrategy() {
        return this.selectionStrategy;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }
}
