package com.robinhood.android.transfers.p271ui.max.i18n.composable;

import kotlin.Metadata;

/* compiled from: TransferEditScreen.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/composable/TransferEditScreenData;", "", "reviewEnabled", "", "<init>", "(Z)V", "getReviewEnabled", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TransferEditScreenData {
    public static final int $stable = 0;
    private final boolean reviewEnabled;

    public static /* synthetic */ TransferEditScreenData copy$default(TransferEditScreenData transferEditScreenData, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = transferEditScreenData.reviewEnabled;
        }
        return transferEditScreenData.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getReviewEnabled() {
        return this.reviewEnabled;
    }

    public final TransferEditScreenData copy(boolean reviewEnabled) {
        return new TransferEditScreenData(reviewEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TransferEditScreenData) && this.reviewEnabled == ((TransferEditScreenData) other).reviewEnabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.reviewEnabled);
    }

    public String toString() {
        return "TransferEditScreenData(reviewEnabled=" + this.reviewEnabled + ")";
    }

    public TransferEditScreenData(boolean z) {
        this.reviewEnabled = z;
    }

    public final boolean getReviewEnabled() {
        return this.reviewEnabled;
    }
}
