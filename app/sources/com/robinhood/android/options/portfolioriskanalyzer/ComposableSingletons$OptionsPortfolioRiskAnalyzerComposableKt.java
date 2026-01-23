package com.robinhood.android.options.portfolioriskanalyzer;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.options.lib.simulatedreturn.OptionsSimulatedReturnErrorState;
import com.robinhood.android.options.lib.simulatedreturn.header.OptionsSimulatedChartHeaderState;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.ModifiersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsPortfolioRiskAnalyzerComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt {
    public static final ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt INSTANCE = new ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt();

    /* renamed from: lambda$-1663652901, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9143lambda$1663652901 = ComposableLambda3.composableLambdaInstance(-1663652901, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt$lambda$-1663652901$1
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
                ComposerKt.traceEventStart(-1663652901, i, -1, "com.robinhood.android.options.portfolioriskanalyzer.ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt.lambda$-1663652901.<anonymous> (OptionsPortfolioRiskAnalyzerComposable.kt:121)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C23462R.string.options_pra_topbar_title, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextM(), composer, 0, 0, 8190);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<OptionsSimulatedChartHeaderState, Composer, Integer, Unit> lambda$10415985 = ComposableLambda3.composableLambdaInstance(10415985, false, new Function3<OptionsSimulatedChartHeaderState, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt$lambda$10415985$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(OptionsSimulatedChartHeaderState optionsSimulatedChartHeaderState, Composer composer, Integer num) {
            invoke(optionsSimulatedChartHeaderState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(OptionsSimulatedChartHeaderState it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(10415985, i, -1, "com.robinhood.android.options.portfolioriskanalyzer.ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt.lambda$10415985.<anonymous> (OptionsPortfolioRiskAnalyzerComposable.kt:215)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1937999382, reason: not valid java name */
    private static Function3<OptionsSimulatedChartHeaderState, Composer, Integer, Unit> f9144lambda$1937999382 = ComposableLambda3.composableLambdaInstance(-1937999382, false, new Function3<OptionsSimulatedChartHeaderState, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt$lambda$-1937999382$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(OptionsSimulatedChartHeaderState optionsSimulatedChartHeaderState, Composer composer, Integer num) {
            invoke(optionsSimulatedChartHeaderState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(OptionsSimulatedChartHeaderState it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1937999382, i, -1, "com.robinhood.android.options.portfolioriskanalyzer.ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt.lambda$-1937999382.<anonymous> (OptionsPortfolioRiskAnalyzerComposable.kt:294)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<OptionsSimulatedReturnErrorState, Composer, Integer, Unit> lambda$1275840735 = ComposableLambda3.composableLambdaInstance(1275840735, false, new Function3<OptionsSimulatedReturnErrorState, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt$lambda$1275840735$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(OptionsSimulatedReturnErrorState optionsSimulatedReturnErrorState, Composer composer, Integer num) {
            invoke(optionsSimulatedReturnErrorState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(OptionsSimulatedReturnErrorState it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1275840735, i, -1, "com.robinhood.android.options.portfolioriskanalyzer.ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt.lambda$1275840735.<anonymous> (OptionsPortfolioRiskAnalyzerComposable.kt:295)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1317790765 = ComposableLambda3.composableLambdaInstance(1317790765, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt$lambda$1317790765$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1317790765, i, -1, "com.robinhood.android.options.portfolioriskanalyzer.ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt.lambda$1317790765.<anonymous> (OptionsPortfolioRiskAnalyzerComposable.kt:366)");
            }
            BoxKt.Box(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(100)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1505636039 = ComposableLambda3.composableLambdaInstance(1505636039, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt$lambda$1505636039$1
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
                ComposerKt.traceEventStart(1505636039, i, -1, "com.robinhood.android.options.portfolioriskanalyzer.ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt.lambda$1505636039.<anonymous> (OptionsPortfolioRiskAnalyzerComposable.kt:396)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C23462R.string.options_pra_topbar_title, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextM(), composer, 0, 0, 8190);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-628050993, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f9147lambda$628050993 = ComposableLambda3.composableLambdaInstance(-628050993, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt$lambda$-628050993$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-628050993, i, -1, "com.robinhood.android.options.portfolioriskanalyzer.ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt.lambda$-628050993.<anonymous> (OptionsPortfolioRiskAnalyzerComposable.kt:416)");
            }
            BoxKt.Box(ModifiersKt.bentoPlaceholder$default(SizeKt.m5156height3ABfNKs(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(16), 7, null), C2002Dp.m7995constructorimpl(40)), true, null, 2, null), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1227997816 = ComposableLambda3.composableLambdaInstance(1227997816, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt$lambda$1227997816$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1227997816, i, -1, "com.robinhood.android.options.portfolioriskanalyzer.ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt.lambda$1227997816.<anonymous> (OptionsPortfolioRiskAnalyzerComposable.kt:426)");
            }
            BentoText2.m20747BentoText38GnDrw("---- -- -- -- -----", PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, C2002Dp.m7995constructorimpl(16), 0.0f, 0.0f, 13, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 54, 0, 16380);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-415950953, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f9146lambda$415950953 = ComposableLambda3.composableLambdaInstance(-415950953, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt$lambda$-415950953$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-415950953, i, -1, "com.robinhood.android.options.portfolioriskanalyzer.ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt.lambda$-415950953.<anonymous> (OptionsPortfolioRiskAnalyzerComposable.kt:433)");
            }
            BoxKt.Box(ModifiersKt.bentoPlaceholder$default(SizeKt.m5156height3ABfNKs(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.6f), 0.0f, C2002Dp.m7995constructorimpl(16), 0.0f, 0.0f, 13, null), C2002Dp.m7995constructorimpl(120)), true, null, 2, null), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-2059899722, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f9145lambda$2059899722 = ComposableLambda3.composableLambdaInstance(-2059899722, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt$lambda$-2059899722$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2059899722, i, -1, "com.robinhood.android.options.portfolioriskanalyzer.ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt.lambda$-2059899722.<anonymous> (OptionsPortfolioRiskAnalyzerComposable.kt:442)");
            }
            BentoText2.m20747BentoText38GnDrw("-- -- -- ----", PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, C2002Dp.m7995constructorimpl(16), 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 54, 0, 16380);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$591118805 = ComposableLambda3.composableLambdaInstance(591118805, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt$lambda$591118805$1
        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(591118805, i, -1, "com.robinhood.android.options.portfolioriskanalyzer.ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt.lambda$591118805.<anonymous> (OptionsPortfolioRiskAnalyzerComposable.kt:449)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getTop(), composer, 6);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            composer.startReplaceGroup(-403069846);
            for (int i2 = 0; i2 < 4; i2++) {
                BoxKt.Box(ModifiersKt.bentoPlaceholder$default(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, C2002Dp.m7995constructorimpl(16), 1, null), C2002Dp.m7995constructorimpl(70)), C2002Dp.m7995constructorimpl(60)), true, null, 2, null), composer, 0);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }
    });

    /* renamed from: lambda$-1052829964, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f9142lambda$1052829964 = ComposableLambda3.composableLambdaInstance(-1052829964, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt$lambda$-1052829964$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1052829964, i, -1, "com.robinhood.android.options.portfolioriskanalyzer.ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt.lambda$-1052829964.<anonymous> (OptionsPortfolioRiskAnalyzerComposable.kt:467)");
            }
            BoxKt.Box(ModifiersKt.bentoPlaceholder$default(SizeKt.m5156height3ABfNKs(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, C2002Dp.m7995constructorimpl(16), 1, null), C2002Dp.m7995constructorimpl(200)), true, null, 2, null), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1598188563 = ComposableLambda3.composableLambdaInstance(1598188563, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt$lambda$1598188563$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1598188563, i, -1, "com.robinhood.android.options.portfolioriskanalyzer.ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt.lambda$1598188563.<anonymous> (OptionsPortfolioRiskAnalyzerComposable.kt:477)");
            }
            BentoText2.m20747BentoText38GnDrw("- ------ -- -- ---", PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, C2002Dp.m7995constructorimpl(16), 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 54, 0, 16380);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$6264257 = ComposableLambda3.composableLambdaInstance(6264257, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt$lambda$6264257$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(6264257, i, -1, "com.robinhood.android.options.portfolioriskanalyzer.ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt.lambda$6264257.<anonymous> (OptionsPortfolioRiskAnalyzerComposable.kt:484)");
            }
            BoxKt.Box(ModifiersKt.bentoPlaceholder$default(SizeKt.m5156height3ABfNKs(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, C2002Dp.m7995constructorimpl(16), 1, null), C2002Dp.m7995constructorimpl(80)), true, null, 2, null), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$2010283012 = ComposableLambda3.composableLambdaInstance(2010283012, false, C23401xe846c50b.INSTANCE);

    /* renamed from: getLambda$-1052829964$feature_options_portfolio_risk_analyzer_externalDebug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m2239x3f0e0334() {
        return f9142lambda$1052829964;
    }

    /* renamed from: getLambda$-1663652901$feature_options_portfolio_risk_analyzer_externalDebug */
    public final Function2<Composer, Integer, Unit> m2240xb7a6989() {
        return f9143lambda$1663652901;
    }

    /* renamed from: getLambda$-1937999382$feature_options_portfolio_risk_analyzer_externalDebug */
    public final Function3<OptionsSimulatedChartHeaderState, Composer, Integer, Unit> m2241x943116a0() {
        return f9144lambda$1937999382;
    }

    /* renamed from: getLambda$-2059899722$feature_options_portfolio_risk_analyzer_externalDebug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m2242xa8f4fbe1() {
        return f9145lambda$2059899722;
    }

    /* renamed from: getLambda$-415950953$feature_options_portfolio_risk_analyzer_externalDebug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m2243x24a3fa2f() {
        return f9146lambda$415950953;
    }

    /* renamed from: getLambda$-628050993$feature_options_portfolio_risk_analyzer_externalDebug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m2244x9e1978f8() {
        return f9147lambda$628050993;
    }

    /* renamed from: getLambda$10415985$feature_options_portfolio_risk_analyzer_externalDebug */
    public final Function3<OptionsSimulatedChartHeaderState, Composer, Integer, Unit> m2245x23faccde() {
        return lambda$10415985;
    }

    /* renamed from: getLambda$1227997816$feature_options_portfolio_risk_analyzer_externalDebug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m2246xaf1531ed() {
        return lambda$1227997816;
    }

    /* renamed from: getLambda$1275840735$feature_options_portfolio_risk_analyzer_externalDebug */
    public final Function3<OptionsSimulatedReturnErrorState, Composer, Integer, Unit> m2247x9ed9f985() {
        return lambda$1275840735;
    }

    /* renamed from: getLambda$1317790765$feature_options_portfolio_risk_analyzer_externalDebug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m2248xdf0a4e11() {
        return lambda$1317790765;
    }

    /* renamed from: getLambda$1505636039$feature_options_portfolio_risk_analyzer_externalDebug */
    public final Function2<Composer, Integer, Unit> m2249x3ae9b627() {
        return lambda$1505636039;
    }

    /* renamed from: getLambda$1598188563$feature_options_portfolio_risk_analyzer_externalDebug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m2250xb75ddf85() {
        return lambda$1598188563;
    }

    /* renamed from: getLambda$2010283012$feature_options_portfolio_risk_analyzer_externalDebug */
    public final Function2<Composer, Integer, Unit> m2251x586b0442() {
        return lambda$2010283012;
    }

    /* renamed from: getLambda$591118805$feature_options_portfolio_risk_analyzer_externalDebug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m2252xda0ea65() {
        return lambda$591118805;
    }

    /* renamed from: getLambda$6264257$feature_options_portfolio_risk_analyzer_externalDebug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m2253xece04cd() {
        return lambda$6264257;
    }
}
