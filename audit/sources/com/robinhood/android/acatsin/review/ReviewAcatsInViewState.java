package com.robinhood.android.acatsin.review;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: ReviewAcatsInViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00050\fHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u009b\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015¨\u00068"}, m3636d2 = {"Lcom/robinhood/android/acatsin/review/ReviewAcatsInViewState;", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "contraBrokerageName", "", "contraBrokerageLogoUrl", "contraAccountNumber", "assetsValue", "rhAccountName", "rhAccountOwnerLabel", "rhAccountOwnerNames", "Lkotlinx/collections/immutable/ImmutableList;", "matchLabel", "matchValue", "infoText", "primaryCtaText", "secondaryCtaText", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getContraBrokerageName", "()Ljava/lang/String;", "getContraBrokerageLogoUrl", "getContraAccountNumber", "getAssetsValue", "getRhAccountName", "getRhAccountOwnerLabel", "getRhAccountOwnerNames", "()Lkotlinx/collections/immutable/ImmutableList;", "getMatchLabel", "getMatchValue", "getInfoText", "getPrimaryCtaText", "getSecondaryCtaText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class ReviewAcatsInViewState {
    public static final int $stable = StringResource.$stable;
    private final StringResource assetsValue;
    private final String contraAccountNumber;
    private final String contraBrokerageLogoUrl;
    private final String contraBrokerageName;
    private final StringResource infoText;
    private final StringResource matchLabel;
    private final StringResource matchValue;
    private final StringResource primaryCtaText;
    private final StringResource rhAccountName;
    private final StringResource rhAccountOwnerLabel;
    private final ImmutableList<String> rhAccountOwnerNames;
    private final StringResource secondaryCtaText;
    private final StringResource title;

    public static /* synthetic */ ReviewAcatsInViewState copy$default(ReviewAcatsInViewState reviewAcatsInViewState, StringResource stringResource, String str, String str2, String str3, StringResource stringResource2, StringResource stringResource3, StringResource stringResource4, ImmutableList immutableList, StringResource stringResource5, StringResource stringResource6, StringResource stringResource7, StringResource stringResource8, StringResource stringResource9, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = reviewAcatsInViewState.title;
        }
        return reviewAcatsInViewState.copy(stringResource, (i & 2) != 0 ? reviewAcatsInViewState.contraBrokerageName : str, (i & 4) != 0 ? reviewAcatsInViewState.contraBrokerageLogoUrl : str2, (i & 8) != 0 ? reviewAcatsInViewState.contraAccountNumber : str3, (i & 16) != 0 ? reviewAcatsInViewState.assetsValue : stringResource2, (i & 32) != 0 ? reviewAcatsInViewState.rhAccountName : stringResource3, (i & 64) != 0 ? reviewAcatsInViewState.rhAccountOwnerLabel : stringResource4, (i & 128) != 0 ? reviewAcatsInViewState.rhAccountOwnerNames : immutableList, (i & 256) != 0 ? reviewAcatsInViewState.matchLabel : stringResource5, (i & 512) != 0 ? reviewAcatsInViewState.matchValue : stringResource6, (i & 1024) != 0 ? reviewAcatsInViewState.infoText : stringResource7, (i & 2048) != 0 ? reviewAcatsInViewState.primaryCtaText : stringResource8, (i & 4096) != 0 ? reviewAcatsInViewState.secondaryCtaText : stringResource9);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final StringResource getMatchValue() {
        return this.matchValue;
    }

    /* renamed from: component11, reason: from getter */
    public final StringResource getInfoText() {
        return this.infoText;
    }

    /* renamed from: component12, reason: from getter */
    public final StringResource getPrimaryCtaText() {
        return this.primaryCtaText;
    }

    /* renamed from: component13, reason: from getter */
    public final StringResource getSecondaryCtaText() {
        return this.secondaryCtaText;
    }

    /* renamed from: component2, reason: from getter */
    public final String getContraBrokerageName() {
        return this.contraBrokerageName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getContraBrokerageLogoUrl() {
        return this.contraBrokerageLogoUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getContraAccountNumber() {
        return this.contraAccountNumber;
    }

    /* renamed from: component5, reason: from getter */
    public final StringResource getAssetsValue() {
        return this.assetsValue;
    }

    /* renamed from: component6, reason: from getter */
    public final StringResource getRhAccountName() {
        return this.rhAccountName;
    }

    /* renamed from: component7, reason: from getter */
    public final StringResource getRhAccountOwnerLabel() {
        return this.rhAccountOwnerLabel;
    }

    public final ImmutableList<String> component8() {
        return this.rhAccountOwnerNames;
    }

    /* renamed from: component9, reason: from getter */
    public final StringResource getMatchLabel() {
        return this.matchLabel;
    }

    public final ReviewAcatsInViewState copy(StringResource title, String contraBrokerageName, String contraBrokerageLogoUrl, String contraAccountNumber, StringResource assetsValue, StringResource rhAccountName, StringResource rhAccountOwnerLabel, ImmutableList<String> rhAccountOwnerNames, StringResource matchLabel, StringResource matchValue, StringResource infoText, StringResource primaryCtaText, StringResource secondaryCtaText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(contraBrokerageName, "contraBrokerageName");
        Intrinsics.checkNotNullParameter(contraAccountNumber, "contraAccountNumber");
        Intrinsics.checkNotNullParameter(rhAccountName, "rhAccountName");
        Intrinsics.checkNotNullParameter(rhAccountOwnerLabel, "rhAccountOwnerLabel");
        Intrinsics.checkNotNullParameter(rhAccountOwnerNames, "rhAccountOwnerNames");
        Intrinsics.checkNotNullParameter(infoText, "infoText");
        Intrinsics.checkNotNullParameter(primaryCtaText, "primaryCtaText");
        return new ReviewAcatsInViewState(title, contraBrokerageName, contraBrokerageLogoUrl, contraAccountNumber, assetsValue, rhAccountName, rhAccountOwnerLabel, rhAccountOwnerNames, matchLabel, matchValue, infoText, primaryCtaText, secondaryCtaText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewAcatsInViewState)) {
            return false;
        }
        ReviewAcatsInViewState reviewAcatsInViewState = (ReviewAcatsInViewState) other;
        return Intrinsics.areEqual(this.title, reviewAcatsInViewState.title) && Intrinsics.areEqual(this.contraBrokerageName, reviewAcatsInViewState.contraBrokerageName) && Intrinsics.areEqual(this.contraBrokerageLogoUrl, reviewAcatsInViewState.contraBrokerageLogoUrl) && Intrinsics.areEqual(this.contraAccountNumber, reviewAcatsInViewState.contraAccountNumber) && Intrinsics.areEqual(this.assetsValue, reviewAcatsInViewState.assetsValue) && Intrinsics.areEqual(this.rhAccountName, reviewAcatsInViewState.rhAccountName) && Intrinsics.areEqual(this.rhAccountOwnerLabel, reviewAcatsInViewState.rhAccountOwnerLabel) && Intrinsics.areEqual(this.rhAccountOwnerNames, reviewAcatsInViewState.rhAccountOwnerNames) && Intrinsics.areEqual(this.matchLabel, reviewAcatsInViewState.matchLabel) && Intrinsics.areEqual(this.matchValue, reviewAcatsInViewState.matchValue) && Intrinsics.areEqual(this.infoText, reviewAcatsInViewState.infoText) && Intrinsics.areEqual(this.primaryCtaText, reviewAcatsInViewState.primaryCtaText) && Intrinsics.areEqual(this.secondaryCtaText, reviewAcatsInViewState.secondaryCtaText);
    }

    public int hashCode() {
        int iHashCode = ((this.title.hashCode() * 31) + this.contraBrokerageName.hashCode()) * 31;
        String str = this.contraBrokerageLogoUrl;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.contraAccountNumber.hashCode()) * 31;
        StringResource stringResource = this.assetsValue;
        int iHashCode3 = (((((((iHashCode2 + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + this.rhAccountName.hashCode()) * 31) + this.rhAccountOwnerLabel.hashCode()) * 31) + this.rhAccountOwnerNames.hashCode()) * 31;
        StringResource stringResource2 = this.matchLabel;
        int iHashCode4 = (iHashCode3 + (stringResource2 == null ? 0 : stringResource2.hashCode())) * 31;
        StringResource stringResource3 = this.matchValue;
        int iHashCode5 = (((((iHashCode4 + (stringResource3 == null ? 0 : stringResource3.hashCode())) * 31) + this.infoText.hashCode()) * 31) + this.primaryCtaText.hashCode()) * 31;
        StringResource stringResource4 = this.secondaryCtaText;
        return iHashCode5 + (stringResource4 != null ? stringResource4.hashCode() : 0);
    }

    public String toString() {
        return "ReviewAcatsInViewState(title=" + this.title + ", contraBrokerageName=" + this.contraBrokerageName + ", contraBrokerageLogoUrl=" + this.contraBrokerageLogoUrl + ", contraAccountNumber=" + this.contraAccountNumber + ", assetsValue=" + this.assetsValue + ", rhAccountName=" + this.rhAccountName + ", rhAccountOwnerLabel=" + this.rhAccountOwnerLabel + ", rhAccountOwnerNames=" + this.rhAccountOwnerNames + ", matchLabel=" + this.matchLabel + ", matchValue=" + this.matchValue + ", infoText=" + this.infoText + ", primaryCtaText=" + this.primaryCtaText + ", secondaryCtaText=" + this.secondaryCtaText + ")";
    }

    public ReviewAcatsInViewState(StringResource title, String contraBrokerageName, String str, String contraAccountNumber, StringResource stringResource, StringResource rhAccountName, StringResource rhAccountOwnerLabel, ImmutableList<String> rhAccountOwnerNames, StringResource stringResource2, StringResource stringResource3, StringResource infoText, StringResource primaryCtaText, StringResource stringResource4) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(contraBrokerageName, "contraBrokerageName");
        Intrinsics.checkNotNullParameter(contraAccountNumber, "contraAccountNumber");
        Intrinsics.checkNotNullParameter(rhAccountName, "rhAccountName");
        Intrinsics.checkNotNullParameter(rhAccountOwnerLabel, "rhAccountOwnerLabel");
        Intrinsics.checkNotNullParameter(rhAccountOwnerNames, "rhAccountOwnerNames");
        Intrinsics.checkNotNullParameter(infoText, "infoText");
        Intrinsics.checkNotNullParameter(primaryCtaText, "primaryCtaText");
        this.title = title;
        this.contraBrokerageName = contraBrokerageName;
        this.contraBrokerageLogoUrl = str;
        this.contraAccountNumber = contraAccountNumber;
        this.assetsValue = stringResource;
        this.rhAccountName = rhAccountName;
        this.rhAccountOwnerLabel = rhAccountOwnerLabel;
        this.rhAccountOwnerNames = rhAccountOwnerNames;
        this.matchLabel = stringResource2;
        this.matchValue = stringResource3;
        this.infoText = infoText;
        this.primaryCtaText = primaryCtaText;
        this.secondaryCtaText = stringResource4;
    }

    public final StringResource getTitle() {
        return this.title;
    }

    public final String getContraBrokerageName() {
        return this.contraBrokerageName;
    }

    public final String getContraBrokerageLogoUrl() {
        return this.contraBrokerageLogoUrl;
    }

    public final String getContraAccountNumber() {
        return this.contraAccountNumber;
    }

    public final StringResource getAssetsValue() {
        return this.assetsValue;
    }

    public final StringResource getRhAccountName() {
        return this.rhAccountName;
    }

    public final StringResource getRhAccountOwnerLabel() {
        return this.rhAccountOwnerLabel;
    }

    public final ImmutableList<String> getRhAccountOwnerNames() {
        return this.rhAccountOwnerNames;
    }

    public final StringResource getMatchLabel() {
        return this.matchLabel;
    }

    public final StringResource getMatchValue() {
        return this.matchValue;
    }

    public final StringResource getInfoText() {
        return this.infoText;
    }

    public final StringResource getPrimaryCtaText() {
        return this.primaryCtaText;
    }

    public final StringResource getSecondaryCtaText() {
        return this.secondaryCtaText;
    }
}
