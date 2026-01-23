package com.robinhood.android.gold.lib.hub.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.utils.extensions.ResourceTypes;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiGoldHub.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/hub/api/ApiGoldEarningsColorStop;", "Landroid/os/Parcelable;", ResourceTypes.COLOR, "", "stop", "", "<init>", "(Ljava/lang/String;F)V", "getColor", "()Ljava/lang/String;", "getStop", "()F", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ApiGoldEarningsColorStop implements Parcelable {
    public static final Parcelable.Creator<ApiGoldEarningsColorStop> CREATOR = new Creator();
    private final String color;
    private final float stop;

    /* compiled from: ApiGoldHub.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ApiGoldEarningsColorStop> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldEarningsColorStop createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApiGoldEarningsColorStop(parcel.readString(), parcel.readFloat());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldEarningsColorStop[] newArray(int i) {
            return new ApiGoldEarningsColorStop[i];
        }
    }

    public static /* synthetic */ ApiGoldEarningsColorStop copy$default(ApiGoldEarningsColorStop apiGoldEarningsColorStop, String str, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiGoldEarningsColorStop.color;
        }
        if ((i & 2) != 0) {
            f = apiGoldEarningsColorStop.stop;
        }
        return apiGoldEarningsColorStop.copy(str, f);
    }

    /* renamed from: component1, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* renamed from: component2, reason: from getter */
    public final float getStop() {
        return this.stop;
    }

    public final ApiGoldEarningsColorStop copy(String color, float stop) {
        Intrinsics.checkNotNullParameter(color, "color");
        return new ApiGoldEarningsColorStop(color, stop);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiGoldEarningsColorStop)) {
            return false;
        }
        ApiGoldEarningsColorStop apiGoldEarningsColorStop = (ApiGoldEarningsColorStop) other;
        return Intrinsics.areEqual(this.color, apiGoldEarningsColorStop.color) && Float.compare(this.stop, apiGoldEarningsColorStop.stop) == 0;
    }

    public int hashCode() {
        return (this.color.hashCode() * 31) + Float.hashCode(this.stop);
    }

    public String toString() {
        return "ApiGoldEarningsColorStop(color=" + this.color + ", stop=" + this.stop + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.color);
        dest.writeFloat(this.stop);
    }

    public ApiGoldEarningsColorStop(String color, float f) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.color = color;
        this.stop = f;
    }

    public final String getColor() {
        return this.color;
    }

    public final float getStop() {
        return this.stop;
    }
}
