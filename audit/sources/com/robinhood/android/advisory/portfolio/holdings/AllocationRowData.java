package com.robinhood.android.advisory.portfolio.holdings;

import com.robinhood.models.advisory.p304db.portfolio.AssetClass5;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HoldingsDrillDownViewState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003J\t\u0010%\u001a\u00020\u000eHÆ\u0003JY\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010'\u001a\u00020\u000e2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/holdings/AllocationRowData;", "", "instrumentId", "Ljava/util/UUID;", "symbol", "", "name", "percentage", "Ljava/math/BigDecimal;", "percentageString", "amount", "subAssetClassCategory", "Lcom/robinhood/models/advisory/db/portfolio/SubAssetClassCategory;", "clickable", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/advisory/db/portfolio/SubAssetClassCategory;Z)V", "getInstrumentId", "()Ljava/util/UUID;", "getSymbol", "()Ljava/lang/String;", "getName", "getPercentage", "()Ljava/math/BigDecimal;", "getPercentageString", "getAmount", "getSubAssetClassCategory", "()Lcom/robinhood/models/advisory/db/portfolio/SubAssetClassCategory;", "getClickable", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AllocationRowData {
    public static final int $stable = 8;
    private final String amount;
    private final boolean clickable;
    private final UUID instrumentId;
    private final String name;
    private final BigDecimal percentage;
    private final String percentageString;
    private final AssetClass5 subAssetClassCategory;
    private final String symbol;

    public static /* synthetic */ AllocationRowData copy$default(AllocationRowData allocationRowData, UUID uuid, String str, String str2, BigDecimal bigDecimal, String str3, String str4, AssetClass5 assetClass5, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = allocationRowData.instrumentId;
        }
        if ((i & 2) != 0) {
            str = allocationRowData.symbol;
        }
        if ((i & 4) != 0) {
            str2 = allocationRowData.name;
        }
        if ((i & 8) != 0) {
            bigDecimal = allocationRowData.percentage;
        }
        if ((i & 16) != 0) {
            str3 = allocationRowData.percentageString;
        }
        if ((i & 32) != 0) {
            str4 = allocationRowData.amount;
        }
        if ((i & 64) != 0) {
            assetClass5 = allocationRowData.subAssetClassCategory;
        }
        if ((i & 128) != 0) {
            z = allocationRowData.clickable;
        }
        AssetClass5 assetClass52 = assetClass5;
        boolean z2 = z;
        String str5 = str3;
        String str6 = str4;
        return allocationRowData.copy(uuid, str, str2, bigDecimal, str5, str6, assetClass52, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final BigDecimal getPercentage() {
        return this.percentage;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPercentageString() {
        return this.percentageString;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    /* renamed from: component7, reason: from getter */
    public final AssetClass5 getSubAssetClassCategory() {
        return this.subAssetClassCategory;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getClickable() {
        return this.clickable;
    }

    public final AllocationRowData copy(UUID instrumentId, String symbol, String name, BigDecimal percentage, String percentageString, String amount, AssetClass5 subAssetClassCategory, boolean clickable) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(percentage, "percentage");
        Intrinsics.checkNotNullParameter(percentageString, "percentageString");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(subAssetClassCategory, "subAssetClassCategory");
        return new AllocationRowData(instrumentId, symbol, name, percentage, percentageString, amount, subAssetClassCategory, clickable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AllocationRowData)) {
            return false;
        }
        AllocationRowData allocationRowData = (AllocationRowData) other;
        return Intrinsics.areEqual(this.instrumentId, allocationRowData.instrumentId) && Intrinsics.areEqual(this.symbol, allocationRowData.symbol) && Intrinsics.areEqual(this.name, allocationRowData.name) && Intrinsics.areEqual(this.percentage, allocationRowData.percentage) && Intrinsics.areEqual(this.percentageString, allocationRowData.percentageString) && Intrinsics.areEqual(this.amount, allocationRowData.amount) && this.subAssetClassCategory == allocationRowData.subAssetClassCategory && this.clickable == allocationRowData.clickable;
    }

    public int hashCode() {
        return (((((((((((((this.instrumentId.hashCode() * 31) + this.symbol.hashCode()) * 31) + this.name.hashCode()) * 31) + this.percentage.hashCode()) * 31) + this.percentageString.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.subAssetClassCategory.hashCode()) * 31) + Boolean.hashCode(this.clickable);
    }

    public String toString() {
        return "AllocationRowData(instrumentId=" + this.instrumentId + ", symbol=" + this.symbol + ", name=" + this.name + ", percentage=" + this.percentage + ", percentageString=" + this.percentageString + ", amount=" + this.amount + ", subAssetClassCategory=" + this.subAssetClassCategory + ", clickable=" + this.clickable + ")";
    }

    public AllocationRowData(UUID instrumentId, String symbol, String name, BigDecimal percentage, String percentageString, String amount, AssetClass5 subAssetClassCategory, boolean z) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(percentage, "percentage");
        Intrinsics.checkNotNullParameter(percentageString, "percentageString");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(subAssetClassCategory, "subAssetClassCategory");
        this.instrumentId = instrumentId;
        this.symbol = symbol;
        this.name = name;
        this.percentage = percentage;
        this.percentageString = percentageString;
        this.amount = amount;
        this.subAssetClassCategory = subAssetClassCategory;
        this.clickable = z;
    }

    public /* synthetic */ AllocationRowData(UUID uuid, String str, String str2, BigDecimal bigDecimal, String str3, String str4, AssetClass5 assetClass5, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, str, str2, bigDecimal, str3, str4, assetClass5, (i & 128) != 0 ? true : z);
    }

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getName() {
        return this.name;
    }

    public final BigDecimal getPercentage() {
        return this.percentage;
    }

    public final String getPercentageString() {
        return this.percentageString;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final AssetClass5 getSubAssetClassCategory() {
        return this.subAssetClassCategory;
    }

    public final boolean getClickable() {
        return this.clickable;
    }
}
