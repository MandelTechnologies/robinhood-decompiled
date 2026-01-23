package com.robinhood.android.support.appointments;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AppointmentsSchedulerViewState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/AppointmentDayOfWeek;", "", "available", "", "displayMonth", "", "displayDay", "timeSlots", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/support/appointments/AppointmentTimeOfDay;", "<init>", "(ZIILkotlinx/collections/immutable/ImmutableList;)V", "getAvailable", "()Z", "getDisplayMonth", "()I", "getDisplayDay", "getTimeSlots", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AppointmentDayOfWeek {
    public static final int $stable = 8;
    private final boolean available;
    private final int displayDay;
    private final int displayMonth;
    private final ImmutableList<AppointmentTimeOfDay> timeSlots;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppointmentDayOfWeek copy$default(AppointmentDayOfWeek appointmentDayOfWeek, boolean z, int i, int i2, ImmutableList immutableList, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = appointmentDayOfWeek.available;
        }
        if ((i3 & 2) != 0) {
            i = appointmentDayOfWeek.displayMonth;
        }
        if ((i3 & 4) != 0) {
            i2 = appointmentDayOfWeek.displayDay;
        }
        if ((i3 & 8) != 0) {
            immutableList = appointmentDayOfWeek.timeSlots;
        }
        return appointmentDayOfWeek.copy(z, i, i2, immutableList);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getAvailable() {
        return this.available;
    }

    /* renamed from: component2, reason: from getter */
    public final int getDisplayMonth() {
        return this.displayMonth;
    }

    /* renamed from: component3, reason: from getter */
    public final int getDisplayDay() {
        return this.displayDay;
    }

    public final ImmutableList<AppointmentTimeOfDay> component4() {
        return this.timeSlots;
    }

    public final AppointmentDayOfWeek copy(boolean available, int displayMonth, int displayDay, ImmutableList<AppointmentTimeOfDay> timeSlots) {
        Intrinsics.checkNotNullParameter(timeSlots, "timeSlots");
        return new AppointmentDayOfWeek(available, displayMonth, displayDay, timeSlots);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppointmentDayOfWeek)) {
            return false;
        }
        AppointmentDayOfWeek appointmentDayOfWeek = (AppointmentDayOfWeek) other;
        return this.available == appointmentDayOfWeek.available && this.displayMonth == appointmentDayOfWeek.displayMonth && this.displayDay == appointmentDayOfWeek.displayDay && Intrinsics.areEqual(this.timeSlots, appointmentDayOfWeek.timeSlots);
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.available) * 31) + Integer.hashCode(this.displayMonth)) * 31) + Integer.hashCode(this.displayDay)) * 31) + this.timeSlots.hashCode();
    }

    public String toString() {
        return "AppointmentDayOfWeek(available=" + this.available + ", displayMonth=" + this.displayMonth + ", displayDay=" + this.displayDay + ", timeSlots=" + this.timeSlots + ")";
    }

    public AppointmentDayOfWeek(boolean z, int i, int i2, ImmutableList<AppointmentTimeOfDay> timeSlots) {
        Intrinsics.checkNotNullParameter(timeSlots, "timeSlots");
        this.available = z;
        this.displayMonth = i;
        this.displayDay = i2;
        this.timeSlots = timeSlots;
    }

    public final boolean getAvailable() {
        return this.available;
    }

    public final int getDisplayMonth() {
        return this.displayMonth;
    }

    public final int getDisplayDay() {
        return this.displayDay;
    }

    public final ImmutableList<AppointmentTimeOfDay> getTimeSlots() {
        return this.timeSlots;
    }
}
