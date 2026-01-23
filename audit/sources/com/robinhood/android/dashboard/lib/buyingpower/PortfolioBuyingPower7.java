package com.robinhood.android.dashboard.lib.buyingpower;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.bugsy.BugsyRedactCompose2;
import com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPower7;
import com.robinhood.android.mcw.fxswitcher.ftux.constants.Transitions;
import com.robinhood.compose.bento.component.BentoText2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PortfolioBuyingPower.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerKt$PortfolioBuyingPower$2$2, reason: use source file name */
/* loaded from: classes2.dex */
final class PortfolioBuyingPower7 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ AnimationTargetState $buyingPowerAnimationTargetState;
    final /* synthetic */ Modifier $toolTipModifier;

    PortfolioBuyingPower7(AnimationTargetState animationTargetState, Modifier modifier) {
        this.$buyingPowerAnimationTargetState = animationTargetState;
        this.$toolTipModifier = modifier;
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
            ComposerKt.traceEventStart(-2096127662, i, -1, "com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPower.<anonymous>.<anonymous> (PortfolioBuyingPower.kt:170)");
        }
        Alignment centerEnd = Alignment.INSTANCE.getCenterEnd();
        AnimationTargetState animationTargetState = this.$buyingPowerAnimationTargetState;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerKt$PortfolioBuyingPower$2$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PortfolioBuyingPower7.invoke$lambda$1$lambda$0((AnimatedContentTransitionScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerKt$PortfolioBuyingPower$2$2$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PortfolioBuyingPower7.invoke$lambda$3$lambda$2((AnimationTargetState) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        AnimatedContentKt.AnimatedContent(animationTargetState, null, function1, centerEnd, "buyingPowerRowTextAnimation", (Function1) objRememberedValue2, ComposableLambda3.rememberComposableLambda(-527661123, true, new C137263(this.$toolTipModifier), composer, 54), composer, 1797504, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ContentTransform invoke$lambda$1$lambda$0(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        if (((AnimationTargetState) AnimatedContent.getInitialState()).isPrivacyEnabled() != ((AnimationTargetState) AnimatedContent.getTargetState()).isPrivacyEnabled()) {
            return AnimatedContentKt.togetherWith(EnterTransition.INSTANCE.getNone(), ExitTransition.INSTANCE.getNone());
        }
        return AnimatedContent.using(Transitions.getCurrencySwapTransition(), Transitions.getCurrencySwapSizeTransform());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object invoke$lambda$3$lambda$2(AnimationTargetState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getDisplayCurrency();
    }

    /* compiled from: PortfolioBuyingPower.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerKt$PortfolioBuyingPower$2$2$3 */
    static final class C137263 implements Function4<AnimatedContentScope, AnimationTargetState, Composer, Integer, Unit> {
        final /* synthetic */ Modifier $toolTipModifier;

        C137263(Modifier modifier) {
            this.$toolTipModifier = modifier;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, AnimationTargetState animationTargetState, Composer composer, Integer num) {
            invoke(animatedContentScope, animationTargetState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedContentScope AnimatedContent, AnimationTargetState state, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            Intrinsics.checkNotNullParameter(state, "state");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-527661123, i, -1, "com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPower.<anonymous>.<anonymous>.<anonymous> (PortfolioBuyingPower.kt:184)");
            }
            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, PortfolioBuyingPower5.getBuyingPowerMetaTextTestTag());
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerKt$PortfolioBuyingPower$2$2$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PortfolioBuyingPower7.C137263.invoke$lambda$1$lambda$0((SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoText2.m20747BentoText38GnDrw(state.getBuyingPowerText(), BugsyRedactCompose2.redactable(SemanticsModifier6.semantics$default(modifierTestTag, false, (Function1) objRememberedValue, 1, null)).then(this.$toolTipModifier), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16380);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SemanticsPropertyReceiver semantics) {
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
            return Unit.INSTANCE;
        }
    }
}
