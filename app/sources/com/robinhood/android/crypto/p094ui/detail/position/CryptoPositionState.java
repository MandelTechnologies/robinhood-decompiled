package com.robinhood.android.crypto.p094ui.detail.position;

import androidx.compose.p011ui.text.AnnotatedString;
import com.robinhood.android.crypto.p094ui.detail.position.views.CryptoPositionRowState;
import com.robinhood.android.crypto.p094ui.view.CryptoDetailTransferActionState;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoPositionState.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001BB\u008b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u000fHÆ\u0003J\t\u00105\u001a\u00020\u000fHÆ\u0003J\t\u00106\u001a\u00020\u000fHÆ\u0003J\t\u00107\u001a\u00020\u000fHÆ\u0003J\t\u00108\u001a\u00020\u000fHÆ\u0003J\t\u00109\u001a\u00020\u000fHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u00ad\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u000f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001J\u0013\u0010<\u001a\u00020\u00032\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020?HÖ\u0001J\t\u0010@\u001a\u00020AHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001aR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\u0011\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0011\u0010\u0013\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0011\u0010\u0014\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006C"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionState;", "", "areTopAndBottomBordersVisible", "", "areHoldingRowsVisible", "areDataRowDividersVisible", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_EQUITY, "Landroidx/compose/ui/text/AnnotatedString;", "isCryptoBalanceIconVisible", "isPortfolioDiversityRowVisible", "quantity", "transferActionState", "Lcom/robinhood/android/crypto/ui/view/CryptoDetailTransferActionState;", "isGrid", "quantityRowState", "Lcom/robinhood/android/crypto/ui/detail/position/views/CryptoPositionRowState;", "valueRowState", "averageCostRowState", "portfolioDiversityRowState", "todayReturnRowState", "totalReturnRowState", "positionBannerType", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionState$PositionBannerType;", "<init>", "(ZZZLandroidx/compose/ui/text/AnnotatedString;ZZLandroidx/compose/ui/text/AnnotatedString;Lcom/robinhood/android/crypto/ui/view/CryptoDetailTransferActionState;ZLcom/robinhood/android/crypto/ui/detail/position/views/CryptoPositionRowState;Lcom/robinhood/android/crypto/ui/detail/position/views/CryptoPositionRowState;Lcom/robinhood/android/crypto/ui/detail/position/views/CryptoPositionRowState;Lcom/robinhood/android/crypto/ui/detail/position/views/CryptoPositionRowState;Lcom/robinhood/android/crypto/ui/detail/position/views/CryptoPositionRowState;Lcom/robinhood/android/crypto/ui/detail/position/views/CryptoPositionRowState;Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionState$PositionBannerType;)V", "getAreTopAndBottomBordersVisible", "()Z", "getAreHoldingRowsVisible", "getAreDataRowDividersVisible", "getEquity", "()Landroidx/compose/ui/text/AnnotatedString;", "getQuantity", "getTransferActionState", "()Lcom/robinhood/android/crypto/ui/view/CryptoDetailTransferActionState;", "getQuantityRowState", "()Lcom/robinhood/android/crypto/ui/detail/position/views/CryptoPositionRowState;", "getValueRowState", "getAverageCostRowState", "getPortfolioDiversityRowState", "getTodayReturnRowState", "getTotalReturnRowState", "getPositionBannerType", "()Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionState$PositionBannerType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "equals", "other", "hashCode", "", "toString", "", "PositionBannerType", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoPositionState {
    public static final int $stable = 8;
    private final boolean areDataRowDividersVisible;
    private final boolean areHoldingRowsVisible;
    private final boolean areTopAndBottomBordersVisible;
    private final CryptoPositionRowState averageCostRowState;
    private final AnnotatedString equity;
    private final boolean isCryptoBalanceIconVisible;
    private final boolean isGrid;
    private final boolean isPortfolioDiversityRowVisible;
    private final CryptoPositionRowState portfolioDiversityRowState;
    private final PositionBannerType positionBannerType;
    private final AnnotatedString quantity;
    private final CryptoPositionRowState quantityRowState;
    private final CryptoPositionRowState todayReturnRowState;
    private final CryptoPositionRowState totalReturnRowState;
    private final CryptoDetailTransferActionState transferActionState;
    private final CryptoPositionRowState valueRowState;

    /* renamed from: component1, reason: from getter */
    public final boolean getAreTopAndBottomBordersVisible() {
        return this.areTopAndBottomBordersVisible;
    }

    /* renamed from: component10, reason: from getter */
    public final CryptoPositionRowState getQuantityRowState() {
        return this.quantityRowState;
    }

    /* renamed from: component11, reason: from getter */
    public final CryptoPositionRowState getValueRowState() {
        return this.valueRowState;
    }

    /* renamed from: component12, reason: from getter */
    public final CryptoPositionRowState getAverageCostRowState() {
        return this.averageCostRowState;
    }

    /* renamed from: component13, reason: from getter */
    public final CryptoPositionRowState getPortfolioDiversityRowState() {
        return this.portfolioDiversityRowState;
    }

    /* renamed from: component14, reason: from getter */
    public final CryptoPositionRowState getTodayReturnRowState() {
        return this.todayReturnRowState;
    }

    /* renamed from: component15, reason: from getter */
    public final CryptoPositionRowState getTotalReturnRowState() {
        return this.totalReturnRowState;
    }

    /* renamed from: component16, reason: from getter */
    public final PositionBannerType getPositionBannerType() {
        return this.positionBannerType;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getAreHoldingRowsVisible() {
        return this.areHoldingRowsVisible;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getAreDataRowDividersVisible() {
        return this.areDataRowDividersVisible;
    }

    /* renamed from: component4, reason: from getter */
    public final AnnotatedString getEquity() {
        return this.equity;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsCryptoBalanceIconVisible() {
        return this.isCryptoBalanceIconVisible;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsPortfolioDiversityRowVisible() {
        return this.isPortfolioDiversityRowVisible;
    }

    /* renamed from: component7, reason: from getter */
    public final AnnotatedString getQuantity() {
        return this.quantity;
    }

    /* renamed from: component8, reason: from getter */
    public final CryptoDetailTransferActionState getTransferActionState() {
        return this.transferActionState;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsGrid() {
        return this.isGrid;
    }

    public final CryptoPositionState copy(boolean areTopAndBottomBordersVisible, boolean areHoldingRowsVisible, boolean areDataRowDividersVisible, AnnotatedString equity, boolean isCryptoBalanceIconVisible, boolean isPortfolioDiversityRowVisible, AnnotatedString quantity, CryptoDetailTransferActionState transferActionState, boolean isGrid, CryptoPositionRowState quantityRowState, CryptoPositionRowState valueRowState, CryptoPositionRowState averageCostRowState, CryptoPositionRowState portfolioDiversityRowState, CryptoPositionRowState todayReturnRowState, CryptoPositionRowState totalReturnRowState, PositionBannerType positionBannerType) {
        Intrinsics.checkNotNullParameter(equity, "equity");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(quantityRowState, "quantityRowState");
        Intrinsics.checkNotNullParameter(valueRowState, "valueRowState");
        Intrinsics.checkNotNullParameter(averageCostRowState, "averageCostRowState");
        Intrinsics.checkNotNullParameter(portfolioDiversityRowState, "portfolioDiversityRowState");
        Intrinsics.checkNotNullParameter(todayReturnRowState, "todayReturnRowState");
        Intrinsics.checkNotNullParameter(totalReturnRowState, "totalReturnRowState");
        return new CryptoPositionState(areTopAndBottomBordersVisible, areHoldingRowsVisible, areDataRowDividersVisible, equity, isCryptoBalanceIconVisible, isPortfolioDiversityRowVisible, quantity, transferActionState, isGrid, quantityRowState, valueRowState, averageCostRowState, portfolioDiversityRowState, todayReturnRowState, totalReturnRowState, positionBannerType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoPositionState)) {
            return false;
        }
        CryptoPositionState cryptoPositionState = (CryptoPositionState) other;
        return this.areTopAndBottomBordersVisible == cryptoPositionState.areTopAndBottomBordersVisible && this.areHoldingRowsVisible == cryptoPositionState.areHoldingRowsVisible && this.areDataRowDividersVisible == cryptoPositionState.areDataRowDividersVisible && Intrinsics.areEqual(this.equity, cryptoPositionState.equity) && this.isCryptoBalanceIconVisible == cryptoPositionState.isCryptoBalanceIconVisible && this.isPortfolioDiversityRowVisible == cryptoPositionState.isPortfolioDiversityRowVisible && Intrinsics.areEqual(this.quantity, cryptoPositionState.quantity) && Intrinsics.areEqual(this.transferActionState, cryptoPositionState.transferActionState) && this.isGrid == cryptoPositionState.isGrid && Intrinsics.areEqual(this.quantityRowState, cryptoPositionState.quantityRowState) && Intrinsics.areEqual(this.valueRowState, cryptoPositionState.valueRowState) && Intrinsics.areEqual(this.averageCostRowState, cryptoPositionState.averageCostRowState) && Intrinsics.areEqual(this.portfolioDiversityRowState, cryptoPositionState.portfolioDiversityRowState) && Intrinsics.areEqual(this.todayReturnRowState, cryptoPositionState.todayReturnRowState) && Intrinsics.areEqual(this.totalReturnRowState, cryptoPositionState.totalReturnRowState) && this.positionBannerType == cryptoPositionState.positionBannerType;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((Boolean.hashCode(this.areTopAndBottomBordersVisible) * 31) + Boolean.hashCode(this.areHoldingRowsVisible)) * 31) + Boolean.hashCode(this.areDataRowDividersVisible)) * 31) + this.equity.hashCode()) * 31) + Boolean.hashCode(this.isCryptoBalanceIconVisible)) * 31) + Boolean.hashCode(this.isPortfolioDiversityRowVisible)) * 31) + this.quantity.hashCode()) * 31;
        CryptoDetailTransferActionState cryptoDetailTransferActionsComposable = this.transferActionState;
        int iHashCode2 = (((((((((((((((iHashCode + (cryptoDetailTransferActionsComposable == null ? 0 : cryptoDetailTransferActionsComposable.hashCode())) * 31) + Boolean.hashCode(this.isGrid)) * 31) + this.quantityRowState.hashCode()) * 31) + this.valueRowState.hashCode()) * 31) + this.averageCostRowState.hashCode()) * 31) + this.portfolioDiversityRowState.hashCode()) * 31) + this.todayReturnRowState.hashCode()) * 31) + this.totalReturnRowState.hashCode()) * 31;
        PositionBannerType positionBannerType = this.positionBannerType;
        return iHashCode2 + (positionBannerType != null ? positionBannerType.hashCode() : 0);
    }

    public String toString() {
        boolean z = this.areTopAndBottomBordersVisible;
        boolean z2 = this.areHoldingRowsVisible;
        boolean z3 = this.areDataRowDividersVisible;
        AnnotatedString annotatedString = this.equity;
        boolean z4 = this.isCryptoBalanceIconVisible;
        boolean z5 = this.isPortfolioDiversityRowVisible;
        AnnotatedString annotatedString2 = this.quantity;
        return "CryptoPositionState(areTopAndBottomBordersVisible=" + z + ", areHoldingRowsVisible=" + z2 + ", areDataRowDividersVisible=" + z3 + ", equity=" + ((Object) annotatedString) + ", isCryptoBalanceIconVisible=" + z4 + ", isPortfolioDiversityRowVisible=" + z5 + ", quantity=" + ((Object) annotatedString2) + ", transferActionState=" + this.transferActionState + ", isGrid=" + this.isGrid + ", quantityRowState=" + this.quantityRowState + ", valueRowState=" + this.valueRowState + ", averageCostRowState=" + this.averageCostRowState + ", portfolioDiversityRowState=" + this.portfolioDiversityRowState + ", todayReturnRowState=" + this.todayReturnRowState + ", totalReturnRowState=" + this.totalReturnRowState + ", positionBannerType=" + this.positionBannerType + ")";
    }

    public CryptoPositionState(boolean z, boolean z2, boolean z3, AnnotatedString equity, boolean z4, boolean z5, AnnotatedString quantity, CryptoDetailTransferActionState cryptoDetailTransferActionsComposable, boolean z6, CryptoPositionRowState quantityRowState, CryptoPositionRowState valueRowState, CryptoPositionRowState averageCostRowState, CryptoPositionRowState portfolioDiversityRowState, CryptoPositionRowState todayReturnRowState, CryptoPositionRowState totalReturnRowState, PositionBannerType positionBannerType) {
        Intrinsics.checkNotNullParameter(equity, "equity");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(quantityRowState, "quantityRowState");
        Intrinsics.checkNotNullParameter(valueRowState, "valueRowState");
        Intrinsics.checkNotNullParameter(averageCostRowState, "averageCostRowState");
        Intrinsics.checkNotNullParameter(portfolioDiversityRowState, "portfolioDiversityRowState");
        Intrinsics.checkNotNullParameter(todayReturnRowState, "todayReturnRowState");
        Intrinsics.checkNotNullParameter(totalReturnRowState, "totalReturnRowState");
        this.areTopAndBottomBordersVisible = z;
        this.areHoldingRowsVisible = z2;
        this.areDataRowDividersVisible = z3;
        this.equity = equity;
        this.isCryptoBalanceIconVisible = z4;
        this.isPortfolioDiversityRowVisible = z5;
        this.quantity = quantity;
        this.transferActionState = cryptoDetailTransferActionsComposable;
        this.isGrid = z6;
        this.quantityRowState = quantityRowState;
        this.valueRowState = valueRowState;
        this.averageCostRowState = averageCostRowState;
        this.portfolioDiversityRowState = portfolioDiversityRowState;
        this.todayReturnRowState = todayReturnRowState;
        this.totalReturnRowState = totalReturnRowState;
        this.positionBannerType = positionBannerType;
    }

    public final boolean getAreTopAndBottomBordersVisible() {
        return this.areTopAndBottomBordersVisible;
    }

    public final boolean getAreHoldingRowsVisible() {
        return this.areHoldingRowsVisible;
    }

    public final boolean getAreDataRowDividersVisible() {
        return this.areDataRowDividersVisible;
    }

    public final AnnotatedString getEquity() {
        return this.equity;
    }

    public final boolean isCryptoBalanceIconVisible() {
        return this.isCryptoBalanceIconVisible;
    }

    public final boolean isPortfolioDiversityRowVisible() {
        return this.isPortfolioDiversityRowVisible;
    }

    public final AnnotatedString getQuantity() {
        return this.quantity;
    }

    public final CryptoDetailTransferActionState getTransferActionState() {
        return this.transferActionState;
    }

    public final boolean isGrid() {
        return this.isGrid;
    }

    public final CryptoPositionRowState getQuantityRowState() {
        return this.quantityRowState;
    }

    public final CryptoPositionRowState getValueRowState() {
        return this.valueRowState;
    }

    public final CryptoPositionRowState getAverageCostRowState() {
        return this.averageCostRowState;
    }

    public final CryptoPositionRowState getPortfolioDiversityRowState() {
        return this.portfolioDiversityRowState;
    }

    public final CryptoPositionRowState getTodayReturnRowState() {
        return this.todayReturnRowState;
    }

    public final CryptoPositionRowState getTotalReturnRowState() {
        return this.totalReturnRowState;
    }

    public final PositionBannerType getPositionBannerType() {
        return this.positionBannerType;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoPositionState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionState$PositionBannerType;", "", "<init>", "(Ljava/lang/String;I)V", "UNAVAILABLE", "PENDING", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PositionBannerType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PositionBannerType[] $VALUES;
        public static final PositionBannerType UNAVAILABLE = new PositionBannerType("UNAVAILABLE", 0);
        public static final PositionBannerType PENDING = new PositionBannerType("PENDING", 1);

        private static final /* synthetic */ PositionBannerType[] $values() {
            return new PositionBannerType[]{UNAVAILABLE, PENDING};
        }

        public static EnumEntries<PositionBannerType> getEntries() {
            return $ENTRIES;
        }

        private PositionBannerType(String str, int i) {
        }

        static {
            PositionBannerType[] positionBannerTypeArr$values = $values();
            $VALUES = positionBannerTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(positionBannerTypeArr$values);
        }

        public static PositionBannerType valueOf(String str) {
            return (PositionBannerType) Enum.valueOf(PositionBannerType.class, str);
        }

        public static PositionBannerType[] values() {
            return (PositionBannerType[]) $VALUES.clone();
        }
    }
}
