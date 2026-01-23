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
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\tHÆ\u0003JY\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tHÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020 HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/hub/api/ApiGoldEarningsTracker;", "Landroid/os/Parcelable;", "title", "", "amount", "lifetimeAmount", "Lcom/robinhood/android/gold/lib/hub/api/AnimatedAmountContent;", "description", "earningsRows", "", "Lcom/robinhood/android/gold/lib/hub/api/GoldEarningsSourceRow;", "chartData", "Lcom/robinhood/android/gold/lib/hub/api/ApiGoldEarningsCylinderChartSegment;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/gold/lib/hub/api/AnimatedAmountContent;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getAmount", "getLifetimeAmount", "()Lcom/robinhood/android/gold/lib/hub/api/AnimatedAmountContent;", "getDescription", "getEarningsRows", "()Ljava/util/List;", "getChartData", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ApiGoldEarningsTracker implements Parcelable {
    public static final Parcelable.Creator<ApiGoldEarningsTracker> CREATOR = new Creator();
    private final String amount;
    private final List<ApiGoldEarningsCylinderChartSegment> chartData;
    private final String description;
    private final List<GoldEarningsSourceRow> earningsRows;
    private final AnimatedAmountContent lifetimeAmount;
    private final String title;

    /* compiled from: ApiGoldHub.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ApiGoldEarningsTracker> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldEarningsTracker createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            AnimatedAmountContent animatedAmountContentCreateFromParcel = parcel.readInt() == 0 ? null : AnimatedAmountContent.CREATOR.createFromParcel(parcel);
            String string4 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(GoldEarningsSourceRow.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(ApiGoldEarningsCylinderChartSegment.CREATOR.createFromParcel(parcel));
            }
            return new ApiGoldEarningsTracker(string2, string3, animatedAmountContentCreateFromParcel, string4, arrayList, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldEarningsTracker[] newArray(int i) {
            return new ApiGoldEarningsTracker[i];
        }
    }

    public static /* synthetic */ ApiGoldEarningsTracker copy$default(ApiGoldEarningsTracker apiGoldEarningsTracker, String str, String str2, AnimatedAmountContent animatedAmountContent, String str3, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiGoldEarningsTracker.title;
        }
        if ((i & 2) != 0) {
            str2 = apiGoldEarningsTracker.amount;
        }
        if ((i & 4) != 0) {
            animatedAmountContent = apiGoldEarningsTracker.lifetimeAmount;
        }
        if ((i & 8) != 0) {
            str3 = apiGoldEarningsTracker.description;
        }
        if ((i & 16) != 0) {
            list = apiGoldEarningsTracker.earningsRows;
        }
        if ((i & 32) != 0) {
            list2 = apiGoldEarningsTracker.chartData;
        }
        List list3 = list;
        List list4 = list2;
        return apiGoldEarningsTracker.copy(str, str2, animatedAmountContent, str3, list3, list4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    /* renamed from: component3, reason: from getter */
    public final AnimatedAmountContent getLifetimeAmount() {
        return this.lifetimeAmount;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final List<GoldEarningsSourceRow> component5() {
        return this.earningsRows;
    }

    public final List<ApiGoldEarningsCylinderChartSegment> component6() {
        return this.chartData;
    }

    public final ApiGoldEarningsTracker copy(String title, String amount, @Json(name = "lifetime_amount") AnimatedAmountContent lifetimeAmount, String description, @Json(name = "earnings_row_list") List<GoldEarningsSourceRow> earningsRows, @Json(name = "chart_data") List<ApiGoldEarningsCylinderChartSegment> chartData) {
        Intrinsics.checkNotNullParameter(earningsRows, "earningsRows");
        Intrinsics.checkNotNullParameter(chartData, "chartData");
        return new ApiGoldEarningsTracker(title, amount, lifetimeAmount, description, earningsRows, chartData);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiGoldEarningsTracker)) {
            return false;
        }
        ApiGoldEarningsTracker apiGoldEarningsTracker = (ApiGoldEarningsTracker) other;
        return Intrinsics.areEqual(this.title, apiGoldEarningsTracker.title) && Intrinsics.areEqual(this.amount, apiGoldEarningsTracker.amount) && Intrinsics.areEqual(this.lifetimeAmount, apiGoldEarningsTracker.lifetimeAmount) && Intrinsics.areEqual(this.description, apiGoldEarningsTracker.description) && Intrinsics.areEqual(this.earningsRows, apiGoldEarningsTracker.earningsRows) && Intrinsics.areEqual(this.chartData, apiGoldEarningsTracker.chartData);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.amount;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AnimatedAmountContent animatedAmountContent = this.lifetimeAmount;
        int iHashCode3 = (iHashCode2 + (animatedAmountContent == null ? 0 : animatedAmountContent.hashCode())) * 31;
        String str3 = this.description;
        return ((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.earningsRows.hashCode()) * 31) + this.chartData.hashCode();
    }

    public String toString() {
        return "ApiGoldEarningsTracker(title=" + this.title + ", amount=" + this.amount + ", lifetimeAmount=" + this.lifetimeAmount + ", description=" + this.description + ", earningsRows=" + this.earningsRows + ", chartData=" + this.chartData + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.amount);
        AnimatedAmountContent animatedAmountContent = this.lifetimeAmount;
        if (animatedAmountContent == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            animatedAmountContent.writeToParcel(dest, flags);
        }
        dest.writeString(this.description);
        List<GoldEarningsSourceRow> list = this.earningsRows;
        dest.writeInt(list.size());
        Iterator<GoldEarningsSourceRow> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        List<ApiGoldEarningsCylinderChartSegment> list2 = this.chartData;
        dest.writeInt(list2.size());
        Iterator<ApiGoldEarningsCylinderChartSegment> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(dest, flags);
        }
    }

    public ApiGoldEarningsTracker(String str, String str2, @Json(name = "lifetime_amount") AnimatedAmountContent animatedAmountContent, String str3, @Json(name = "earnings_row_list") List<GoldEarningsSourceRow> earningsRows, @Json(name = "chart_data") List<ApiGoldEarningsCylinderChartSegment> chartData) {
        Intrinsics.checkNotNullParameter(earningsRows, "earningsRows");
        Intrinsics.checkNotNullParameter(chartData, "chartData");
        this.title = str;
        this.amount = str2;
        this.lifetimeAmount = animatedAmountContent;
        this.description = str3;
        this.earningsRows = earningsRows;
        this.chartData = chartData;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final AnimatedAmountContent getLifetimeAmount() {
        return this.lifetimeAmount;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<GoldEarningsSourceRow> getEarningsRows() {
        return this.earningsRows;
    }

    public final List<ApiGoldEarningsCylinderChartSegment> getChartData() {
        return this.chartData;
    }
}
