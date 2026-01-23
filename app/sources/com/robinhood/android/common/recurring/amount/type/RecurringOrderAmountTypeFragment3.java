package com.robinhood.android.common.recurring.amount.type;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringOrderAmountTypeFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.recurring.amount.type.RecurringOrderAmountTypeFragment$onViewCreated$1$3, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class RecurringOrderAmountTypeFragment3 extends FunctionReferenceImpl implements Function1<RecurringOrderAmountTypeViewState, Unit> {
    RecurringOrderAmountTypeFragment3(Object obj) {
        super(1, obj, RecurringOrderAmountTypeFragment.class, "bindViewState", "bindViewState(Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeViewState;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(RecurringOrderAmountTypeViewState recurringOrderAmountTypeViewState) {
        invoke2(recurringOrderAmountTypeViewState);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(RecurringOrderAmountTypeViewState p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((RecurringOrderAmountTypeFragment) this.receiver).bindViewState(p0);
    }
}
