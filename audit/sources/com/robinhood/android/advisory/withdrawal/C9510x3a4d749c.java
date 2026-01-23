package com.robinhood.android.advisory.withdrawal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AdvisoryFullWithdrawalScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalScreenKt$AdvisoryFullWithdrawalScreen$1$1$1$1$1 */
/* loaded from: classes7.dex */
/* synthetic */ class C9510x3a4d749c extends FunctionReferenceImpl implements Function0<Unit> {
    C9510x3a4d749c(Object obj) {
        super(0, obj, AdvisoryFullWithdrawalScreenCallbacks.class, "onBackClicked", "onBackClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AdvisoryFullWithdrawalScreenCallbacks) this.receiver).onBackClicked();
    }
}
