package com.robinhood.android.support.appointments;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AppointmentsSchedulingDatetimePickerComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt$AppointmentsSchedulingDatetimePickerComposable$1$2$1 */
/* loaded from: classes9.dex */
/* synthetic */ class C28834x65ab37a3 extends FunctionReferenceImpl implements Function2<Integer, Integer, Unit> {
    C28834x65ab37a3(Object obj) {
        super(2, obj, AppointmentsSchedulerDuxo.class, "selectDayOfWeek", "selectDayOfWeek(II)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
        invoke(num.intValue(), num2.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i, int i2) {
        ((AppointmentsSchedulerDuxo) this.receiver).selectDayOfWeek(i, i2);
    }
}
