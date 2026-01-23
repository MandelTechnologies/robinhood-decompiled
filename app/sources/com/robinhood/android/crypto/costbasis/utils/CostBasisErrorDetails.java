package com.robinhood.android.crypto.costbasis.utils;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CostBasisErrors.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003JK\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/crypto/costbasis/utils/CostBasisErrorDetails;", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "message", "primaryCtaText", "primaryCtaDeeplink", "", "secondaryCtaText", "secondaryCtaDeeplink", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getMessage", "getPrimaryCtaText", "getPrimaryCtaDeeplink", "()Ljava/lang/String;", "getSecondaryCtaText", "getSecondaryCtaDeeplink", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-crypto-cost-basis_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CostBasisErrorDetails {
    public static final int $stable = StringResource.$stable;
    private final StringResource message;
    private final String primaryCtaDeeplink;
    private final StringResource primaryCtaText;
    private final String secondaryCtaDeeplink;
    private final StringResource secondaryCtaText;
    private final StringResource title;

    public static /* synthetic */ CostBasisErrorDetails copy$default(CostBasisErrorDetails costBasisErrorDetails, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, String str, StringResource stringResource4, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = costBasisErrorDetails.title;
        }
        if ((i & 2) != 0) {
            stringResource2 = costBasisErrorDetails.message;
        }
        if ((i & 4) != 0) {
            stringResource3 = costBasisErrorDetails.primaryCtaText;
        }
        if ((i & 8) != 0) {
            str = costBasisErrorDetails.primaryCtaDeeplink;
        }
        if ((i & 16) != 0) {
            stringResource4 = costBasisErrorDetails.secondaryCtaText;
        }
        if ((i & 32) != 0) {
            str2 = costBasisErrorDetails.secondaryCtaDeeplink;
        }
        StringResource stringResource5 = stringResource4;
        String str3 = str2;
        return costBasisErrorDetails.copy(stringResource, stringResource2, stringResource3, str, stringResource5, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getMessage() {
        return this.message;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getPrimaryCtaText() {
        return this.primaryCtaText;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPrimaryCtaDeeplink() {
        return this.primaryCtaDeeplink;
    }

    /* renamed from: component5, reason: from getter */
    public final StringResource getSecondaryCtaText() {
        return this.secondaryCtaText;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSecondaryCtaDeeplink() {
        return this.secondaryCtaDeeplink;
    }

    public final CostBasisErrorDetails copy(StringResource title, StringResource message, StringResource primaryCtaText, String primaryCtaDeeplink, StringResource secondaryCtaText, String secondaryCtaDeeplink) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(primaryCtaText, "primaryCtaText");
        return new CostBasisErrorDetails(title, message, primaryCtaText, primaryCtaDeeplink, secondaryCtaText, secondaryCtaDeeplink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CostBasisErrorDetails)) {
            return false;
        }
        CostBasisErrorDetails costBasisErrorDetails = (CostBasisErrorDetails) other;
        return Intrinsics.areEqual(this.title, costBasisErrorDetails.title) && Intrinsics.areEqual(this.message, costBasisErrorDetails.message) && Intrinsics.areEqual(this.primaryCtaText, costBasisErrorDetails.primaryCtaText) && Intrinsics.areEqual(this.primaryCtaDeeplink, costBasisErrorDetails.primaryCtaDeeplink) && Intrinsics.areEqual(this.secondaryCtaText, costBasisErrorDetails.secondaryCtaText) && Intrinsics.areEqual(this.secondaryCtaDeeplink, costBasisErrorDetails.secondaryCtaDeeplink);
    }

    public int hashCode() {
        int iHashCode = ((((this.title.hashCode() * 31) + this.message.hashCode()) * 31) + this.primaryCtaText.hashCode()) * 31;
        String str = this.primaryCtaDeeplink;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        StringResource stringResource = this.secondaryCtaText;
        int iHashCode3 = (iHashCode2 + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
        String str2 = this.secondaryCtaDeeplink;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "CostBasisErrorDetails(title=" + this.title + ", message=" + this.message + ", primaryCtaText=" + this.primaryCtaText + ", primaryCtaDeeplink=" + this.primaryCtaDeeplink + ", secondaryCtaText=" + this.secondaryCtaText + ", secondaryCtaDeeplink=" + this.secondaryCtaDeeplink + ")";
    }

    public CostBasisErrorDetails(StringResource title, StringResource message, StringResource primaryCtaText, String str, StringResource stringResource, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(primaryCtaText, "primaryCtaText");
        this.title = title;
        this.message = message;
        this.primaryCtaText = primaryCtaText;
        this.primaryCtaDeeplink = str;
        this.secondaryCtaText = stringResource;
        this.secondaryCtaDeeplink = str2;
    }

    public /* synthetic */ CostBasisErrorDetails(StringResource stringResource, StringResource stringResource2, StringResource stringResource3, String str, StringResource stringResource4, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stringResource, stringResource2, stringResource3, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : stringResource4, (i & 32) != 0 ? null : str2);
    }

    public final StringResource getTitle() {
        return this.title;
    }

    public final StringResource getMessage() {
        return this.message;
    }

    public final StringResource getPrimaryCtaText() {
        return this.primaryCtaText;
    }

    public final String getPrimaryCtaDeeplink() {
        return this.primaryCtaDeeplink;
    }

    public final StringResource getSecondaryCtaText() {
        return this.secondaryCtaText;
    }

    public final String getSecondaryCtaDeeplink() {
        return this.secondaryCtaDeeplink;
    }
}
