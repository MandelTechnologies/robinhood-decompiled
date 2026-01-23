package com.robinhood.android.retirement.onboarding.accountcomparison;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: RetirementAccountComparison.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.onboarding.accountcomparison.RetirementAccountComparisonKt$Success$1$2$1, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class RetirementAccountComparison8 extends FunctionReferenceImpl implements Function0<Unit> {
    RetirementAccountComparison8(Object obj) {
        super(0, obj, RetirementAccountComparison4.class, "onCloseClick", "onCloseClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((RetirementAccountComparison4) this.receiver).onCloseClick();
    }
}
