package com.robinhood.staticcontent.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.car.result.CarResultComposable2;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdentifiableTitleAndBody.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/IdentifiableTitleAndBody;", "Landroid/os/Parcelable;", "identifier", "", "title", CarResultComposable2.BODY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "getTitle", "getBody", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class IdentifiableTitleAndBody implements Parcelable {
    public static final Parcelable.Creator<IdentifiableTitleAndBody> CREATOR = new Creator();
    private final String body;
    private final String identifier;
    private final String title;

    /* compiled from: IdentifiableTitleAndBody.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes12.dex */
    public static final class Creator implements Parcelable.Creator<IdentifiableTitleAndBody> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IdentifiableTitleAndBody createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IdentifiableTitleAndBody(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IdentifiableTitleAndBody[] newArray(int i) {
            return new IdentifiableTitleAndBody[i];
        }
    }

    public static /* synthetic */ IdentifiableTitleAndBody copy$default(IdentifiableTitleAndBody identifiableTitleAndBody, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = identifiableTitleAndBody.identifier;
        }
        if ((i & 2) != 0) {
            str2 = identifiableTitleAndBody.title;
        }
        if ((i & 4) != 0) {
            str3 = identifiableTitleAndBody.body;
        }
        return identifiableTitleAndBody.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    public final IdentifiableTitleAndBody copy(String identifier, String title, String body) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(title, "title");
        return new IdentifiableTitleAndBody(identifier, title, body);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdentifiableTitleAndBody)) {
            return false;
        }
        IdentifiableTitleAndBody identifiableTitleAndBody = (IdentifiableTitleAndBody) other;
        return Intrinsics.areEqual(this.identifier, identifiableTitleAndBody.identifier) && Intrinsics.areEqual(this.title, identifiableTitleAndBody.title) && Intrinsics.areEqual(this.body, identifiableTitleAndBody.body);
    }

    public int hashCode() {
        int iHashCode = ((this.identifier.hashCode() * 31) + this.title.hashCode()) * 31;
        String str = this.body;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "IdentifiableTitleAndBody(identifier=" + this.identifier + ", title=" + this.title + ", body=" + this.body + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.identifier);
        dest.writeString(this.title);
        dest.writeString(this.body);
    }

    public IdentifiableTitleAndBody(String identifier, String title, String str) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(title, "title");
        this.identifier = identifier;
        this.title = title;
        this.body = str;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getBody() {
        return this.body;
    }
}
