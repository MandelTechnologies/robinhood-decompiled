package com.robinhood.android.education.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.advanced.alert.p302db.AlertHubSettingItem;
import com.robinhood.models.p355ui.Historical;
import com.robinhood.shared.models.advancedChart.api.ApiTechnicalIndicator;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedAlert.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003J?\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u001fHÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/education/contracts/AlertHubCreateIndicatorAlert;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "instrumentId", "Ljava/util/UUID;", "indicatorName", "", "technicalIndicator", "Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator;", "alert", "Lcom/robinhood/models/advanced/alert/db/AlertHubSettingItem;", "chartInterval", "Lcom/robinhood/models/ui/Historical$Interval;", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator;Lcom/robinhood/models/advanced/alert/db/AlertHubSettingItem;Lcom/robinhood/models/ui/Historical$Interval;)V", "getInstrumentId", "()Ljava/util/UUID;", "getIndicatorName", "()Ljava/lang/String;", "getTechnicalIndicator", "()Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator;", "getAlert", "()Lcom/robinhood/models/advanced/alert/db/AlertHubSettingItem;", "getChartInterval", "()Lcom/robinhood/models/ui/Historical$Interval;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AlertHubCreateIndicatorAlert implements FragmentKey {
    public static final Parcelable.Creator<AlertHubCreateIndicatorAlert> CREATOR = new Creator();
    private final AlertHubSettingItem alert;
    private final Historical.Interval chartInterval;
    private final String indicatorName;
    private final UUID instrumentId;
    private final ApiTechnicalIndicator technicalIndicator;

    /* compiled from: AdvancedAlert.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<AlertHubCreateIndicatorAlert> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlertHubCreateIndicatorAlert createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AlertHubCreateIndicatorAlert((UUID) parcel.readSerializable(), parcel.readString(), (ApiTechnicalIndicator) parcel.readParcelable(AlertHubCreateIndicatorAlert.class.getClassLoader()), (AlertHubSettingItem) parcel.readParcelable(AlertHubCreateIndicatorAlert.class.getClassLoader()), parcel.readInt() == 0 ? null : Historical.Interval.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlertHubCreateIndicatorAlert[] newArray(int i) {
            return new AlertHubCreateIndicatorAlert[i];
        }
    }

    public static /* synthetic */ AlertHubCreateIndicatorAlert copy$default(AlertHubCreateIndicatorAlert alertHubCreateIndicatorAlert, UUID uuid, String str, ApiTechnicalIndicator apiTechnicalIndicator, AlertHubSettingItem alertHubSettingItem, Historical.Interval interval, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = alertHubCreateIndicatorAlert.instrumentId;
        }
        if ((i & 2) != 0) {
            str = alertHubCreateIndicatorAlert.indicatorName;
        }
        if ((i & 4) != 0) {
            apiTechnicalIndicator = alertHubCreateIndicatorAlert.technicalIndicator;
        }
        if ((i & 8) != 0) {
            alertHubSettingItem = alertHubCreateIndicatorAlert.alert;
        }
        if ((i & 16) != 0) {
            interval = alertHubCreateIndicatorAlert.chartInterval;
        }
        Historical.Interval interval2 = interval;
        ApiTechnicalIndicator apiTechnicalIndicator2 = apiTechnicalIndicator;
        return alertHubCreateIndicatorAlert.copy(uuid, str, apiTechnicalIndicator2, alertHubSettingItem, interval2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIndicatorName() {
        return this.indicatorName;
    }

    /* renamed from: component3, reason: from getter */
    public final ApiTechnicalIndicator getTechnicalIndicator() {
        return this.technicalIndicator;
    }

    /* renamed from: component4, reason: from getter */
    public final AlertHubSettingItem getAlert() {
        return this.alert;
    }

    /* renamed from: component5, reason: from getter */
    public final Historical.Interval getChartInterval() {
        return this.chartInterval;
    }

    public final AlertHubCreateIndicatorAlert copy(UUID instrumentId, String indicatorName, ApiTechnicalIndicator technicalIndicator, AlertHubSettingItem alert, Historical.Interval chartInterval) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(indicatorName, "indicatorName");
        Intrinsics.checkNotNullParameter(technicalIndicator, "technicalIndicator");
        return new AlertHubCreateIndicatorAlert(instrumentId, indicatorName, technicalIndicator, alert, chartInterval);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlertHubCreateIndicatorAlert)) {
            return false;
        }
        AlertHubCreateIndicatorAlert alertHubCreateIndicatorAlert = (AlertHubCreateIndicatorAlert) other;
        return Intrinsics.areEqual(this.instrumentId, alertHubCreateIndicatorAlert.instrumentId) && Intrinsics.areEqual(this.indicatorName, alertHubCreateIndicatorAlert.indicatorName) && Intrinsics.areEqual(this.technicalIndicator, alertHubCreateIndicatorAlert.technicalIndicator) && Intrinsics.areEqual(this.alert, alertHubCreateIndicatorAlert.alert) && this.chartInterval == alertHubCreateIndicatorAlert.chartInterval;
    }

    public int hashCode() {
        int iHashCode = ((((this.instrumentId.hashCode() * 31) + this.indicatorName.hashCode()) * 31) + this.technicalIndicator.hashCode()) * 31;
        AlertHubSettingItem alertHubSettingItem = this.alert;
        int iHashCode2 = (iHashCode + (alertHubSettingItem == null ? 0 : alertHubSettingItem.hashCode())) * 31;
        Historical.Interval interval = this.chartInterval;
        return iHashCode2 + (interval != null ? interval.hashCode() : 0);
    }

    public String toString() {
        return "AlertHubCreateIndicatorAlert(instrumentId=" + this.instrumentId + ", indicatorName=" + this.indicatorName + ", technicalIndicator=" + this.technicalIndicator + ", alert=" + this.alert + ", chartInterval=" + this.chartInterval + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.instrumentId);
        dest.writeString(this.indicatorName);
        dest.writeParcelable(this.technicalIndicator, flags);
        dest.writeParcelable(this.alert, flags);
        Historical.Interval interval = this.chartInterval;
        if (interval == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(interval.name());
        }
    }

    public AlertHubCreateIndicatorAlert(UUID instrumentId, String indicatorName, ApiTechnicalIndicator technicalIndicator, AlertHubSettingItem alertHubSettingItem, Historical.Interval interval) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(indicatorName, "indicatorName");
        Intrinsics.checkNotNullParameter(technicalIndicator, "technicalIndicator");
        this.instrumentId = instrumentId;
        this.indicatorName = indicatorName;
        this.technicalIndicator = technicalIndicator;
        this.alert = alertHubSettingItem;
        this.chartInterval = interval;
    }

    public /* synthetic */ AlertHubCreateIndicatorAlert(UUID uuid, String str, ApiTechnicalIndicator apiTechnicalIndicator, AlertHubSettingItem alertHubSettingItem, Historical.Interval interval, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, str, apiTechnicalIndicator, alertHubSettingItem, (i & 16) != 0 ? null : interval);
    }

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    public final String getIndicatorName() {
        return this.indicatorName;
    }

    public final ApiTechnicalIndicator getTechnicalIndicator() {
        return this.technicalIndicator;
    }

    public final AlertHubSettingItem getAlert() {
        return this.alert;
    }

    public final Historical.Interval getChartInterval() {
        return this.chartInterval;
    }
}
