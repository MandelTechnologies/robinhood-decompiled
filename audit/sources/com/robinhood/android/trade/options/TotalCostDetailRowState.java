package com.robinhood.android.trade.options;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOrderTotalCostRowComposeView.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/trade/options/TotalCostDetailRowState;", "", "multiplierText", "", "regulatoryFeeText", "contractFeeText", "salesTaxesText", "", "goldFeeSavingsText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getMultiplierText", "()Ljava/lang/String;", "getRegulatoryFeeText", "getContractFeeText", "getSalesTaxesText", "()Ljava/util/List;", "getGoldFeeSavingsText", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TotalCostDetailRowState {
    public static final int $stable = 8;
    private final String contractFeeText;
    private final String goldFeeSavingsText;
    private final String multiplierText;
    private final String regulatoryFeeText;
    private final List<String> salesTaxesText;

    public static /* synthetic */ TotalCostDetailRowState copy$default(TotalCostDetailRowState totalCostDetailRowState, String str, String str2, String str3, List list, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = totalCostDetailRowState.multiplierText;
        }
        if ((i & 2) != 0) {
            str2 = totalCostDetailRowState.regulatoryFeeText;
        }
        if ((i & 4) != 0) {
            str3 = totalCostDetailRowState.contractFeeText;
        }
        if ((i & 8) != 0) {
            list = totalCostDetailRowState.salesTaxesText;
        }
        if ((i & 16) != 0) {
            str4 = totalCostDetailRowState.goldFeeSavingsText;
        }
        String str5 = str4;
        String str6 = str3;
        return totalCostDetailRowState.copy(str, str2, str6, list, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMultiplierText() {
        return this.multiplierText;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRegulatoryFeeText() {
        return this.regulatoryFeeText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getContractFeeText() {
        return this.contractFeeText;
    }

    public final List<String> component4() {
        return this.salesTaxesText;
    }

    /* renamed from: component5, reason: from getter */
    public final String getGoldFeeSavingsText() {
        return this.goldFeeSavingsText;
    }

    public final TotalCostDetailRowState copy(String multiplierText, String regulatoryFeeText, String contractFeeText, List<String> salesTaxesText, String goldFeeSavingsText) {
        Intrinsics.checkNotNullParameter(multiplierText, "multiplierText");
        Intrinsics.checkNotNullParameter(regulatoryFeeText, "regulatoryFeeText");
        Intrinsics.checkNotNullParameter(salesTaxesText, "salesTaxesText");
        return new TotalCostDetailRowState(multiplierText, regulatoryFeeText, contractFeeText, salesTaxesText, goldFeeSavingsText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TotalCostDetailRowState)) {
            return false;
        }
        TotalCostDetailRowState totalCostDetailRowState = (TotalCostDetailRowState) other;
        return Intrinsics.areEqual(this.multiplierText, totalCostDetailRowState.multiplierText) && Intrinsics.areEqual(this.regulatoryFeeText, totalCostDetailRowState.regulatoryFeeText) && Intrinsics.areEqual(this.contractFeeText, totalCostDetailRowState.contractFeeText) && Intrinsics.areEqual(this.salesTaxesText, totalCostDetailRowState.salesTaxesText) && Intrinsics.areEqual(this.goldFeeSavingsText, totalCostDetailRowState.goldFeeSavingsText);
    }

    public int hashCode() {
        int iHashCode = ((this.multiplierText.hashCode() * 31) + this.regulatoryFeeText.hashCode()) * 31;
        String str = this.contractFeeText;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.salesTaxesText.hashCode()) * 31;
        String str2 = this.goldFeeSavingsText;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "TotalCostDetailRowState(multiplierText=" + this.multiplierText + ", regulatoryFeeText=" + this.regulatoryFeeText + ", contractFeeText=" + this.contractFeeText + ", salesTaxesText=" + this.salesTaxesText + ", goldFeeSavingsText=" + this.goldFeeSavingsText + ")";
    }

    public TotalCostDetailRowState(String multiplierText, String regulatoryFeeText, String str, List<String> salesTaxesText, String str2) {
        Intrinsics.checkNotNullParameter(multiplierText, "multiplierText");
        Intrinsics.checkNotNullParameter(regulatoryFeeText, "regulatoryFeeText");
        Intrinsics.checkNotNullParameter(salesTaxesText, "salesTaxesText");
        this.multiplierText = multiplierText;
        this.regulatoryFeeText = regulatoryFeeText;
        this.contractFeeText = str;
        this.salesTaxesText = salesTaxesText;
        this.goldFeeSavingsText = str2;
    }

    public final String getMultiplierText() {
        return this.multiplierText;
    }

    public final String getRegulatoryFeeText() {
        return this.regulatoryFeeText;
    }

    public final String getContractFeeText() {
        return this.contractFeeText;
    }

    public final List<String> getSalesTaxesText() {
        return this.salesTaxesText;
    }

    public final String getGoldFeeSavingsText() {
        return this.goldFeeSavingsText;
    }
}
