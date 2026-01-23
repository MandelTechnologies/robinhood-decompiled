package com.robinhood.android.chart.equityadvancedchart.bottomsheets;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.chart.equityadvancedchart.C10954R;
import com.robinhood.android.equityadvancedorder.C15237R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityTradeSettings.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.chart.equityadvancedchart.bottomsheets.ComposableSingletons$EquityTradeSettingsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class EquityTradeSettings {
    public static final EquityTradeSettings INSTANCE = new EquityTradeSettings();

    /* renamed from: lambda$-147364586, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8712lambda$147364586 = ComposableLambda3.composableLambdaInstance(-147364586, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.equityadvancedchart.bottomsheets.ComposableSingletons$EquityTradeSettingsKt$lambda$-147364586$1
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
                ComposerKt.traceEventStart(-147364586, i, -1, "com.robinhood.android.chart.equityadvancedchart.bottomsheets.ComposableSingletons$EquityTradeSettingsKt.lambda$-147364586.<anonymous> (EquityTradeSettings.kt:50)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C15237R.string.order_create_time_in_force_row_title, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16382);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1600831053, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8713lambda$1600831053 = ComposableLambda3.composableLambdaInstance(-1600831053, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.equityadvancedchart.bottomsheets.ComposableSingletons$EquityTradeSettingsKt$lambda$-1600831053$1
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
                ComposerKt.traceEventStart(-1600831053, i, -1, "com.robinhood.android.chart.equityadvancedchart.bottomsheets.ComposableSingletons$EquityTradeSettingsKt.lambda$-1600831053.<anonymous> (EquityTradeSettings.kt:53)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM());
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerVertically, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_RIGHT_16), null, bentoTheme.getColors(composer, i2).m21427getFg30d7_KjU(), null, null, false, composer, BentoIcon4.Size16.$stable | 48, 56);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-678017592, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8716lambda$678017592 = ComposableLambda3.composableLambdaInstance(-678017592, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.equityadvancedchart.bottomsheets.ComposableSingletons$EquityTradeSettingsKt$lambda$-678017592$1
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
                ComposerKt.traceEventStart(-678017592, i, -1, "com.robinhood.android.chart.equityadvancedchart.bottomsheets.ComposableSingletons$EquityTradeSettingsKt.lambda$-678017592.<anonymous> (EquityTradeSettings.kt:79)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C15237R.string.order_create_trading_session_row_title, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16382);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-505603511, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8715lambda$505603511 = ComposableLambda3.composableLambdaInstance(-505603511, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.equityadvancedchart.bottomsheets.ComposableSingletons$EquityTradeSettingsKt$lambda$-505603511$1
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
                ComposerKt.traceEventStart(-505603511, i, -1, "com.robinhood.android.chart.equityadvancedchart.bottomsheets.ComposableSingletons$EquityTradeSettingsKt.lambda$-505603511.<anonymous> (EquityTradeSettings.kt:82)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C10954R.string.equities_trading_session_subtitle, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 0, 0, 8186);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-160775349, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8714lambda$160775349 = ComposableLambda3.composableLambdaInstance(-160775349, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.equityadvancedchart.bottomsheets.ComposableSingletons$EquityTradeSettingsKt$lambda$-160775349$1
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
                ComposerKt.traceEventStart(-160775349, i, -1, "com.robinhood.android.chart.equityadvancedchart.bottomsheets.ComposableSingletons$EquityTradeSettingsKt.lambda$-160775349.<anonymous> (EquityTradeSettings.kt:89)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM());
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerVertically, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_RIGHT_16), null, bentoTheme.getColors(composer, i2).m21427getFg30d7_KjU(), null, null, false, composer, BentoIcon4.Size16.$stable | 48, 56);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-147364586$lib_equity_advanced_chart_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11968getLambda$147364586$lib_equity_advanced_chart_externalDebug() {
        return f8712lambda$147364586;
    }

    /* renamed from: getLambda$-1600831053$lib_equity_advanced_chart_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11969getLambda$1600831053$lib_equity_advanced_chart_externalDebug() {
        return f8713lambda$1600831053;
    }

    /* renamed from: getLambda$-160775349$lib_equity_advanced_chart_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11970getLambda$160775349$lib_equity_advanced_chart_externalDebug() {
        return f8714lambda$160775349;
    }

    /* renamed from: getLambda$-505603511$lib_equity_advanced_chart_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11971getLambda$505603511$lib_equity_advanced_chart_externalDebug() {
        return f8715lambda$505603511;
    }

    /* renamed from: getLambda$-678017592$lib_equity_advanced_chart_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11972getLambda$678017592$lib_equity_advanced_chart_externalDebug() {
        return f8716lambda$678017592;
    }
}
