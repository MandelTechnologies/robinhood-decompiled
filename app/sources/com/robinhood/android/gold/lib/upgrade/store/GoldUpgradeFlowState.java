package com.robinhood.android.gold.lib.upgrade.store;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldUpgradeFlowState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/upgrade/store/GoldUpgradeFlowState;", "Landroid/os/Parcelable;", "selectedPlanId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getSelectedPlanId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class GoldUpgradeFlowState implements Parcelable {
    public static final Parcelable.Creator<GoldUpgradeFlowState> CREATOR = new Creator();
    private final UUID selectedPlanId;

    /* compiled from: GoldUpgradeFlowState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<GoldUpgradeFlowState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldUpgradeFlowState createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GoldUpgradeFlowState((UUID) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldUpgradeFlowState[] newArray(int i) {
            return new GoldUpgradeFlowState[i];
        }
    }

    public static /* synthetic */ GoldUpgradeFlowState copy$default(GoldUpgradeFlowState goldUpgradeFlowState, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = goldUpgradeFlowState.selectedPlanId;
        }
        return goldUpgradeFlowState.copy(uuid);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getSelectedPlanId() {
        return this.selectedPlanId;
    }

    public final GoldUpgradeFlowState copy(UUID selectedPlanId) {
        return new GoldUpgradeFlowState(selectedPlanId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GoldUpgradeFlowState) && Intrinsics.areEqual(this.selectedPlanId, ((GoldUpgradeFlowState) other).selectedPlanId);
    }

    public int hashCode() {
        UUID uuid = this.selectedPlanId;
        if (uuid == null) {
            return 0;
        }
        return uuid.hashCode();
    }

    public String toString() {
        return "GoldUpgradeFlowState(selectedPlanId=" + this.selectedPlanId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.selectedPlanId);
    }

    public GoldUpgradeFlowState(UUID uuid) {
        this.selectedPlanId = uuid;
    }

    public final UUID getSelectedPlanId() {
        return this.selectedPlanId;
    }
}
