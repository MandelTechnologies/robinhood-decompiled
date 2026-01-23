package com.robinhood.android.margin.upgrade.agreements;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MarginUpgradeAgreementFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementFragment$MarginUpgradeStepComposable$1$1, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class MarginUpgradeAgreementFragment2 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    MarginUpgradeAgreementFragment2(Object obj) {
        super(1, obj, MarginUpgradeAgreementDuxo.class, "onToggleFirstCheckbox", "onToggleFirstCheckbox(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        ((MarginUpgradeAgreementDuxo) this.receiver).onToggleFirstCheckbox(z);
    }
}
