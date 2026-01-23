package com.robinhood.android.cash.rewards.p074ui.onboarding.composables;

import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintScopeCommon5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RoundupOnboardingSignUpComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.rewards.ui.onboarding.composables.RoundupOnboardingSignUpComposableKt$RoundupOnboardingSignUpComposable$1$1$1, reason: use source file name */
/* loaded from: classes7.dex */
final class RoundupOnboardingSignUpComposable2 implements Function1<ConstrainScope, Unit> {
    public static final RoundupOnboardingSignUpComposable2 INSTANCE = new RoundupOnboardingSignUpComposable2();

    RoundupOnboardingSignUpComposable2() {
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
        invoke2(constrainScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
    }
}
