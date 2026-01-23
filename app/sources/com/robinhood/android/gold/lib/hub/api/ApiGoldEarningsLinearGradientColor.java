package com.robinhood.android.gold.lib.hub.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiGoldHub.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/hub/api/ApiGoldEarningsLinearGradientColor;", "Landroid/os/Parcelable;", "angle", "", "colorStops", "", "Lcom/robinhood/android/gold/lib/hub/api/ApiGoldEarningsColorStop;", "<init>", "(FLjava/util/List;)V", "getAngle", "()F", "getColorStops", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ApiGoldEarningsLinearGradientColor implements Parcelable {
    public static final Parcelable.Creator<ApiGoldEarningsLinearGradientColor> CREATOR = new Creator();
    private final float angle;
    private final List<ApiGoldEarningsColorStop> colorStops;

    /* compiled from: ApiGoldHub.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ApiGoldEarningsLinearGradientColor> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldEarningsLinearGradientColor createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            float f = parcel.readFloat();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(ApiGoldEarningsColorStop.CREATOR.createFromParcel(parcel));
            }
            return new ApiGoldEarningsLinearGradientColor(f, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldEarningsLinearGradientColor[] newArray(int i) {
            return new ApiGoldEarningsLinearGradientColor[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiGoldEarningsLinearGradientColor copy$default(ApiGoldEarningsLinearGradientColor apiGoldEarningsLinearGradientColor, float f, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            f = apiGoldEarningsLinearGradientColor.angle;
        }
        if ((i & 2) != 0) {
            list = apiGoldEarningsLinearGradientColor.colorStops;
        }
        return apiGoldEarningsLinearGradientColor.copy(f, list);
    }

    /* renamed from: component1, reason: from getter */
    public final float getAngle() {
        return this.angle;
    }

    public final List<ApiGoldEarningsColorStop> component2() {
        return this.colorStops;
    }

    public final ApiGoldEarningsLinearGradientColor copy(float angle, @Json(name = "color_stops") List<ApiGoldEarningsColorStop> colorStops) {
        Intrinsics.checkNotNullParameter(colorStops, "colorStops");
        return new ApiGoldEarningsLinearGradientColor(angle, colorStops);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiGoldEarningsLinearGradientColor)) {
            return false;
        }
        ApiGoldEarningsLinearGradientColor apiGoldEarningsLinearGradientColor = (ApiGoldEarningsLinearGradientColor) other;
        return Float.compare(this.angle, apiGoldEarningsLinearGradientColor.angle) == 0 && Intrinsics.areEqual(this.colorStops, apiGoldEarningsLinearGradientColor.colorStops);
    }

    public int hashCode() {
        return (Float.hashCode(this.angle) * 31) + this.colorStops.hashCode();
    }

    public String toString() {
        return "ApiGoldEarningsLinearGradientColor(angle=" + this.angle + ", colorStops=" + this.colorStops + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeFloat(this.angle);
        List<ApiGoldEarningsColorStop> list = this.colorStops;
        dest.writeInt(list.size());
        Iterator<ApiGoldEarningsColorStop> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public ApiGoldEarningsLinearGradientColor(float f, @Json(name = "color_stops") List<ApiGoldEarningsColorStop> colorStops) {
        Intrinsics.checkNotNullParameter(colorStops, "colorStops");
        this.angle = f;
        this.colorStops = colorStops;
    }

    public final float getAngle() {
        return this.angle;
    }

    public final List<ApiGoldEarningsColorStop> getColorStops() {
        return this.colorStops;
    }
}
