package com.robinhood.android.lib.margin.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InterestRateModels.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001)B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003J?\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/api/MarginInterestRateChoice;", "Landroid/os/Parcelable;", "title", "", "description", "interestRate", "Ljava/math/BigDecimal;", "planId", "Ljava/util/UUID;", "infoTag", "Lcom/robinhood/android/lib/margin/api/MarginInterestRateChoice$InfoTag;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/util/UUID;Lcom/robinhood/android/lib/margin/api/MarginInterestRateChoice$InfoTag;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getInterestRate", "()Ljava/math/BigDecimal;", "getPlanId", "()Ljava/util/UUID;", "getInfoTag", "()Lcom/robinhood/android/lib/margin/api/MarginInterestRateChoice$InfoTag;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "InfoTag", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MarginInterestRateChoice implements Parcelable {
    public static final Parcelable.Creator<MarginInterestRateChoice> CREATOR = new Creator();
    private final String description;
    private final InfoTag infoTag;
    private final BigDecimal interestRate;
    private final UUID planId;
    private final String title;

    /* compiled from: InterestRateModels.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<MarginInterestRateChoice> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarginInterestRateChoice createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MarginInterestRateChoice(parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (UUID) parcel.readSerializable(), parcel.readInt() == 0 ? null : InfoTag.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarginInterestRateChoice[] newArray(int i) {
            return new MarginInterestRateChoice[i];
        }
    }

    public static /* synthetic */ MarginInterestRateChoice copy$default(MarginInterestRateChoice marginInterestRateChoice, String str, String str2, BigDecimal bigDecimal, UUID uuid, InfoTag infoTag, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marginInterestRateChoice.title;
        }
        if ((i & 2) != 0) {
            str2 = marginInterestRateChoice.description;
        }
        if ((i & 4) != 0) {
            bigDecimal = marginInterestRateChoice.interestRate;
        }
        if ((i & 8) != 0) {
            uuid = marginInterestRateChoice.planId;
        }
        if ((i & 16) != 0) {
            infoTag = marginInterestRateChoice.infoTag;
        }
        InfoTag infoTag2 = infoTag;
        BigDecimal bigDecimal2 = bigDecimal;
        return marginInterestRateChoice.copy(str, str2, bigDecimal2, uuid, infoTag2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final BigDecimal getInterestRate() {
        return this.interestRate;
    }

    /* renamed from: component4, reason: from getter */
    public final UUID getPlanId() {
        return this.planId;
    }

    /* renamed from: component5, reason: from getter */
    public final InfoTag getInfoTag() {
        return this.infoTag;
    }

    public final MarginInterestRateChoice copy(String title, String description, @Json(name = "interest_rate") BigDecimal interestRate, @Json(name = "plan_id") UUID planId, @Json(name = "info_tag") InfoTag infoTag) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(interestRate, "interestRate");
        return new MarginInterestRateChoice(title, description, interestRate, planId, infoTag);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginInterestRateChoice)) {
            return false;
        }
        MarginInterestRateChoice marginInterestRateChoice = (MarginInterestRateChoice) other;
        return Intrinsics.areEqual(this.title, marginInterestRateChoice.title) && Intrinsics.areEqual(this.description, marginInterestRateChoice.description) && Intrinsics.areEqual(this.interestRate, marginInterestRateChoice.interestRate) && Intrinsics.areEqual(this.planId, marginInterestRateChoice.planId) && Intrinsics.areEqual(this.infoTag, marginInterestRateChoice.infoTag);
    }

    public int hashCode() {
        int iHashCode = ((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.interestRate.hashCode()) * 31;
        UUID uuid = this.planId;
        int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
        InfoTag infoTag = this.infoTag;
        return iHashCode2 + (infoTag != null ? infoTag.hashCode() : 0);
    }

    public String toString() {
        return "MarginInterestRateChoice(title=" + this.title + ", description=" + this.description + ", interestRate=" + this.interestRate + ", planId=" + this.planId + ", infoTag=" + this.infoTag + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeSerializable(this.interestRate);
        dest.writeSerializable(this.planId);
        InfoTag infoTag = this.infoTag;
        if (infoTag == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            infoTag.writeToParcel(dest, flags);
        }
    }

    public MarginInterestRateChoice(String title, String description, @Json(name = "interest_rate") BigDecimal interestRate, @Json(name = "plan_id") UUID uuid, @Json(name = "info_tag") InfoTag infoTag) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(interestRate, "interestRate");
        this.title = title;
        this.description = description;
        this.interestRate = interestRate;
        this.planId = uuid;
        this.infoTag = infoTag;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final BigDecimal getInterestRate() {
        return this.interestRate;
    }

    public final UUID getPlanId() {
        return this.planId;
    }

    public final InfoTag getInfoTag() {
        return this.infoTag;
    }

    /* compiled from: InterestRateModels.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/api/MarginInterestRateChoice$InfoTag;", "Landroid/os/Parcelable;", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InfoTag implements Parcelable {
        public static final Parcelable.Creator<InfoTag> CREATOR = new Creator();
        private final String text;

        /* compiled from: InterestRateModels.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<InfoTag> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InfoTag createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InfoTag(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InfoTag[] newArray(int i) {
                return new InfoTag[i];
            }
        }

        public static /* synthetic */ InfoTag copy$default(InfoTag infoTag, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = infoTag.text;
            }
            return infoTag.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final InfoTag copy(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new InfoTag(text);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InfoTag) && Intrinsics.areEqual(this.text, ((InfoTag) other).text);
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return "InfoTag(text=" + this.text + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.text);
        }

        public InfoTag(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
        }

        public final String getText() {
            return this.text;
        }
    }
}
