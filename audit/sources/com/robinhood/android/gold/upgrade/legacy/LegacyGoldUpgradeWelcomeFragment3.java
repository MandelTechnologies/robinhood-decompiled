package com.robinhood.android.gold.upgrade.legacy;

import com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeWelcomeFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: LegacyGoldUpgradeWelcomeFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeWelcomeFragment$ComposeContent$1$2$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class LegacyGoldUpgradeWelcomeFragment3 extends FunctionReferenceImpl implements Function0<Unit> {
    LegacyGoldUpgradeWelcomeFragment3(Object obj) {
        super(0, obj, LegacyGoldUpgradeWelcomeFragment.Callbacks.class, "onConfirmationFailedCtaClicked", "onConfirmationFailedCtaClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((LegacyGoldUpgradeWelcomeFragment.Callbacks) this.receiver).onConfirmationFailedCtaClicked();
    }
}
