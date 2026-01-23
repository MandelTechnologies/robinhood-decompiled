package com.robinhood.android.gold.lib.hub.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldSegmentedControl.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/hub/api/GoldSegmentedControl;", "Landroid/os/Parcelable;", "title", "", "type", "rhsAccountNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getType", "getRhsAccountNumber", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class GoldSegmentedControl implements Parcelable {
    public static final Parcelable.Creator<GoldSegmentedControl> CREATOR = new Creator();
    private final String rhsAccountNumber;
    private final String title;
    private final String type;

    /* compiled from: GoldSegmentedControl.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<GoldSegmentedControl> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldSegmentedControl createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GoldSegmentedControl(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldSegmentedControl[] newArray(int i) {
            return new GoldSegmentedControl[i];
        }
    }

    public static /* synthetic */ GoldSegmentedControl copy$default(GoldSegmentedControl goldSegmentedControl, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = goldSegmentedControl.title;
        }
        if ((i & 2) != 0) {
            str2 = goldSegmentedControl.type;
        }
        if ((i & 4) != 0) {
            str3 = goldSegmentedControl.rhsAccountNumber;
        }
        return goldSegmentedControl.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRhsAccountNumber() {
        return this.rhsAccountNumber;
    }

    public final GoldSegmentedControl copy(String title, String type2, @Json(name = "rhs_account_number") String rhsAccountNumber) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type2, "type");
        return new GoldSegmentedControl(title, type2, rhsAccountNumber);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoldSegmentedControl)) {
            return false;
        }
        GoldSegmentedControl goldSegmentedControl = (GoldSegmentedControl) other;
        return Intrinsics.areEqual(this.title, goldSegmentedControl.title) && Intrinsics.areEqual(this.type, goldSegmentedControl.type) && Intrinsics.areEqual(this.rhsAccountNumber, goldSegmentedControl.rhsAccountNumber);
    }

    public int hashCode() {
        int iHashCode = ((this.title.hashCode() * 31) + this.type.hashCode()) * 31;
        String str = this.rhsAccountNumber;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "GoldSegmentedControl(title=" + this.title + ", type=" + this.type + ", rhsAccountNumber=" + this.rhsAccountNumber + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.type);
        dest.writeString(this.rhsAccountNumber);
    }

    public GoldSegmentedControl(String title, String type2, @Json(name = "rhs_account_number") String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type2, "type");
        this.title = title;
        this.type = type2;
        this.rhsAccountNumber = str;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final String getRhsAccountNumber() {
        return this.rhsAccountNumber;
    }
}
