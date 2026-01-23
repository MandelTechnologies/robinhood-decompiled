package com.robinhood.android.trade.options.profitloss;

import com.robinhood.models.api.ApiOptionsProfitLossChartRequestParams;
import com.robinhood.models.util.Money;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsProfitLossInfoBarViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\bHÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/UserEnteredProfitLossParams;", "", "legs", "", "Lcom/robinhood/models/api/ApiOptionsProfitLossChartRequestParams$Leg;", "limitPrice", "Lcom/robinhood/models/util/Money;", "quantity", "", "<init>", "(Ljava/util/List;Lcom/robinhood/models/util/Money;I)V", "getLegs", "()Ljava/util/List;", "getLimitPrice", "()Lcom/robinhood/models/util/Money;", "getQuantity", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class UserEnteredProfitLossParams {
    private final List<ApiOptionsProfitLossChartRequestParams.Leg> legs;
    private final Money limitPrice;
    private final int quantity;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserEnteredProfitLossParams copy$default(UserEnteredProfitLossParams userEnteredProfitLossParams, List list, Money money, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = userEnteredProfitLossParams.legs;
        }
        if ((i2 & 2) != 0) {
            money = userEnteredProfitLossParams.limitPrice;
        }
        if ((i2 & 4) != 0) {
            i = userEnteredProfitLossParams.quantity;
        }
        return userEnteredProfitLossParams.copy(list, money, i);
    }

    public final List<ApiOptionsProfitLossChartRequestParams.Leg> component1() {
        return this.legs;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getLimitPrice() {
        return this.limitPrice;
    }

    /* renamed from: component3, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    public final UserEnteredProfitLossParams copy(List<ApiOptionsProfitLossChartRequestParams.Leg> legs, Money limitPrice, int quantity) {
        Intrinsics.checkNotNullParameter(legs, "legs");
        return new UserEnteredProfitLossParams(legs, limitPrice, quantity);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserEnteredProfitLossParams)) {
            return false;
        }
        UserEnteredProfitLossParams userEnteredProfitLossParams = (UserEnteredProfitLossParams) other;
        return Intrinsics.areEqual(this.legs, userEnteredProfitLossParams.legs) && Intrinsics.areEqual(this.limitPrice, userEnteredProfitLossParams.limitPrice) && this.quantity == userEnteredProfitLossParams.quantity;
    }

    public int hashCode() {
        int iHashCode = this.legs.hashCode() * 31;
        Money money = this.limitPrice;
        return ((iHashCode + (money == null ? 0 : money.hashCode())) * 31) + Integer.hashCode(this.quantity);
    }

    public String toString() {
        return "UserEnteredProfitLossParams(legs=" + this.legs + ", limitPrice=" + this.limitPrice + ", quantity=" + this.quantity + ")";
    }

    public UserEnteredProfitLossParams(List<ApiOptionsProfitLossChartRequestParams.Leg> legs, Money money, int i) {
        Intrinsics.checkNotNullParameter(legs, "legs");
        this.legs = legs;
        this.limitPrice = money;
        this.quantity = i;
    }

    public final List<ApiOptionsProfitLossChartRequestParams.Leg> getLegs() {
        return this.legs;
    }

    public final Money getLimitPrice() {
        return this.limitPrice;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    /* compiled from: OptionsProfitLossInfoBarViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/UserEnteredProfitLossParams$Companion;", "", "<init>", "()V", "userEnteredParams", "Lcom/robinhood/android/trade/options/profitloss/UserEnteredProfitLossParams;", "Lcom/robinhood/models/api/ApiOptionsProfitLossChartRequestParams;", "getUserEnteredParams", "(Lcom/robinhood/models/api/ApiOptionsProfitLossChartRequestParams;)Lcom/robinhood/android/trade/options/profitloss/UserEnteredProfitLossParams;", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final UserEnteredProfitLossParams getUserEnteredParams(ApiOptionsProfitLossChartRequestParams apiOptionsProfitLossChartRequestParams) {
            Intrinsics.checkNotNullParameter(apiOptionsProfitLossChartRequestParams, "<this>");
            return new UserEnteredProfitLossParams(apiOptionsProfitLossChartRequestParams.getLegs(), apiOptionsProfitLossChartRequestParams.getLimitPrice(), apiOptionsProfitLossChartRequestParams.getQuantity());
        }
    }
}
