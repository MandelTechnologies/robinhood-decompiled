package com.robinhood.android.directdeposit.p101ui.prefilled.partial;

import com.robinhood.android.directdeposit.p101ui.prefilled.partial.PreFilledFormAmountTypeFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PreFilledFormAmountTypeFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.directdeposit.ui.prefilled.partial.PreFilledFormAmountTypeFragment$onViewCreated$1$1, reason: use source file name */
/* loaded from: classes27.dex */
/* synthetic */ class PreFilledFormAmountTypeFragment3 extends FunctionReferenceImpl implements Function0<Unit> {
    PreFilledFormAmountTypeFragment3(Object obj) {
        super(0, obj, PreFilledFormAmountTypeFragment.Callbacks.class, "onEntirePaycheckSelected", "onEntirePaycheckSelected()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((PreFilledFormAmountTypeFragment.Callbacks) this.receiver).onEntirePaycheckSelected();
    }
}
