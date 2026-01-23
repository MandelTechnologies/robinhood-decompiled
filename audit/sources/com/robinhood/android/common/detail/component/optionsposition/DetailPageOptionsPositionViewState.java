package com.robinhood.android.common.detail.component.optionsposition;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: DetailPageOptionsPositionViewState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000f0\fHÆ\u0003Jg\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\fHÆ\u0001J\u0013\u0010'\u001a\u00020\u00032\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001c¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/common/detail/component/optionsposition/DetailPageOptionsPositionViewState;", "", "showThisSection", "", "strategyCount", "Ljava/math/BigDecimal;", "cashCollateralValue", "", "totalValue", "todayReturn", "totalReturn", "positionRows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/common/detail/component/optionsposition/DetailPageOptionsPositionRowViewState;", "entryPointRows", "Lcom/robinhood/android/common/detail/component/optionsposition/DetailPageEntryPointRowViewState;", "<init>", "(ZLjava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;)V", "getShowThisSection", "()Z", "getStrategyCount", "()Ljava/math/BigDecimal;", "getCashCollateralValue", "()Ljava/lang/String;", "getTotalValue", "getTodayReturn", "getTotalReturn", "getPositionRows", "()Lkotlinx/collections/immutable/ImmutableList;", "getEntryPointRows", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "feature-lib-detail-component_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DetailPageOptionsPositionViewState {
    public static final int $stable = 8;
    private final String cashCollateralValue;
    private final ImmutableList<DetailPageOptionsPositionViewState2> entryPointRows;
    private final ImmutableList<DetailPageOptionsPositionRowViewState> positionRows;
    private final boolean showThisSection;
    private final BigDecimal strategyCount;
    private final String todayReturn;
    private final String totalReturn;
    private final String totalValue;

    public static /* synthetic */ DetailPageOptionsPositionViewState copy$default(DetailPageOptionsPositionViewState detailPageOptionsPositionViewState, boolean z, BigDecimal bigDecimal, String str, String str2, String str3, String str4, ImmutableList immutableList, ImmutableList immutableList2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = detailPageOptionsPositionViewState.showThisSection;
        }
        if ((i & 2) != 0) {
            bigDecimal = detailPageOptionsPositionViewState.strategyCount;
        }
        if ((i & 4) != 0) {
            str = detailPageOptionsPositionViewState.cashCollateralValue;
        }
        if ((i & 8) != 0) {
            str2 = detailPageOptionsPositionViewState.totalValue;
        }
        if ((i & 16) != 0) {
            str3 = detailPageOptionsPositionViewState.todayReturn;
        }
        if ((i & 32) != 0) {
            str4 = detailPageOptionsPositionViewState.totalReturn;
        }
        if ((i & 64) != 0) {
            immutableList = detailPageOptionsPositionViewState.positionRows;
        }
        if ((i & 128) != 0) {
            immutableList2 = detailPageOptionsPositionViewState.entryPointRows;
        }
        ImmutableList immutableList3 = immutableList;
        ImmutableList immutableList4 = immutableList2;
        String str5 = str3;
        String str6 = str4;
        return detailPageOptionsPositionViewState.copy(z, bigDecimal, str, str2, str5, str6, immutableList3, immutableList4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowThisSection() {
        return this.showThisSection;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getStrategyCount() {
        return this.strategyCount;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCashCollateralValue() {
        return this.cashCollateralValue;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTotalValue() {
        return this.totalValue;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTodayReturn() {
        return this.todayReturn;
    }

    /* renamed from: component6, reason: from getter */
    public final String getTotalReturn() {
        return this.totalReturn;
    }

    public final ImmutableList<DetailPageOptionsPositionRowViewState> component7() {
        return this.positionRows;
    }

    public final ImmutableList<DetailPageOptionsPositionViewState2> component8() {
        return this.entryPointRows;
    }

    public final DetailPageOptionsPositionViewState copy(boolean showThisSection, BigDecimal strategyCount, String cashCollateralValue, String totalValue, String todayReturn, String totalReturn, ImmutableList<DetailPageOptionsPositionRowViewState> positionRows, ImmutableList<? extends DetailPageOptionsPositionViewState2> entryPointRows) {
        Intrinsics.checkNotNullParameter(strategyCount, "strategyCount");
        Intrinsics.checkNotNullParameter(totalValue, "totalValue");
        Intrinsics.checkNotNullParameter(todayReturn, "todayReturn");
        Intrinsics.checkNotNullParameter(totalReturn, "totalReturn");
        Intrinsics.checkNotNullParameter(positionRows, "positionRows");
        Intrinsics.checkNotNullParameter(entryPointRows, "entryPointRows");
        return new DetailPageOptionsPositionViewState(showThisSection, strategyCount, cashCollateralValue, totalValue, todayReturn, totalReturn, positionRows, entryPointRows);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailPageOptionsPositionViewState)) {
            return false;
        }
        DetailPageOptionsPositionViewState detailPageOptionsPositionViewState = (DetailPageOptionsPositionViewState) other;
        return this.showThisSection == detailPageOptionsPositionViewState.showThisSection && Intrinsics.areEqual(this.strategyCount, detailPageOptionsPositionViewState.strategyCount) && Intrinsics.areEqual(this.cashCollateralValue, detailPageOptionsPositionViewState.cashCollateralValue) && Intrinsics.areEqual(this.totalValue, detailPageOptionsPositionViewState.totalValue) && Intrinsics.areEqual(this.todayReturn, detailPageOptionsPositionViewState.todayReturn) && Intrinsics.areEqual(this.totalReturn, detailPageOptionsPositionViewState.totalReturn) && Intrinsics.areEqual(this.positionRows, detailPageOptionsPositionViewState.positionRows) && Intrinsics.areEqual(this.entryPointRows, detailPageOptionsPositionViewState.entryPointRows);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.showThisSection) * 31) + this.strategyCount.hashCode()) * 31;
        String str = this.cashCollateralValue;
        return ((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.totalValue.hashCode()) * 31) + this.todayReturn.hashCode()) * 31) + this.totalReturn.hashCode()) * 31) + this.positionRows.hashCode()) * 31) + this.entryPointRows.hashCode();
    }

    public String toString() {
        return "DetailPageOptionsPositionViewState(showThisSection=" + this.showThisSection + ", strategyCount=" + this.strategyCount + ", cashCollateralValue=" + this.cashCollateralValue + ", totalValue=" + this.totalValue + ", todayReturn=" + this.todayReturn + ", totalReturn=" + this.totalReturn + ", positionRows=" + this.positionRows + ", entryPointRows=" + this.entryPointRows + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DetailPageOptionsPositionViewState(boolean z, BigDecimal strategyCount, String str, String totalValue, String todayReturn, String totalReturn, ImmutableList<DetailPageOptionsPositionRowViewState> positionRows, ImmutableList<? extends DetailPageOptionsPositionViewState2> entryPointRows) {
        Intrinsics.checkNotNullParameter(strategyCount, "strategyCount");
        Intrinsics.checkNotNullParameter(totalValue, "totalValue");
        Intrinsics.checkNotNullParameter(todayReturn, "todayReturn");
        Intrinsics.checkNotNullParameter(totalReturn, "totalReturn");
        Intrinsics.checkNotNullParameter(positionRows, "positionRows");
        Intrinsics.checkNotNullParameter(entryPointRows, "entryPointRows");
        this.showThisSection = z;
        this.strategyCount = strategyCount;
        this.cashCollateralValue = str;
        this.totalValue = totalValue;
        this.todayReturn = todayReturn;
        this.totalReturn = totalReturn;
        this.positionRows = positionRows;
        this.entryPointRows = entryPointRows;
    }

    public final boolean getShowThisSection() {
        return this.showThisSection;
    }

    public final BigDecimal getStrategyCount() {
        return this.strategyCount;
    }

    public final String getCashCollateralValue() {
        return this.cashCollateralValue;
    }

    public final String getTotalValue() {
        return this.totalValue;
    }

    public final String getTodayReturn() {
        return this.todayReturn;
    }

    public final String getTotalReturn() {
        return this.totalReturn;
    }

    public final ImmutableList<DetailPageOptionsPositionRowViewState> getPositionRows() {
        return this.positionRows;
    }

    public final ImmutableList<DetailPageOptionsPositionViewState2> getEntryPointRows() {
        return this.entryPointRows;
    }
}
