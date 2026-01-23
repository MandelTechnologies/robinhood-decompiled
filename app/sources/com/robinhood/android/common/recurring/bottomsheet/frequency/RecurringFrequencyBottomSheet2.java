package com.robinhood.android.common.recurring.bottomsheet.frequency;

import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringFrequencyBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet$adapter$1, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class RecurringFrequencyBottomSheet2 extends FunctionReferenceImpl implements Function1<RecurringFrequencyBottomSheet.Row, Unit> {
    RecurringFrequencyBottomSheet2(Object obj) {
        super(1, obj, RecurringFrequencyBottomSheet.class, "onRowClicked", "onRowClicked(Lcom/robinhood/android/common/recurring/bottomsheet/frequency/RecurringFrequencyBottomSheet$Row;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(RecurringFrequencyBottomSheet.Row row) {
        invoke2(row);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(RecurringFrequencyBottomSheet.Row p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((RecurringFrequencyBottomSheet) this.receiver).onRowClicked(p0);
    }
}
