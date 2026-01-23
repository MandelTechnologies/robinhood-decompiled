package com.robinhood.android.common.recurring.bottomsheet.paymentmethod;

import com.robinhood.android.common.recurring.bottomsheet.paymentmethod.RecurringPaymentMethodBottomSheet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringPaymentMethodBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.recurring.bottomsheet.paymentmethod.RecurringPaymentMethodBottomSheet$adapter$1, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class RecurringPaymentMethodBottomSheet2 extends FunctionReferenceImpl implements Function1<RecurringPaymentMethodBottomSheet.Row, Unit> {
    RecurringPaymentMethodBottomSheet2(Object obj) {
        super(1, obj, RecurringPaymentMethodBottomSheet.class, "onRowClicked", "onRowClicked(Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodBottomSheet$Row;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(RecurringPaymentMethodBottomSheet.Row row) {
        invoke2(row);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(RecurringPaymentMethodBottomSheet.Row p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((RecurringPaymentMethodBottomSheet) this.receiver).onRowClicked(p0);
    }
}
