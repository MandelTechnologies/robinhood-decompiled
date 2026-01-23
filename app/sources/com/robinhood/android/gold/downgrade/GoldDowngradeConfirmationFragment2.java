package com.robinhood.android.gold.downgrade;

import com.robinhood.android.gold.downgrade.GoldDowngradeConfirmationFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: GoldDowngradeConfirmationFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.downgrade.GoldDowngradeConfirmationFragment$ComposeContent$1$1$1$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class GoldDowngradeConfirmationFragment2 extends FunctionReferenceImpl implements Function0<Unit> {
    GoldDowngradeConfirmationFragment2(Object obj) {
        super(0, obj, GoldDowngradeConfirmationFragment.Callbacks.class, "onDowngradeCompleted", "onDowngradeCompleted()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((GoldDowngradeConfirmationFragment.Callbacks) this.receiver).onDowngradeCompleted();
    }
}
