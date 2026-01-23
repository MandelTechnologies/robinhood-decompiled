package com.robinhood.android.pricealerts.libpricealertsbanner;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.advanced.alert.p302db.AlertHubSettingItem;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PriceAlertsBannerViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/pricealerts/libpricealertsbanner/PriceAlertsBannerViewState;", "", "<init>", "()V", "None", "BreakingNewsActive", "PriceAlert", "Lcom/robinhood/android/pricealerts/libpricealertsbanner/PriceAlertsBannerViewState$BreakingNewsActive;", "Lcom/robinhood/android/pricealerts/libpricealertsbanner/PriceAlertsBannerViewState$None;", "Lcom/robinhood/android/pricealerts/libpricealertsbanner/PriceAlertsBannerViewState$PriceAlert;", "lib-price-alerts-banner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public abstract class PriceAlertsBannerViewState {
    public static final int $stable = 0;

    public /* synthetic */ PriceAlertsBannerViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: PriceAlertsBannerViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/pricealerts/libpricealertsbanner/PriceAlertsBannerViewState$None;", "Lcom/robinhood/android/pricealerts/libpricealertsbanner/PriceAlertsBannerViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-price-alerts-banner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class None extends PriceAlertsBannerViewState {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();

        public boolean equals(Object other) {
            return this == other || (other instanceof None);
        }

        public int hashCode() {
            return 407409025;
        }

        public String toString() {
            return "None";
        }

        private None() {
            super(null);
        }
    }

    private PriceAlertsBannerViewState() {
    }

    /* compiled from: PriceAlertsBannerViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/pricealerts/libpricealertsbanner/PriceAlertsBannerViewState$BreakingNewsActive;", "Lcom/robinhood/android/pricealerts/libpricealertsbanner/PriceAlertsBannerViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-price-alerts-banner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class BreakingNewsActive extends PriceAlertsBannerViewState {
        public static final int $stable = 0;
        public static final BreakingNewsActive INSTANCE = new BreakingNewsActive();

        public boolean equals(Object other) {
            return this == other || (other instanceof BreakingNewsActive);
        }

        public int hashCode() {
            return -814286555;
        }

        public String toString() {
            return "BreakingNewsActive";
        }

        private BreakingNewsActive() {
            super(null);
        }
    }

    /* compiled from: PriceAlertsBannerViewState.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/pricealerts/libpricealertsbanner/PriceAlertsBannerViewState$PriceAlert;", "Lcom/robinhood/android/pricealerts/libpricealertsbanner/PriceAlertsBannerViewState;", "symbol", "", "priceAlert", "Lcom/robinhood/models/advanced/alert/db/AlertHubSettingItem;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/advanced/alert/db/AlertHubSettingItem;)V", "getSymbol", "()Ljava/lang/String;", "getPriceAlert", "()Lcom/robinhood/models/advanced/alert/db/AlertHubSettingItem;", "isUp", "", "()Z", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "Lcom/robinhood/models/util/Money;", "getPrice", "()Lcom/robinhood/models/util/Money;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "lib-price-alerts-banner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PriceAlert extends PriceAlertsBannerViewState {
        public static final int $stable = 8;
        private final boolean isUp;
        private final Money price;
        private final AlertHubSettingItem priceAlert;
        private final String symbol;

        public static /* synthetic */ PriceAlert copy$default(PriceAlert priceAlert, String str, AlertHubSettingItem alertHubSettingItem, int i, Object obj) {
            if ((i & 1) != 0) {
                str = priceAlert.symbol;
            }
            if ((i & 2) != 0) {
                alertHubSettingItem = priceAlert.priceAlert;
            }
            return priceAlert.copy(str, alertHubSettingItem);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component2, reason: from getter */
        public final AlertHubSettingItem getPriceAlert() {
            return this.priceAlert;
        }

        public final PriceAlert copy(String symbol, AlertHubSettingItem priceAlert) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(priceAlert, "priceAlert");
            return new PriceAlert(symbol, priceAlert);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceAlert)) {
                return false;
            }
            PriceAlert priceAlert = (PriceAlert) other;
            return Intrinsics.areEqual(this.symbol, priceAlert.symbol) && Intrinsics.areEqual(this.priceAlert, priceAlert.priceAlert);
        }

        public int hashCode() {
            return (this.symbol.hashCode() * 31) + this.priceAlert.hashCode();
        }

        public String toString() {
            return "PriceAlert(symbol=" + this.symbol + ", priceAlert=" + this.priceAlert + ")";
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final AlertHubSettingItem getPriceAlert() {
            return this.priceAlert;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PriceAlert(String symbol, AlertHubSettingItem priceAlert) {
            Money money$default;
            super(null);
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(priceAlert, "priceAlert");
            this.symbol = symbol;
            this.priceAlert = priceAlert;
            this.isUp = priceAlert instanceof AlertHubSettingItem.PriceAbove;
            BigDecimal price = priceAlert.getPrice();
            if (price == null || (money$default = Money3.toMoney$default(price, null, 1, null)) == null) {
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                money$default = Money3.toMoney$default(bigDecimalValueOf, null, 1, null);
            }
            this.price = money$default;
        }

        /* renamed from: isUp, reason: from getter */
        public final boolean getIsUp() {
            return this.isUp;
        }

        public final Money getPrice() {
            return this.price;
        }
    }
}
