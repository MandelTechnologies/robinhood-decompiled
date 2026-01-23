package com.robinhood.shared.chart.contracts.advancedChart;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.shared.models.advancedChart.api.ApiTechnicalIndicator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedChartEditIndicatorLaunchMode.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/chart/contracts/advancedChart/AdvancedChartEditIndicatorLaunchMode;", "Landroid/os/Parcelable;", "<init>", "()V", "Editing", "Adding", "Lcom/robinhood/shared/chart/contracts/advancedChart/AdvancedChartEditIndicatorLaunchMode$Adding;", "Lcom/robinhood/shared/chart/contracts/advancedChart/AdvancedChartEditIndicatorLaunchMode$Editing;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public abstract class AdvancedChartEditIndicatorLaunchMode implements Parcelable {
    public /* synthetic */ AdvancedChartEditIndicatorLaunchMode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AdvancedChartEditIndicatorLaunchMode() {
    }

    /* compiled from: AdvancedChartEditIndicatorLaunchMode.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/chart/contracts/advancedChart/AdvancedChartEditIndicatorLaunchMode$Editing;", "Lcom/robinhood/shared/chart/contracts/advancedChart/AdvancedChartEditIndicatorLaunchMode;", "apiTechnicalIndicator", "Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator;", "<init>", "(Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator;)V", "getApiTechnicalIndicator", "()Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Editing extends AdvancedChartEditIndicatorLaunchMode {
        public static final Parcelable.Creator<Editing> CREATOR = new Creator();
        private final ApiTechnicalIndicator apiTechnicalIndicator;

        /* compiled from: AdvancedChartEditIndicatorLaunchMode.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Editing> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Editing createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Editing((ApiTechnicalIndicator) parcel.readParcelable(Editing.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Editing[] newArray(int i) {
                return new Editing[i];
            }
        }

        public static /* synthetic */ Editing copy$default(Editing editing, ApiTechnicalIndicator apiTechnicalIndicator, int i, Object obj) {
            if ((i & 1) != 0) {
                apiTechnicalIndicator = editing.apiTechnicalIndicator;
            }
            return editing.copy(apiTechnicalIndicator);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiTechnicalIndicator getApiTechnicalIndicator() {
            return this.apiTechnicalIndicator;
        }

        public final Editing copy(ApiTechnicalIndicator apiTechnicalIndicator) {
            Intrinsics.checkNotNullParameter(apiTechnicalIndicator, "apiTechnicalIndicator");
            return new Editing(apiTechnicalIndicator);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Editing) && Intrinsics.areEqual(this.apiTechnicalIndicator, ((Editing) other).apiTechnicalIndicator);
        }

        public int hashCode() {
            return this.apiTechnicalIndicator.hashCode();
        }

        public String toString() {
            return "Editing(apiTechnicalIndicator=" + this.apiTechnicalIndicator + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.apiTechnicalIndicator, flags);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Editing(ApiTechnicalIndicator apiTechnicalIndicator) {
            super(null);
            Intrinsics.checkNotNullParameter(apiTechnicalIndicator, "apiTechnicalIndicator");
            this.apiTechnicalIndicator = apiTechnicalIndicator;
        }

        public final ApiTechnicalIndicator getApiTechnicalIndicator() {
            return this.apiTechnicalIndicator;
        }
    }

    /* compiled from: AdvancedChartEditIndicatorLaunchMode.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/chart/contracts/advancedChart/AdvancedChartEditIndicatorLaunchMode$Adding;", "Lcom/robinhood/shared/chart/contracts/advancedChart/AdvancedChartEditIndicatorLaunchMode;", "apiTechnicalIndicatorType", "Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator$Type;", "<init>", "(Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator$Type;)V", "getApiTechnicalIndicatorType", "()Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator$Type;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Adding extends AdvancedChartEditIndicatorLaunchMode {
        public static final Parcelable.Creator<Adding> CREATOR = new Creator();
        private final ApiTechnicalIndicator.Type apiTechnicalIndicatorType;

        /* compiled from: AdvancedChartEditIndicatorLaunchMode.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Adding> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Adding createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Adding(ApiTechnicalIndicator.Type.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Adding[] newArray(int i) {
                return new Adding[i];
            }
        }

        public static /* synthetic */ Adding copy$default(Adding adding, ApiTechnicalIndicator.Type type2, int i, Object obj) {
            if ((i & 1) != 0) {
                type2 = adding.apiTechnicalIndicatorType;
            }
            return adding.copy(type2);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiTechnicalIndicator.Type getApiTechnicalIndicatorType() {
            return this.apiTechnicalIndicatorType;
        }

        public final Adding copy(ApiTechnicalIndicator.Type apiTechnicalIndicatorType) {
            Intrinsics.checkNotNullParameter(apiTechnicalIndicatorType, "apiTechnicalIndicatorType");
            return new Adding(apiTechnicalIndicatorType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Adding) && this.apiTechnicalIndicatorType == ((Adding) other).apiTechnicalIndicatorType;
        }

        public int hashCode() {
            return this.apiTechnicalIndicatorType.hashCode();
        }

        public String toString() {
            return "Adding(apiTechnicalIndicatorType=" + this.apiTechnicalIndicatorType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.apiTechnicalIndicatorType.name());
        }

        public final ApiTechnicalIndicator.Type getApiTechnicalIndicatorType() {
            return this.apiTechnicalIndicatorType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Adding(ApiTechnicalIndicator.Type apiTechnicalIndicatorType) {
            super(null);
            Intrinsics.checkNotNullParameter(apiTechnicalIndicatorType, "apiTechnicalIndicatorType");
            this.apiTechnicalIndicatorType = apiTechnicalIndicatorType;
        }
    }
}
