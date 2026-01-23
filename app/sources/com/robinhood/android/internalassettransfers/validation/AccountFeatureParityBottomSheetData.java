package com.robinhood.android.internalassettransfers.validation;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountFeatureParityBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011JD\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/validation/AccountFeatureParityBottomSheetData;", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "subtitle", "primaryButtonText", "secondaryButtonText", "pogResourceId", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/Integer;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getSubtitle", "getPrimaryButtonText", "getSecondaryButtonText", "getPogResourceId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/Integer;)Lcom/robinhood/android/internalassettransfers/validation/AccountFeatureParityBottomSheetData;", "equals", "", "other", "hashCode", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AccountFeatureParityBottomSheetData {
    public static final int $stable = StringResource.$stable;
    private final Integer pogResourceId;
    private final StringResource primaryButtonText;
    private final StringResource secondaryButtonText;
    private final StringResource subtitle;
    private final StringResource title;

    public static /* synthetic */ AccountFeatureParityBottomSheetData copy$default(AccountFeatureParityBottomSheetData accountFeatureParityBottomSheetData, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, StringResource stringResource4, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = accountFeatureParityBottomSheetData.title;
        }
        if ((i & 2) != 0) {
            stringResource2 = accountFeatureParityBottomSheetData.subtitle;
        }
        if ((i & 4) != 0) {
            stringResource3 = accountFeatureParityBottomSheetData.primaryButtonText;
        }
        if ((i & 8) != 0) {
            stringResource4 = accountFeatureParityBottomSheetData.secondaryButtonText;
        }
        if ((i & 16) != 0) {
            num = accountFeatureParityBottomSheetData.pogResourceId;
        }
        Integer num2 = num;
        StringResource stringResource5 = stringResource3;
        return accountFeatureParityBottomSheetData.copy(stringResource, stringResource2, stringResource5, stringResource4, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    /* renamed from: component4, reason: from getter */
    public final StringResource getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getPogResourceId() {
        return this.pogResourceId;
    }

    public final AccountFeatureParityBottomSheetData copy(StringResource title, StringResource subtitle, StringResource primaryButtonText, StringResource secondaryButtonText, Integer pogResourceId) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        return new AccountFeatureParityBottomSheetData(title, subtitle, primaryButtonText, secondaryButtonText, pogResourceId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountFeatureParityBottomSheetData)) {
            return false;
        }
        AccountFeatureParityBottomSheetData accountFeatureParityBottomSheetData = (AccountFeatureParityBottomSheetData) other;
        return Intrinsics.areEqual(this.title, accountFeatureParityBottomSheetData.title) && Intrinsics.areEqual(this.subtitle, accountFeatureParityBottomSheetData.subtitle) && Intrinsics.areEqual(this.primaryButtonText, accountFeatureParityBottomSheetData.primaryButtonText) && Intrinsics.areEqual(this.secondaryButtonText, accountFeatureParityBottomSheetData.secondaryButtonText) && Intrinsics.areEqual(this.pogResourceId, accountFeatureParityBottomSheetData.pogResourceId);
    }

    public int hashCode() {
        int iHashCode = ((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.primaryButtonText.hashCode()) * 31;
        StringResource stringResource = this.secondaryButtonText;
        int iHashCode2 = (iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
        Integer num = this.pogResourceId;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "AccountFeatureParityBottomSheetData(title=" + this.title + ", subtitle=" + this.subtitle + ", primaryButtonText=" + this.primaryButtonText + ", secondaryButtonText=" + this.secondaryButtonText + ", pogResourceId=" + this.pogResourceId + ")";
    }

    public AccountFeatureParityBottomSheetData(StringResource title, StringResource subtitle, StringResource primaryButtonText, StringResource stringResource, Integer num) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        this.title = title;
        this.subtitle = subtitle;
        this.primaryButtonText = primaryButtonText;
        this.secondaryButtonText = stringResource;
        this.pogResourceId = num;
    }

    public /* synthetic */ AccountFeatureParityBottomSheetData(StringResource stringResource, StringResource stringResource2, StringResource stringResource3, StringResource stringResource4, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stringResource, stringResource2, stringResource3, stringResource4, (i & 16) != 0 ? null : num);
    }

    public final StringResource getTitle() {
        return this.title;
    }

    public final StringResource getSubtitle() {
        return this.subtitle;
    }

    public final StringResource getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    public final StringResource getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    public final Integer getPogResourceId() {
        return this.pogResourceId;
    }
}
