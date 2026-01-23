package com.robinhood.android.support.appointments;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: AppointmentsSchedulingDatetimePickerComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
final class AppointmentsSchedulingDatetimePickerComposableKt$DateCard$1$3$1 implements Function0<Unit> {
    final /* synthetic */ int $dayIndex;
    final /* synthetic */ boolean $isAvailable;
    final /* synthetic */ Function2<Integer, Integer, Unit> $onClick;
    final /* synthetic */ int $weekIndex;

    /* JADX WARN: Multi-variable type inference failed */
    AppointmentsSchedulingDatetimePickerComposableKt$DateCard$1$3$1(boolean z, Function2<? super Integer, ? super Integer, Unit> function2, int i, int i2) {
        this.$isAvailable = z;
        this.$onClick = function2;
        this.$weekIndex = i;
        this.$dayIndex = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$isAvailable) {
            this.$onClick.invoke(Integer.valueOf(this.$weekIndex), Integer.valueOf(this.$dayIndex));
        }
    }
}
