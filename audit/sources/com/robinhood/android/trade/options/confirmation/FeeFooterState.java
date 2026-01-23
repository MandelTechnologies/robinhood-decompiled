package com.robinhood.android.trade.options.confirmation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOrderConfirmationState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/trade/options/confirmation/FeeFooterState;", "", "feeFooterText", "", "feeFooterSubstringLinkText", "goldFeeSavingsText", "inlineUrlLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFeeFooterText", "()Ljava/lang/String;", "getFeeFooterSubstringLinkText", "getGoldFeeSavingsText", "getInlineUrlLink", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class FeeFooterState {
    public static final int $stable = 0;
    private final String feeFooterSubstringLinkText;
    private final String feeFooterText;
    private final String goldFeeSavingsText;
    private final String inlineUrlLink;

    public static /* synthetic */ FeeFooterState copy$default(FeeFooterState feeFooterState, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feeFooterState.feeFooterText;
        }
        if ((i & 2) != 0) {
            str2 = feeFooterState.feeFooterSubstringLinkText;
        }
        if ((i & 4) != 0) {
            str3 = feeFooterState.goldFeeSavingsText;
        }
        if ((i & 8) != 0) {
            str4 = feeFooterState.inlineUrlLink;
        }
        return feeFooterState.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFeeFooterText() {
        return this.feeFooterText;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFeeFooterSubstringLinkText() {
        return this.feeFooterSubstringLinkText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getGoldFeeSavingsText() {
        return this.goldFeeSavingsText;
    }

    /* renamed from: component4, reason: from getter */
    public final String getInlineUrlLink() {
        return this.inlineUrlLink;
    }

    public final FeeFooterState copy(String feeFooterText, String feeFooterSubstringLinkText, String goldFeeSavingsText, String inlineUrlLink) {
        return new FeeFooterState(feeFooterText, feeFooterSubstringLinkText, goldFeeSavingsText, inlineUrlLink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeeFooterState)) {
            return false;
        }
        FeeFooterState feeFooterState = (FeeFooterState) other;
        return Intrinsics.areEqual(this.feeFooterText, feeFooterState.feeFooterText) && Intrinsics.areEqual(this.feeFooterSubstringLinkText, feeFooterState.feeFooterSubstringLinkText) && Intrinsics.areEqual(this.goldFeeSavingsText, feeFooterState.goldFeeSavingsText) && Intrinsics.areEqual(this.inlineUrlLink, feeFooterState.inlineUrlLink);
    }

    public int hashCode() {
        String str = this.feeFooterText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.feeFooterSubstringLinkText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.goldFeeSavingsText;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.inlineUrlLink;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "FeeFooterState(feeFooterText=" + this.feeFooterText + ", feeFooterSubstringLinkText=" + this.feeFooterSubstringLinkText + ", goldFeeSavingsText=" + this.goldFeeSavingsText + ", inlineUrlLink=" + this.inlineUrlLink + ")";
    }

    public FeeFooterState(String str, String str2, String str3, String str4) {
        this.feeFooterText = str;
        this.feeFooterSubstringLinkText = str2;
        this.goldFeeSavingsText = str3;
        this.inlineUrlLink = str4;
    }

    public final String getFeeFooterText() {
        return this.feeFooterText;
    }

    public final String getFeeFooterSubstringLinkText() {
        return this.feeFooterSubstringLinkText;
    }

    public final String getGoldFeeSavingsText() {
        return this.goldFeeSavingsText;
    }

    public final String getInlineUrlLink() {
        return this.inlineUrlLink;
    }
}
