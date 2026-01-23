package com.robinhood.android.support.supporthub;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoProgressIndicator2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConciergeOnboardingComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$ConciergeOnboardingComposableKt {
    public static final ComposableSingletons$ConciergeOnboardingComposableKt INSTANCE = new ComposableSingletons$ConciergeOnboardingComposableKt();

    /* renamed from: lambda$-1245686020, reason: not valid java name */
    private static Function3<PaddingValues, Composer, Integer, Unit> f9255lambda$1245686020 = ComposableLambda3.composableLambdaInstance(-1245686020, false, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.support.supporthub.ComposableSingletons$ConciergeOnboardingComposableKt$lambda$-1245686020$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i |= composer.changed(paddingValues) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1245686020, i, -1, "com.robinhood.android.support.supporthub.ComposableSingletons$ConciergeOnboardingComposableKt.lambda$-1245686020.<anonymous> (ConciergeOnboardingComposable.kt:229)");
            }
            ConciergeOnboardingLoadingComposable.ConciergeOnboardingLoadingComposable(paddingValues, composer, i & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<Row5, Composer, Integer, Unit> lambda$2001814583 = ComposableLambda3.composableLambdaInstance(2001814583, false, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.support.supporthub.ComposableSingletons$ConciergeOnboardingComposableKt$lambda$2001814583$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 row5, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(row5, "<this>");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2001814583, i, -1, "com.robinhood.android.support.supporthub.ComposableSingletons$ConciergeOnboardingComposableKt.lambda$2001814583.<anonymous> (ConciergeOnboardingComposable.kt:363)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-2106116456, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9256lambda$2106116456 = ComposableLambda3.composableLambdaInstance(-2106116456, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.support.supporthub.ComposableSingletons$ConciergeOnboardingComposableKt$lambda$-2106116456$1
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
                ComposerKt.traceEventStart(-2106116456, i, -1, "com.robinhood.android.support.supporthub.ComposableSingletons$ConciergeOnboardingComposableKt.lambda$-2106116456.<anonymous> (ConciergeOnboardingComposable.kt:381)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<AnimatedVisibilityScope, Composer, Integer, Unit> lambda$881661233 = ComposableLambda3.composableLambdaInstance(881661233, false, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.support.supporthub.ComposableSingletons$ConciergeOnboardingComposableKt$lambda$881661233$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(881661233, i, -1, "com.robinhood.android.support.supporthub.ComposableSingletons$ConciergeOnboardingComposableKt.lambda$881661233.<anonymous> (ConciergeOnboardingComposable.kt:841)");
            }
            ConciergeOnboardingComposableKt.ConciergeWelcomeEndVideoText(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-416443223, reason: not valid java name */
    private static Function3<AnimatedVisibilityScope, Composer, Integer, Unit> f9257lambda$416443223 = ComposableLambda3.composableLambdaInstance(-416443223, false, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.support.supporthub.ComposableSingletons$ConciergeOnboardingComposableKt$lambda$-416443223$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-416443223, i, -1, "com.robinhood.android.support.supporthub.ComposableSingletons$ConciergeOnboardingComposableKt.lambda$-416443223.<anonymous> (ConciergeOnboardingComposable.kt:879)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierFillMaxSize$default, bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), null, 2, null);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4872backgroundbw27NRU$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default2);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ProgressIndicatorKt.m5922CircularProgressIndicatorLxG7B9w(LocalShowPlaceholder.withBentoCirclePlaceholder$default(TestTag3.testTag(SizeKt.m5169size3ABfNKs(companion, C2002Dp.m7995constructorimpl(80)), BentoProgressIndicator2.BentoCircularProgressIndicatorTestTag), false, 1, null), bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), C2002Dp.m7995constructorimpl(2), 0L, 0, composer, 384, 24);
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size40(ServerToBentoAssetMapper2.ROBINHOOD_24), null, bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), null, null, false, composer, BentoIcon4.Size40.$stable | 48, 56);
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1245686020$feature_support_externalRelease, reason: not valid java name */
    public final Function3<PaddingValues, Composer, Integer, Unit> m19094getLambda$1245686020$feature_support_externalRelease() {
        return f9255lambda$1245686020;
    }

    /* renamed from: getLambda$-2106116456$feature_support_externalRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m19095getLambda$2106116456$feature_support_externalRelease() {
        return f9256lambda$2106116456;
    }

    /* renamed from: getLambda$-416443223$feature_support_externalRelease, reason: not valid java name */
    public final Function3<AnimatedVisibilityScope, Composer, Integer, Unit> m19096getLambda$416443223$feature_support_externalRelease() {
        return f9257lambda$416443223;
    }

    public final Function3<Row5, Composer, Integer, Unit> getLambda$2001814583$feature_support_externalRelease() {
        return lambda$2001814583;
    }

    public final Function3<AnimatedVisibilityScope, Composer, Integer, Unit> getLambda$881661233$feature_support_externalRelease() {
        return lambda$881661233;
    }
}
