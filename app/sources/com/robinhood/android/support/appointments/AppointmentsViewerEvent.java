package com.robinhood.android.support.appointments;

import com.robinhood.models.p355ui.appointments.Appointment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppointmentsViewerEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/AppointmentsViewerEvent;", "", "<init>", "()V", "RescheduleAppointment", "ShowCancellationCompleted", "ShowDialog", "HideDialog", "Lcom/robinhood/android/support/appointments/AppointmentsViewerEvent$HideDialog;", "Lcom/robinhood/android/support/appointments/AppointmentsViewerEvent$RescheduleAppointment;", "Lcom/robinhood/android/support/appointments/AppointmentsViewerEvent$ShowCancellationCompleted;", "Lcom/robinhood/android/support/appointments/AppointmentsViewerEvent$ShowDialog;", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public abstract class AppointmentsViewerEvent {
    public static final int $stable = 0;

    public /* synthetic */ AppointmentsViewerEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AppointmentsViewerEvent() {
    }

    /* compiled from: AppointmentsViewerEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/AppointmentsViewerEvent$RescheduleAppointment;", "Lcom/robinhood/android/support/appointments/AppointmentsViewerEvent;", "appointment", "Lcom/robinhood/models/ui/appointments/Appointment;", "<init>", "(Lcom/robinhood/models/ui/appointments/Appointment;)V", "getAppointment", "()Lcom/robinhood/models/ui/appointments/Appointment;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RescheduleAppointment extends AppointmentsViewerEvent {
        public static final int $stable = 8;
        private final Appointment appointment;

        public static /* synthetic */ RescheduleAppointment copy$default(RescheduleAppointment rescheduleAppointment, Appointment appointment, int i, Object obj) {
            if ((i & 1) != 0) {
                appointment = rescheduleAppointment.appointment;
            }
            return rescheduleAppointment.copy(appointment);
        }

        /* renamed from: component1, reason: from getter */
        public final Appointment getAppointment() {
            return this.appointment;
        }

        public final RescheduleAppointment copy(Appointment appointment) {
            Intrinsics.checkNotNullParameter(appointment, "appointment");
            return new RescheduleAppointment(appointment);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RescheduleAppointment) && Intrinsics.areEqual(this.appointment, ((RescheduleAppointment) other).appointment);
        }

        public int hashCode() {
            return this.appointment.hashCode();
        }

        public String toString() {
            return "RescheduleAppointment(appointment=" + this.appointment + ")";
        }

        public final Appointment getAppointment() {
            return this.appointment;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RescheduleAppointment(Appointment appointment) {
            super(null);
            Intrinsics.checkNotNullParameter(appointment, "appointment");
            this.appointment = appointment;
        }
    }

    /* compiled from: AppointmentsViewerEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/AppointmentsViewerEvent$ShowCancellationCompleted;", "Lcom/robinhood/android/support/appointments/AppointmentsViewerEvent;", "appointment", "Lcom/robinhood/models/ui/appointments/Appointment;", "<init>", "(Lcom/robinhood/models/ui/appointments/Appointment;)V", "getAppointment", "()Lcom/robinhood/models/ui/appointments/Appointment;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowCancellationCompleted extends AppointmentsViewerEvent {
        public static final int $stable = 8;
        private final Appointment appointment;

        public static /* synthetic */ ShowCancellationCompleted copy$default(ShowCancellationCompleted showCancellationCompleted, Appointment appointment, int i, Object obj) {
            if ((i & 1) != 0) {
                appointment = showCancellationCompleted.appointment;
            }
            return showCancellationCompleted.copy(appointment);
        }

        /* renamed from: component1, reason: from getter */
        public final Appointment getAppointment() {
            return this.appointment;
        }

        public final ShowCancellationCompleted copy(Appointment appointment) {
            Intrinsics.checkNotNullParameter(appointment, "appointment");
            return new ShowCancellationCompleted(appointment);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowCancellationCompleted) && Intrinsics.areEqual(this.appointment, ((ShowCancellationCompleted) other).appointment);
        }

        public int hashCode() {
            return this.appointment.hashCode();
        }

        public String toString() {
            return "ShowCancellationCompleted(appointment=" + this.appointment + ")";
        }

        public final Appointment getAppointment() {
            return this.appointment;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowCancellationCompleted(Appointment appointment) {
            super(null);
            Intrinsics.checkNotNullParameter(appointment, "appointment");
            this.appointment = appointment;
        }
    }

    /* compiled from: AppointmentsViewerEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/AppointmentsViewerEvent$ShowDialog;", "Lcom/robinhood/android/support/appointments/AppointmentsViewerEvent;", "<init>", "()V", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ShowDialog extends AppointmentsViewerEvent {
        public static final int $stable = 0;
        public static final ShowDialog INSTANCE = new ShowDialog();

        private ShowDialog() {
            super(null);
        }
    }

    /* compiled from: AppointmentsViewerEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/AppointmentsViewerEvent$HideDialog;", "Lcom/robinhood/android/support/appointments/AppointmentsViewerEvent;", "<init>", "()V", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class HideDialog extends AppointmentsViewerEvent {
        public static final int $stable = 0;
        public static final HideDialog INSTANCE = new HideDialog();

        private HideDialog() {
            super(null);
        }
    }
}
