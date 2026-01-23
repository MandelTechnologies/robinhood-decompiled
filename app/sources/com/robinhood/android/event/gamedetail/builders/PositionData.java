package com.robinhood.android.event.gamedetail.builders;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BuildGameDetailPositions.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J_\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/builders/PositionData;", "", "side", "", "quantityAbs", "Ljava/math/BigDecimal;", "avgTradePrice", "openPnl", "totalCost", "totalPotentialValue", "contractTitleName", "contractSubtitleName", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;)V", "getSide", "()Ljava/lang/String;", "getQuantityAbs", "()Ljava/math/BigDecimal;", "getAvgTradePrice", "getOpenPnl", "getTotalCost", "getTotalPotentialValue", "getContractTitleName", "getContractSubtitleName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PositionData {
    public static final int $stable = 8;
    private final BigDecimal avgTradePrice;
    private final String contractSubtitleName;
    private final String contractTitleName;
    private final BigDecimal openPnl;
    private final BigDecimal quantityAbs;
    private final String side;
    private final BigDecimal totalCost;
    private final BigDecimal totalPotentialValue;

    public static /* synthetic */ PositionData copy$default(PositionData positionData, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = positionData.side;
        }
        if ((i & 2) != 0) {
            bigDecimal = positionData.quantityAbs;
        }
        if ((i & 4) != 0) {
            bigDecimal2 = positionData.avgTradePrice;
        }
        if ((i & 8) != 0) {
            bigDecimal3 = positionData.openPnl;
        }
        if ((i & 16) != 0) {
            bigDecimal4 = positionData.totalCost;
        }
        if ((i & 32) != 0) {
            bigDecimal5 = positionData.totalPotentialValue;
        }
        if ((i & 64) != 0) {
            str2 = positionData.contractTitleName;
        }
        if ((i & 128) != 0) {
            str3 = positionData.contractSubtitleName;
        }
        String str4 = str2;
        String str5 = str3;
        BigDecimal bigDecimal6 = bigDecimal4;
        BigDecimal bigDecimal7 = bigDecimal5;
        return positionData.copy(str, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal6, bigDecimal7, str4, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getQuantityAbs() {
        return this.quantityAbs;
    }

    /* renamed from: component3, reason: from getter */
    public final BigDecimal getAvgTradePrice() {
        return this.avgTradePrice;
    }

    /* renamed from: component4, reason: from getter */
    public final BigDecimal getOpenPnl() {
        return this.openPnl;
    }

    /* renamed from: component5, reason: from getter */
    public final BigDecimal getTotalCost() {
        return this.totalCost;
    }

    /* renamed from: component6, reason: from getter */
    public final BigDecimal getTotalPotentialValue() {
        return this.totalPotentialValue;
    }

    /* renamed from: component7, reason: from getter */
    public final String getContractTitleName() {
        return this.contractTitleName;
    }

    /* renamed from: component8, reason: from getter */
    public final String getContractSubtitleName() {
        return this.contractSubtitleName;
    }

    public final PositionData copy(String side, BigDecimal quantityAbs, BigDecimal avgTradePrice, BigDecimal openPnl, BigDecimal totalCost, BigDecimal totalPotentialValue, String contractTitleName, String contractSubtitleName) {
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(quantityAbs, "quantityAbs");
        Intrinsics.checkNotNullParameter(avgTradePrice, "avgTradePrice");
        Intrinsics.checkNotNullParameter(totalCost, "totalCost");
        Intrinsics.checkNotNullParameter(totalPotentialValue, "totalPotentialValue");
        return new PositionData(side, quantityAbs, avgTradePrice, openPnl, totalCost, totalPotentialValue, contractTitleName, contractSubtitleName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PositionData)) {
            return false;
        }
        PositionData positionData = (PositionData) other;
        return Intrinsics.areEqual(this.side, positionData.side) && Intrinsics.areEqual(this.quantityAbs, positionData.quantityAbs) && Intrinsics.areEqual(this.avgTradePrice, positionData.avgTradePrice) && Intrinsics.areEqual(this.openPnl, positionData.openPnl) && Intrinsics.areEqual(this.totalCost, positionData.totalCost) && Intrinsics.areEqual(this.totalPotentialValue, positionData.totalPotentialValue) && Intrinsics.areEqual(this.contractTitleName, positionData.contractTitleName) && Intrinsics.areEqual(this.contractSubtitleName, positionData.contractSubtitleName);
    }

    public int hashCode() {
        int iHashCode = ((((this.side.hashCode() * 31) + this.quantityAbs.hashCode()) * 31) + this.avgTradePrice.hashCode()) * 31;
        BigDecimal bigDecimal = this.openPnl;
        int iHashCode2 = (((((iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + this.totalCost.hashCode()) * 31) + this.totalPotentialValue.hashCode()) * 31;
        String str = this.contractTitleName;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.contractSubtitleName;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "PositionData(side=" + this.side + ", quantityAbs=" + this.quantityAbs + ", avgTradePrice=" + this.avgTradePrice + ", openPnl=" + this.openPnl + ", totalCost=" + this.totalCost + ", totalPotentialValue=" + this.totalPotentialValue + ", contractTitleName=" + this.contractTitleName + ", contractSubtitleName=" + this.contractSubtitleName + ")";
    }

    public PositionData(String side, BigDecimal quantityAbs, BigDecimal avgTradePrice, BigDecimal bigDecimal, BigDecimal totalCost, BigDecimal totalPotentialValue, String str, String str2) {
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(quantityAbs, "quantityAbs");
        Intrinsics.checkNotNullParameter(avgTradePrice, "avgTradePrice");
        Intrinsics.checkNotNullParameter(totalCost, "totalCost");
        Intrinsics.checkNotNullParameter(totalPotentialValue, "totalPotentialValue");
        this.side = side;
        this.quantityAbs = quantityAbs;
        this.avgTradePrice = avgTradePrice;
        this.openPnl = bigDecimal;
        this.totalCost = totalCost;
        this.totalPotentialValue = totalPotentialValue;
        this.contractTitleName = str;
        this.contractSubtitleName = str2;
    }

    public final String getSide() {
        return this.side;
    }

    public final BigDecimal getQuantityAbs() {
        return this.quantityAbs;
    }

    public final BigDecimal getAvgTradePrice() {
        return this.avgTradePrice;
    }

    public final BigDecimal getOpenPnl() {
        return this.openPnl;
    }

    public final BigDecimal getTotalCost() {
        return this.totalCost;
    }

    public final BigDecimal getTotalPotentialValue() {
        return this.totalPotentialValue;
    }

    public final String getContractTitleName() {
        return this.contractTitleName;
    }

    public final String getContractSubtitleName() {
        return this.contractSubtitleName;
    }
}
