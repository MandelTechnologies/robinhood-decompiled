package com.robinhood.android.investmentstracker;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.lib.performancechart.PerformanceChartLoadingComposable3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestmentsTrackerFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class ComposableSingletons$InvestmentsTrackerFragmentKt {
    public static final ComposableSingletons$InvestmentsTrackerFragmentKt INSTANCE = new ComposableSingletons$InvestmentsTrackerFragmentKt();

    /* renamed from: lambda$-241969748, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9061lambda$241969748 = ComposableLambda3.composableLambdaInstance(-241969748, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investmentstracker.ComposableSingletons$InvestmentsTrackerFragmentKt$lambda$-241969748$1
        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-241969748, i, -1, "com.robinhood.android.investmentstracker.ComposableSingletons$InvestmentsTrackerFragmentKt.lambda$-241969748.<anonymous> (InvestmentsTrackerFragment.kt:230)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
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
            BentoText2.m20747BentoText38GnDrw("-----  - - - --------", null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 6, 0, 16382);
            BentoText2.m20747BentoText38GnDrw("-----  - - - --------", null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 6, 0, 16382);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, companion);
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            Modifier modifierWeight$default = Row5.weight$default(row6, companion, 1.0f, false, 2, null);
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            BentoText2.m20747BentoText38GnDrw("-----", modifierWeight$default, null, null, null, null, TextAlign.m7912boximpl(companion4.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, null, composer, 6, 0, 16316);
            Composer composer2 = composer;
            BentoText2.m20747BentoText38GnDrw("-----", Row5.weight$default(row6, companion, 1.0f, false, 2, null), null, null, null, null, TextAlign.m7912boximpl(companion4.m7920getEnde0LSkKk()), 0, false, 0, 0, null, 0, null, composer2, 6, 0, 16316);
            composer2.endNode();
            Object obj = null;
            int i2 = 1;
            int i3 = 0;
            PerformanceChartLoadingComposable3.PerformanceChartLoadingComposable(null, composer2, 0, 1);
            composer2.startReplaceGroup(-298707300);
            int i4 = 0;
            for (int i5 = 2; i4 < i5; i5 = i5) {
                Modifier.Companion companion5 = Modifier.INSTANCE;
                float f = 100;
                Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion5, 0.0f, i2, obj), C2002Dp.m7995constructorimpl(f)), BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM());
                Arrangement arrangement2 = Arrangement.INSTANCE;
                Arrangement.Horizontal start = arrangement2.getStart();
                Alignment.Companion companion6 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(start, companion6.getTop(), composer2, i3);
                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, i3);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierM5142padding3ABfNKs);
                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion7.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion7.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion7.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion7.getSetCompositeKeyHash();
                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion7.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion6.getStart(), composer2, i3);
                int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer2, i3);
                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer2, companion5);
                Function0<ComposeUiNode> constructor4 = companion7.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor4);
                } else {
                    composer2.useNode();
                }
                Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy2, companion7.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion7.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion7.getSetCompositeKeyHash();
                if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion7.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                BentoText2.m20747BentoText38GnDrw("----", SizeKt.m5174width3ABfNKs(companion5, C2002Dp.m7995constructorimpl(f)), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 54, 0, 16380);
                composer2 = composer;
                BentoText2.m20747BentoText38GnDrw("----", SizeKt.m5174width3ABfNKs(companion5, C2002Dp.m7995constructorimpl(f)), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 54, 0, 16380);
                composer.endNode();
                composer.endNode();
                i4++;
                obj = null;
                i2 = i2;
                i3 = i3;
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }
    });

    /* renamed from: lambda$-1000360882, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9060lambda$1000360882 = ComposableLambda3.composableLambdaInstance(-1000360882, false, C19435x2232d4a5.INSTANCE);

    /* renamed from: getLambda$-1000360882$feature_investments_tracker_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15542getLambda$1000360882$feature_investments_tracker_externalDebug() {
        return f9060lambda$1000360882;
    }

    /* renamed from: getLambda$-241969748$feature_investments_tracker_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15543getLambda$241969748$feature_investments_tracker_externalDebug() {
        return f9061lambda$241969748;
    }
}
