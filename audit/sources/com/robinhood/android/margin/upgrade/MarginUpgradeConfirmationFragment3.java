package com.robinhood.android.margin.upgrade;

import com.robinhood.android.margin.upgrade.MarginUpgradeConfirmationFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MarginUpgradeConfirmationFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.margin.upgrade.MarginUpgradeConfirmationFragment$ComposeContent$1$2$1, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class MarginUpgradeConfirmationFragment3 extends FunctionReferenceImpl implements Function0<Unit> {
    MarginUpgradeConfirmationFragment3(Object obj) {
        super(0, obj, MarginUpgradeConfirmationFragment.Callbacks.class, "onDoneClicked", "onDoneClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((MarginUpgradeConfirmationFragment.Callbacks) this.receiver).onDoneClicked();
    }
}
