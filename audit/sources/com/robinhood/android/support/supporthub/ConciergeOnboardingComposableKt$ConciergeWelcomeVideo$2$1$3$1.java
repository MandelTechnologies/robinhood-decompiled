package com.robinhood.android.support.supporthub;

import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.SnapshotState;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintScopeCommon5;
import androidx.constraintlayout.compose.ConstraintScopeCommon6;
import androidx.constraintlayout.compose.Dimension;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ConciergeOnboardingComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
final class ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$3$1 implements Function1<ConstrainScope, Unit> {
    final /* synthetic */ ConstraintLayoutBaseScope4 $heroVideo;
    final /* synthetic */ SnapshotState<Boolean> $videoEnd$delegate;

    ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$3$1(ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, SnapshotState<Boolean> snapshotState) {
        this.$heroVideo = constraintLayoutBaseScope4;
        this.$videoEnd$delegate = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
        invoke2(constrainScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConstrainScope constrainAs) {
        Dimension dimensionM8160value0680j_4;
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        if (ConciergeOnboardingComposableKt.ConciergeWelcomeVideo$lambda$41(this.$videoEnd$delegate)) {
            ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getTop(), this.$heroVideo.getTop(), 0.0f, 0.0f, 6, null);
        }
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getBottom(), this.$heroVideo.getBottom(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        if (ConciergeOnboardingComposableKt.ConciergeWelcomeVideo$lambda$41(this.$videoEnd$delegate)) {
            dimensionM8160value0680j_4 = Dimension.INSTANCE.getFillToConstraints();
        } else {
            dimensionM8160value0680j_4 = Dimension.INSTANCE.m8160value0680j_4(C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE));
        }
        constrainAs.setHeight(dimensionM8160value0680j_4);
    }
}
