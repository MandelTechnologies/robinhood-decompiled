package com.robinhood.shared.crypto.p375ui.trade.review;

import com.robinhood.shared.crypto.p375ui.trade.review.CryptoReviewState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoReviewComposable.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/review/ReviewScreenPreview;", "", "titleContentDisplay", "Lcom/robinhood/shared/crypto/ui/trade/review/CryptoReviewState$TitleContentDisplay;", "<init>", "(Lcom/robinhood/shared/crypto/ui/trade/review/CryptoReviewState$TitleContentDisplay;)V", "getTitleContentDisplay", "()Lcom/robinhood/shared/crypto/ui/trade/review/CryptoReviewState$TitleContentDisplay;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
final /* data */ class ReviewScreenPreview {
    private final CryptoReviewState.TitleContentDisplay titleContentDisplay;

    public static /* synthetic */ ReviewScreenPreview copy$default(ReviewScreenPreview reviewScreenPreview, CryptoReviewState.TitleContentDisplay titleContentDisplay, int i, Object obj) {
        if ((i & 1) != 0) {
            titleContentDisplay = reviewScreenPreview.titleContentDisplay;
        }
        return reviewScreenPreview.copy(titleContentDisplay);
    }

    /* renamed from: component1, reason: from getter */
    public final CryptoReviewState.TitleContentDisplay getTitleContentDisplay() {
        return this.titleContentDisplay;
    }

    public final ReviewScreenPreview copy(CryptoReviewState.TitleContentDisplay titleContentDisplay) {
        Intrinsics.checkNotNullParameter(titleContentDisplay, "titleContentDisplay");
        return new ReviewScreenPreview(titleContentDisplay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ReviewScreenPreview) && this.titleContentDisplay == ((ReviewScreenPreview) other).titleContentDisplay;
    }

    public int hashCode() {
        return this.titleContentDisplay.hashCode();
    }

    public String toString() {
        return "ReviewScreenPreview(titleContentDisplay=" + this.titleContentDisplay + ")";
    }

    public ReviewScreenPreview(CryptoReviewState.TitleContentDisplay titleContentDisplay) {
        Intrinsics.checkNotNullParameter(titleContentDisplay, "titleContentDisplay");
        this.titleContentDisplay = titleContentDisplay;
    }

    public final CryptoReviewState.TitleContentDisplay getTitleContentDisplay() {
        return this.titleContentDisplay;
    }
}
