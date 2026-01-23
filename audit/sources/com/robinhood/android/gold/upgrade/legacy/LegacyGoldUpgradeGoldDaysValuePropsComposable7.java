package com.robinhood.android.gold.upgrade.legacy;

import com.robinhood.android.gold.lib.upgrade.api.ApiGoldUpgradeFlow;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LegacyGoldUpgradeGoldDaysValuePropsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeGoldDaysValuePropsComposableKt$GoldUpgradeGoldDaysValuePropsComposable$1$3$1$2$1$3$1$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class LegacyGoldUpgradeGoldDaysValuePropsComposable7 extends FunctionReferenceImpl implements Function1<ApiGoldUpgradeFlow.ApiGoldPlanSelectionOption, Unit> {
    LegacyGoldUpgradeGoldDaysValuePropsComposable7(Object obj) {
        super(1, obj, LegacyGoldUpgradeGoldDaysValuePropsDuxo.class, "onSelectPlanOption", "onSelectPlanOption(Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldPlanSelectionOption;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ApiGoldUpgradeFlow.ApiGoldPlanSelectionOption apiGoldPlanSelectionOption) {
        invoke2(apiGoldPlanSelectionOption);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ApiGoldUpgradeFlow.ApiGoldPlanSelectionOption p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((LegacyGoldUpgradeGoldDaysValuePropsDuxo) this.receiver).onSelectPlanOption(p0);
    }
}
