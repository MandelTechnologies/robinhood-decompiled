package com.robinhood.android.settings.p254ui.recurring.detail;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestmentScheduleSettingsArgs.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/detail/InvestmentScheduleSettingsArgs;", "Landroid/os/Parcelable;", "investmentScheduleId", "Ljava/util/UUID;", "fromInsights", "", "<init>", "(Ljava/util/UUID;Z)V", "getInvestmentScheduleId", "()Ljava/util/UUID;", "getFromInsights", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class InvestmentScheduleSettingsArgs implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestmentScheduleSettingsArgs> CREATOR = new Creator();
    private final boolean fromInsights;
    private final UUID investmentScheduleId;

    /* compiled from: InvestmentScheduleSettingsArgs.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<InvestmentScheduleSettingsArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestmentScheduleSettingsArgs createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvestmentScheduleSettingsArgs((UUID) parcel.readSerializable(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestmentScheduleSettingsArgs[] newArray(int i) {
            return new InvestmentScheduleSettingsArgs[i];
        }
    }

    public static /* synthetic */ InvestmentScheduleSettingsArgs copy$default(InvestmentScheduleSettingsArgs investmentScheduleSettingsArgs, UUID uuid, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = investmentScheduleSettingsArgs.investmentScheduleId;
        }
        if ((i & 2) != 0) {
            z = investmentScheduleSettingsArgs.fromInsights;
        }
        return investmentScheduleSettingsArgs.copy(uuid, z);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInvestmentScheduleId() {
        return this.investmentScheduleId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getFromInsights() {
        return this.fromInsights;
    }

    public final InvestmentScheduleSettingsArgs copy(UUID investmentScheduleId, boolean fromInsights) {
        Intrinsics.checkNotNullParameter(investmentScheduleId, "investmentScheduleId");
        return new InvestmentScheduleSettingsArgs(investmentScheduleId, fromInsights);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestmentScheduleSettingsArgs)) {
            return false;
        }
        InvestmentScheduleSettingsArgs investmentScheduleSettingsArgs = (InvestmentScheduleSettingsArgs) other;
        return Intrinsics.areEqual(this.investmentScheduleId, investmentScheduleSettingsArgs.investmentScheduleId) && this.fromInsights == investmentScheduleSettingsArgs.fromInsights;
    }

    public int hashCode() {
        return (this.investmentScheduleId.hashCode() * 31) + Boolean.hashCode(this.fromInsights);
    }

    public String toString() {
        return "InvestmentScheduleSettingsArgs(investmentScheduleId=" + this.investmentScheduleId + ", fromInsights=" + this.fromInsights + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.investmentScheduleId);
        dest.writeInt(this.fromInsights ? 1 : 0);
    }

    public InvestmentScheduleSettingsArgs(UUID investmentScheduleId, boolean z) {
        Intrinsics.checkNotNullParameter(investmentScheduleId, "investmentScheduleId");
        this.investmentScheduleId = investmentScheduleId;
        this.fromInsights = z;
    }

    public /* synthetic */ InvestmentScheduleSettingsArgs(UUID uuid, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, (i & 2) != 0 ? false : z);
    }

    public final UUID getInvestmentScheduleId() {
        return this.investmentScheduleId;
    }

    public final boolean getFromInsights() {
        return this.fromInsights;
    }
}
