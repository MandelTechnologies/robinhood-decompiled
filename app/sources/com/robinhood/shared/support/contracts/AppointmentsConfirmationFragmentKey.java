package com.robinhood.shared.support.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.p355ui.appointments.Appointment;
import com.robinhood.shared.support.contracts.AppointmentsSchedulerFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppointmentsConfirmationFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/support/contracts/AppointmentsConfirmationFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "appointment", "Lcom/robinhood/models/ui/appointments/Appointment;", "getAppointment", "()Lcom/robinhood/models/ui/appointments/Appointment;", "source", "Lcom/robinhood/shared/support/contracts/AppointmentsSchedulerFragmentKey$Source;", "getSource", "()Lcom/robinhood/shared/support/contracts/AppointmentsSchedulerFragmentKey$Source;", "Cancelled", "Scheduled", "ScheduledRedirectToView", "Rescheduled", "Lcom/robinhood/shared/support/contracts/AppointmentsConfirmationFragmentKey$Cancelled;", "Lcom/robinhood/shared/support/contracts/AppointmentsConfirmationFragmentKey$Rescheduled;", "Lcom/robinhood/shared/support/contracts/AppointmentsConfirmationFragmentKey$Scheduled;", "Lcom/robinhood/shared/support/contracts/AppointmentsConfirmationFragmentKey$ScheduledRedirectToView;", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface AppointmentsConfirmationFragmentKey extends FragmentKey {
    Appointment getAppointment();

    AppointmentsSchedulerFragmentKey.Source getSource();

    /* compiled from: AppointmentsConfirmationFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/support/contracts/AppointmentsConfirmationFragmentKey$Cancelled;", "Lcom/robinhood/shared/support/contracts/AppointmentsConfirmationFragmentKey;", "appointment", "Lcom/robinhood/models/ui/appointments/Appointment;", "source", "Lcom/robinhood/shared/support/contracts/AppointmentsSchedulerFragmentKey$Source;", "<init>", "(Lcom/robinhood/models/ui/appointments/Appointment;Lcom/robinhood/shared/support/contracts/AppointmentsSchedulerFragmentKey$Source;)V", "getAppointment", "()Lcom/robinhood/models/ui/appointments/Appointment;", "getSource", "()Lcom/robinhood/shared/support/contracts/AppointmentsSchedulerFragmentKey$Source;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Cancelled implements AppointmentsConfirmationFragmentKey {
        public static final Parcelable.Creator<Cancelled> CREATOR = new Creator();
        private final Appointment appointment;
        private final AppointmentsSchedulerFragmentKey.Source source;

        /* compiled from: AppointmentsConfirmationFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Cancelled> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Cancelled createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Cancelled((Appointment) parcel.readParcelable(Cancelled.class.getClassLoader()), (AppointmentsSchedulerFragmentKey.Source) parcel.readParcelable(Cancelled.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Cancelled[] newArray(int i) {
                return new Cancelled[i];
            }
        }

        public static /* synthetic */ Cancelled copy$default(Cancelled cancelled, Appointment appointment, AppointmentsSchedulerFragmentKey.Source source, int i, Object obj) {
            if ((i & 1) != 0) {
                appointment = cancelled.appointment;
            }
            if ((i & 2) != 0) {
                source = cancelled.source;
            }
            return cancelled.copy(appointment, source);
        }

        /* renamed from: component1, reason: from getter */
        public final Appointment getAppointment() {
            return this.appointment;
        }

        /* renamed from: component2, reason: from getter */
        public final AppointmentsSchedulerFragmentKey.Source getSource() {
            return this.source;
        }

        public final Cancelled copy(Appointment appointment, AppointmentsSchedulerFragmentKey.Source source) {
            Intrinsics.checkNotNullParameter(appointment, "appointment");
            return new Cancelled(appointment, source);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Cancelled)) {
                return false;
            }
            Cancelled cancelled = (Cancelled) other;
            return Intrinsics.areEqual(this.appointment, cancelled.appointment) && Intrinsics.areEqual(this.source, cancelled.source);
        }

        public int hashCode() {
            int iHashCode = this.appointment.hashCode() * 31;
            AppointmentsSchedulerFragmentKey.Source source = this.source;
            return iHashCode + (source == null ? 0 : source.hashCode());
        }

        public String toString() {
            return "Cancelled(appointment=" + this.appointment + ", source=" + this.source + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.appointment, flags);
            dest.writeParcelable(this.source, flags);
        }

        public Cancelled(Appointment appointment, AppointmentsSchedulerFragmentKey.Source source) {
            Intrinsics.checkNotNullParameter(appointment, "appointment");
            this.appointment = appointment;
            this.source = source;
        }

        public /* synthetic */ Cancelled(Appointment appointment, AppointmentsSchedulerFragmentKey.Source source, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(appointment, (i & 2) != 0 ? null : source);
        }

        @Override // com.robinhood.shared.support.contracts.AppointmentsConfirmationFragmentKey
        public Appointment getAppointment() {
            return this.appointment;
        }

        @Override // com.robinhood.shared.support.contracts.AppointmentsConfirmationFragmentKey
        public AppointmentsSchedulerFragmentKey.Source getSource() {
            return this.source;
        }
    }

    /* compiled from: AppointmentsConfirmationFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/support/contracts/AppointmentsConfirmationFragmentKey$Scheduled;", "Lcom/robinhood/shared/support/contracts/AppointmentsConfirmationFragmentKey;", "appointment", "Lcom/robinhood/models/ui/appointments/Appointment;", "source", "Lcom/robinhood/shared/support/contracts/AppointmentsSchedulerFragmentKey$Source;", "<init>", "(Lcom/robinhood/models/ui/appointments/Appointment;Lcom/robinhood/shared/support/contracts/AppointmentsSchedulerFragmentKey$Source;)V", "getAppointment", "()Lcom/robinhood/models/ui/appointments/Appointment;", "getSource", "()Lcom/robinhood/shared/support/contracts/AppointmentsSchedulerFragmentKey$Source;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Scheduled implements AppointmentsConfirmationFragmentKey {
        public static final Parcelable.Creator<Scheduled> CREATOR = new Creator();
        private final Appointment appointment;
        private final AppointmentsSchedulerFragmentKey.Source source;

        /* compiled from: AppointmentsConfirmationFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Scheduled> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Scheduled createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Scheduled((Appointment) parcel.readParcelable(Scheduled.class.getClassLoader()), (AppointmentsSchedulerFragmentKey.Source) parcel.readParcelable(Scheduled.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Scheduled[] newArray(int i) {
                return new Scheduled[i];
            }
        }

        public static /* synthetic */ Scheduled copy$default(Scheduled scheduled, Appointment appointment, AppointmentsSchedulerFragmentKey.Source source, int i, Object obj) {
            if ((i & 1) != 0) {
                appointment = scheduled.appointment;
            }
            if ((i & 2) != 0) {
                source = scheduled.source;
            }
            return scheduled.copy(appointment, source);
        }

        /* renamed from: component1, reason: from getter */
        public final Appointment getAppointment() {
            return this.appointment;
        }

        /* renamed from: component2, reason: from getter */
        public final AppointmentsSchedulerFragmentKey.Source getSource() {
            return this.source;
        }

        public final Scheduled copy(Appointment appointment, AppointmentsSchedulerFragmentKey.Source source) {
            Intrinsics.checkNotNullParameter(appointment, "appointment");
            return new Scheduled(appointment, source);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Scheduled)) {
                return false;
            }
            Scheduled scheduled = (Scheduled) other;
            return Intrinsics.areEqual(this.appointment, scheduled.appointment) && Intrinsics.areEqual(this.source, scheduled.source);
        }

        public int hashCode() {
            int iHashCode = this.appointment.hashCode() * 31;
            AppointmentsSchedulerFragmentKey.Source source = this.source;
            return iHashCode + (source == null ? 0 : source.hashCode());
        }

        public String toString() {
            return "Scheduled(appointment=" + this.appointment + ", source=" + this.source + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.appointment, flags);
            dest.writeParcelable(this.source, flags);
        }

        public Scheduled(Appointment appointment, AppointmentsSchedulerFragmentKey.Source source) {
            Intrinsics.checkNotNullParameter(appointment, "appointment");
            this.appointment = appointment;
            this.source = source;
        }

        public /* synthetic */ Scheduled(Appointment appointment, AppointmentsSchedulerFragmentKey.Source source, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(appointment, (i & 2) != 0 ? null : source);
        }

        @Override // com.robinhood.shared.support.contracts.AppointmentsConfirmationFragmentKey
        public Appointment getAppointment() {
            return this.appointment;
        }

        @Override // com.robinhood.shared.support.contracts.AppointmentsConfirmationFragmentKey
        public AppointmentsSchedulerFragmentKey.Source getSource() {
            return this.source;
        }
    }

    /* compiled from: AppointmentsConfirmationFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/support/contracts/AppointmentsConfirmationFragmentKey$ScheduledRedirectToView;", "Lcom/robinhood/shared/support/contracts/AppointmentsConfirmationFragmentKey;", "appointment", "Lcom/robinhood/models/ui/appointments/Appointment;", "source", "Lcom/robinhood/shared/support/contracts/AppointmentsSchedulerFragmentKey$Source;", "<init>", "(Lcom/robinhood/models/ui/appointments/Appointment;Lcom/robinhood/shared/support/contracts/AppointmentsSchedulerFragmentKey$Source;)V", "getAppointment", "()Lcom/robinhood/models/ui/appointments/Appointment;", "getSource", "()Lcom/robinhood/shared/support/contracts/AppointmentsSchedulerFragmentKey$Source;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ScheduledRedirectToView implements AppointmentsConfirmationFragmentKey {
        public static final Parcelable.Creator<ScheduledRedirectToView> CREATOR = new Creator();
        private final Appointment appointment;
        private final AppointmentsSchedulerFragmentKey.Source source;

        /* compiled from: AppointmentsConfirmationFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ScheduledRedirectToView> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ScheduledRedirectToView createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ScheduledRedirectToView((Appointment) parcel.readParcelable(ScheduledRedirectToView.class.getClassLoader()), (AppointmentsSchedulerFragmentKey.Source) parcel.readParcelable(ScheduledRedirectToView.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ScheduledRedirectToView[] newArray(int i) {
                return new ScheduledRedirectToView[i];
            }
        }

        public static /* synthetic */ ScheduledRedirectToView copy$default(ScheduledRedirectToView scheduledRedirectToView, Appointment appointment, AppointmentsSchedulerFragmentKey.Source source, int i, Object obj) {
            if ((i & 1) != 0) {
                appointment = scheduledRedirectToView.appointment;
            }
            if ((i & 2) != 0) {
                source = scheduledRedirectToView.source;
            }
            return scheduledRedirectToView.copy(appointment, source);
        }

        /* renamed from: component1, reason: from getter */
        public final Appointment getAppointment() {
            return this.appointment;
        }

        /* renamed from: component2, reason: from getter */
        public final AppointmentsSchedulerFragmentKey.Source getSource() {
            return this.source;
        }

        public final ScheduledRedirectToView copy(Appointment appointment, AppointmentsSchedulerFragmentKey.Source source) {
            Intrinsics.checkNotNullParameter(appointment, "appointment");
            return new ScheduledRedirectToView(appointment, source);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ScheduledRedirectToView)) {
                return false;
            }
            ScheduledRedirectToView scheduledRedirectToView = (ScheduledRedirectToView) other;
            return Intrinsics.areEqual(this.appointment, scheduledRedirectToView.appointment) && Intrinsics.areEqual(this.source, scheduledRedirectToView.source);
        }

        public int hashCode() {
            int iHashCode = this.appointment.hashCode() * 31;
            AppointmentsSchedulerFragmentKey.Source source = this.source;
            return iHashCode + (source == null ? 0 : source.hashCode());
        }

        public String toString() {
            return "ScheduledRedirectToView(appointment=" + this.appointment + ", source=" + this.source + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.appointment, flags);
            dest.writeParcelable(this.source, flags);
        }

        public ScheduledRedirectToView(Appointment appointment, AppointmentsSchedulerFragmentKey.Source source) {
            Intrinsics.checkNotNullParameter(appointment, "appointment");
            this.appointment = appointment;
            this.source = source;
        }

        public /* synthetic */ ScheduledRedirectToView(Appointment appointment, AppointmentsSchedulerFragmentKey.Source source, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(appointment, (i & 2) != 0 ? null : source);
        }

        @Override // com.robinhood.shared.support.contracts.AppointmentsConfirmationFragmentKey
        public Appointment getAppointment() {
            return this.appointment;
        }

        @Override // com.robinhood.shared.support.contracts.AppointmentsConfirmationFragmentKey
        public AppointmentsSchedulerFragmentKey.Source getSource() {
            return this.source;
        }
    }

    /* compiled from: AppointmentsConfirmationFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/support/contracts/AppointmentsConfirmationFragmentKey$Rescheduled;", "Lcom/robinhood/shared/support/contracts/AppointmentsConfirmationFragmentKey;", "appointment", "Lcom/robinhood/models/ui/appointments/Appointment;", "source", "Lcom/robinhood/shared/support/contracts/AppointmentsSchedulerFragmentKey$Source;", "<init>", "(Lcom/robinhood/models/ui/appointments/Appointment;Lcom/robinhood/shared/support/contracts/AppointmentsSchedulerFragmentKey$Source;)V", "getAppointment", "()Lcom/robinhood/models/ui/appointments/Appointment;", "getSource", "()Lcom/robinhood/shared/support/contracts/AppointmentsSchedulerFragmentKey$Source;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Rescheduled implements AppointmentsConfirmationFragmentKey {
        public static final Parcelable.Creator<Rescheduled> CREATOR = new Creator();
        private final Appointment appointment;
        private final AppointmentsSchedulerFragmentKey.Source source;

        /* compiled from: AppointmentsConfirmationFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Rescheduled> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Rescheduled createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Rescheduled((Appointment) parcel.readParcelable(Rescheduled.class.getClassLoader()), (AppointmentsSchedulerFragmentKey.Source) parcel.readParcelable(Rescheduled.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Rescheduled[] newArray(int i) {
                return new Rescheduled[i];
            }
        }

        public static /* synthetic */ Rescheduled copy$default(Rescheduled rescheduled, Appointment appointment, AppointmentsSchedulerFragmentKey.Source source, int i, Object obj) {
            if ((i & 1) != 0) {
                appointment = rescheduled.appointment;
            }
            if ((i & 2) != 0) {
                source = rescheduled.source;
            }
            return rescheduled.copy(appointment, source);
        }

        /* renamed from: component1, reason: from getter */
        public final Appointment getAppointment() {
            return this.appointment;
        }

        /* renamed from: component2, reason: from getter */
        public final AppointmentsSchedulerFragmentKey.Source getSource() {
            return this.source;
        }

        public final Rescheduled copy(Appointment appointment, AppointmentsSchedulerFragmentKey.Source source) {
            Intrinsics.checkNotNullParameter(appointment, "appointment");
            return new Rescheduled(appointment, source);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Rescheduled)) {
                return false;
            }
            Rescheduled rescheduled = (Rescheduled) other;
            return Intrinsics.areEqual(this.appointment, rescheduled.appointment) && Intrinsics.areEqual(this.source, rescheduled.source);
        }

        public int hashCode() {
            int iHashCode = this.appointment.hashCode() * 31;
            AppointmentsSchedulerFragmentKey.Source source = this.source;
            return iHashCode + (source == null ? 0 : source.hashCode());
        }

        public String toString() {
            return "Rescheduled(appointment=" + this.appointment + ", source=" + this.source + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.appointment, flags);
            dest.writeParcelable(this.source, flags);
        }

        public Rescheduled(Appointment appointment, AppointmentsSchedulerFragmentKey.Source source) {
            Intrinsics.checkNotNullParameter(appointment, "appointment");
            this.appointment = appointment;
            this.source = source;
        }

        public /* synthetic */ Rescheduled(Appointment appointment, AppointmentsSchedulerFragmentKey.Source source, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(appointment, (i & 2) != 0 ? null : source);
        }

        @Override // com.robinhood.shared.support.contracts.AppointmentsConfirmationFragmentKey
        public Appointment getAppointment() {
            return this.appointment;
        }

        @Override // com.robinhood.shared.support.contracts.AppointmentsConfirmationFragmentKey
        public AppointmentsSchedulerFragmentKey.Source getSource() {
            return this.source;
        }
    }
}
