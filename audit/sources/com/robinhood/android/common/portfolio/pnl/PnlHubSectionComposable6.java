package com.robinhood.android.common.portfolio.pnl;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.mcw.fxswitcher.ftux.constants.Transitions;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PnlHubSectionComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.portfolio.pnl.PnlHubSectionComposableKt$PnlHubSection$4$3, reason: use source file name */
/* loaded from: classes2.dex */
final class PnlHubSectionComposable6 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ PnlHubSectionViewState $viewState;

    PnlHubSectionComposable6(PnlHubSectionViewState pnlHubSectionViewState) {
        this.$viewState = pnlHubSectionViewState;
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
            ComposerKt.traceEventStart(-442988999, i, -1, "com.robinhood.android.common.portfolio.pnl.PnlHubSection.<anonymous>.<anonymous> (PnlHubSectionComposable.kt:207)");
        }
        Money pastMonth = this.$viewState.getRealizedPnl().getPastMonth();
        Alignment centerEnd = Alignment.INSTANCE.getCenterEnd();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.common.portfolio.pnl.PnlHubSectionComposableKt$PnlHubSection$4$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PnlHubSectionComposable6.invoke$lambda$1$lambda$0((AnimatedContentTransitionScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.common.portfolio.pnl.PnlHubSectionComposableKt$PnlHubSection$4$3$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PnlHubSectionComposable6.invoke$lambda$3$lambda$2((Money) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        final PnlHubSectionViewState pnlHubSectionViewState = this.$viewState;
        AnimatedContentKt.AnimatedContent(pastMonth, null, function1, centerEnd, "pnlHubSectionPastMonthAnimation", (Function1) objRememberedValue2, ComposableLambda3.rememberComposableLambda(365791486, true, new Function4<AnimatedContentScope, Money, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.portfolio.pnl.PnlHubSectionComposableKt$PnlHubSection$4$3.3
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Money money, Composer composer2, Integer num) {
                invoke(animatedContentScope, money, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedContentScope AnimatedContent, Money pastMonth2, Composer composer2, int i2) {
                Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                Intrinsics.checkNotNullParameter(pastMonth2, "pastMonth");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(365791486, i2, -1, "com.robinhood.android.common.portfolio.pnl.PnlHubSection.<anonymous>.<anonymous>.<anonymous> (PnlHubSectionComposable.kt:214)");
                }
                BentoText2.m20747BentoText38GnDrw(Money.format$default(pastMonth2, null, false, null, false, 2, null, false, null, false, !pastMonth2.isZero(), 495, null), ModifiersKt.bentoPlaceholder$default(Modifier.INSTANCE, pnlHubSectionViewState.isStale(), null, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16380);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, 1797504, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform invoke$lambda$1$lambda$0(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        return AnimatedContent.using(Transitions.getCurrencySwapTransition(), Transitions.getCurrencySwapSizeTransform());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object invoke$lambda$3$lambda$2(Money it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getCurrency();
    }
}
