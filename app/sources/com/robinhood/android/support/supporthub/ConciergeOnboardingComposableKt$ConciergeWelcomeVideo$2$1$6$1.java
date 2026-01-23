package com.robinhood.android.support.supporthub;

import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintScopeCommon5;
import androidx.constraintlayout.compose.ConstraintScopeCommon6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConciergeOnboardingComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
final class ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$6$1 implements Function1<ConstrainScope, Unit> {
    public static final ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$6$1 INSTANCE = new ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$6$1();

    ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$6$1() {
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
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
    }
}
