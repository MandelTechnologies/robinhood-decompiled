package com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.feeTierUpgraded;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.Dimension;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoFeeTierUpgradedComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$3$1$5$1$2 */
/* loaded from: classes12.dex */
final class C40405x5b437678 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ ConstraintLayoutBaseScope4 $currentTier;
    final /* synthetic */ ConstraintLayoutBaseScope4 $divider;
    final /* synthetic */ ConstraintLayoutScope $this_ConstraintLayout;

    C40405x5b437678(ConstraintLayoutScope constraintLayoutScope, ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, ConstraintLayoutBaseScope4 constraintLayoutBaseScope42) {
        this.$this_ConstraintLayout = constraintLayoutScope;
        this.$divider = constraintLayoutBaseScope4;
        this.$currentTier = constraintLayoutBaseScope42;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1610577433, i, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgraded.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoFeeTierUpgradedComposable.kt:304)");
        }
        ConstraintLayoutScope constraintLayoutScope = this.$this_ConstraintLayout;
        Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21373getBg30d7_KjU(), null, 2, null), C2002Dp.m7995constructorimpl(1));
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4 = this.$divider;
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(this.$currentTier);
        final ConstraintLayoutBaseScope4 constraintLayoutBaseScope42 = this.$currentTier;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1<ConstrainScope, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt$CryptoFeeTierUpgraded$3$1$5$1$2$1$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                    invoke2(constrainScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ConstrainScope constrainAs) {
                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                    ConstrainScope.centerVerticallyTo$default(constrainAs, constraintLayoutBaseScope42, 0.0f, 2, null);
                    ConstrainScope.centerHorizontallyTo$default(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
                    constrainAs.setHeight(Dimension.INSTANCE.getFillToConstraints());
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Spacer2.Spacer(constraintLayoutScope.constrainAs(modifierM5174width3ABfNKs, constraintLayoutBaseScope4, (Function1) objRememberedValue), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
