package com.robinhood.android.gold.upgrade.unified.screen;

import com.robinhood.android.common.C11048R;
import com.robinhood.utils.resource.StringResource;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import gold_flow.proto.p466v1.Cta;
import gold_flow.proto.p466v1.FullAgreement;
import gold_flow.proto.p466v1.StreamSingleAgreementContentResponse;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldUnifiedSingleAgreementViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0013\u0014\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0006R\u0011\u0010\u0012\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006\u0082\u0001\u0003\u0016\u0017\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedSingleAgreementViewState;", "", "<init>", "()V", "isReviewed", "", "()Z", "ctaText", "Lcom/robinhood/utils/resource/StringResource;", "getCtaText", "()Lcom/robinhood/utils/resource/StringResource;", "showSparkleButton", "getShowSparkleButton", Footer.f10637type, "", "getFooter", "()Ljava/lang/String;", "isCtaEnabled", "isCtaLoading", "Loading", "Loaded", "Error", "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedSingleAgreementViewState$Error;", "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedSingleAgreementViewState$Loaded;", "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedSingleAgreementViewState$Loading;", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public abstract class GoldUnifiedSingleAgreementViewState {
    public static final int $stable = 0;

    /* compiled from: GoldUnifiedSingleAgreementViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GoldUnifiedSingleAgreementViewState2.values().length];
            try {
                iArr[GoldUnifiedSingleAgreementViewState2.UNREVIEWED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GoldUnifiedSingleAgreementViewState2.REVIEWED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GoldUnifiedSingleAgreementViewState2.ACCEPTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ GoldUnifiedSingleAgreementViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: GoldUnifiedSingleAgreementViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedSingleAgreementViewState$Loading;", "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedSingleAgreementViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends GoldUnifiedSingleAgreementViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -1266203504;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    private GoldUnifiedSingleAgreementViewState() {
    }

    /* compiled from: GoldUnifiedSingleAgreementViewState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedSingleAgreementViewState$Loaded;", "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedSingleAgreementViewState;", "content", "Lgold_flow/proto/v1/StreamSingleAgreementContentResponse;", "reviewStatus", "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedSingleAgreementReviewStatus;", "<init>", "(Lgold_flow/proto/v1/StreamSingleAgreementContentResponse;Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedSingleAgreementReviewStatus;)V", "getContent", "()Lgold_flow/proto/v1/StreamSingleAgreementContentResponse;", "getReviewStatus", "()Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedSingleAgreementReviewStatus;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded extends GoldUnifiedSingleAgreementViewState {
        public static final int $stable = 8;
        private final StreamSingleAgreementContentResponse content;
        private final GoldUnifiedSingleAgreementViewState2 reviewStatus;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, StreamSingleAgreementContentResponse streamSingleAgreementContentResponse, GoldUnifiedSingleAgreementViewState2 goldUnifiedSingleAgreementViewState2, int i, Object obj) {
            if ((i & 1) != 0) {
                streamSingleAgreementContentResponse = loaded.content;
            }
            if ((i & 2) != 0) {
                goldUnifiedSingleAgreementViewState2 = loaded.reviewStatus;
            }
            return loaded.copy(streamSingleAgreementContentResponse, goldUnifiedSingleAgreementViewState2);
        }

        /* renamed from: component1, reason: from getter */
        public final StreamSingleAgreementContentResponse getContent() {
            return this.content;
        }

        /* renamed from: component2, reason: from getter */
        public final GoldUnifiedSingleAgreementViewState2 getReviewStatus() {
            return this.reviewStatus;
        }

        public final Loaded copy(StreamSingleAgreementContentResponse content, GoldUnifiedSingleAgreementViewState2 reviewStatus) {
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(reviewStatus, "reviewStatus");
            return new Loaded(content, reviewStatus);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.content, loaded.content) && this.reviewStatus == loaded.reviewStatus;
        }

        public int hashCode() {
            return (this.content.hashCode() * 31) + this.reviewStatus.hashCode();
        }

        public String toString() {
            return "Loaded(content=" + this.content + ", reviewStatus=" + this.reviewStatus + ")";
        }

        public final StreamSingleAgreementContentResponse getContent() {
            return this.content;
        }

        public final GoldUnifiedSingleAgreementViewState2 getReviewStatus() {
            return this.reviewStatus;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(StreamSingleAgreementContentResponse content, GoldUnifiedSingleAgreementViewState2 reviewStatus) {
            super(null);
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(reviewStatus, "reviewStatus");
            this.content = content;
            this.reviewStatus = reviewStatus;
        }
    }

    /* compiled from: GoldUnifiedSingleAgreementViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedSingleAgreementViewState$Error;", "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedSingleAgreementViewState;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error extends GoldUnifiedSingleAgreementViewState {
        public static final int $stable = 8;
        private final Throwable error;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.error;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final Error copy(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Error(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.error, ((Error) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.error + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final Throwable getError() {
            return this.error;
        }
    }

    public final boolean isReviewed() {
        return (this instanceof Loaded) && ((Loaded) this).getReviewStatus() == GoldUnifiedSingleAgreementViewState2.REVIEWED;
    }

    public final StringResource getCtaText() {
        StringResource stringResourceInvoke;
        String text;
        if (!(this instanceof Loaded)) {
            return null;
        }
        Loaded loaded = (Loaded) this;
        Cta cta = loaded.getContent().getCta();
        if (cta == null || (text = cta.getText()) == null || (stringResourceInvoke = StringResource.INSTANCE.invoke(text)) == null) {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C11048R.string.general_action_agree, new Object[0]);
        }
        int i = WhenMappings.$EnumSwitchMapping$0[loaded.getReviewStatus().ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C11048R.string.general_action_review, new Object[0]);
        }
        if (i == 2 || i == 3) {
            return stringResourceInvoke;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean getShowSparkleButton() {
        StreamSingleAgreementContentResponse content;
        Loaded loaded = this instanceof Loaded ? (Loaded) this : null;
        return !((loaded == null || (content = loaded.getContent()) == null) ? false : Intrinsics.areEqual(content.getDisable_sparkle_button_styling(), Boolean.TRUE));
    }

    public final String getFooter() {
        FullAgreement agreement;
        if (this instanceof Loaded) {
            Loaded loaded = (Loaded) this;
            if (loaded.getReviewStatus() != GoldUnifiedSingleAgreementViewState2.UNREVIEWED && (agreement = loaded.getContent().getAgreement()) != null) {
                return agreement.getFooter();
            }
        }
        return null;
    }

    public final boolean isCtaEnabled() {
        if (this instanceof Loaded) {
            Cta cta = ((Loaded) this).getContent().getCta();
            if (!(cta != null ? Intrinsics.areEqual(cta.getEnabled(), Boolean.FALSE) : false)) {
                return true;
            }
        }
        return false;
    }

    public final boolean isCtaLoading() {
        StreamSingleAgreementContentResponse content;
        Cta cta;
        if (this instanceof Loading) {
            return true;
        }
        Loaded loaded = this instanceof Loaded ? (Loaded) this : null;
        return (loaded == null || (content = loaded.getContent()) == null || (cta = content.getCta()) == null) ? false : Intrinsics.areEqual(cta.getLoading(), Boolean.TRUE);
    }
}
