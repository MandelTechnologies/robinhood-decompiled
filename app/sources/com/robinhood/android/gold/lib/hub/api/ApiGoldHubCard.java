package com.robinhood.android.gold.lib.hub.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
import com.robinhood.models.serverdriven.experimental.api.GoldHubAction;
import com.robinhood.models.serverdriven.experimental.api.TextButton;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: ApiGoldHub.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0015JX\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020 HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\n\u0010\u0015¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubCard;", "Landroid/os/Parcelable;", "id", "", AnnotatedPrivateKey.LABEL, "content", AccountOverviewOptionsSettingCard4.CTA, "Lcom/robinhood/models/serverdriven/experimental/api/TextButton;", "Lcom/robinhood/models/serverdriven/experimental/api/GoldHubAction;", "imagePath", "isImageFullBleed", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/TextButton;Ljava/lang/String;Ljava/lang/Boolean;)V", "getId", "()Ljava/lang/String;", "getLabel", "getContent", "getCta", "()Lcom/robinhood/models/serverdriven/experimental/api/TextButton;", "getImagePath", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/TextButton;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubCard;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ApiGoldHubCard implements Parcelable {
    public static final Parcelable.Creator<ApiGoldHubCard> CREATOR = new Creator();
    private final String content;
    private final TextButton<GoldHubAction> cta;
    private final String id;
    private final String imagePath;
    private final Boolean isImageFullBleed;
    private final String label;

    /* compiled from: ApiGoldHub.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ApiGoldHubCard> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldHubCard createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            TextButton textButton = (TextButton) parcel.readParcelable(ApiGoldHubCard.class.getClassLoader());
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ApiGoldHubCard(string2, string3, string4, textButton, string5, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldHubCard[] newArray(int i) {
            return new ApiGoldHubCard[i];
        }
    }

    public static /* synthetic */ ApiGoldHubCard copy$default(ApiGoldHubCard apiGoldHubCard, String str, String str2, String str3, TextButton textButton, String str4, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiGoldHubCard.id;
        }
        if ((i & 2) != 0) {
            str2 = apiGoldHubCard.label;
        }
        if ((i & 4) != 0) {
            str3 = apiGoldHubCard.content;
        }
        if ((i & 8) != 0) {
            textButton = apiGoldHubCard.cta;
        }
        if ((i & 16) != 0) {
            str4 = apiGoldHubCard.imagePath;
        }
        if ((i & 32) != 0) {
            bool = apiGoldHubCard.isImageFullBleed;
        }
        String str5 = str4;
        Boolean bool2 = bool;
        return apiGoldHubCard.copy(str, str2, str3, textButton, str5, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component3, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    public final TextButton<GoldHubAction> component4() {
        return this.cta;
    }

    /* renamed from: component5, reason: from getter */
    public final String getImagePath() {
        return this.imagePath;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getIsImageFullBleed() {
        return this.isImageFullBleed;
    }

    public final ApiGoldHubCard copy(String id, String label, String content, TextButton<? extends GoldHubAction> cta, @Json(name = "image_path") String imagePath, @Json(name = "is_image_full_bleed") Boolean isImageFullBleed) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(content, "content");
        return new ApiGoldHubCard(id, label, content, cta, imagePath, isImageFullBleed);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiGoldHubCard)) {
            return false;
        }
        ApiGoldHubCard apiGoldHubCard = (ApiGoldHubCard) other;
        return Intrinsics.areEqual(this.id, apiGoldHubCard.id) && Intrinsics.areEqual(this.label, apiGoldHubCard.label) && Intrinsics.areEqual(this.content, apiGoldHubCard.content) && Intrinsics.areEqual(this.cta, apiGoldHubCard.cta) && Intrinsics.areEqual(this.imagePath, apiGoldHubCard.imagePath) && Intrinsics.areEqual(this.isImageFullBleed, apiGoldHubCard.isImageFullBleed);
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.label;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.content.hashCode()) * 31;
        TextButton<GoldHubAction> textButton = this.cta;
        int iHashCode3 = (iHashCode2 + (textButton == null ? 0 : textButton.hashCode())) * 31;
        String str2 = this.imagePath;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isImageFullBleed;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "ApiGoldHubCard(id=" + this.id + ", label=" + this.label + ", content=" + this.content + ", cta=" + this.cta + ", imagePath=" + this.imagePath + ", isImageFullBleed=" + this.isImageFullBleed + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.label);
        dest.writeString(this.content);
        dest.writeParcelable(this.cta, flags);
        dest.writeString(this.imagePath);
        Boolean bool = this.isImageFullBleed;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ApiGoldHubCard(String id, String str, String content, TextButton<? extends GoldHubAction> textButton, @Json(name = "image_path") String str2, @Json(name = "is_image_full_bleed") Boolean bool) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(content, "content");
        this.id = id;
        this.label = str;
        this.content = content;
        this.cta = textButton;
        this.imagePath = str2;
        this.isImageFullBleed = bool;
    }

    public /* synthetic */ ApiGoldHubCard(String str, String str2, String str3, TextButton textButton, String str4, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, textButton, str4, (i & 32) != 0 ? null : bool);
    }

    public final String getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getContent() {
        return this.content;
    }

    public final TextButton<GoldHubAction> getCta() {
        return this.cta;
    }

    public final String getImagePath() {
        return this.imagePath;
    }

    public final Boolean isImageFullBleed() {
        return this.isImageFullBleed;
    }
}
