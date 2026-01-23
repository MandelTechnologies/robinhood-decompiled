package com.robinhood.android.retirement.onboarding.accountselection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AccountSelection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class AccountSelectionKt$AccountSelectionScreen$1$3$1 extends FunctionReferenceImpl implements Function0<Unit> {
    AccountSelectionKt$AccountSelectionScreen$1$3$1(Object obj) {
        super(0, obj, AccountSelectionCallbacks.class, "onMaybeLaterPressed", "onMaybeLaterPressed()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AccountSelectionCallbacks) this.receiver).onMaybeLaterPressed();
    }
}
