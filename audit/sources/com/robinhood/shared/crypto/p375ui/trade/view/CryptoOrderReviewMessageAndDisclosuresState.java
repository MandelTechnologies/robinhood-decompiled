package com.robinhood.shared.crypto.p375ui.trade.view;

import com.robinhood.shared.crypto.p375ui.C38572R;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderReviewMessageAndDisclosuresComposable.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState;", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "reviewText", "disclosuresContent", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState$DisclosuresContent;", "isLoading", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState$DisclosuresContent;Z)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getReviewText", "getDisclosuresContent", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState$DisclosuresContent;", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "DisclosuresContent", "Companion", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoOrderReviewMessageAndDisclosuresState {
    private final DisclosuresContent disclosuresContent;
    private final boolean isLoading;
    private final StringResource reviewText;
    private final StringResource title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = StringResource.$stable;
    private static final CryptoOrderReviewMessageAndDisclosuresState Loading = new CryptoOrderReviewMessageAndDisclosuresState(null, StringResource.INSTANCE.invoke(""), null, true, 1, null);

    public static /* synthetic */ CryptoOrderReviewMessageAndDisclosuresState copy$default(CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresState, StringResource stringResource, StringResource stringResource2, DisclosuresContent disclosuresContent, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = cryptoOrderReviewMessageAndDisclosuresState.title;
        }
        if ((i & 2) != 0) {
            stringResource2 = cryptoOrderReviewMessageAndDisclosuresState.reviewText;
        }
        if ((i & 4) != 0) {
            disclosuresContent = cryptoOrderReviewMessageAndDisclosuresState.disclosuresContent;
        }
        if ((i & 8) != 0) {
            z = cryptoOrderReviewMessageAndDisclosuresState.isLoading;
        }
        return cryptoOrderReviewMessageAndDisclosuresState.copy(stringResource, stringResource2, disclosuresContent, z);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getReviewText() {
        return this.reviewText;
    }

    /* renamed from: component3, reason: from getter */
    public final DisclosuresContent getDisclosuresContent() {
        return this.disclosuresContent;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final CryptoOrderReviewMessageAndDisclosuresState copy(StringResource title, StringResource reviewText, DisclosuresContent disclosuresContent, boolean isLoading) {
        Intrinsics.checkNotNullParameter(reviewText, "reviewText");
        return new CryptoOrderReviewMessageAndDisclosuresState(title, reviewText, disclosuresContent, isLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoOrderReviewMessageAndDisclosuresState)) {
            return false;
        }
        CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresState = (CryptoOrderReviewMessageAndDisclosuresState) other;
        return Intrinsics.areEqual(this.title, cryptoOrderReviewMessageAndDisclosuresState.title) && Intrinsics.areEqual(this.reviewText, cryptoOrderReviewMessageAndDisclosuresState.reviewText) && Intrinsics.areEqual(this.disclosuresContent, cryptoOrderReviewMessageAndDisclosuresState.disclosuresContent) && this.isLoading == cryptoOrderReviewMessageAndDisclosuresState.isLoading;
    }

    public int hashCode() {
        StringResource stringResource = this.title;
        int iHashCode = (((stringResource == null ? 0 : stringResource.hashCode()) * 31) + this.reviewText.hashCode()) * 31;
        DisclosuresContent disclosuresContent = this.disclosuresContent;
        return ((iHashCode + (disclosuresContent != null ? disclosuresContent.hashCode() : 0)) * 31) + Boolean.hashCode(this.isLoading);
    }

    public String toString() {
        return "CryptoOrderReviewMessageAndDisclosuresState(title=" + this.title + ", reviewText=" + this.reviewText + ", disclosuresContent=" + this.disclosuresContent + ", isLoading=" + this.isLoading + ")";
    }

    public CryptoOrderReviewMessageAndDisclosuresState(StringResource stringResource, StringResource reviewText, DisclosuresContent disclosuresContent, boolean z) {
        Intrinsics.checkNotNullParameter(reviewText, "reviewText");
        this.title = stringResource;
        this.reviewText = reviewText;
        this.disclosuresContent = disclosuresContent;
        this.isLoading = z;
    }

    public /* synthetic */ CryptoOrderReviewMessageAndDisclosuresState(StringResource stringResource, StringResource stringResource2, DisclosuresContent disclosuresContent, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? StringResource.INSTANCE.invoke(C38572R.string.crypto_order_create_summary_title, new Object[0]) : stringResource, stringResource2, disclosuresContent, (i & 8) != 0 ? false : z);
    }

    public final StringResource getTitle() {
        return this.title;
    }

    public final StringResource getReviewText() {
        return this.reviewText;
    }

    public final DisclosuresContent getDisclosuresContent() {
        return this.disclosuresContent;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    /* compiled from: CryptoOrderReviewMessageAndDisclosuresComposable.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState$DisclosuresContent;", "", "disclosureText", "Lcom/robinhood/utils/resource/StringResource;", "disclosureUrl", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getDisclosureText", "()Lcom/robinhood/utils/resource/StringResource;", "getDisclosureUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DisclosuresContent {
        public static final int $stable = StringResource.$stable;
        private final StringResource disclosureText;
        private final StringResource disclosureUrl;

        public static /* synthetic */ DisclosuresContent copy$default(DisclosuresContent disclosuresContent, StringResource stringResource, StringResource stringResource2, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = disclosuresContent.disclosureText;
            }
            if ((i & 2) != 0) {
                stringResource2 = disclosuresContent.disclosureUrl;
            }
            return disclosuresContent.copy(stringResource, stringResource2);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getDisclosureText() {
            return this.disclosureText;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getDisclosureUrl() {
            return this.disclosureUrl;
        }

        public final DisclosuresContent copy(StringResource disclosureText, StringResource disclosureUrl) {
            Intrinsics.checkNotNullParameter(disclosureText, "disclosureText");
            Intrinsics.checkNotNullParameter(disclosureUrl, "disclosureUrl");
            return new DisclosuresContent(disclosureText, disclosureUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DisclosuresContent)) {
                return false;
            }
            DisclosuresContent disclosuresContent = (DisclosuresContent) other;
            return Intrinsics.areEqual(this.disclosureText, disclosuresContent.disclosureText) && Intrinsics.areEqual(this.disclosureUrl, disclosuresContent.disclosureUrl);
        }

        public int hashCode() {
            return (this.disclosureText.hashCode() * 31) + this.disclosureUrl.hashCode();
        }

        public String toString() {
            return "DisclosuresContent(disclosureText=" + this.disclosureText + ", disclosureUrl=" + this.disclosureUrl + ")";
        }

        public DisclosuresContent(StringResource disclosureText, StringResource disclosureUrl) {
            Intrinsics.checkNotNullParameter(disclosureText, "disclosureText");
            Intrinsics.checkNotNullParameter(disclosureUrl, "disclosureUrl");
            this.disclosureText = disclosureText;
            this.disclosureUrl = disclosureUrl;
        }

        public final StringResource getDisclosureText() {
            return this.disclosureText;
        }

        public final StringResource getDisclosureUrl() {
            return this.disclosureUrl;
        }
    }

    /* compiled from: CryptoOrderReviewMessageAndDisclosuresComposable.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState$Companion;", "", "<init>", "()V", "Loading", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState;", "getLoading", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState;", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CryptoOrderReviewMessageAndDisclosuresState getLoading() {
            return CryptoOrderReviewMessageAndDisclosuresState.Loading;
        }
    }
}
