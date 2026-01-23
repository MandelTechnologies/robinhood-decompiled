package com.robinhood.android.gold.upgrade.legacy;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: LegacyGoldUpgradeGoldDaysValuePropsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeGoldDaysValuePropsFragment$ComposeContent$2$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class LegacyGoldUpgradeGoldDaysValuePropsFragment3 extends AdaptedFunctionReference implements Function0<Unit> {
    LegacyGoldUpgradeGoldDaysValuePropsFragment3(Object obj) {
        super(0, obj, LegacyGoldUpgradeGoldDaysValuePropsFragment.class, "onBackPressed", "onBackPressed()Z", 8);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((LegacyGoldUpgradeGoldDaysValuePropsFragment) this.receiver).onBackPressed();
    }
}
