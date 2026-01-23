package com.robinhood.android.education.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.advanced.alert.p302db.AlertHubSettings2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedAlert.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/education/contracts/AlertHubSettingsKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "entityType", "Lcom/robinhood/models/advanced/alert/db/AlertHubSettingsEntityType;", "entryPoint", "Lcom/robinhood/android/education/contracts/AlertHubSettingsEntryPoint;", "<init>", "(Lcom/robinhood/models/advanced/alert/db/AlertHubSettingsEntityType;Lcom/robinhood/android/education/contracts/AlertHubSettingsEntryPoint;)V", "getEntityType", "()Lcom/robinhood/models/advanced/alert/db/AlertHubSettingsEntityType;", "getEntryPoint", "()Lcom/robinhood/android/education/contracts/AlertHubSettingsEntryPoint;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AlertHubSettingsKey implements FragmentKey {
    public static final Parcelable.Creator<AlertHubSettingsKey> CREATOR = new Creator();
    private final AlertHubSettings2 entityType;
    private final AdvancedAlert4 entryPoint;

    /* compiled from: AdvancedAlert.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<AlertHubSettingsKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlertHubSettingsKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AlertHubSettingsKey(AlertHubSettings2.valueOf(parcel.readString()), AdvancedAlert4.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlertHubSettingsKey[] newArray(int i) {
            return new AlertHubSettingsKey[i];
        }
    }

    public static /* synthetic */ AlertHubSettingsKey copy$default(AlertHubSettingsKey alertHubSettingsKey, AlertHubSettings2 alertHubSettings2, AdvancedAlert4 advancedAlert4, int i, Object obj) {
        if ((i & 1) != 0) {
            alertHubSettings2 = alertHubSettingsKey.entityType;
        }
        if ((i & 2) != 0) {
            advancedAlert4 = alertHubSettingsKey.entryPoint;
        }
        return alertHubSettingsKey.copy(alertHubSettings2, advancedAlert4);
    }

    /* renamed from: component1, reason: from getter */
    public final AlertHubSettings2 getEntityType() {
        return this.entityType;
    }

    /* renamed from: component2, reason: from getter */
    public final AdvancedAlert4 getEntryPoint() {
        return this.entryPoint;
    }

    public final AlertHubSettingsKey copy(AlertHubSettings2 entityType, AdvancedAlert4 entryPoint) {
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        return new AlertHubSettingsKey(entityType, entryPoint);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlertHubSettingsKey)) {
            return false;
        }
        AlertHubSettingsKey alertHubSettingsKey = (AlertHubSettingsKey) other;
        return this.entityType == alertHubSettingsKey.entityType && this.entryPoint == alertHubSettingsKey.entryPoint;
    }

    public int hashCode() {
        return (this.entityType.hashCode() * 31) + this.entryPoint.hashCode();
    }

    public String toString() {
        return "AlertHubSettingsKey(entityType=" + this.entityType + ", entryPoint=" + this.entryPoint + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.entityType.name());
        dest.writeString(this.entryPoint.name());
    }

    public AlertHubSettingsKey(AlertHubSettings2 entityType, AdvancedAlert4 entryPoint) {
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.entityType = entityType;
        this.entryPoint = entryPoint;
    }

    public final AlertHubSettings2 getEntityType() {
        return this.entityType;
    }

    public final AdvancedAlert4 getEntryPoint() {
        return this.entryPoint;
    }
}
