package com.robinhood.android.gold.lib.hub.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiGoldHub.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u00052\b\b\u0003\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001eHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/hub/api/ApiGoldEarningsCylinderChartSegment;", "Landroid/os/Parcelable;", "sideColor", "", "fillColorGradient", "Lcom/robinhood/android/gold/lib/hub/api/ApiGoldEarningsLinearGradientColor;", "weight", "", "fill", "emptyColorGradient", "borderColor", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/gold/lib/hub/api/ApiGoldEarningsLinearGradientColor;FFLcom/robinhood/android/gold/lib/hub/api/ApiGoldEarningsLinearGradientColor;Ljava/lang/String;)V", "getSideColor", "()Ljava/lang/String;", "getFillColorGradient", "()Lcom/robinhood/android/gold/lib/hub/api/ApiGoldEarningsLinearGradientColor;", "getWeight", "()F", "getFill", "getEmptyColorGradient", "getBorderColor", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ApiGoldEarningsCylinderChartSegment implements Parcelable {
    public static final Parcelable.Creator<ApiGoldEarningsCylinderChartSegment> CREATOR = new Creator();
    private final String borderColor;
    private final ApiGoldEarningsLinearGradientColor emptyColorGradient;
    private final float fill;
    private final ApiGoldEarningsLinearGradientColor fillColorGradient;
    private final String sideColor;
    private final float weight;

    /* compiled from: ApiGoldHub.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ApiGoldEarningsCylinderChartSegment> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldEarningsCylinderChartSegment createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            Parcelable.Creator<ApiGoldEarningsLinearGradientColor> creator = ApiGoldEarningsLinearGradientColor.CREATOR;
            return new ApiGoldEarningsCylinderChartSegment(string2, creator.createFromParcel(parcel), parcel.readFloat(), parcel.readFloat(), creator.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldEarningsCylinderChartSegment[] newArray(int i) {
            return new ApiGoldEarningsCylinderChartSegment[i];
        }
    }

    public static /* synthetic */ ApiGoldEarningsCylinderChartSegment copy$default(ApiGoldEarningsCylinderChartSegment apiGoldEarningsCylinderChartSegment, String str, ApiGoldEarningsLinearGradientColor apiGoldEarningsLinearGradientColor, float f, float f2, ApiGoldEarningsLinearGradientColor apiGoldEarningsLinearGradientColor2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiGoldEarningsCylinderChartSegment.sideColor;
        }
        if ((i & 2) != 0) {
            apiGoldEarningsLinearGradientColor = apiGoldEarningsCylinderChartSegment.fillColorGradient;
        }
        if ((i & 4) != 0) {
            f = apiGoldEarningsCylinderChartSegment.weight;
        }
        if ((i & 8) != 0) {
            f2 = apiGoldEarningsCylinderChartSegment.fill;
        }
        if ((i & 16) != 0) {
            apiGoldEarningsLinearGradientColor2 = apiGoldEarningsCylinderChartSegment.emptyColorGradient;
        }
        if ((i & 32) != 0) {
            str2 = apiGoldEarningsCylinderChartSegment.borderColor;
        }
        ApiGoldEarningsLinearGradientColor apiGoldEarningsLinearGradientColor3 = apiGoldEarningsLinearGradientColor2;
        String str3 = str2;
        return apiGoldEarningsCylinderChartSegment.copy(str, apiGoldEarningsLinearGradientColor, f, f2, apiGoldEarningsLinearGradientColor3, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSideColor() {
        return this.sideColor;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiGoldEarningsLinearGradientColor getFillColorGradient() {
        return this.fillColorGradient;
    }

    /* renamed from: component3, reason: from getter */
    public final float getWeight() {
        return this.weight;
    }

    /* renamed from: component4, reason: from getter */
    public final float getFill() {
        return this.fill;
    }

    /* renamed from: component5, reason: from getter */
    public final ApiGoldEarningsLinearGradientColor getEmptyColorGradient() {
        return this.emptyColorGradient;
    }

    /* renamed from: component6, reason: from getter */
    public final String getBorderColor() {
        return this.borderColor;
    }

    public final ApiGoldEarningsCylinderChartSegment copy(@Json(name = "side_color") String sideColor, @Json(name = "fill_color_gradient") ApiGoldEarningsLinearGradientColor fillColorGradient, float weight, float fill, @Json(name = "empty_color_gradient") ApiGoldEarningsLinearGradientColor emptyColorGradient, @Json(name = "border_color") String borderColor) {
        Intrinsics.checkNotNullParameter(sideColor, "sideColor");
        Intrinsics.checkNotNullParameter(fillColorGradient, "fillColorGradient");
        Intrinsics.checkNotNullParameter(emptyColorGradient, "emptyColorGradient");
        Intrinsics.checkNotNullParameter(borderColor, "borderColor");
        return new ApiGoldEarningsCylinderChartSegment(sideColor, fillColorGradient, weight, fill, emptyColorGradient, borderColor);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiGoldEarningsCylinderChartSegment)) {
            return false;
        }
        ApiGoldEarningsCylinderChartSegment apiGoldEarningsCylinderChartSegment = (ApiGoldEarningsCylinderChartSegment) other;
        return Intrinsics.areEqual(this.sideColor, apiGoldEarningsCylinderChartSegment.sideColor) && Intrinsics.areEqual(this.fillColorGradient, apiGoldEarningsCylinderChartSegment.fillColorGradient) && Float.compare(this.weight, apiGoldEarningsCylinderChartSegment.weight) == 0 && Float.compare(this.fill, apiGoldEarningsCylinderChartSegment.fill) == 0 && Intrinsics.areEqual(this.emptyColorGradient, apiGoldEarningsCylinderChartSegment.emptyColorGradient) && Intrinsics.areEqual(this.borderColor, apiGoldEarningsCylinderChartSegment.borderColor);
    }

    public int hashCode() {
        return (((((((((this.sideColor.hashCode() * 31) + this.fillColorGradient.hashCode()) * 31) + Float.hashCode(this.weight)) * 31) + Float.hashCode(this.fill)) * 31) + this.emptyColorGradient.hashCode()) * 31) + this.borderColor.hashCode();
    }

    public String toString() {
        return "ApiGoldEarningsCylinderChartSegment(sideColor=" + this.sideColor + ", fillColorGradient=" + this.fillColorGradient + ", weight=" + this.weight + ", fill=" + this.fill + ", emptyColorGradient=" + this.emptyColorGradient + ", borderColor=" + this.borderColor + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.sideColor);
        this.fillColorGradient.writeToParcel(dest, flags);
        dest.writeFloat(this.weight);
        dest.writeFloat(this.fill);
        this.emptyColorGradient.writeToParcel(dest, flags);
        dest.writeString(this.borderColor);
    }

    public ApiGoldEarningsCylinderChartSegment(@Json(name = "side_color") String sideColor, @Json(name = "fill_color_gradient") ApiGoldEarningsLinearGradientColor fillColorGradient, float f, float f2, @Json(name = "empty_color_gradient") ApiGoldEarningsLinearGradientColor emptyColorGradient, @Json(name = "border_color") String borderColor) {
        Intrinsics.checkNotNullParameter(sideColor, "sideColor");
        Intrinsics.checkNotNullParameter(fillColorGradient, "fillColorGradient");
        Intrinsics.checkNotNullParameter(emptyColorGradient, "emptyColorGradient");
        Intrinsics.checkNotNullParameter(borderColor, "borderColor");
        this.sideColor = sideColor;
        this.fillColorGradient = fillColorGradient;
        this.weight = f;
        this.fill = f2;
        this.emptyColorGradient = emptyColorGradient;
        this.borderColor = borderColor;
    }

    public final String getSideColor() {
        return this.sideColor;
    }

    public final ApiGoldEarningsLinearGradientColor getFillColorGradient() {
        return this.fillColorGradient;
    }

    public final float getWeight() {
        return this.weight;
    }

    public final float getFill() {
        return this.fill;
    }

    public final ApiGoldEarningsLinearGradientColor getEmptyColorGradient() {
        return this.emptyColorGradient;
    }

    public final String getBorderColor() {
        return this.borderColor;
    }
}
