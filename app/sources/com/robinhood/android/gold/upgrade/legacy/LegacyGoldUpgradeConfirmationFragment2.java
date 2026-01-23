package com.robinhood.android.gold.upgrade.legacy;

import com.robinhood.android.gold.contracts.GoldUpgradeConfirmationFragmentContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: LegacyGoldUpgradeConfirmationFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeConfirmationFragment$ComposeContent$1$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class LegacyGoldUpgradeConfirmationFragment2 extends FunctionReferenceImpl implements Function2<Boolean, Boolean, Unit> {
    LegacyGoldUpgradeConfirmationFragment2(Object obj) {
        super(2, obj, GoldUpgradeConfirmationFragmentContract.Callbacks.class, "onClickConfirmationCta", "onClickConfirmationCta(ZZ)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Boolean bool2) {
        invoke(bool.booleanValue(), bool2.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z, boolean z2) {
        ((GoldUpgradeConfirmationFragmentContract.Callbacks) this.receiver).onClickConfirmationCta(z, z2);
    }
}
