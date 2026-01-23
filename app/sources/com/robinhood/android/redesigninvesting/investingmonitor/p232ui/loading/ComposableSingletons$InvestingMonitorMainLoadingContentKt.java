package com.robinhood.android.redesigninvesting.investingmonitor.p232ui.loading;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TabPosition;
import androidx.compose.material3.TabRowDefaults;
import androidx.compose.material3.TabRowKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.redesigninvesting.investingmonitor.C26507R;
import com.robinhood.android.redesigninvesting.investingmonitor.p232ui.item.row.InvestingMonitorShimmerAssetRow;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestingMonitorMainLoadingContent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class ComposableSingletons$InvestingMonitorMainLoadingContentKt {
    public static final ComposableSingletons$InvestingMonitorMainLoadingContentKt INSTANCE = new ComposableSingletons$InvestingMonitorMainLoadingContentKt();
    private static Function2<Composer, Integer, Unit> lambda$443487415 = ComposableLambda3.composableLambdaInstance(443487415, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.loading.ComposableSingletons$InvestingMonitorMainLoadingContentKt$lambda$443487415$1
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
                ComposerKt.traceEventStart(443487415, i, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.loading.ComposableSingletons$InvestingMonitorMainLoadingContentKt.lambda$443487415.<anonymous> (InvestingMonitorMainLoadingContent.kt:37)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C26507R.string.investing_monitor_title, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getDisplayCapsuleMedium(), composer, 0, 0, 8190);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<BentoAppBarScope, Composer, Integer, Unit> lambda$1908943627 = ComposableLambda3.composableLambdaInstance(1908943627, false, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.loading.ComposableSingletons$InvestingMonitorMainLoadingContentKt$lambda$1908943627$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
            invoke(bentoAppBarScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1908943627, i, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.loading.ComposableSingletons$InvestingMonitorMainLoadingContentKt.lambda$1908943627.<anonymous> (InvestingMonitorMainLoadingContent.kt:42)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-592631508, reason: not valid java name */
    private static Function3<Row5, Composer, Integer, Unit> f9204lambda$592631508 = ComposableLambda3.composableLambdaInstance(-592631508, false, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.loading.ComposableSingletons$InvestingMonitorMainLoadingContentKt$lambda$-592631508$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-592631508, i, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.loading.ComposableSingletons$InvestingMonitorMainLoadingContentKt.lambda$-592631508.<anonymous> (InvestingMonitorMainLoadingContent.kt:43)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$476972298 = ComposableLambda3.composableLambdaInstance(476972298, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.loading.ComposableSingletons$InvestingMonitorMainLoadingContentKt$lambda$476972298$1
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
                ComposerKt.traceEventStart(476972298, i, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.loading.ComposableSingletons$InvestingMonitorMainLoadingContentKt.lambda$476972298.<anonymous> (InvestingMonitorMainLoadingContent.kt:34)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposableSingletons$InvestingMonitorMainLoadingContentKt composableSingletons$InvestingMonitorMainLoadingContentKt = ComposableSingletons$InvestingMonitorMainLoadingContentKt.INSTANCE;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableSingletons$InvestingMonitorMainLoadingContentKt.getLambda$443487415$feature_investing_monitor_externalDebug(), modifierFillMaxWidth$default, composableSingletons$InvestingMonitorMainLoadingContentKt.getLambda$1908943627$feature_investing_monitor_externalDebug(), composableSingletons$InvestingMonitorMainLoadingContentKt.m18001getLambda$592631508$feature_investing_monitor_externalDebug(), null, false, false, null, null, 0L, null, composer, 3510, 0, 2032);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1249887489, reason: not valid java name */
    private static Function3<List<TabPosition>, Composer, Integer, Unit> f9202lambda$1249887489 = ComposableLambda3.composableLambdaInstance(-1249887489, false, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.loading.ComposableSingletons$InvestingMonitorMainLoadingContentKt$lambda$-1249887489$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer, Integer num) {
            invoke((List<TabPosition>) list, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(List<TabPosition> tabPositions, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1249887489, i, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.loading.ComposableSingletons$InvestingMonitorMainLoadingContentKt.lambda$-1249887489.<anonymous> (InvestingMonitorMainLoadingContent.kt:59)");
            }
            if (!tabPositions.isEmpty()) {
                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                tabRowDefaults.m5988SecondaryIndicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(0)), 0.0f, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU(), composer, TabRowDefaults.$stable << 9, 2);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1372637439 = ComposableLambda3.composableLambdaInstance(1372637439, false, C26560x2cbd3c9e.INSTANCE);

    /* renamed from: lambda$-1549372523, reason: not valid java name */
    private static Function3<PaddingValues, Composer, Integer, Unit> f9203lambda$1549372523 = ComposableLambda3.composableLambdaInstance(-1549372523, false, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.loading.ComposableSingletons$InvestingMonitorMainLoadingContentKt$lambda$-1549372523$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            int i2 = (i & 6) == 0 ? i | (composer.changed(paddingValues) ? 4 : 2) : i;
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1549372523, i2, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.loading.ComposableSingletons$InvestingMonitorMainLoadingContentKt.lambda$-1549372523.<anonymous> (InvestingMonitorMainLoadingContent.kt:47)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.padding(companion, paddingValues), 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
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
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            long jM21371getBg0d7_KjU = bentoTheme.getColors(composer, i3).m21371getBg0d7_KjU();
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU();
            float fM21593getSmallD9Ej5fM = bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM();
            ComposableSingletons$InvestingMonitorMainLoadingContentKt composableSingletons$InvestingMonitorMainLoadingContentKt = ComposableSingletons$InvestingMonitorMainLoadingContentKt.INSTANCE;
            TabRowKt.m5991ScrollableTabRowsKfQg0A(0, null, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, fM21593getSmallD9Ej5fM, composableSingletons$InvestingMonitorMainLoadingContentKt.m17999getLambda$1249887489$feature_investing_monitor_externalDebug(), null, composableSingletons$InvestingMonitorMainLoadingContentKt.getLambda$1372637439$feature_investing_monitor_externalDebug(), composer, 12779526, 66);
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            composer.startReplaceGroup(1080311677);
            for (int i4 = 0; i4 < 10; i4++) {
                InvestingMonitorShimmerAssetRow.InvestingMonitorShimmerAssetRow(null, composer, 0, 1);
            }
            composer.endReplaceGroup();
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1249887489$feature_investing_monitor_externalDebug, reason: not valid java name */
    public final Function3<List<TabPosition>, Composer, Integer, Unit> m17999getLambda$1249887489$feature_investing_monitor_externalDebug() {
        return f9202lambda$1249887489;
    }

    /* renamed from: getLambda$-1549372523$feature_investing_monitor_externalDebug, reason: not valid java name */
    public final Function3<PaddingValues, Composer, Integer, Unit> m18000getLambda$1549372523$feature_investing_monitor_externalDebug() {
        return f9203lambda$1549372523;
    }

    /* renamed from: getLambda$-592631508$feature_investing_monitor_externalDebug, reason: not valid java name */
    public final Function3<Row5, Composer, Integer, Unit> m18001getLambda$592631508$feature_investing_monitor_externalDebug() {
        return f9204lambda$592631508;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1372637439$feature_investing_monitor_externalDebug() {
        return lambda$1372637439;
    }

    public final Function3<BentoAppBarScope, Composer, Integer, Unit> getLambda$1908943627$feature_investing_monitor_externalDebug() {
        return lambda$1908943627;
    }

    public final Function2<Composer, Integer, Unit> getLambda$443487415$feature_investing_monitor_externalDebug() {
        return lambda$443487415;
    }

    public final Function2<Composer, Integer, Unit> getLambda$476972298$feature_investing_monitor_externalDebug() {
        return lambda$476972298;
    }
}
