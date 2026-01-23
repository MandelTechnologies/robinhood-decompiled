package com.robinhood.android.rhy.referral.fund.confirmation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: RhyReferralFundConfirmationFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhy.referral.fund.confirmation.RhyReferralFundConfirmationFragment$ComposeContent$2$1, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class RhyReferralFundConfirmationFragment2 extends FunctionReferenceImpl implements Function0<Unit> {
    RhyReferralFundConfirmationFragment2(Object obj) {
        super(0, obj, RhyReferralFundConfirmationDuxo.class, "debugAddCardToGooglePayDialogDismissed", "debugAddCardToGooglePayDialogDismissed()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((RhyReferralFundConfirmationDuxo) this.receiver).debugAddCardToGooglePayDialogDismissed();
    }
}
