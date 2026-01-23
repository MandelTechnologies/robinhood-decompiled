package com.robinhood.android.advisory.dashboard.portfolio.holdings;

import com.robinhood.models.advisory.p304db.portfolio.AssetClass3;
import com.robinhood.models.util.Money;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PortfolioHoldingsViewState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JG\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/portfolio/holdings/HoldingRowData;", "", "name", "", "secondaryText", "assetClassRegion", "Lcom/robinhood/models/advisory/db/portfolio/AssetClassRegion;", "amount", "Lcom/robinhood/models/util/Money;", "percentage", "Ljava/math/BigDecimal;", "percentageString", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/advisory/db/portfolio/AssetClassRegion;Lcom/robinhood/models/util/Money;Ljava/math/BigDecimal;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getSecondaryText", "getAssetClassRegion", "()Lcom/robinhood/models/advisory/db/portfolio/AssetClassRegion;", "getAmount", "()Lcom/robinhood/models/util/Money;", "getPercentage", "()Ljava/math/BigDecimal;", "getPercentageString", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class HoldingRowData {
    public static final int $stable = 8;
    private final Money amount;
    private final AssetClass3 assetClassRegion;
    private final String name;
    private final BigDecimal percentage;
    private final String percentageString;
    private final String secondaryText;

    public static /* synthetic */ HoldingRowData copy$default(HoldingRowData holdingRowData, String str, String str2, AssetClass3 assetClass3, Money money, BigDecimal bigDecimal, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = holdingRowData.name;
        }
        if ((i & 2) != 0) {
            str2 = holdingRowData.secondaryText;
        }
        if ((i & 4) != 0) {
            assetClass3 = holdingRowData.assetClassRegion;
        }
        if ((i & 8) != 0) {
            money = holdingRowData.amount;
        }
        if ((i & 16) != 0) {
            bigDecimal = holdingRowData.percentage;
        }
        if ((i & 32) != 0) {
            str3 = holdingRowData.percentageString;
        }
        BigDecimal bigDecimal2 = bigDecimal;
        String str4 = str3;
        return holdingRowData.copy(str, str2, assetClass3, money, bigDecimal2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSecondaryText() {
        return this.secondaryText;
    }

    /* renamed from: component3, reason: from getter */
    public final AssetClass3 getAssetClassRegion() {
        return this.assetClassRegion;
    }

    /* renamed from: component4, reason: from getter */
    public final Money getAmount() {
        return this.amount;
    }

    /* renamed from: component5, reason: from getter */
    public final BigDecimal getPercentage() {
        return this.percentage;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPercentageString() {
        return this.percentageString;
    }

    public final HoldingRowData copy(String name, String secondaryText, AssetClass3 assetClassRegion, Money amount, BigDecimal percentage, String percentageString) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(assetClassRegion, "assetClassRegion");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(percentage, "percentage");
        Intrinsics.checkNotNullParameter(percentageString, "percentageString");
        return new HoldingRowData(name, secondaryText, assetClassRegion, amount, percentage, percentageString);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HoldingRowData)) {
            return false;
        }
        HoldingRowData holdingRowData = (HoldingRowData) other;
        return Intrinsics.areEqual(this.name, holdingRowData.name) && Intrinsics.areEqual(this.secondaryText, holdingRowData.secondaryText) && this.assetClassRegion == holdingRowData.assetClassRegion && Intrinsics.areEqual(this.amount, holdingRowData.amount) && Intrinsics.areEqual(this.percentage, holdingRowData.percentage) && Intrinsics.areEqual(this.percentageString, holdingRowData.percentageString);
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.secondaryText;
        return ((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.assetClassRegion.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.percentage.hashCode()) * 31) + this.percentageString.hashCode();
    }

    public String toString() {
        return "HoldingRowData(name=" + this.name + ", secondaryText=" + this.secondaryText + ", assetClassRegion=" + this.assetClassRegion + ", amount=" + this.amount + ", percentage=" + this.percentage + ", percentageString=" + this.percentageString + ")";
    }

    public HoldingRowData(String name, String str, AssetClass3 assetClassRegion, Money amount, BigDecimal percentage, String percentageString) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(assetClassRegion, "assetClassRegion");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(percentage, "percentage");
        Intrinsics.checkNotNullParameter(percentageString, "percentageString");
        this.name = name;
        this.secondaryText = str;
        this.assetClassRegion = assetClassRegion;
        this.amount = amount;
        this.percentage = percentage;
        this.percentageString = percentageString;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSecondaryText() {
        return this.secondaryText;
    }

    public final AssetClass3 getAssetClassRegion() {
        return this.assetClassRegion;
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final BigDecimal getPercentage() {
        return this.percentage;
    }

    public final String getPercentageString() {
        return this.percentageString;
    }
}
