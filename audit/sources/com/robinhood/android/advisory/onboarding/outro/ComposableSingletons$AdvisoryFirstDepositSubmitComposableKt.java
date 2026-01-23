package com.robinhood.android.advisory.onboarding.outro;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoProgressIndicator2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryFirstDepositSubmitComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class ComposableSingletons$AdvisoryFirstDepositSubmitComposableKt {
    public static final ComposableSingletons$AdvisoryFirstDepositSubmitComposableKt INSTANCE = new ComposableSingletons$AdvisoryFirstDepositSubmitComposableKt();
    private static Function2<Composer, Integer, Unit> lambda$814352503 = ComposableLambda3.composableLambdaInstance(814352503, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.outro.ComposableSingletons$AdvisoryFirstDepositSubmitComposableKt$lambda$814352503$1
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
                ComposerKt.traceEventStart(814352503, i, -1, "com.robinhood.android.advisory.onboarding.outro.ComposableSingletons$AdvisoryFirstDepositSubmitComposableKt.lambda$814352503.<anonymous> (AdvisoryFirstDepositSubmitComposable.kt:161)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1138197451, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8632lambda$1138197451 = ComposableLambda3.composableLambdaInstance(-1138197451, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.outro.ComposableSingletons$AdvisoryFirstDepositSubmitComposableKt$lambda$-1138197451$1
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
                ComposerKt.traceEventStart(-1138197451, i, -1, "com.robinhood.android.advisory.onboarding.outro.ComposableSingletons$AdvisoryFirstDepositSubmitComposableKt.lambda$-1138197451.<anonymous> (AdvisoryFirstDepositSubmitComposable.kt:162)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-144866604, reason: not valid java name */
    private static Function3<AnimatedVisibilityScope, Composer, Integer, Unit> f8633lambda$144866604 = ComposableLambda3.composableLambdaInstance(-144866604, false, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.outro.ComposableSingletons$AdvisoryFirstDepositSubmitComposableKt$lambda$-144866604$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope OrderForm, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(OrderForm, "$this$OrderForm");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-144866604, i, -1, "com.robinhood.android.advisory.onboarding.outro.ComposableSingletons$AdvisoryFirstDepositSubmitComposableKt.lambda$-144866604.<anonymous> (AdvisoryFirstDepositSubmitComposable.kt:163)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1830152581, reason: not valid java name */
    private static Function5<Boolean, Integer, Float, Composer, Integer, Unit> f8634lambda$1830152581 = ComposableLambda3.composableLambdaInstance(-1830152581, false, new Function5<Boolean, Integer, Float, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.outro.ComposableSingletons$AdvisoryFirstDepositSubmitComposableKt$lambda$-1830152581$1
        public final void invoke(boolean z, int i, float f, Composer composer, int i2) {
            if ((i2 & 1025) == 1024 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1830152581, i2, -1, "com.robinhood.android.advisory.onboarding.outro.ComposableSingletons$AdvisoryFirstDepositSubmitComposableKt.lambda$-1830152581.<anonymous> (AdvisoryFirstDepositSubmitComposable.kt:166)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(null, null, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getNova(), composer, 0, 3);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Integer num, Float f, Composer composer, Integer num2) {
            invoke(bool.booleanValue(), num.intValue(), f.floatValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }
    });

    /* renamed from: lambda$-795266551, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8635lambda$795266551 = ComposableLambda3.composableLambdaInstance(-795266551, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.outro.ComposableSingletons$AdvisoryFirstDepositSubmitComposableKt$lambda$-795266551$1
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
                ComposerKt.traceEventStart(-795266551, i, -1, "com.robinhood.android.advisory.onboarding.outro.ComposableSingletons$AdvisoryFirstDepositSubmitComposableKt.lambda$-795266551.<anonymous> (AdvisoryFirstDepositSubmitComposable.kt:199)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1138197451$feature_advisory_onboarding_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11087getLambda$1138197451$feature_advisory_onboarding_externalDebug() {
        return f8632lambda$1138197451;
    }

    /* renamed from: getLambda$-144866604$feature_advisory_onboarding_externalDebug, reason: not valid java name */
    public final Function3<AnimatedVisibilityScope, Composer, Integer, Unit> m11088getLambda$144866604$feature_advisory_onboarding_externalDebug() {
        return f8633lambda$144866604;
    }

    /* renamed from: getLambda$-1830152581$feature_advisory_onboarding_externalDebug, reason: not valid java name */
    public final Function5<Boolean, Integer, Float, Composer, Integer, Unit> m11089getLambda$1830152581$feature_advisory_onboarding_externalDebug() {
        return f8634lambda$1830152581;
    }

    /* renamed from: getLambda$-795266551$feature_advisory_onboarding_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11090getLambda$795266551$feature_advisory_onboarding_externalDebug() {
        return f8635lambda$795266551;
    }

    public final Function2<Composer, Integer, Unit> getLambda$814352503$feature_advisory_onboarding_externalDebug() {
        return lambda$814352503;
    }
}
