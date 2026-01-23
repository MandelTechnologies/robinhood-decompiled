package com.robinhood.shared.education.p377ui.onboarding;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoLearnAndEarnOnboardingDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001dB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/onboarding/CryptoLearnAndEarnOnboardingViewState;", "", "subtitle", "Lcom/robinhood/utils/resource/StringResource;", "contentRows", "", "Lcom/robinhood/shared/education/ui/onboarding/CryptoLearnAndEarnOnboardingViewState$BentoValuePropRowContent;", "footerMessage", "footerLinkText", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Ljava/util/List;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getSubtitle", "()Lcom/robinhood/utils/resource/StringResource;", "getContentRows", "()Ljava/util/List;", "getFooterMessage", "getFooterLinkText", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "BentoValuePropRowContent", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoLearnAndEarnOnboardingViewState {
    public static final int $stable = 8;
    private final List<BentoValuePropRowContent> contentRows;
    private final StringResource footerLinkText;
    private final StringResource footerMessage;
    private final StringResource subtitle;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CryptoLearnAndEarnOnboardingViewState copy$default(CryptoLearnAndEarnOnboardingViewState cryptoLearnAndEarnOnboardingViewState, StringResource stringResource, List list, StringResource stringResource2, StringResource stringResource3, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = cryptoLearnAndEarnOnboardingViewState.subtitle;
        }
        if ((i & 2) != 0) {
            list = cryptoLearnAndEarnOnboardingViewState.contentRows;
        }
        if ((i & 4) != 0) {
            stringResource2 = cryptoLearnAndEarnOnboardingViewState.footerMessage;
        }
        if ((i & 8) != 0) {
            stringResource3 = cryptoLearnAndEarnOnboardingViewState.footerLinkText;
        }
        return cryptoLearnAndEarnOnboardingViewState.copy(stringResource, list, stringResource2, stringResource3);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getSubtitle() {
        return this.subtitle;
    }

    public final List<BentoValuePropRowContent> component2() {
        return this.contentRows;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getFooterMessage() {
        return this.footerMessage;
    }

    /* renamed from: component4, reason: from getter */
    public final StringResource getFooterLinkText() {
        return this.footerLinkText;
    }

    public final CryptoLearnAndEarnOnboardingViewState copy(StringResource subtitle, List<BentoValuePropRowContent> contentRows, StringResource footerMessage, StringResource footerLinkText) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(contentRows, "contentRows");
        Intrinsics.checkNotNullParameter(footerMessage, "footerMessage");
        Intrinsics.checkNotNullParameter(footerLinkText, "footerLinkText");
        return new CryptoLearnAndEarnOnboardingViewState(subtitle, contentRows, footerMessage, footerLinkText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoLearnAndEarnOnboardingViewState)) {
            return false;
        }
        CryptoLearnAndEarnOnboardingViewState cryptoLearnAndEarnOnboardingViewState = (CryptoLearnAndEarnOnboardingViewState) other;
        return Intrinsics.areEqual(this.subtitle, cryptoLearnAndEarnOnboardingViewState.subtitle) && Intrinsics.areEqual(this.contentRows, cryptoLearnAndEarnOnboardingViewState.contentRows) && Intrinsics.areEqual(this.footerMessage, cryptoLearnAndEarnOnboardingViewState.footerMessage) && Intrinsics.areEqual(this.footerLinkText, cryptoLearnAndEarnOnboardingViewState.footerLinkText);
    }

    public int hashCode() {
        return (((((this.subtitle.hashCode() * 31) + this.contentRows.hashCode()) * 31) + this.footerMessage.hashCode()) * 31) + this.footerLinkText.hashCode();
    }

    public String toString() {
        return "CryptoLearnAndEarnOnboardingViewState(subtitle=" + this.subtitle + ", contentRows=" + this.contentRows + ", footerMessage=" + this.footerMessage + ", footerLinkText=" + this.footerLinkText + ")";
    }

    public CryptoLearnAndEarnOnboardingViewState(StringResource subtitle, List<BentoValuePropRowContent> contentRows, StringResource footerMessage, StringResource footerLinkText) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(contentRows, "contentRows");
        Intrinsics.checkNotNullParameter(footerMessage, "footerMessage");
        Intrinsics.checkNotNullParameter(footerLinkText, "footerLinkText");
        this.subtitle = subtitle;
        this.contentRows = contentRows;
        this.footerMessage = footerMessage;
        this.footerLinkText = footerLinkText;
    }

    public final StringResource getSubtitle() {
        return this.subtitle;
    }

    public final List<BentoValuePropRowContent> getContentRows() {
        return this.contentRows;
    }

    public final StringResource getFooterMessage() {
        return this.footerMessage;
    }

    public final StringResource getFooterLinkText() {
        return this.footerLinkText;
    }

    /* compiled from: CryptoLearnAndEarnOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/onboarding/CryptoLearnAndEarnOnboardingViewState$BentoValuePropRowContent;", "", "title", "Lcom/robinhood/utils/resource/StringResource;", CarResultComposable2.BODY, "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getBody", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class BentoValuePropRowContent {
        public static final int $stable = StringResource.$stable;
        private final StringResource body;
        private final StringResource title;

        public static /* synthetic */ BentoValuePropRowContent copy$default(BentoValuePropRowContent bentoValuePropRowContent, StringResource stringResource, StringResource stringResource2, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = bentoValuePropRowContent.title;
            }
            if ((i & 2) != 0) {
                stringResource2 = bentoValuePropRowContent.body;
            }
            return bentoValuePropRowContent.copy(stringResource, stringResource2);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getBody() {
            return this.body;
        }

        public final BentoValuePropRowContent copy(StringResource title, StringResource body) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            return new BentoValuePropRowContent(title, body);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BentoValuePropRowContent)) {
                return false;
            }
            BentoValuePropRowContent bentoValuePropRowContent = (BentoValuePropRowContent) other;
            return Intrinsics.areEqual(this.title, bentoValuePropRowContent.title) && Intrinsics.areEqual(this.body, bentoValuePropRowContent.body);
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + this.body.hashCode();
        }

        public String toString() {
            return "BentoValuePropRowContent(title=" + this.title + ", body=" + this.body + ")";
        }

        public BentoValuePropRowContent(StringResource title, StringResource body) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            this.title = title;
            this.body = body;
        }

        public final StringResource getTitle() {
            return this.title;
        }

        public final StringResource getBody() {
            return this.body;
        }
    }
}
