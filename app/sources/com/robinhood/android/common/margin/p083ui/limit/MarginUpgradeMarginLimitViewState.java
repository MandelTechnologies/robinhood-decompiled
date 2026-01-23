package com.robinhood.android.common.margin.p083ui.limit;

import com.robinhood.android.lib.margin.api.ApiMarginInvestingInfo;
import com.robinhood.models.util.Money;
import com.robinhood.udf.UiEvent;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginUpgradeMarginLimitViewState.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J;\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010!\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/limit/MarginUpgradeMarginLimitViewState;", "", "marginInvestingInfo", "Lcom/robinhood/android/lib/margin/api/ApiMarginInvestingInfo;", "userSetMarginLimit", "Lcom/robinhood/models/util/Money;", "error", "Lcom/robinhood/udf/UiEvent;", "", "isInSlipRegionGate", "", "<init>", "(Lcom/robinhood/android/lib/margin/api/ApiMarginInvestingInfo;Lcom/robinhood/models/util/Money;Lcom/robinhood/udf/UiEvent;Z)V", "getMarginInvestingInfo", "()Lcom/robinhood/android/lib/margin/api/ApiMarginInvestingInfo;", "getUserSetMarginLimit", "()Lcom/robinhood/models/util/Money;", "getError", "()Lcom/robinhood/udf/UiEvent;", "()Z", "marginAvailable", "Ljava/math/BigDecimal;", "getMarginAvailable", "()Ljava/math/BigDecimal;", "marginBuyingPower", "getMarginBuyingPower", "totalBuyingPower", "getTotalBuyingPower", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MarginUpgradeMarginLimitViewState {
    public static final int $stable = 8;
    private final UiEvent<Throwable> error;
    private final boolean isInSlipRegionGate;
    private final ApiMarginInvestingInfo marginInvestingInfo;
    private final Money userSetMarginLimit;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarginUpgradeMarginLimitViewState copy$default(MarginUpgradeMarginLimitViewState marginUpgradeMarginLimitViewState, ApiMarginInvestingInfo apiMarginInvestingInfo, Money money, UiEvent uiEvent, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            apiMarginInvestingInfo = marginUpgradeMarginLimitViewState.marginInvestingInfo;
        }
        if ((i & 2) != 0) {
            money = marginUpgradeMarginLimitViewState.userSetMarginLimit;
        }
        if ((i & 4) != 0) {
            uiEvent = marginUpgradeMarginLimitViewState.error;
        }
        if ((i & 8) != 0) {
            z = marginUpgradeMarginLimitViewState.isInSlipRegionGate;
        }
        return marginUpgradeMarginLimitViewState.copy(apiMarginInvestingInfo, money, uiEvent, z);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiMarginInvestingInfo getMarginInvestingInfo() {
        return this.marginInvestingInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getUserSetMarginLimit() {
        return this.userSetMarginLimit;
    }

    public final UiEvent<Throwable> component3() {
        return this.error;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsInSlipRegionGate() {
        return this.isInSlipRegionGate;
    }

    public final MarginUpgradeMarginLimitViewState copy(ApiMarginInvestingInfo marginInvestingInfo, Money userSetMarginLimit, UiEvent<Throwable> error, boolean isInSlipRegionGate) {
        Intrinsics.checkNotNullParameter(marginInvestingInfo, "marginInvestingInfo");
        return new MarginUpgradeMarginLimitViewState(marginInvestingInfo, userSetMarginLimit, error, isInSlipRegionGate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginUpgradeMarginLimitViewState)) {
            return false;
        }
        MarginUpgradeMarginLimitViewState marginUpgradeMarginLimitViewState = (MarginUpgradeMarginLimitViewState) other;
        return Intrinsics.areEqual(this.marginInvestingInfo, marginUpgradeMarginLimitViewState.marginInvestingInfo) && Intrinsics.areEqual(this.userSetMarginLimit, marginUpgradeMarginLimitViewState.userSetMarginLimit) && Intrinsics.areEqual(this.error, marginUpgradeMarginLimitViewState.error) && this.isInSlipRegionGate == marginUpgradeMarginLimitViewState.isInSlipRegionGate;
    }

    public int hashCode() {
        int iHashCode = this.marginInvestingInfo.hashCode() * 31;
        Money money = this.userSetMarginLimit;
        int iHashCode2 = (iHashCode + (money == null ? 0 : money.hashCode())) * 31;
        UiEvent<Throwable> uiEvent = this.error;
        return ((iHashCode2 + (uiEvent != null ? uiEvent.hashCode() : 0)) * 31) + Boolean.hashCode(this.isInSlipRegionGate);
    }

    public String toString() {
        return "MarginUpgradeMarginLimitViewState(marginInvestingInfo=" + this.marginInvestingInfo + ", userSetMarginLimit=" + this.userSetMarginLimit + ", error=" + this.error + ", isInSlipRegionGate=" + this.isInSlipRegionGate + ")";
    }

    public MarginUpgradeMarginLimitViewState(ApiMarginInvestingInfo marginInvestingInfo, Money money, UiEvent<Throwable> uiEvent, boolean z) {
        Intrinsics.checkNotNullParameter(marginInvestingInfo, "marginInvestingInfo");
        this.marginInvestingInfo = marginInvestingInfo;
        this.userSetMarginLimit = money;
        this.error = uiEvent;
        this.isInSlipRegionGate = z;
    }

    public /* synthetic */ MarginUpgradeMarginLimitViewState(ApiMarginInvestingInfo apiMarginInvestingInfo, Money money, UiEvent uiEvent, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(apiMarginInvestingInfo, (i & 2) != 0 ? null : money, (i & 4) != 0 ? null : uiEvent, (i & 8) != 0 ? false : z);
    }

    public final ApiMarginInvestingInfo getMarginInvestingInfo() {
        return this.marginInvestingInfo;
    }

    public final Money getUserSetMarginLimit() {
        return this.userSetMarginLimit;
    }

    public final UiEvent<Throwable> getError() {
        return this.error;
    }

    public final boolean isInSlipRegionGate() {
        return this.isInSlipRegionGate;
    }

    private final BigDecimal getMarginAvailable() {
        return this.marginInvestingInfo.getMarginAvailable().getDecimalValue();
    }

    public final BigDecimal getMarginBuyingPower() {
        BigDecimal decimalValue;
        BigDecimal marginAvailable = getMarginAvailable();
        Money money = this.userSetMarginLimit;
        if (money == null || (decimalValue = money.getDecimalValue()) == null) {
            decimalValue = marginAvailable;
        }
        BigDecimal bigDecimalMin = decimalValue.min(marginAvailable);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMin, "min(...)");
        return bigDecimalMin;
    }

    public final BigDecimal getTotalBuyingPower() {
        BigDecimal bigDecimalAdd = this.marginInvestingInfo.getBuyingPowerWithMargin().minus(this.marginInvestingInfo.getMarginAvailable()).getDecimalValue().add(getMarginBuyingPower());
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        return bigDecimalAdd;
    }
}
