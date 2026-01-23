package com.robinhood.shared.support.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.shared.support.contracts.AppointmentsSchedulerFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppointmentsViewerFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/support/contracts/AppointmentsViewerFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "appointmentId", "", "source", "Lcom/robinhood/shared/support/contracts/AppointmentsSchedulerFragmentKey$Source;", "<init>", "(Ljava/lang/String;Lcom/robinhood/shared/support/contracts/AppointmentsSchedulerFragmentKey$Source;)V", "getAppointmentId", "()Ljava/lang/String;", "getSource", "()Lcom/robinhood/shared/support/contracts/AppointmentsSchedulerFragmentKey$Source;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AppointmentsViewerFragmentKey implements FragmentKey {
    public static final Parcelable.Creator<AppointmentsViewerFragmentKey> CREATOR = new Creator();
    private final String appointmentId;
    private final AppointmentsSchedulerFragmentKey.Source source;

    /* compiled from: AppointmentsViewerFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<AppointmentsViewerFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AppointmentsViewerFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AppointmentsViewerFragmentKey(parcel.readString(), (AppointmentsSchedulerFragmentKey.Source) parcel.readParcelable(AppointmentsViewerFragmentKey.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AppointmentsViewerFragmentKey[] newArray(int i) {
            return new AppointmentsViewerFragmentKey[i];
        }
    }

    public static /* synthetic */ AppointmentsViewerFragmentKey copy$default(AppointmentsViewerFragmentKey appointmentsViewerFragmentKey, String str, AppointmentsSchedulerFragmentKey.Source source, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appointmentsViewerFragmentKey.appointmentId;
        }
        if ((i & 2) != 0) {
            source = appointmentsViewerFragmentKey.source;
        }
        return appointmentsViewerFragmentKey.copy(str, source);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAppointmentId() {
        return this.appointmentId;
    }

    /* renamed from: component2, reason: from getter */
    public final AppointmentsSchedulerFragmentKey.Source getSource() {
        return this.source;
    }

    public final AppointmentsViewerFragmentKey copy(String appointmentId, AppointmentsSchedulerFragmentKey.Source source) {
        Intrinsics.checkNotNullParameter(appointmentId, "appointmentId");
        return new AppointmentsViewerFragmentKey(appointmentId, source);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppointmentsViewerFragmentKey)) {
            return false;
        }
        AppointmentsViewerFragmentKey appointmentsViewerFragmentKey = (AppointmentsViewerFragmentKey) other;
        return Intrinsics.areEqual(this.appointmentId, appointmentsViewerFragmentKey.appointmentId) && Intrinsics.areEqual(this.source, appointmentsViewerFragmentKey.source);
    }

    public int hashCode() {
        int iHashCode = this.appointmentId.hashCode() * 31;
        AppointmentsSchedulerFragmentKey.Source source = this.source;
        return iHashCode + (source == null ? 0 : source.hashCode());
    }

    public String toString() {
        return "AppointmentsViewerFragmentKey(appointmentId=" + this.appointmentId + ", source=" + this.source + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.appointmentId);
        dest.writeParcelable(this.source, flags);
    }

    public AppointmentsViewerFragmentKey(String appointmentId, AppointmentsSchedulerFragmentKey.Source source) {
        Intrinsics.checkNotNullParameter(appointmentId, "appointmentId");
        this.appointmentId = appointmentId;
        this.source = source;
    }

    public /* synthetic */ AppointmentsViewerFragmentKey(String str, AppointmentsSchedulerFragmentKey.Source source, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : source);
    }

    public final String getAppointmentId() {
        return this.appointmentId;
    }

    public final AppointmentsSchedulerFragmentKey.Source getSource() {
        return this.source;
    }
}
