package com.robinhood.android.gold.subscription.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.shared.crypto.transfer.send.amount.WarningSheetContent5;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiModels.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/gold/subscription/api/ApiGoldDowngradeConfirmation;", "Landroid/os/Parcelable;", "assetPath", "", "title", "descriptionMarkdown", "primaryCta", "Lcom/robinhood/android/gold/subscription/api/ApiGenericCta;", "secondaryCta", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/gold/subscription/api/ApiGenericCta;Lcom/robinhood/android/gold/subscription/api/ApiGenericCta;)V", "getAssetPath", "()Ljava/lang/String;", "getTitle", "getDescriptionMarkdown", "getPrimaryCta", "()Lcom/robinhood/android/gold/subscription/api/ApiGenericCta;", "getSecondaryCta", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-subscription_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ApiGoldDowngradeConfirmation implements Parcelable {
    public static final Parcelable.Creator<ApiGoldDowngradeConfirmation> CREATOR = new Creator();
    private final String assetPath;
    private final String descriptionMarkdown;
    private final ApiGenericCta primaryCta;
    private final ApiGenericCta secondaryCta;
    private final String title;

    /* compiled from: ApiModels.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ApiGoldDowngradeConfirmation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldDowngradeConfirmation createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Parcelable.Creator<ApiGenericCta> creator = ApiGenericCta.CREATOR;
            return new ApiGoldDowngradeConfirmation(string2, string3, string4, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldDowngradeConfirmation[] newArray(int i) {
            return new ApiGoldDowngradeConfirmation[i];
        }
    }

    public static /* synthetic */ ApiGoldDowngradeConfirmation copy$default(ApiGoldDowngradeConfirmation apiGoldDowngradeConfirmation, String str, String str2, String str3, ApiGenericCta apiGenericCta, ApiGenericCta apiGenericCta2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiGoldDowngradeConfirmation.assetPath;
        }
        if ((i & 2) != 0) {
            str2 = apiGoldDowngradeConfirmation.title;
        }
        if ((i & 4) != 0) {
            str3 = apiGoldDowngradeConfirmation.descriptionMarkdown;
        }
        if ((i & 8) != 0) {
            apiGenericCta = apiGoldDowngradeConfirmation.primaryCta;
        }
        if ((i & 16) != 0) {
            apiGenericCta2 = apiGoldDowngradeConfirmation.secondaryCta;
        }
        ApiGenericCta apiGenericCta3 = apiGenericCta2;
        String str4 = str3;
        return apiGoldDowngradeConfirmation.copy(str, str2, str4, apiGenericCta, apiGenericCta3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAssetPath() {
        return this.assetPath;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescriptionMarkdown() {
        return this.descriptionMarkdown;
    }

    /* renamed from: component4, reason: from getter */
    public final ApiGenericCta getPrimaryCta() {
        return this.primaryCta;
    }

    /* renamed from: component5, reason: from getter */
    public final ApiGenericCta getSecondaryCta() {
        return this.secondaryCta;
    }

    public final ApiGoldDowngradeConfirmation copy(@Json(name = "asset_path") String assetPath, String title, @Json(name = "description_markdown") String descriptionMarkdown, @Json(name = WarningSheetContent5.TEST_TAG_PRIMARY_CTA) ApiGenericCta primaryCta, @Json(name = WarningSheetContent5.TEST_TAG_SECONDARY_CTA) ApiGenericCta secondaryCta) {
        Intrinsics.checkNotNullParameter(assetPath, "assetPath");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(descriptionMarkdown, "descriptionMarkdown");
        Intrinsics.checkNotNullParameter(primaryCta, "primaryCta");
        return new ApiGoldDowngradeConfirmation(assetPath, title, descriptionMarkdown, primaryCta, secondaryCta);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiGoldDowngradeConfirmation)) {
            return false;
        }
        ApiGoldDowngradeConfirmation apiGoldDowngradeConfirmation = (ApiGoldDowngradeConfirmation) other;
        return Intrinsics.areEqual(this.assetPath, apiGoldDowngradeConfirmation.assetPath) && Intrinsics.areEqual(this.title, apiGoldDowngradeConfirmation.title) && Intrinsics.areEqual(this.descriptionMarkdown, apiGoldDowngradeConfirmation.descriptionMarkdown) && Intrinsics.areEqual(this.primaryCta, apiGoldDowngradeConfirmation.primaryCta) && Intrinsics.areEqual(this.secondaryCta, apiGoldDowngradeConfirmation.secondaryCta);
    }

    public int hashCode() {
        int iHashCode = ((((((this.assetPath.hashCode() * 31) + this.title.hashCode()) * 31) + this.descriptionMarkdown.hashCode()) * 31) + this.primaryCta.hashCode()) * 31;
        ApiGenericCta apiGenericCta = this.secondaryCta;
        return iHashCode + (apiGenericCta == null ? 0 : apiGenericCta.hashCode());
    }

    public String toString() {
        return "ApiGoldDowngradeConfirmation(assetPath=" + this.assetPath + ", title=" + this.title + ", descriptionMarkdown=" + this.descriptionMarkdown + ", primaryCta=" + this.primaryCta + ", secondaryCta=" + this.secondaryCta + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.assetPath);
        dest.writeString(this.title);
        dest.writeString(this.descriptionMarkdown);
        this.primaryCta.writeToParcel(dest, flags);
        ApiGenericCta apiGenericCta = this.secondaryCta;
        if (apiGenericCta == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            apiGenericCta.writeToParcel(dest, flags);
        }
    }

    public ApiGoldDowngradeConfirmation(@Json(name = "asset_path") String assetPath, String title, @Json(name = "description_markdown") String descriptionMarkdown, @Json(name = WarningSheetContent5.TEST_TAG_PRIMARY_CTA) ApiGenericCta primaryCta, @Json(name = WarningSheetContent5.TEST_TAG_SECONDARY_CTA) ApiGenericCta apiGenericCta) {
        Intrinsics.checkNotNullParameter(assetPath, "assetPath");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(descriptionMarkdown, "descriptionMarkdown");
        Intrinsics.checkNotNullParameter(primaryCta, "primaryCta");
        this.assetPath = assetPath;
        this.title = title;
        this.descriptionMarkdown = descriptionMarkdown;
        this.primaryCta = primaryCta;
        this.secondaryCta = apiGenericCta;
    }

    public final String getAssetPath() {
        return this.assetPath;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescriptionMarkdown() {
        return this.descriptionMarkdown;
    }

    public final ApiGenericCta getPrimaryCta() {
        return this.primaryCta;
    }

    public final ApiGenericCta getSecondaryCta() {
        return this.secondaryCta;
    }
}
