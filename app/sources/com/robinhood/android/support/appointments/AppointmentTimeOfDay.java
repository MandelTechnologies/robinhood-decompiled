package com.robinhood.android.support.appointments;

import com.robinhood.models.p355ui.appointments.AppointmentSlot;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppointmentsSchedulerViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/AppointmentTimeOfDay;", "", "available", "", "displayStartTime", "", "sourceAppointment", "Lcom/robinhood/models/ui/appointments/AppointmentSlot;", "<init>", "(ZLjava/lang/String;Lcom/robinhood/models/ui/appointments/AppointmentSlot;)V", "getAvailable", "()Z", "getDisplayStartTime", "()Ljava/lang/String;", "getSourceAppointment", "()Lcom/robinhood/models/ui/appointments/AppointmentSlot;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AppointmentTimeOfDay {
    public static final int $stable = 8;
    private final boolean available;
    private final String displayStartTime;
    private final AppointmentSlot sourceAppointment;

    public static /* synthetic */ AppointmentTimeOfDay copy$default(AppointmentTimeOfDay appointmentTimeOfDay, boolean z, String str, AppointmentSlot appointmentSlot, int i, Object obj) {
        if ((i & 1) != 0) {
            z = appointmentTimeOfDay.available;
        }
        if ((i & 2) != 0) {
            str = appointmentTimeOfDay.displayStartTime;
        }
        if ((i & 4) != 0) {
            appointmentSlot = appointmentTimeOfDay.sourceAppointment;
        }
        return appointmentTimeOfDay.copy(z, str, appointmentSlot);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getAvailable() {
        return this.available;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDisplayStartTime() {
        return this.displayStartTime;
    }

    /* renamed from: component3, reason: from getter */
    public final AppointmentSlot getSourceAppointment() {
        return this.sourceAppointment;
    }

    public final AppointmentTimeOfDay copy(boolean available, String displayStartTime, AppointmentSlot sourceAppointment) {
        Intrinsics.checkNotNullParameter(displayStartTime, "displayStartTime");
        Intrinsics.checkNotNullParameter(sourceAppointment, "sourceAppointment");
        return new AppointmentTimeOfDay(available, displayStartTime, sourceAppointment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppointmentTimeOfDay)) {
            return false;
        }
        AppointmentTimeOfDay appointmentTimeOfDay = (AppointmentTimeOfDay) other;
        return this.available == appointmentTimeOfDay.available && Intrinsics.areEqual(this.displayStartTime, appointmentTimeOfDay.displayStartTime) && Intrinsics.areEqual(this.sourceAppointment, appointmentTimeOfDay.sourceAppointment);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.available) * 31) + this.displayStartTime.hashCode()) * 31) + this.sourceAppointment.hashCode();
    }

    public String toString() {
        return "AppointmentTimeOfDay(available=" + this.available + ", displayStartTime=" + this.displayStartTime + ", sourceAppointment=" + this.sourceAppointment + ")";
    }

    public AppointmentTimeOfDay(boolean z, String displayStartTime, AppointmentSlot sourceAppointment) {
        Intrinsics.checkNotNullParameter(displayStartTime, "displayStartTime");
        Intrinsics.checkNotNullParameter(sourceAppointment, "sourceAppointment");
        this.available = z;
        this.displayStartTime = displayStartTime;
        this.sourceAppointment = sourceAppointment;
    }

    public final boolean getAvailable() {
        return this.available;
    }

    public final String getDisplayStartTime() {
        return this.displayStartTime;
    }

    public final AppointmentSlot getSourceAppointment() {
        return this.sourceAppointment;
    }
}
