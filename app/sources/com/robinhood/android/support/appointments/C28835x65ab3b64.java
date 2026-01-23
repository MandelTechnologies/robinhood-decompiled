package com.robinhood.android.support.appointments;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AppointmentsSchedulingDatetimePickerComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt$AppointmentsSchedulingDatetimePickerComposable$1$3$1 */
/* loaded from: classes9.dex */
/* synthetic */ class C28835x65ab3b64 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
    C28835x65ab3b64(Object obj) {
        super(1, obj, AppointmentsSchedulerDuxo.class, "selectTimeOfDay", "selectTimeOfDay(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        ((AppointmentsSchedulerDuxo) this.receiver).selectTimeOfDay(i);
    }
}
