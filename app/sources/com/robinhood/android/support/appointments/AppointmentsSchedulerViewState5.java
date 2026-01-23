package com.robinhood.android.support.appointments;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppointmentsSchedulerViewState.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002¨\u0006\u0004"}, m3636d2 = {"compareTo", "", "Lcom/robinhood/android/support/appointments/SubScreen;", "other", "feature-support_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.support.appointments.AppointmentsSchedulerViewStateKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class AppointmentsSchedulerViewState5 {
    public static final int compareTo(AppointmentsSchedulerViewState6 appointmentsSchedulerViewState6, AppointmentsSchedulerViewState6 other) {
        Intrinsics.checkNotNullParameter(appointmentsSchedulerViewState6, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.compare(appointmentsSchedulerViewState6.getValue(), other.getValue());
    }
}
