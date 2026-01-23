package com.robinhood.android.education.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.librobinhood.data.store.alert.AdvancedAlertEntryPoint;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p355ui.Historical;
import com.robinhood.models.parceler.EitherParceler;
import com.robinhood.utils.Either;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedAlert.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\u000bHÆ\u0003J?\u0010\u001a\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001cHÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cR\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/education/contracts/AdvancedAlert;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "entity", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/models/db/Instrument;", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "defaultToPriceAlert", "", "chartInterval", "Lcom/robinhood/models/ui/Historical$Interval;", "entryPoint", "Lcom/robinhood/librobinhood/data/store/alert/AdvancedAlertEntryPoint;", "<init>", "(Lcom/robinhood/utils/Either;ZLcom/robinhood/models/ui/Historical$Interval;Lcom/robinhood/librobinhood/data/store/alert/AdvancedAlertEntryPoint;)V", "getEntity", "()Lcom/robinhood/utils/Either;", "getDefaultToPriceAlert", "()Z", "getChartInterval", "()Lcom/robinhood/models/ui/Historical$Interval;", "getEntryPoint", "()Lcom/robinhood/librobinhood/data/store/alert/AdvancedAlertEntryPoint;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AdvancedAlert implements FragmentKey {
    public static final Parcelable.Creator<AdvancedAlert> CREATOR = new Creator();
    private final Historical.Interval chartInterval;
    private final boolean defaultToPriceAlert;
    private final Either<Instrument, UiCurrencyPair> entity;
    private final AdvancedAlertEntryPoint entryPoint;

    /* compiled from: AdvancedAlert.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<AdvancedAlert> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvancedAlert createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AdvancedAlert(EitherParceler.INSTANCE.m23663create(parcel), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Historical.Interval.valueOf(parcel.readString()), AdvancedAlertEntryPoint.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvancedAlert[] newArray(int i) {
            return new AdvancedAlert[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdvancedAlert copy$default(AdvancedAlert advancedAlert, Either either, boolean z, Historical.Interval interval, AdvancedAlertEntryPoint advancedAlertEntryPoint, int i, Object obj) {
        if ((i & 1) != 0) {
            either = advancedAlert.entity;
        }
        if ((i & 2) != 0) {
            z = advancedAlert.defaultToPriceAlert;
        }
        if ((i & 4) != 0) {
            interval = advancedAlert.chartInterval;
        }
        if ((i & 8) != 0) {
            advancedAlertEntryPoint = advancedAlert.entryPoint;
        }
        return advancedAlert.copy(either, z, interval, advancedAlertEntryPoint);
    }

    public final Either<Instrument, UiCurrencyPair> component1() {
        return this.entity;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getDefaultToPriceAlert() {
        return this.defaultToPriceAlert;
    }

    /* renamed from: component3, reason: from getter */
    public final Historical.Interval getChartInterval() {
        return this.chartInterval;
    }

    /* renamed from: component4, reason: from getter */
    public final AdvancedAlertEntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public final AdvancedAlert copy(Either<Instrument, UiCurrencyPair> entity, boolean defaultToPriceAlert, Historical.Interval chartInterval, AdvancedAlertEntryPoint entryPoint) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        return new AdvancedAlert(entity, defaultToPriceAlert, chartInterval, entryPoint);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvancedAlert)) {
            return false;
        }
        AdvancedAlert advancedAlert = (AdvancedAlert) other;
        return Intrinsics.areEqual(this.entity, advancedAlert.entity) && this.defaultToPriceAlert == advancedAlert.defaultToPriceAlert && this.chartInterval == advancedAlert.chartInterval && this.entryPoint == advancedAlert.entryPoint;
    }

    public int hashCode() {
        int iHashCode = ((this.entity.hashCode() * 31) + Boolean.hashCode(this.defaultToPriceAlert)) * 31;
        Historical.Interval interval = this.chartInterval;
        return ((iHashCode + (interval == null ? 0 : interval.hashCode())) * 31) + this.entryPoint.hashCode();
    }

    public String toString() {
        return "AdvancedAlert(entity=" + this.entity + ", defaultToPriceAlert=" + this.defaultToPriceAlert + ", chartInterval=" + this.chartInterval + ", entryPoint=" + this.entryPoint + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        EitherParceler.INSTANCE.write((Either<?, ?>) this.entity, dest, flags);
        dest.writeInt(this.defaultToPriceAlert ? 1 : 0);
        Historical.Interval interval = this.chartInterval;
        if (interval == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(interval.name());
        }
        dest.writeString(this.entryPoint.name());
    }

    public AdvancedAlert(Either<Instrument, UiCurrencyPair> entity, boolean z, Historical.Interval interval, AdvancedAlertEntryPoint entryPoint) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.entity = entity;
        this.defaultToPriceAlert = z;
        this.chartInterval = interval;
        this.entryPoint = entryPoint;
    }

    public final Either<Instrument, UiCurrencyPair> getEntity() {
        return this.entity;
    }

    public final boolean getDefaultToPriceAlert() {
        return this.defaultToPriceAlert;
    }

    public final Historical.Interval getChartInterval() {
        return this.chartInterval;
    }

    public /* synthetic */ AdvancedAlert(Either either, boolean z, Historical.Interval interval, AdvancedAlertEntryPoint advancedAlertEntryPoint, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(either, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : interval, (i & 8) != 0 ? AdvancedAlertEntryPoint.NONE : advancedAlertEntryPoint);
    }

    public final AdvancedAlertEntryPoint getEntryPoint() {
        return this.entryPoint;
    }
}
