package com.robinhood.android.gold.upgrade.legacy;

import com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeWelcomeFragment;
import com.robinhood.models.serverdriven.experimental.api.DeeplinkAction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: LegacyGoldUpgradeWelcomeFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeWelcomeFragment$ComposeContent$1$1$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class LegacyGoldUpgradeWelcomeFragment2 extends FunctionReferenceImpl implements Function2<Boolean, DeeplinkAction, Unit> {
    LegacyGoldUpgradeWelcomeFragment2(Object obj) {
        super(2, obj, LegacyGoldUpgradeWelcomeFragment.Callbacks.class, "onConfirmationButtonClicked", "onConfirmationButtonClicked(ZLcom/robinhood/models/serverdriven/experimental/api/DeeplinkAction;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, DeeplinkAction deeplinkAction) {
        invoke(bool.booleanValue(), deeplinkAction);
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z, DeeplinkAction deeplinkAction) {
        ((LegacyGoldUpgradeWelcomeFragment.Callbacks) this.receiver).onConfirmationButtonClicked(z, deeplinkAction);
    }
}
