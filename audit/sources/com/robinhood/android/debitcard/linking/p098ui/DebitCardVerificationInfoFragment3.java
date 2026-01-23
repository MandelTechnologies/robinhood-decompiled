package com.robinhood.android.debitcard.linking.p098ui;

import com.robinhood.android.debitcard.linking.p098ui.DebitCardVerificationInfoFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DebitCardVerificationInfoFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.debitcard.linking.ui.DebitCardVerificationInfoFragment$onViewCreated$1$2$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class DebitCardVerificationInfoFragment3 extends FunctionReferenceImpl implements Function0<Unit> {
    DebitCardVerificationInfoFragment3(Object obj) {
        super(0, obj, DebitCardVerificationInfoFragment.Callbacks.class, "onContinueWithVerification", "onContinueWithVerification()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((DebitCardVerificationInfoFragment.Callbacks) this.receiver).onContinueWithVerification();
    }
}
