package com.robinhood.android.chart.blackwidowadvancedchart.composables.shared;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.ChartSnackbarVisuals;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.Helpers3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ChartSnackbar.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a\r\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0006¨\u0006\b"}, m3636d2 = {"ChartSnackbar", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/chart/blackwidowadvancedchart/composables/ChartSnackbarVisuals;", "(Lcom/robinhood/android/chart/blackwidowadvancedchart/composables/ChartSnackbarVisuals;Landroidx/compose/runtime/Composer;I)V", "PreviewChartSnackbar", "(Landroidx/compose/runtime/Composer;I)V", "PreviewChartSnackbarLong", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.shared.ChartSnackbarKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class ChartSnackbar2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartSnackbar$lambda$5(ChartSnackbarVisuals chartSnackbarVisuals, int i, Composer composer, int i2) {
        ChartSnackbar(chartSnackbarVisuals, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewChartSnackbar$lambda$6(int i, Composer composer, int i2) {
        PreviewChartSnackbar(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewChartSnackbarLong$lambda$7(int i, Composer composer, int i2) {
        PreviewChartSnackbarLong(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ChartSnackbar(ChartSnackbarVisuals chartSnackbarVisuals, Composer composer, final int i) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        final ChartSnackbarVisuals chartSnackbarVisuals2;
        Composer composer2;
        final ChartSnackbarVisuals data = chartSnackbarVisuals;
        Intrinsics.checkNotNullParameter(data, "data");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1438000550);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(data) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1438000550, i2, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.shared.ChartSnackbar (ChartSnackbar.kt:27)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5143paddingVpY3zN4(Background3.m4871backgroundbw27NRU(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM(), 0.0f, 2, null), BentoColor.INSTANCE.m21298getNightElevatedBg0d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM())), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM(), Helpers3.getBW_ADVANCE_CHART_STANDARD_PADDING()), 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            ServerToBentoAssetMapper2 icon = data.getIcon();
            composerStartRestartGroup.startReplaceGroup(-1294656048);
            if (icon == null) {
                i3 = i4;
                z = true;
                z2 = false;
            } else {
                i3 = i4;
                z = true;
                z2 = false;
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(icon), null, bentoTheme.getColors(composerStartRestartGroup, i4).getNova(), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM(), 0.0f, 11, null), null, false, composerStartRestartGroup, BentoIcon4.Size24.$stable | 48, 48);
            }
            composerStartRestartGroup.endReplaceGroup();
            StringResource startText = data.getStartText();
            int i5 = StringResource.$stable;
            int i6 = i3;
            int i7 = i2;
            BentoText2.m20747BentoText38GnDrw(StringResources6.getTextAsString(startText, composerStartRestartGroup, i5), Row5.weight$default(row6, companion, 1.0f, false, 2, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).getNova()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), composerStartRestartGroup, 0, 0, 8184);
            StringResource actionText = chartSnackbarVisuals.getActionText();
            composerStartRestartGroup.startReplaceGroup(-1294637870);
            if (actionText == null) {
                data = chartSnackbarVisuals;
                composer2 = composerStartRestartGroup;
            } else {
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean z3 = (i7 & 14) == 4 ? z : z2;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    chartSnackbarVisuals2 = chartSnackbarVisuals;
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.shared.ChartSnackbarKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ChartSnackbar2.ChartSnackbar$lambda$4$lambda$3$lambda$2$lambda$1(chartSnackbarVisuals2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    chartSnackbarVisuals2 = chartSnackbarVisuals;
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierM5146paddingqDBjuR0$default, false, null, null, (Function0) objRememberedValue, 7, null);
                String textAsString = StringResources6.getTextAsString(actionText, composerStartRestartGroup, i5);
                TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM();
                long jM21456getPositive0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i6).m21456getPositive0d7_KjU();
                composer2 = composerStartRestartGroup;
                data = chartSnackbarVisuals2;
                BentoText2.m20747BentoText38GnDrw(textAsString, modifierM4893clickableXHw0xAI$default, Color.m6701boximpl(jM21456getPositive0d7_KjU), null, FontWeight.INSTANCE.getBold(), TextDecoration.INSTANCE.getUnderline(), null, 0, false, 0, 0, null, 0, textM, composer2, 221184, 0, 8136);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.shared.ChartSnackbarKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChartSnackbar2.ChartSnackbar$lambda$5(data, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartSnackbar$lambda$4$lambda$3$lambda$2$lambda$1(ChartSnackbarVisuals chartSnackbarVisuals) {
        Function0<Unit> onActionClicked = chartSnackbarVisuals.getOnActionClicked();
        if (onActionClicked != null) {
            onActionClicked.invoke();
        }
        return Unit.INSTANCE;
    }

    private static final void PreviewChartSnackbar(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-223662634);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-223662634, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.shared.PreviewChartSnackbar (ChartSnackbar.kt:79)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ChartSnackbar3.INSTANCE.m1794xd7eef270(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.shared.ChartSnackbarKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChartSnackbar2.PreviewChartSnackbar$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewChartSnackbarLong(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1432713274);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1432713274, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.shared.PreviewChartSnackbarLong (ChartSnackbar.kt:95)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ChartSnackbar3.INSTANCE.m1795x14c9b667(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.shared.ChartSnackbarKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChartSnackbar2.PreviewChartSnackbarLong$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
