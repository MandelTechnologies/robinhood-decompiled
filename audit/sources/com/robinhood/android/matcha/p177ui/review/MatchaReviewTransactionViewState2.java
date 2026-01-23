package com.robinhood.android.matcha.p177ui.review;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaReviewTransactionViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionBannerViewState;", "", "Hidden", "Visible", "Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionBannerViewState$Hidden;", "Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionBannerViewState$Visible;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionBannerViewState, reason: use source file name */
/* loaded from: classes8.dex */
public interface MatchaReviewTransactionViewState2 {

    /* compiled from: MatchaReviewTransactionViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionBannerViewState$Hidden;", "Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionBannerViewState;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionBannerViewState$Hidden */
    public static final class Hidden implements MatchaReviewTransactionViewState2 {
        public static final int $stable = 0;
        public static final Hidden INSTANCE = new Hidden();

        private Hidden() {
        }
    }

    /* compiled from: MatchaReviewTransactionViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionBannerViewState$Visible;", "Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionBannerViewState;", "text", "Lcom/robinhood/utils/resource/StringResource;", "ctaText", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "getCtaText", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionBannerViewState$Visible, reason: from toString */
    public static final /* data */ class Visible implements MatchaReviewTransactionViewState2 {
        public static final int $stable = StringResource.$stable;
        private final StringResource ctaText;
        private final StringResource text;

        public static /* synthetic */ Visible copy$default(Visible visible, StringResource stringResource, StringResource stringResource2, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = visible.text;
            }
            if ((i & 2) != 0) {
                stringResource2 = visible.ctaText;
            }
            return visible.copy(stringResource, stringResource2);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getCtaText() {
            return this.ctaText;
        }

        public final Visible copy(StringResource text, StringResource ctaText) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(ctaText, "ctaText");
            return new Visible(text, ctaText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Visible)) {
                return false;
            }
            Visible visible = (Visible) other;
            return Intrinsics.areEqual(this.text, visible.text) && Intrinsics.areEqual(this.ctaText, visible.ctaText);
        }

        public int hashCode() {
            return (this.text.hashCode() * 31) + this.ctaText.hashCode();
        }

        public String toString() {
            return "Visible(text=" + this.text + ", ctaText=" + this.ctaText + ")";
        }

        public Visible(StringResource text, StringResource ctaText) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(ctaText, "ctaText");
            this.text = text;
            this.ctaText = ctaText;
        }

        public final StringResource getText() {
            return this.text;
        }

        public final StringResource getCtaText() {
            return this.ctaText;
        }
    }
}
