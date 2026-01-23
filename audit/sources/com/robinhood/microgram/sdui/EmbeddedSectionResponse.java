package com.robinhood.microgram.sdui;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmbeddedSectionResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/EmbeddedSectionResponse;", "Landroid/os/Parcelable;", "screenType", "", "identifier", "encodedInitialContent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getScreenType", "()Ljava/lang/String;", "getIdentifier", "getEncodedInitialContent", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-microgram-sdui-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EmbeddedSectionResponse implements Parcelable {
    public static final Parcelable.Creator<EmbeddedSectionResponse> CREATOR = new Creator();
    private final String encodedInitialContent;
    private final String identifier;
    private final String screenType;

    /* compiled from: EmbeddedSectionResponse.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<EmbeddedSectionResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EmbeddedSectionResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EmbeddedSectionResponse(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EmbeddedSectionResponse[] newArray(int i) {
            return new EmbeddedSectionResponse[i];
        }
    }

    public static /* synthetic */ EmbeddedSectionResponse copy$default(EmbeddedSectionResponse embeddedSectionResponse, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = embeddedSectionResponse.screenType;
        }
        if ((i & 2) != 0) {
            str2 = embeddedSectionResponse.identifier;
        }
        if ((i & 4) != 0) {
            str3 = embeddedSectionResponse.encodedInitialContent;
        }
        return embeddedSectionResponse.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getScreenType() {
        return this.screenType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEncodedInitialContent() {
        return this.encodedInitialContent;
    }

    public final EmbeddedSectionResponse copy(String screenType, String identifier, String encodedInitialContent) {
        Intrinsics.checkNotNullParameter(screenType, "screenType");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(encodedInitialContent, "encodedInitialContent");
        return new EmbeddedSectionResponse(screenType, identifier, encodedInitialContent);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmbeddedSectionResponse)) {
            return false;
        }
        EmbeddedSectionResponse embeddedSectionResponse = (EmbeddedSectionResponse) other;
        return Intrinsics.areEqual(this.screenType, embeddedSectionResponse.screenType) && Intrinsics.areEqual(this.identifier, embeddedSectionResponse.identifier) && Intrinsics.areEqual(this.encodedInitialContent, embeddedSectionResponse.encodedInitialContent);
    }

    public int hashCode() {
        return (((this.screenType.hashCode() * 31) + this.identifier.hashCode()) * 31) + this.encodedInitialContent.hashCode();
    }

    public String toString() {
        return "EmbeddedSectionResponse(screenType=" + this.screenType + ", identifier=" + this.identifier + ", encodedInitialContent=" + this.encodedInitialContent + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.screenType);
        dest.writeString(this.identifier);
        dest.writeString(this.encodedInitialContent);
    }

    public EmbeddedSectionResponse(String screenType, String identifier, String encodedInitialContent) {
        Intrinsics.checkNotNullParameter(screenType, "screenType");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(encodedInitialContent, "encodedInitialContent");
        this.screenType = screenType;
        this.identifier = identifier;
        this.encodedInitialContent = encodedInitialContent;
    }

    public final String getScreenType() {
        return this.screenType;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getEncodedInitialContent() {
        return this.encodedInitialContent;
    }
}
