package com.robinhood.android.equities.taxlots;

import com.robinhood.utils.resource.StringResource;
import equity_trading_tax_lots.proto.p460v1.SelectionStrategy;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelectLotsStateProvider.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/SetSelectionStrategyFailure;", "", "maxNumberOfShares", "Ljava/math/BigDecimal;", "selectionStrategy", "Lequity_trading_tax_lots/proto/v1/SelectionStrategy;", "estGainLoss", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Ljava/math/BigDecimal;Lequity_trading_tax_lots/proto/v1/SelectionStrategy;Lcom/robinhood/utils/resource/StringResource;)V", "getMaxNumberOfShares", "()Ljava/math/BigDecimal;", "getSelectionStrategy", "()Lequity_trading_tax_lots/proto/v1/SelectionStrategy;", "getEstGainLoss", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SetSelectionStrategyFailure {
    public static final int $stable = 8;
    private final StringResource estGainLoss;
    private final BigDecimal maxNumberOfShares;
    private final SelectionStrategy selectionStrategy;

    public static /* synthetic */ SetSelectionStrategyFailure copy$default(SetSelectionStrategyFailure setSelectionStrategyFailure, BigDecimal bigDecimal, SelectionStrategy selectionStrategy, StringResource stringResource, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = setSelectionStrategyFailure.maxNumberOfShares;
        }
        if ((i & 2) != 0) {
            selectionStrategy = setSelectionStrategyFailure.selectionStrategy;
        }
        if ((i & 4) != 0) {
            stringResource = setSelectionStrategyFailure.estGainLoss;
        }
        return setSelectionStrategyFailure.copy(bigDecimal, selectionStrategy, stringResource);
    }

    /* renamed from: component1, reason: from getter */
    public final BigDecimal getMaxNumberOfShares() {
        return this.maxNumberOfShares;
    }

    /* renamed from: component2, reason: from getter */
    public final SelectionStrategy getSelectionStrategy() {
        return this.selectionStrategy;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getEstGainLoss() {
        return this.estGainLoss;
    }

    public final SetSelectionStrategyFailure copy(BigDecimal maxNumberOfShares, SelectionStrategy selectionStrategy, StringResource estGainLoss) {
        Intrinsics.checkNotNullParameter(maxNumberOfShares, "maxNumberOfShares");
        Intrinsics.checkNotNullParameter(selectionStrategy, "selectionStrategy");
        Intrinsics.checkNotNullParameter(estGainLoss, "estGainLoss");
        return new SetSelectionStrategyFailure(maxNumberOfShares, selectionStrategy, estGainLoss);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetSelectionStrategyFailure)) {
            return false;
        }
        SetSelectionStrategyFailure setSelectionStrategyFailure = (SetSelectionStrategyFailure) other;
        return Intrinsics.areEqual(this.maxNumberOfShares, setSelectionStrategyFailure.maxNumberOfShares) && this.selectionStrategy == setSelectionStrategyFailure.selectionStrategy && Intrinsics.areEqual(this.estGainLoss, setSelectionStrategyFailure.estGainLoss);
    }

    public int hashCode() {
        return (((this.maxNumberOfShares.hashCode() * 31) + this.selectionStrategy.hashCode()) * 31) + this.estGainLoss.hashCode();
    }

    public String toString() {
        return "SetSelectionStrategyFailure(maxNumberOfShares=" + this.maxNumberOfShares + ", selectionStrategy=" + this.selectionStrategy + ", estGainLoss=" + this.estGainLoss + ")";
    }

    public SetSelectionStrategyFailure(BigDecimal maxNumberOfShares, SelectionStrategy selectionStrategy, StringResource estGainLoss) {
        Intrinsics.checkNotNullParameter(maxNumberOfShares, "maxNumberOfShares");
        Intrinsics.checkNotNullParameter(selectionStrategy, "selectionStrategy");
        Intrinsics.checkNotNullParameter(estGainLoss, "estGainLoss");
        this.maxNumberOfShares = maxNumberOfShares;
        this.selectionStrategy = selectionStrategy;
        this.estGainLoss = estGainLoss;
    }

    public final BigDecimal getMaxNumberOfShares() {
        return this.maxNumberOfShares;
    }

    public final SelectionStrategy getSelectionStrategy() {
        return this.selectionStrategy;
    }

    public final StringResource getEstGainLoss() {
        return this.estGainLoss;
    }
}
