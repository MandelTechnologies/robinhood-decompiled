package com.robinhood.android.onboarding.p205ui.postfundupsell.goldupsell;

import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.models.serverdriven.experimental.api.OnboardingFundingUpsellAction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OnboardingUpsellGoldRateSelectionComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.onboarding.ui.postfundupsell.goldupsell.OnboardingUpsellGoldRateSelectionComposableKt$OnboardingUpsellGoldRateSelectionComposable$1$1$2$1$1$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class OnboardingUpsellGoldRateSelectionComposable2 extends AdaptedFunctionReference implements Function1<OnboardingFundingUpsellAction, Unit> {
    OnboardingUpsellGoldRateSelectionComposable2(Object obj) {
        super(1, obj, SduiActionHandler.class, "handle", "handle(Ljava/lang/Object;)Z", 8);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OnboardingFundingUpsellAction onboardingFundingUpsellAction) {
        invoke2(onboardingFundingUpsellAction);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(OnboardingFundingUpsellAction p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((SduiActionHandler) this.receiver).mo15941handle(p0);
    }
}
