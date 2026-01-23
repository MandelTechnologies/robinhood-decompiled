package com.robinhood.android.gold.upgrade.legacy;

import com.robinhood.android.gold.contracts.GoldUpgradeConfirmationFragmentContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: LegacyGoldUpgradeConfirmationFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeConfirmationFragment$ComposeContent$2$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class LegacyGoldUpgradeConfirmationFragment3 extends FunctionReferenceImpl implements Function0<Unit> {
    LegacyGoldUpgradeConfirmationFragment3(Object obj) {
        super(0, obj, GoldUpgradeConfirmationFragmentContract.Callbacks.class, "onClickConfirmationFailedCta", "onClickConfirmationFailedCta()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((GoldUpgradeConfirmationFragmentContract.Callbacks) this.receiver).onClickConfirmationFailedCta();
    }
}
