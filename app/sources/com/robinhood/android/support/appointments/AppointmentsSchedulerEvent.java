package com.robinhood.android.support.appointments;

import com.robinhood.models.p355ui.appointments.Appointment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppointmentsSchedulerEvent.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/AppointmentsSchedulerEvent;", "", "<init>", "()V", "ShowSupportHub", "ShowScheduledConfirmation", "ShowViewingAppointmentConfirmationView", "ShowErrorDialog", "HideErrorDialog", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerEvent$HideErrorDialog;", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerEvent$ShowErrorDialog;", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerEvent$ShowScheduledConfirmation;", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerEvent$ShowSupportHub;", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerEvent$ShowViewingAppointmentConfirmationView;", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public abstract class AppointmentsSchedulerEvent {
    public static final int $stable = 0;

    public /* synthetic */ AppointmentsSchedulerEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: AppointmentsSchedulerEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/AppointmentsSchedulerEvent$ShowSupportHub;", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerEvent;", "<init>", "()V", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ShowSupportHub extends AppointmentsSchedulerEvent {
        public static final int $stable = 0;
        public static final ShowSupportHub INSTANCE = new ShowSupportHub();

        private ShowSupportHub() {
            super(null);
        }
    }

    private AppointmentsSchedulerEvent() {
    }

    /* compiled from: AppointmentsSchedulerEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/AppointmentsSchedulerEvent$ShowScheduledConfirmation;", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerEvent;", "appointment", "Lcom/robinhood/models/ui/appointments/Appointment;", "<init>", "(Lcom/robinhood/models/ui/appointments/Appointment;)V", "getAppointment", "()Lcom/robinhood/models/ui/appointments/Appointment;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowScheduledConfirmation extends AppointmentsSchedulerEvent {
        public static final int $stable = 8;
        private final Appointment appointment;

        public static /* synthetic */ ShowScheduledConfirmation copy$default(ShowScheduledConfirmation showScheduledConfirmation, Appointment appointment, int i, Object obj) {
            if ((i & 1) != 0) {
                appointment = showScheduledConfirmation.appointment;
            }
            return showScheduledConfirmation.copy(appointment);
        }

        /* renamed from: component1, reason: from getter */
        public final Appointment getAppointment() {
            return this.appointment;
        }

        public final ShowScheduledConfirmation copy(Appointment appointment) {
            Intrinsics.checkNotNullParameter(appointment, "appointment");
            return new ShowScheduledConfirmation(appointment);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowScheduledConfirmation) && Intrinsics.areEqual(this.appointment, ((ShowScheduledConfirmation) other).appointment);
        }

        public int hashCode() {
            return this.appointment.hashCode();
        }

        public String toString() {
            return "ShowScheduledConfirmation(appointment=" + this.appointment + ")";
        }

        public final Appointment getAppointment() {
            return this.appointment;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowScheduledConfirmation(Appointment appointment) {
            super(null);
            Intrinsics.checkNotNullParameter(appointment, "appointment");
            this.appointment = appointment;
        }
    }

    /* compiled from: AppointmentsSchedulerEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/AppointmentsSchedulerEvent$ShowViewingAppointmentConfirmationView;", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerEvent;", "appointment", "Lcom/robinhood/models/ui/appointments/Appointment;", "<init>", "(Lcom/robinhood/models/ui/appointments/Appointment;)V", "getAppointment", "()Lcom/robinhood/models/ui/appointments/Appointment;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowViewingAppointmentConfirmationView extends AppointmentsSchedulerEvent {
        public static final int $stable = 8;
        private final Appointment appointment;

        public static /* synthetic */ ShowViewingAppointmentConfirmationView copy$default(ShowViewingAppointmentConfirmationView showViewingAppointmentConfirmationView, Appointment appointment, int i, Object obj) {
            if ((i & 1) != 0) {
                appointment = showViewingAppointmentConfirmationView.appointment;
            }
            return showViewingAppointmentConfirmationView.copy(appointment);
        }

        /* renamed from: component1, reason: from getter */
        public final Appointment getAppointment() {
            return this.appointment;
        }

        public final ShowViewingAppointmentConfirmationView copy(Appointment appointment) {
            Intrinsics.checkNotNullParameter(appointment, "appointment");
            return new ShowViewingAppointmentConfirmationView(appointment);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowViewingAppointmentConfirmationView) && Intrinsics.areEqual(this.appointment, ((ShowViewingAppointmentConfirmationView) other).appointment);
        }

        public int hashCode() {
            return this.appointment.hashCode();
        }

        public String toString() {
            return "ShowViewingAppointmentConfirmationView(appointment=" + this.appointment + ")";
        }

        public final Appointment getAppointment() {
            return this.appointment;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowViewingAppointmentConfirmationView(Appointment appointment) {
            super(null);
            Intrinsics.checkNotNullParameter(appointment, "appointment");
            this.appointment = appointment;
        }
    }

    /* compiled from: AppointmentsSchedulerEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/AppointmentsSchedulerEvent$ShowErrorDialog;", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerEvent;", "withTryAgain", "", "closeAllOnDone", "<init>", "(ZZ)V", "getWithTryAgain", "()Z", "getCloseAllOnDone", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowErrorDialog extends AppointmentsSchedulerEvent {
        public static final int $stable = 0;
        private final boolean closeAllOnDone;
        private final boolean withTryAgain;

        /* JADX WARN: Illegal instructions before constructor call */
        public ShowErrorDialog() {
            boolean z = false;
            this(z, z, 3, null);
        }

        public static /* synthetic */ ShowErrorDialog copy$default(ShowErrorDialog showErrorDialog, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = showErrorDialog.withTryAgain;
            }
            if ((i & 2) != 0) {
                z2 = showErrorDialog.closeAllOnDone;
            }
            return showErrorDialog.copy(z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getWithTryAgain() {
            return this.withTryAgain;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getCloseAllOnDone() {
            return this.closeAllOnDone;
        }

        public final ShowErrorDialog copy(boolean withTryAgain, boolean closeAllOnDone) {
            return new ShowErrorDialog(withTryAgain, closeAllOnDone);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowErrorDialog)) {
                return false;
            }
            ShowErrorDialog showErrorDialog = (ShowErrorDialog) other;
            return this.withTryAgain == showErrorDialog.withTryAgain && this.closeAllOnDone == showErrorDialog.closeAllOnDone;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.withTryAgain) * 31) + Boolean.hashCode(this.closeAllOnDone);
        }

        public String toString() {
            return "ShowErrorDialog(withTryAgain=" + this.withTryAgain + ", closeAllOnDone=" + this.closeAllOnDone + ")";
        }

        public /* synthetic */ ShowErrorDialog(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2);
        }

        public final boolean getWithTryAgain() {
            return this.withTryAgain;
        }

        public final boolean getCloseAllOnDone() {
            return this.closeAllOnDone;
        }

        public ShowErrorDialog(boolean z, boolean z2) {
            super(null);
            this.withTryAgain = z;
            this.closeAllOnDone = z2;
        }
    }

    /* compiled from: AppointmentsSchedulerEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/AppointmentsSchedulerEvent$HideErrorDialog;", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class HideErrorDialog extends AppointmentsSchedulerEvent {
        public static final int $stable = 0;
        public static final HideErrorDialog INSTANCE = new HideErrorDialog();

        public boolean equals(Object other) {
            return this == other || (other instanceof HideErrorDialog);
        }

        public int hashCode() {
            return 181393626;
        }

        public String toString() {
            return "HideErrorDialog";
        }

        private HideErrorDialog() {
            super(null);
        }
    }
}
