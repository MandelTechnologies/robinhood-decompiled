package com.robinhood.android.advisory.withdrawal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AdvisoryFullWithdrawalScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalScreenKt$AdvisoryFullWithdrawalContent$1$2$2$1 */
/* loaded from: classes7.dex */
/* synthetic */ class C9508xa8d36a0 extends FunctionReferenceImpl implements Function0<Unit> {
    C9508xa8d36a0(Object obj) {
        super(0, obj, AdvisoryFullWithdrawalScreenCallbacks.class, "onCancelClicked", "onCancelClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AdvisoryFullWithdrawalScreenCallbacks) this.receiver).onCancelClicked();
    }
}
