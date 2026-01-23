package com.robinhood.android.history.p153ui.transfer;

import android.text.SpannedString;
import com.robinhood.models.util.Money;
import com.robinhood.transfers.gold.GoldDepositBoostTransferDetail;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RfpInstantTransferNonReadyPendingPage.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000fHÆ\u0003Js\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/history/ui/transfer/RfpInstantTransferNonReadyPendingPageData;", "", "amountText", "", "subHeadingText", "statusText", "fromText", "toText", "initiatedText", "lastUpdatedText", "requestedAmount", "Lcom/robinhood/models/util/Money;", "disclosureText", "Landroid/text/SpannedString;", "goldDepositBoost", "Lcom/robinhood/transfers/gold/GoldDepositBoostTransferDetail;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/util/Money;Landroid/text/SpannedString;Lcom/robinhood/transfers/gold/GoldDepositBoostTransferDetail;)V", "getAmountText", "()Ljava/lang/String;", "getSubHeadingText", "getStatusText", "getFromText", "getToText", "getInitiatedText", "getLastUpdatedText", "getRequestedAmount", "()Lcom/robinhood/models/util/Money;", "getDisclosureText", "()Landroid/text/SpannedString;", "getGoldDepositBoost", "()Lcom/robinhood/transfers/gold/GoldDepositBoostTransferDetail;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class RfpInstantTransferNonReadyPendingPageData {
    public static final int $stable = 8;
    private final String amountText;
    private final SpannedString disclosureText;
    private final String fromText;
    private final GoldDepositBoostTransferDetail goldDepositBoost;
    private final String initiatedText;
    private final String lastUpdatedText;
    private final Money requestedAmount;
    private final String statusText;
    private final String subHeadingText;
    private final String toText;

    public static /* synthetic */ RfpInstantTransferNonReadyPendingPageData copy$default(RfpInstantTransferNonReadyPendingPageData rfpInstantTransferNonReadyPendingPageData, String str, String str2, String str3, String str4, String str5, String str6, String str7, Money money, SpannedString spannedString, GoldDepositBoostTransferDetail goldDepositBoostTransferDetail, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rfpInstantTransferNonReadyPendingPageData.amountText;
        }
        if ((i & 2) != 0) {
            str2 = rfpInstantTransferNonReadyPendingPageData.subHeadingText;
        }
        if ((i & 4) != 0) {
            str3 = rfpInstantTransferNonReadyPendingPageData.statusText;
        }
        if ((i & 8) != 0) {
            str4 = rfpInstantTransferNonReadyPendingPageData.fromText;
        }
        if ((i & 16) != 0) {
            str5 = rfpInstantTransferNonReadyPendingPageData.toText;
        }
        if ((i & 32) != 0) {
            str6 = rfpInstantTransferNonReadyPendingPageData.initiatedText;
        }
        if ((i & 64) != 0) {
            str7 = rfpInstantTransferNonReadyPendingPageData.lastUpdatedText;
        }
        if ((i & 128) != 0) {
            money = rfpInstantTransferNonReadyPendingPageData.requestedAmount;
        }
        if ((i & 256) != 0) {
            spannedString = rfpInstantTransferNonReadyPendingPageData.disclosureText;
        }
        if ((i & 512) != 0) {
            goldDepositBoostTransferDetail = rfpInstantTransferNonReadyPendingPageData.goldDepositBoost;
        }
        SpannedString spannedString2 = spannedString;
        GoldDepositBoostTransferDetail goldDepositBoostTransferDetail2 = goldDepositBoostTransferDetail;
        String str8 = str7;
        Money money2 = money;
        String str9 = str5;
        String str10 = str6;
        return rfpInstantTransferNonReadyPendingPageData.copy(str, str2, str3, str4, str9, str10, str8, money2, spannedString2, goldDepositBoostTransferDetail2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAmountText() {
        return this.amountText;
    }

    /* renamed from: component10, reason: from getter */
    public final GoldDepositBoostTransferDetail getGoldDepositBoost() {
        return this.goldDepositBoost;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubHeadingText() {
        return this.subHeadingText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStatusText() {
        return this.statusText;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFromText() {
        return this.fromText;
    }

    /* renamed from: component5, reason: from getter */
    public final String getToText() {
        return this.toText;
    }

    /* renamed from: component6, reason: from getter */
    public final String getInitiatedText() {
        return this.initiatedText;
    }

    /* renamed from: component7, reason: from getter */
    public final String getLastUpdatedText() {
        return this.lastUpdatedText;
    }

    /* renamed from: component8, reason: from getter */
    public final Money getRequestedAmount() {
        return this.requestedAmount;
    }

    /* renamed from: component9, reason: from getter */
    public final SpannedString getDisclosureText() {
        return this.disclosureText;
    }

    public final RfpInstantTransferNonReadyPendingPageData copy(String amountText, String subHeadingText, String statusText, String fromText, String toText, String initiatedText, String lastUpdatedText, Money requestedAmount, SpannedString disclosureText, GoldDepositBoostTransferDetail goldDepositBoost) {
        Intrinsics.checkNotNullParameter(amountText, "amountText");
        Intrinsics.checkNotNullParameter(subHeadingText, "subHeadingText");
        Intrinsics.checkNotNullParameter(statusText, "statusText");
        Intrinsics.checkNotNullParameter(fromText, "fromText");
        Intrinsics.checkNotNullParameter(toText, "toText");
        Intrinsics.checkNotNullParameter(initiatedText, "initiatedText");
        Intrinsics.checkNotNullParameter(lastUpdatedText, "lastUpdatedText");
        return new RfpInstantTransferNonReadyPendingPageData(amountText, subHeadingText, statusText, fromText, toText, initiatedText, lastUpdatedText, requestedAmount, disclosureText, goldDepositBoost);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RfpInstantTransferNonReadyPendingPageData)) {
            return false;
        }
        RfpInstantTransferNonReadyPendingPageData rfpInstantTransferNonReadyPendingPageData = (RfpInstantTransferNonReadyPendingPageData) other;
        return Intrinsics.areEqual(this.amountText, rfpInstantTransferNonReadyPendingPageData.amountText) && Intrinsics.areEqual(this.subHeadingText, rfpInstantTransferNonReadyPendingPageData.subHeadingText) && Intrinsics.areEqual(this.statusText, rfpInstantTransferNonReadyPendingPageData.statusText) && Intrinsics.areEqual(this.fromText, rfpInstantTransferNonReadyPendingPageData.fromText) && Intrinsics.areEqual(this.toText, rfpInstantTransferNonReadyPendingPageData.toText) && Intrinsics.areEqual(this.initiatedText, rfpInstantTransferNonReadyPendingPageData.initiatedText) && Intrinsics.areEqual(this.lastUpdatedText, rfpInstantTransferNonReadyPendingPageData.lastUpdatedText) && Intrinsics.areEqual(this.requestedAmount, rfpInstantTransferNonReadyPendingPageData.requestedAmount) && Intrinsics.areEqual(this.disclosureText, rfpInstantTransferNonReadyPendingPageData.disclosureText) && Intrinsics.areEqual(this.goldDepositBoost, rfpInstantTransferNonReadyPendingPageData.goldDepositBoost);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.amountText.hashCode() * 31) + this.subHeadingText.hashCode()) * 31) + this.statusText.hashCode()) * 31) + this.fromText.hashCode()) * 31) + this.toText.hashCode()) * 31) + this.initiatedText.hashCode()) * 31) + this.lastUpdatedText.hashCode()) * 31;
        Money money = this.requestedAmount;
        int iHashCode2 = (iHashCode + (money == null ? 0 : money.hashCode())) * 31;
        SpannedString spannedString = this.disclosureText;
        int iHashCode3 = (iHashCode2 + (spannedString == null ? 0 : spannedString.hashCode())) * 31;
        GoldDepositBoostTransferDetail goldDepositBoostTransferDetail = this.goldDepositBoost;
        return iHashCode3 + (goldDepositBoostTransferDetail != null ? goldDepositBoostTransferDetail.hashCode() : 0);
    }

    public String toString() {
        String str = this.amountText;
        String str2 = this.subHeadingText;
        String str3 = this.statusText;
        String str4 = this.fromText;
        String str5 = this.toText;
        String str6 = this.initiatedText;
        String str7 = this.lastUpdatedText;
        Money money = this.requestedAmount;
        SpannedString spannedString = this.disclosureText;
        return "RfpInstantTransferNonReadyPendingPageData(amountText=" + str + ", subHeadingText=" + str2 + ", statusText=" + str3 + ", fromText=" + str4 + ", toText=" + str5 + ", initiatedText=" + str6 + ", lastUpdatedText=" + str7 + ", requestedAmount=" + money + ", disclosureText=" + ((Object) spannedString) + ", goldDepositBoost=" + this.goldDepositBoost + ")";
    }

    public RfpInstantTransferNonReadyPendingPageData(String amountText, String subHeadingText, String statusText, String fromText, String toText, String initiatedText, String lastUpdatedText, Money money, SpannedString spannedString, GoldDepositBoostTransferDetail goldDepositBoostTransferDetail) {
        Intrinsics.checkNotNullParameter(amountText, "amountText");
        Intrinsics.checkNotNullParameter(subHeadingText, "subHeadingText");
        Intrinsics.checkNotNullParameter(statusText, "statusText");
        Intrinsics.checkNotNullParameter(fromText, "fromText");
        Intrinsics.checkNotNullParameter(toText, "toText");
        Intrinsics.checkNotNullParameter(initiatedText, "initiatedText");
        Intrinsics.checkNotNullParameter(lastUpdatedText, "lastUpdatedText");
        this.amountText = amountText;
        this.subHeadingText = subHeadingText;
        this.statusText = statusText;
        this.fromText = fromText;
        this.toText = toText;
        this.initiatedText = initiatedText;
        this.lastUpdatedText = lastUpdatedText;
        this.requestedAmount = money;
        this.disclosureText = spannedString;
        this.goldDepositBoost = goldDepositBoostTransferDetail;
    }

    public /* synthetic */ RfpInstantTransferNonReadyPendingPageData(String str, String str2, String str3, String str4, String str5, String str6, String str7, Money money, SpannedString spannedString, GoldDepositBoostTransferDetail goldDepositBoostTransferDetail, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, (i & 128) != 0 ? null : money, spannedString, goldDepositBoostTransferDetail);
    }

    public final String getAmountText() {
        return this.amountText;
    }

    public final String getSubHeadingText() {
        return this.subHeadingText;
    }

    public final String getStatusText() {
        return this.statusText;
    }

    public final String getFromText() {
        return this.fromText;
    }

    public final String getToText() {
        return this.toText;
    }

    public final String getInitiatedText() {
        return this.initiatedText;
    }

    public final String getLastUpdatedText() {
        return this.lastUpdatedText;
    }

    public final Money getRequestedAmount() {
        return this.requestedAmount;
    }

    public final SpannedString getDisclosureText() {
        return this.disclosureText;
    }

    public final GoldDepositBoostTransferDetail getGoldDepositBoost() {
        return this.goldDepositBoost;
    }
}
