package com.robinhood.android.beneficiaries.p067ui.individualflow.intro;

import com.robinhood.android.beneficiaries.p067ui.individualflow.intro.BeneficiaryValuePropFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: BeneficiaryValuePropFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.beneficiaries.ui.individualflow.intro.BeneficiaryValuePropFragment$ComposeContent$1$1$1$1, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class BeneficiaryValuePropFragment2 extends FunctionReferenceImpl implements Function0<Unit> {
    BeneficiaryValuePropFragment2(Object obj) {
        super(0, obj, BeneficiaryValuePropFragment.Callbacks.class, "onValuePropCompleted", "onValuePropCompleted()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((BeneficiaryValuePropFragment.Callbacks) this.receiver).onValuePropCompleted();
    }
}
