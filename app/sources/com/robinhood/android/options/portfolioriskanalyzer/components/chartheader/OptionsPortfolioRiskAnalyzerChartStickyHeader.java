package com.robinhood.android.options.portfolioriskanalyzer.components.chartheader;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.options.calculation.greeks.OptionsGreeks;
import com.robinhood.android.options.lib.simulatedreturn.header.OptionsSimulatedChartHeaderState;
import com.robinhood.android.options.portfolioriskanalyzer.C23462R;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme4;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: OptionsPortfolioRiskAnalyzerChartStickyHeader.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a3\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001aM\u0010\u0013\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a)\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001b²\u0006\u000e\u0010\u001a\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\f\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/options/calculation/greeks/OptionsGreeks;", "aggregatedGreeks", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/chartheader/OptionsPortfolioRiskAnalyzerChartHeaderViewState;", "chartHeaderViewState", "Lcom/robinhood/android/options/lib/simulatedreturn/header/OptionsSimulatedChartHeaderState$PortfolioRiskAnalyzerHeader;", "headerState", "Landroidx/compose/ui/Modifier;", "modifier", "", "OptionsPortfolioRiskAnalyzerChartStickyHeader", "(Lcom/robinhood/android/options/calculation/greeks/OptionsGreeks;Lcom/robinhood/android/options/portfolioriskanalyzer/components/chartheader/OptionsPortfolioRiskAnalyzerChartHeaderViewState;Lcom/robinhood/android/options/lib/simulatedreturn/header/OptionsSimulatedChartHeaderState$PortfolioRiskAnalyzerHeader;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "firstColumnWidth", "", "firstColumnText", "Lkotlin/Function0;", "secondColumnContent", "Lkotlin/Function1;", "onFirstColumnIntrinsicWidthUpdated", "OptionsPortfolioRiskAnalyzerChartStickyHeaderRow", "(Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", AnnotatedPrivateKey.LABEL, "value", "OptionsPortfolioRiskAnalyzerChartStickyHeaderLabelValue", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "collapsed", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeaderKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsPortfolioRiskAnalyzerChartStickyHeader {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsPortfolioRiskAnalyzerChartStickyHeader$lambda$27(OptionsGreeks optionsGreeks, OptionsPortfolioRiskAnalyzerChartHeaderViewState optionsPortfolioRiskAnalyzerChartHeaderViewState, OptionsSimulatedChartHeaderState.PortfolioRiskAnalyzerHeader portfolioRiskAnalyzerHeader, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OptionsPortfolioRiskAnalyzerChartStickyHeader(optionsGreeks, optionsPortfolioRiskAnalyzerChartHeaderViewState, portfolioRiskAnalyzerHeader, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionsPortfolioRiskAnalyzerChartStickyHeaderLabelValue$lambda$36 */
    public static final Unit m2262x1b1d36e(String str, String str2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OptionsPortfolioRiskAnalyzerChartStickyHeaderLabelValue(str, str2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsPortfolioRiskAnalyzerChartStickyHeaderRow$lambda$34(Integer num, String str, Function2 function2, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        OptionsPortfolioRiskAnalyzerChartStickyHeaderRow(num, str, function2, modifier, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02af  */
    /* JADX WARN: Type inference failed for: r13v15, types: [androidx.compose.ui.Modifier] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionsPortfolioRiskAnalyzerChartStickyHeader(final OptionsGreeks aggregatedGreeks, final OptionsPortfolioRiskAnalyzerChartHeaderViewState chartHeaderViewState, final OptionsSimulatedChartHeaderState.PortfolioRiskAnalyzerHeader portfolioRiskAnalyzerHeader, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        Object objRememberedValue2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue3;
        Object objRememberedValue4;
        final SnapshotIntState2 snapshotIntState2;
        int i4;
        Modifier modifierM5169size3ABfNKs;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Object objRememberedValue5;
        Object objRememberedValue6;
        Object objRememberedValue7;
        Object objRememberedValue8;
        Object objRememberedValue9;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        Object objRememberedValue10;
        final SnapshotIntState2 snapshotIntState22;
        Object objRememberedValue11;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(aggregatedGreeks, "aggregatedGreeks");
        Intrinsics.checkNotNullParameter(chartHeaderViewState, "chartHeaderViewState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1456501480);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(aggregatedGreeks) : composerStartRestartGroup.changedInstance(aggregatedGreeks) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(chartHeaderViewState) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(portfolioRiskAnalyzerHeader) : composerStartRestartGroup.changedInstance(portfolioRiskAnalyzerHeader) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1456501480, i3, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeader (OptionsPortfolioRiskAnalyzerChartStickyHeader.kt:47)");
                }
                final Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotIntState3.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final SnapshotIntState2 snapshotIntState23 = (SnapshotIntState2) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifier4, bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU(), null, 2, null);
                Modifier modifier5 = modifier4;
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                final Column6 column6 = Column6.INSTANCE;
                int intValue = snapshotIntState23.getIntValue();
                String underlyingSymbol = chartHeaderViewState.getUnderlyingSymbol();
                Integer numValueOf = Integer.valueOf(intValue);
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1746215714, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeaderKt$OptionsPortfolioRiskAnalyzerChartStickyHeader$1$1

                    /* compiled from: OptionsPortfolioRiskAnalyzerChartStickyHeader.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeaderKt$OptionsPortfolioRiskAnalyzerChartStickyHeader$1$1$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[BentoTheme4.values().length];
                            try {
                                iArr[BentoTheme4.POSITIVE.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[BentoTheme4.NEGATIVE.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        long jM21456getPositive0d7_KjU;
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1746215714, i7, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeader.<anonymous>.<anonymous> (OptionsPortfolioRiskAnalyzerChartStickyHeader.kt:61)");
                        }
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        OptionsPortfolioRiskAnalyzerChartHeaderViewState optionsPortfolioRiskAnalyzerChartHeaderViewState = chartHeaderViewState;
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                        int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, companion4);
                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion5.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier2, companion5.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(optionsPortfolioRiskAnalyzerChartHeaderViewState.getUnderlyingPriceStr(), PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, 0.0f, bentoTheme2.getSpacing(composer2, i8).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i8).getTextS(), composer2, 0, 0, 8188);
                        String underlyingPercentageChangeStr = optionsPortfolioRiskAnalyzerChartHeaderViewState.getUnderlyingPercentageChangeStr();
                        composer2.startReplaceGroup(-2042037954);
                        if (underlyingPercentageChangeStr != null) {
                            String str = "(" + underlyingPercentageChangeStr + ")";
                            TextStyle textS = bentoTheme2.getTypography(composer2, i8).getTextS();
                            int i9 = WhenMappings.$EnumSwitchMapping$0[optionsPortfolioRiskAnalyzerChartHeaderViewState.getUnderlyingChangeDirection().ordinal()];
                            if (i9 == 1) {
                                composer2.startReplaceGroup(2059011472);
                                jM21456getPositive0d7_KjU = bentoTheme2.getColors(composer2, i8).m21456getPositive0d7_KjU();
                                composer2.endReplaceGroup();
                            } else {
                                if (i9 != 2) {
                                    composer2.startReplaceGroup(2059007615);
                                    composer2.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer2.startReplaceGroup(2059014064);
                                jM21456getPositive0d7_KjU = bentoTheme2.getColors(composer2, i8).m21452getNegative0d7_KjU();
                                composer2.endReplaceGroup();
                            }
                            BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(jM21456getPositive0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textS, composer2, 0, 0, 8186);
                        }
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54);
                composerStartRestartGroup.startReplaceGroup(5004770);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeaderKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OptionsPortfolioRiskAnalyzerChartStickyHeader.m2260x1f365811(snapshotIntState23, ((Integer) obj).intValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                OptionsPortfolioRiskAnalyzerChartStickyHeaderRow(numValueOf, underlyingSymbol, composableLambdaRememberComposableLambda, null, (Function1) objRememberedValue3, composerStartRestartGroup, 24960, 8);
                Modifier.Companion companion4 = Modifier.INSTANCE;
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion4, 0.0f, composerStartRestartGroup, 6, 1), bentoTheme.getColors(composerStartRestartGroup, i6).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
                int intValue2 = snapshotIntState23.getIntValue();
                String strStringResource = StringResources_androidKt.stringResource(C23462R.string.options_pra_sticky_header_label_return, composerStartRestartGroup, 0);
                Integer numValueOf2 = Integer.valueOf(intValue2);
                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(2018145305, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeaderKt$OptionsPortfolioRiskAnalyzerChartStickyHeader$1$3

                    /* compiled from: OptionsPortfolioRiskAnalyzerChartStickyHeader.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeaderKt$OptionsPortfolioRiskAnalyzerChartStickyHeader$1$3$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[BentoTheme4.values().length];
                            try {
                                iArr[BentoTheme4.POSITIVE.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[BentoTheme4.NEGATIVE.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:28:0x00d1  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void invoke(Composer composer2, int i7) {
                        String strInvoke;
                        long jM21456getPositive0d7_KjU;
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2018145305, i7, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeader.<anonymous>.<anonymous> (OptionsPortfolioRiskAnalyzerChartStickyHeader.kt:93)");
                        }
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        OptionsSimulatedChartHeaderState.PortfolioRiskAnalyzerHeader portfolioRiskAnalyzerHeader2 = portfolioRiskAnalyzerHeader;
                        Resources resources2 = resources;
                        Modifier.Companion companion5 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                        int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, companion5);
                        ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyRowMeasurePolicy, companion6.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap2, companion6.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion6.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier2, companion6.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion5, 0.0f, 0.0f, bentoTheme2.getSpacing(composer2, i8).m21595getXsmallD9Ej5fM(), 0.0f, 11, null);
                        if (portfolioRiskAnalyzerHeader2 != null) {
                            Function1<Resources, String> totalReturn = portfolioRiskAnalyzerHeader2.getTotalReturn();
                            Intrinsics.checkNotNull(resources2);
                            strInvoke = totalReturn.invoke(resources2);
                            if (strInvoke == null) {
                                strInvoke = "-";
                            }
                        }
                        BentoText2.m20747BentoText38GnDrw(strInvoke, modifierM5146paddingqDBjuR0$default, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i8).getTextS(), composer2, 0, 0, 8188);
                        String str = "(" + NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPercentDeltaWithHundredthDecimalFormat(), portfolioRiskAnalyzerHeader2 != null ? portfolioRiskAnalyzerHeader2.getTotalReturnPercentage() : null, null, 2, null) + ")";
                        TextStyle textS = bentoTheme2.getTypography(composer2, i8).getTextS();
                        BentoTheme4 totalReturnDirection = portfolioRiskAnalyzerHeader2 != null ? portfolioRiskAnalyzerHeader2.getTotalReturnDirection() : null;
                        int i9 = totalReturnDirection == null ? -1 : WhenMappings.$EnumSwitchMapping$0[totalReturnDirection.ordinal()];
                        if (i9 == -1 || i9 == 1) {
                            composer2.startReplaceGroup(1645826725);
                            jM21456getPositive0d7_KjU = bentoTheme2.getColors(composer2, i8).m21456getPositive0d7_KjU();
                            composer2.endReplaceGroup();
                        } else {
                            if (i9 != 2) {
                                composer2.startReplaceGroup(1645823201);
                                composer2.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer2.startReplaceGroup(1645829189);
                            jM21456getPositive0d7_KjU = bentoTheme2.getColors(composer2, i8).m21452getNegative0d7_KjU();
                            composer2.endReplaceGroup();
                        }
                        BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(jM21456getPositive0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textS, composer2, 0, 0, 8186);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54);
                composerStartRestartGroup.startReplaceGroup(5004770);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 != companion.getEmpty()) {
                    snapshotIntState2 = snapshotIntState23;
                    objRememberedValue4 = new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeaderKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OptionsPortfolioRiskAnalyzerChartStickyHeader.m2261x7c93a51(snapshotIntState2, ((Integer) obj).intValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    snapshotIntState2 = snapshotIntState23;
                }
                composerStartRestartGroup.endReplaceGroup();
                SnapshotIntState2 snapshotIntState24 = snapshotIntState2;
                OptionsPortfolioRiskAnalyzerChartStickyHeaderRow(numValueOf2, strStringResource, composableLambdaRememberComposableLambda2, null, (Function1) objRememberedValue4, composerStartRestartGroup, 24960, 8);
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composerStartRestartGroup, i6).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
                if (OptionsPortfolioRiskAnalyzerChartStickyHeader$lambda$1(snapshotState)) {
                    i4 = 0;
                    modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(companion4, C2002Dp.m7995constructorimpl(0));
                } else {
                    modifierM5169size3ABfNKs = companion4;
                    i4 = 0;
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, i4);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i4);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5169size3ABfNKs);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor2);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = InteractionSource2.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new Function0() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeaderKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OptionsPortfolioRiskAnalyzerChartStickyHeader.m2255x7c1e9805(snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(companion4, interactionSource3, null, false, null, null, (Function0) objRememberedValue6, 28, null);
                String strStringResource2 = StringResources_androidKt.stringResource(C23462R.string.options_pra_sticky_header_label_greeks_and_max_pnl, composerStartRestartGroup, 0);
                ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambda3.rememberComposableLambda(1696275224, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeaderKt$OptionsPortfolioRiskAnalyzerChartStickyHeader$1$6$3
                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1696275224, i7, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeader.<anonymous>.<anonymous>.<anonymous> (OptionsPortfolioRiskAnalyzerChartStickyHeader.kt:129)");
                        }
                        Column5 column5 = column6;
                        Modifier.Companion companion5 = Modifier.INSTANCE;
                        Modifier modifierWeight$default = Column5.weight$default(column5, companion5, 1.0f, false, 2, null);
                        Alignment.Companion companion6 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getTopStart(), false);
                        int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierWeight$default);
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
                        Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy, companion7.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap3, companion7.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion7.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier3, companion7.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        BentoIcon4.Size12 size12 = new BentoIcon4.Size12(ServerToBentoAssetMapper2.CARET_DOWN_12);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        BentoIcon2.m20644BentoIconFU0evQE(size12, null, bentoTheme2.getColors(composer2, i8).m21425getFg0d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(boxScopeInstance.align(companion5, companion6.getCenterEnd()), 0.0f, 0.0f, bentoTheme2.getSpacing(composer2, i8).m21592getMediumD9Ej5fM(), 0.0f, 11, null), null, false, composer2, BentoIcon4.Size12.$stable | 48, 48);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeaderKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OptionsPortfolioRiskAnalyzerChartStickyHeader.m2256xa5e7fd89(((Integer) obj).intValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceGroup();
                OptionsPortfolioRiskAnalyzerChartStickyHeaderRow(null, strStringResource2, composableLambdaRememberComposableLambda3, modifierM4891clickableO2vRcR0$default, (Function1) objRememberedValue7, composerStartRestartGroup, 24966, 0);
                composerStartRestartGroup.endNode();
                Modifier.Companion companionM5169size3ABfNKs = !OptionsPortfolioRiskAnalyzerChartStickyHeader$lambda$1(snapshotState) ? SizeKt.m5169size3ABfNKs(companion4, C2002Dp.m7995constructorimpl(0)) : companion4;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = InteractionSource2.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                InteractionSource3 interactionSource32 = (InteractionSource3) objRememberedValue8;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue9 == companion.getEmpty()) {
                    objRememberedValue9 = new Function0() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeaderKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OptionsPortfolioRiskAnalyzerChartStickyHeader.m2257xdbc362a(snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4891clickableO2vRcR0$default2 = ClickableKt.m4891clickableO2vRcR0$default(companionM5169size3ABfNKs, interactionSource32, null, false, null, null, (Function0) objRememberedValue9, 28, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4891clickableO2vRcR0$default2);
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor3);
                }
                composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                int intValue3 = snapshotIntState24.getIntValue();
                String strStringResource3 = StringResources_androidKt.stringResource(C23462R.string.options_pra_sticky_header_label_greeks, composerStartRestartGroup, 0);
                Integer numValueOf3 = Integer.valueOf(intValue3);
                ComposableLambda composableLambdaRememberComposableLambda4 = ComposableLambda3.rememberComposableLambda(1269974671, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeaderKt$OptionsPortfolioRiskAnalyzerChartStickyHeader$1$10$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1269974671, i7, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeader.<anonymous>.<anonymous>.<anonymous> (OptionsPortfolioRiskAnalyzerChartStickyHeader.kt:160)");
                        }
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        final OptionsGreeks optionsGreeks = aggregatedGreeks;
                        FlowLayoutKt.FlowRow(null, null, null, centerVertically, 0, 0, ComposableLambda3.rememberComposableLambda(-1338854604, true, new Function3<FlowRowScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeaderKt$OptionsPortfolioRiskAnalyzerChartStickyHeader$1$10$1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(FlowRowScope flowRowScope, Composer composer3, Integer num) {
                                invoke(flowRowScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(FlowRowScope FlowRow, Composer composer3, int i8) {
                                Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
                                if ((i8 & 17) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1338854604, i8, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeader.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OptionsPortfolioRiskAnalyzerChartStickyHeader.kt:161)");
                                }
                                OptionsPortfolioRiskAnalyzerChartStickyHeader.OptionsPortfolioRiskAnalyzerChartStickyHeaderLabelValue(StringResources_androidKt.stringResource(C23462R.string.options_pra_sticky_header_label_delta, composer3, 0), NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), optionsGreeks.getDelta(), null, 2, null), null, composer3, 0, 4);
                                OptionsPortfolioRiskAnalyzerChartStickyHeader.OptionsPortfolioRiskAnalyzerChartStickyHeaderLabelValue(StringResources_androidKt.stringResource(C23462R.string.options_pra_sticky_header_label_gamma, composer3, 0), NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), optionsGreeks.getGamma(), null, 2, null), null, composer3, 0, 4);
                                OptionsPortfolioRiskAnalyzerChartStickyHeader.OptionsPortfolioRiskAnalyzerChartStickyHeaderLabelValue(StringResources_androidKt.stringResource(C23462R.string.options_pra_sticky_header_label_theta, composer3, 0), NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), optionsGreeks.getTheta(), null, 2, null), null, composer3, 0, 4);
                                OptionsPortfolioRiskAnalyzerChartStickyHeader.OptionsPortfolioRiskAnalyzerChartStickyHeaderLabelValue(StringResources_androidKt.stringResource(C23462R.string.options_pra_sticky_header_label_vega, composer3, 0), NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), optionsGreeks.getVega(), null, 2, null), null, composer3, 0, 4);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 1575936, 55);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54);
                composerStartRestartGroup.startReplaceGroup(5004770);
                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue10 != companion.getEmpty()) {
                    snapshotIntState22 = snapshotIntState24;
                    objRememberedValue10 = new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeaderKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OptionsPortfolioRiskAnalyzerChartStickyHeader.m2258x68d84fdf(snapshotIntState22, ((Integer) obj).intValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                } else {
                    snapshotIntState22 = snapshotIntState24;
                }
                composerStartRestartGroup.endReplaceGroup();
                final SnapshotIntState2 snapshotIntState25 = snapshotIntState22;
                OptionsPortfolioRiskAnalyzerChartStickyHeaderRow(numValueOf3, strStringResource3, composableLambdaRememberComposableLambda4, null, (Function1) objRememberedValue10, composerStartRestartGroup, 24960, 8);
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion4, 0.0f, composerStartRestartGroup, 6, 1), bentoTheme.getColors(composerStartRestartGroup, i6).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
                int intValue4 = snapshotIntState25.getIntValue();
                String strStringResource4 = StringResources_androidKt.stringResource(C23462R.string.options_pra_sticky_header_label_max_profit_loss, composerStartRestartGroup, 0);
                Integer numValueOf4 = Integer.valueOf(intValue4);
                ComposableLambda composableLambdaRememberComposableLambda5 = ComposableLambda3.rememberComposableLambda(1026152518, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeaderKt$OptionsPortfolioRiskAnalyzerChartStickyHeader$1$10$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1026152518, i7, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeader.<anonymous>.<anonymous>.<anonymous> (OptionsPortfolioRiskAnalyzerChartStickyHeader.kt:193)");
                        }
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        final OptionsSimulatedChartHeaderState.PortfolioRiskAnalyzerHeader portfolioRiskAnalyzerHeader2 = portfolioRiskAnalyzerHeader;
                        final Resources resources2 = resources;
                        FlowLayoutKt.FlowRow(null, null, null, centerVertically, 0, 0, ComposableLambda3.rememberComposableLambda(-2092847189, true, new Function3<FlowRowScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeaderKt$OptionsPortfolioRiskAnalyzerChartStickyHeader$1$10$3.1
                            /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
                            /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void invoke(FlowRowScope FlowRow, Composer composer3, int i8) {
                                int i9;
                                String strInvoke;
                                String strInvoke2;
                                Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
                                if ((i8 & 6) == 0) {
                                    i9 = i8 | (composer3.changed(FlowRow) ? 4 : 2);
                                } else {
                                    i9 = i8;
                                }
                                if ((i9 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2092847189, i9, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeader.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OptionsPortfolioRiskAnalyzerChartStickyHeader.kt:194)");
                                }
                                String strStringResource5 = StringResources_androidKt.stringResource(C23462R.string.options_pra_sticky_header_label_max_profit, composer3, 0);
                                OptionsSimulatedChartHeaderState.PortfolioRiskAnalyzerHeader portfolioRiskAnalyzerHeader3 = portfolioRiskAnalyzerHeader2;
                                if (portfolioRiskAnalyzerHeader3 != null) {
                                    Function1<Resources, String> maxProfit = portfolioRiskAnalyzerHeader3.getMaxProfit();
                                    Resources resources3 = resources2;
                                    Intrinsics.checkNotNull(resources3);
                                    strInvoke = maxProfit.invoke(resources3);
                                    if (strInvoke == null) {
                                        strInvoke = "-";
                                    }
                                }
                                OptionsPortfolioRiskAnalyzerChartStickyHeader.OptionsPortfolioRiskAnalyzerChartStickyHeaderLabelValue(strStringResource5, strInvoke, null, composer3, 0, 4);
                                String strStringResource6 = StringResources_androidKt.stringResource(C23462R.string.options_pra_sticky_header_label_max_loss, composer3, 0);
                                OptionsSimulatedChartHeaderState.PortfolioRiskAnalyzerHeader portfolioRiskAnalyzerHeader4 = portfolioRiskAnalyzerHeader2;
                                if (portfolioRiskAnalyzerHeader4 != null) {
                                    Function1<Resources, String> maxLoss = portfolioRiskAnalyzerHeader4.getMaxLoss();
                                    Resources resources4 = resources2;
                                    Intrinsics.checkNotNull(resources4);
                                    strInvoke2 = maxLoss.invoke(resources4);
                                    if (strInvoke2 == null) {
                                        strInvoke2 = "-";
                                    }
                                }
                                OptionsPortfolioRiskAnalyzerChartStickyHeader.OptionsPortfolioRiskAnalyzerChartStickyHeaderLabelValue(strStringResource6, strInvoke2, null, composer3, 0, 4);
                                Modifier.Companion companion5 = Modifier.INSTANCE;
                                Modifier modifierWeight$default = Row5.weight$default(FlowRow, companion5, 1.0f, false, 2, null);
                                Alignment.Companion companion6 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getTopStart(), false);
                                int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer3, modifierWeight$default);
                                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor4 = companion7.getConstructor();
                                if (composer3.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor4);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer3);
                                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy, companion7.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion7.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion7.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion7.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                BentoIcon4.Size12 size12 = new BentoIcon4.Size12(ServerToBentoAssetMapper2.CARET_UP_12);
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                int i10 = BentoTheme.$stable;
                                BentoIcon2.m20644BentoIconFU0evQE(size12, null, bentoTheme2.getColors(composer3, i10).m21425getFg0d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(boxScopeInstance.align(companion5, companion6.getCenterEnd()), 0.0f, 0.0f, bentoTheme2.getSpacing(composer3, i10).m21592getMediumD9Ej5fM(), 0.0f, 11, null), null, false, composer3, BentoIcon4.Size12.$stable | 48, 48);
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(FlowRowScope flowRowScope, Composer composer3, Integer num) {
                                invoke(flowRowScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }
                        }, composer2, 54), composer2, 1575936, 55);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54);
                composerStartRestartGroup.startReplaceGroup(5004770);
                objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue11 == companion.getEmpty()) {
                    objRememberedValue11 = new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeaderKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OptionsPortfolioRiskAnalyzerChartStickyHeader.m2259x92a1b563(snapshotIntState25, ((Integer) obj).intValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                }
                composerStartRestartGroup.endReplaceGroup();
                OptionsPortfolioRiskAnalyzerChartStickyHeaderRow(numValueOf4, strStringResource4, composableLambdaRememberComposableLambda5, null, (Function1) objRememberedValue11, composerStartRestartGroup, 24960, 8);
                composerStartRestartGroup.endNode();
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composerStartRestartGroup, i6).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeaderKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OptionsPortfolioRiskAnalyzerChartStickyHeader.OptionsPortfolioRiskAnalyzerChartStickyHeader$lambda$27(aggregatedGreeks, chartHeaderViewState, portfolioRiskAnalyzerHeader, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final Resources resources2 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            final SnapshotIntState2 snapshotIntState232 = (SnapshotIntState2) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(modifier4, bentoTheme2.getColors(composerStartRestartGroup, i62).m21371getBg0d7_KjU(), null, 2, null);
            Modifier modifier52 = modifier4;
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement2.getTop();
            Alignment.Companion companion22 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy4 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default2);
            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor4 = companion32.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy4, companion32.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion32.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion32.getSetModifier());
                final Column5 column62 = Column6.INSTANCE;
                int intValue5 = snapshotIntState232.getIntValue();
                String underlyingSymbol2 = chartHeaderViewState.getUnderlyingSymbol();
                Integer numValueOf5 = Integer.valueOf(intValue5);
                ComposableLambda composableLambdaRememberComposableLambda6 = ComposableLambda3.rememberComposableLambda(1746215714, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeaderKt$OptionsPortfolioRiskAnalyzerChartStickyHeader$1$1

                    /* compiled from: OptionsPortfolioRiskAnalyzerChartStickyHeader.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeaderKt$OptionsPortfolioRiskAnalyzerChartStickyHeader$1$1$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[BentoTheme4.values().length];
                            try {
                                iArr[BentoTheme4.POSITIVE.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[BentoTheme4.NEGATIVE.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        long jM21456getPositive0d7_KjU;
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1746215714, i7, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeader.<anonymous>.<anonymous> (OptionsPortfolioRiskAnalyzerChartStickyHeader.kt:61)");
                        }
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        OptionsPortfolioRiskAnalyzerChartHeaderViewState optionsPortfolioRiskAnalyzerChartHeaderViewState = chartHeaderViewState;
                        Modifier.Companion companion42 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                        int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer2, companion42);
                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor22 = companion5.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor22);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap22, companion5.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion5.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier22, companion5.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(optionsPortfolioRiskAnalyzerChartHeaderViewState.getUnderlyingPriceStr(), PaddingKt.m5146paddingqDBjuR0$default(companion42, 0.0f, 0.0f, bentoTheme22.getSpacing(composer2, i8).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme22.getTypography(composer2, i8).getTextS(), composer2, 0, 0, 8188);
                        String underlyingPercentageChangeStr = optionsPortfolioRiskAnalyzerChartHeaderViewState.getUnderlyingPercentageChangeStr();
                        composer2.startReplaceGroup(-2042037954);
                        if (underlyingPercentageChangeStr != null) {
                            String str = "(" + underlyingPercentageChangeStr + ")";
                            TextStyle textS = bentoTheme22.getTypography(composer2, i8).getTextS();
                            int i9 = WhenMappings.$EnumSwitchMapping$0[optionsPortfolioRiskAnalyzerChartHeaderViewState.getUnderlyingChangeDirection().ordinal()];
                            if (i9 == 1) {
                                composer2.startReplaceGroup(2059011472);
                                jM21456getPositive0d7_KjU = bentoTheme22.getColors(composer2, i8).m21456getPositive0d7_KjU();
                                composer2.endReplaceGroup();
                            } else {
                                if (i9 != 2) {
                                    composer2.startReplaceGroup(2059007615);
                                    composer2.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer2.startReplaceGroup(2059014064);
                                jM21456getPositive0d7_KjU = bentoTheme22.getColors(composer2, i8).m21452getNegative0d7_KjU();
                                composer2.endReplaceGroup();
                            }
                            BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(jM21456getPositive0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textS, composer2, 0, 0, 8186);
                        }
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54);
                composerStartRestartGroup.startReplaceGroup(5004770);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                OptionsPortfolioRiskAnalyzerChartStickyHeaderRow(numValueOf5, underlyingSymbol2, composableLambdaRememberComposableLambda6, null, (Function1) objRememberedValue3, composerStartRestartGroup, 24960, 8);
                Modifier.Companion companion42 = Modifier.INSTANCE;
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion42, 0.0f, composerStartRestartGroup, 6, 1), bentoTheme2.getColors(composerStartRestartGroup, i62).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
                int intValue22 = snapshotIntState232.getIntValue();
                String strStringResource5 = StringResources_androidKt.stringResource(C23462R.string.options_pra_sticky_header_label_return, composerStartRestartGroup, 0);
                Integer numValueOf22 = Integer.valueOf(intValue22);
                ComposableLambda composableLambdaRememberComposableLambda22 = ComposableLambda3.rememberComposableLambda(2018145305, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeaderKt$OptionsPortfolioRiskAnalyzerChartStickyHeader$1$3

                    /* compiled from: OptionsPortfolioRiskAnalyzerChartStickyHeader.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeaderKt$OptionsPortfolioRiskAnalyzerChartStickyHeader$1$3$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[BentoTheme4.values().length];
                            try {
                                iArr[BentoTheme4.POSITIVE.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[BentoTheme4.NEGATIVE.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:28:0x00d1  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void invoke(Composer composer2, int i7) {
                        String strInvoke;
                        long jM21456getPositive0d7_KjU;
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2018145305, i7, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeader.<anonymous>.<anonymous> (OptionsPortfolioRiskAnalyzerChartStickyHeader.kt:93)");
                        }
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        OptionsSimulatedChartHeaderState.PortfolioRiskAnalyzerHeader portfolioRiskAnalyzerHeader2 = portfolioRiskAnalyzerHeader;
                        Resources resources22 = resources2;
                        Modifier.Companion companion5 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                        int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer2, companion5);
                        ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor22 = companion6.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor22);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyRowMeasurePolicy, companion6.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap22, companion6.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion6.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier22, companion6.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion5, 0.0f, 0.0f, bentoTheme22.getSpacing(composer2, i8).m21595getXsmallD9Ej5fM(), 0.0f, 11, null);
                        if (portfolioRiskAnalyzerHeader2 != null) {
                            Function1<Resources, String> totalReturn = portfolioRiskAnalyzerHeader2.getTotalReturn();
                            Intrinsics.checkNotNull(resources22);
                            strInvoke = totalReturn.invoke(resources22);
                            if (strInvoke == null) {
                                strInvoke = "-";
                            }
                        }
                        BentoText2.m20747BentoText38GnDrw(strInvoke, modifierM5146paddingqDBjuR0$default, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme22.getTypography(composer2, i8).getTextS(), composer2, 0, 0, 8188);
                        String str = "(" + NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPercentDeltaWithHundredthDecimalFormat(), portfolioRiskAnalyzerHeader2 != null ? portfolioRiskAnalyzerHeader2.getTotalReturnPercentage() : null, null, 2, null) + ")";
                        TextStyle textS = bentoTheme22.getTypography(composer2, i8).getTextS();
                        BentoTheme4 totalReturnDirection = portfolioRiskAnalyzerHeader2 != null ? portfolioRiskAnalyzerHeader2.getTotalReturnDirection() : null;
                        int i9 = totalReturnDirection == null ? -1 : WhenMappings.$EnumSwitchMapping$0[totalReturnDirection.ordinal()];
                        if (i9 == -1 || i9 == 1) {
                            composer2.startReplaceGroup(1645826725);
                            jM21456getPositive0d7_KjU = bentoTheme22.getColors(composer2, i8).m21456getPositive0d7_KjU();
                            composer2.endReplaceGroup();
                        } else {
                            if (i9 != 2) {
                                composer2.startReplaceGroup(1645823201);
                                composer2.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer2.startReplaceGroup(1645829189);
                            jM21456getPositive0d7_KjU = bentoTheme22.getColors(composer2, i8).m21452getNegative0d7_KjU();
                            composer2.endReplaceGroup();
                        }
                        BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(jM21456getPositive0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textS, composer2, 0, 0, 8186);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54);
                composerStartRestartGroup.startReplaceGroup(5004770);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 != companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                SnapshotIntState2 snapshotIntState242 = snapshotIntState2;
                OptionsPortfolioRiskAnalyzerChartStickyHeaderRow(numValueOf22, strStringResource5, composableLambdaRememberComposableLambda22, null, (Function1) objRememberedValue4, composerStartRestartGroup, 24960, 8);
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme2.getColors(composerStartRestartGroup, i62).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
                if (OptionsPortfolioRiskAnalyzerChartStickyHeader$lambda$1(snapshotState)) {
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion22.getStart(), composerStartRestartGroup, i4);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i4);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5169size3ABfNKs);
                Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy22, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                    }
                    InteractionSource3 interactionSource33 = (InteractionSource3) objRememberedValue5;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == companion.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM4891clickableO2vRcR0$default3 = ClickableKt.m4891clickableO2vRcR0$default(companion42, interactionSource33, null, false, null, null, (Function0) objRememberedValue6, 28, null);
                    String strStringResource22 = StringResources_androidKt.stringResource(C23462R.string.options_pra_sticky_header_label_greeks_and_max_pnl, composerStartRestartGroup, 0);
                    ComposableLambda composableLambdaRememberComposableLambda32 = ComposableLambda3.rememberComposableLambda(1696275224, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeaderKt$OptionsPortfolioRiskAnalyzerChartStickyHeader$1$6$3
                        public final void invoke(Composer composer2, int i7) {
                            if ((i7 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1696275224, i7, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeader.<anonymous>.<anonymous>.<anonymous> (OptionsPortfolioRiskAnalyzerChartStickyHeader.kt:129)");
                            }
                            Column5 column5 = column62;
                            Modifier.Companion companion5 = Modifier.INSTANCE;
                            Modifier modifierWeight$default = Column5.weight$default(column5, companion5, 1.0f, false, 2, null);
                            Alignment.Companion companion6 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getTopStart(), false);
                            int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap32 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composer2, modifierWeight$default);
                            ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor32 = companion7.getConstructor();
                            if (composer2.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor32);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy, companion7.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap32, companion7.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion7.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier32, companion7.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            BentoIcon4.Size12 size12 = new BentoIcon4.Size12(ServerToBentoAssetMapper2.CARET_DOWN_12);
                            BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                            int i8 = BentoTheme.$stable;
                            BentoIcon2.m20644BentoIconFU0evQE(size12, null, bentoTheme22.getColors(composer2, i8).m21425getFg0d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(boxScopeInstance.align(companion5, companion6.getCenterEnd()), 0.0f, 0.0f, bentoTheme22.getSpacing(composer2, i8).m21592getMediumD9Ej5fM(), 0.0f, 11, null), null, false, composer2, BentoIcon4.Size12.$stable | 48, 48);
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composerStartRestartGroup, 54);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    OptionsPortfolioRiskAnalyzerChartStickyHeaderRow(null, strStringResource22, composableLambdaRememberComposableLambda32, modifierM4891clickableO2vRcR0$default3, (Function1) objRememberedValue7, composerStartRestartGroup, 24966, 0);
                    composerStartRestartGroup.endNode();
                    if (!OptionsPortfolioRiskAnalyzerChartStickyHeader$lambda$1(snapshotState)) {
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue8 == companion.getEmpty()) {
                    }
                    InteractionSource3 interactionSource322 = (InteractionSource3) objRememberedValue8;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue9 == companion.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM4891clickableO2vRcR0$default22 = ClickableKt.m4891clickableO2vRcR0$default(companionM5169size3ABfNKs, interactionSource322, null, false, null, null, (Function0) objRememberedValue9, 28, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy32 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion22.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4891clickableO2vRcR0$default22);
                    Function0<ComposeUiNode> constructor32 = companion32.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy32, companion32.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion32.getSetResolvedCompositionLocals());
                    setCompositeKeyHash3 = companion32.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl3.getInserting()) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion32.getSetModifier());
                        int intValue32 = snapshotIntState242.getIntValue();
                        String strStringResource32 = StringResources_androidKt.stringResource(C23462R.string.options_pra_sticky_header_label_greeks, composerStartRestartGroup, 0);
                        Integer numValueOf32 = Integer.valueOf(intValue32);
                        ComposableLambda composableLambdaRememberComposableLambda42 = ComposableLambda3.rememberComposableLambda(1269974671, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeaderKt$OptionsPortfolioRiskAnalyzerChartStickyHeader$1$10$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i7) {
                                if ((i7 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1269974671, i7, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeader.<anonymous>.<anonymous>.<anonymous> (OptionsPortfolioRiskAnalyzerChartStickyHeader.kt:160)");
                                }
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                final OptionsGreeks optionsGreeks = aggregatedGreeks;
                                FlowLayoutKt.FlowRow(null, null, null, centerVertically, 0, 0, ComposableLambda3.rememberComposableLambda(-1338854604, true, new Function3<FlowRowScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeaderKt$OptionsPortfolioRiskAnalyzerChartStickyHeader$1$10$1.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(FlowRowScope flowRowScope, Composer composer3, Integer num) {
                                        invoke(flowRowScope, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(FlowRowScope FlowRow, Composer composer3, int i8) {
                                        Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
                                        if ((i8 & 17) == 16 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1338854604, i8, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeader.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OptionsPortfolioRiskAnalyzerChartStickyHeader.kt:161)");
                                        }
                                        OptionsPortfolioRiskAnalyzerChartStickyHeader.OptionsPortfolioRiskAnalyzerChartStickyHeaderLabelValue(StringResources_androidKt.stringResource(C23462R.string.options_pra_sticky_header_label_delta, composer3, 0), NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), optionsGreeks.getDelta(), null, 2, null), null, composer3, 0, 4);
                                        OptionsPortfolioRiskAnalyzerChartStickyHeader.OptionsPortfolioRiskAnalyzerChartStickyHeaderLabelValue(StringResources_androidKt.stringResource(C23462R.string.options_pra_sticky_header_label_gamma, composer3, 0), NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), optionsGreeks.getGamma(), null, 2, null), null, composer3, 0, 4);
                                        OptionsPortfolioRiskAnalyzerChartStickyHeader.OptionsPortfolioRiskAnalyzerChartStickyHeaderLabelValue(StringResources_androidKt.stringResource(C23462R.string.options_pra_sticky_header_label_theta, composer3, 0), NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), optionsGreeks.getTheta(), null, 2, null), null, composer3, 0, 4);
                                        OptionsPortfolioRiskAnalyzerChartStickyHeader.OptionsPortfolioRiskAnalyzerChartStickyHeaderLabelValue(StringResources_androidKt.stringResource(C23462R.string.options_pra_sticky_header_label_vega, composer3, 0), NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), optionsGreeks.getVega(), null, 2, null), null, composer3, 0, 4);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), composer2, 1575936, 55);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue10 != companion.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        final SnapshotIntState2 snapshotIntState252 = snapshotIntState22;
                        OptionsPortfolioRiskAnalyzerChartStickyHeaderRow(numValueOf32, strStringResource32, composableLambdaRememberComposableLambda42, null, (Function1) objRememberedValue10, composerStartRestartGroup, 24960, 8);
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion42, 0.0f, composerStartRestartGroup, 6, 1), bentoTheme2.getColors(composerStartRestartGroup, i62).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
                        int intValue42 = snapshotIntState252.getIntValue();
                        String strStringResource42 = StringResources_androidKt.stringResource(C23462R.string.options_pra_sticky_header_label_max_profit_loss, composerStartRestartGroup, 0);
                        Integer numValueOf42 = Integer.valueOf(intValue42);
                        ComposableLambda composableLambdaRememberComposableLambda52 = ComposableLambda3.rememberComposableLambda(1026152518, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeaderKt$OptionsPortfolioRiskAnalyzerChartStickyHeader$1$10$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i7) {
                                if ((i7 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1026152518, i7, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeader.<anonymous>.<anonymous>.<anonymous> (OptionsPortfolioRiskAnalyzerChartStickyHeader.kt:193)");
                                }
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                final OptionsSimulatedChartHeaderState.PortfolioRiskAnalyzerHeader portfolioRiskAnalyzerHeader2 = portfolioRiskAnalyzerHeader;
                                final Resources resources22 = resources2;
                                FlowLayoutKt.FlowRow(null, null, null, centerVertically, 0, 0, ComposableLambda3.rememberComposableLambda(-2092847189, true, new Function3<FlowRowScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeaderKt$OptionsPortfolioRiskAnalyzerChartStickyHeader$1$10$3.1
                                    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
                                    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final void invoke(FlowRowScope FlowRow, Composer composer3, int i8) {
                                        int i9;
                                        String strInvoke;
                                        String strInvoke2;
                                        Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
                                        if ((i8 & 6) == 0) {
                                            i9 = i8 | (composer3.changed(FlowRow) ? 4 : 2);
                                        } else {
                                            i9 = i8;
                                        }
                                        if ((i9 & 19) == 18 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-2092847189, i9, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeader.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OptionsPortfolioRiskAnalyzerChartStickyHeader.kt:194)");
                                        }
                                        String strStringResource52 = StringResources_androidKt.stringResource(C23462R.string.options_pra_sticky_header_label_max_profit, composer3, 0);
                                        OptionsSimulatedChartHeaderState.PortfolioRiskAnalyzerHeader portfolioRiskAnalyzerHeader3 = portfolioRiskAnalyzerHeader2;
                                        if (portfolioRiskAnalyzerHeader3 != null) {
                                            Function1<Resources, String> maxProfit = portfolioRiskAnalyzerHeader3.getMaxProfit();
                                            Resources resources3 = resources22;
                                            Intrinsics.checkNotNull(resources3);
                                            strInvoke = maxProfit.invoke(resources3);
                                            if (strInvoke == null) {
                                                strInvoke = "-";
                                            }
                                        }
                                        OptionsPortfolioRiskAnalyzerChartStickyHeader.OptionsPortfolioRiskAnalyzerChartStickyHeaderLabelValue(strStringResource52, strInvoke, null, composer3, 0, 4);
                                        String strStringResource6 = StringResources_androidKt.stringResource(C23462R.string.options_pra_sticky_header_label_max_loss, composer3, 0);
                                        OptionsSimulatedChartHeaderState.PortfolioRiskAnalyzerHeader portfolioRiskAnalyzerHeader4 = portfolioRiskAnalyzerHeader2;
                                        if (portfolioRiskAnalyzerHeader4 != null) {
                                            Function1<Resources, String> maxLoss = portfolioRiskAnalyzerHeader4.getMaxLoss();
                                            Resources resources4 = resources22;
                                            Intrinsics.checkNotNull(resources4);
                                            strInvoke2 = maxLoss.invoke(resources4);
                                            if (strInvoke2 == null) {
                                                strInvoke2 = "-";
                                            }
                                        }
                                        OptionsPortfolioRiskAnalyzerChartStickyHeader.OptionsPortfolioRiskAnalyzerChartStickyHeaderLabelValue(strStringResource6, strInvoke2, null, composer3, 0, 4);
                                        Modifier.Companion companion5 = Modifier.INSTANCE;
                                        Modifier modifierWeight$default = Row5.weight$default(FlowRow, companion5, 1.0f, false, 2, null);
                                        Alignment.Companion companion6 = Alignment.INSTANCE;
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getTopStart(), false);
                                        int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap42 = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier42 = ComposedModifier2.materializeModifier(composer3, modifierWeight$default);
                                        ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor42 = companion7.getConstructor();
                                        if (composer3.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor42);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer3);
                                        Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy, companion7.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap42, companion7.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion7.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                            composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                            composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier42, companion7.getSetModifier());
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        BentoIcon4.Size12 size12 = new BentoIcon4.Size12(ServerToBentoAssetMapper2.CARET_UP_12);
                                        BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                                        int i10 = BentoTheme.$stable;
                                        BentoIcon2.m20644BentoIconFU0evQE(size12, null, bentoTheme22.getColors(composer3, i10).m21425getFg0d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(boxScopeInstance.align(companion5, companion6.getCenterEnd()), 0.0f, 0.0f, bentoTheme22.getSpacing(composer3, i10).m21592getMediumD9Ej5fM(), 0.0f, 11, null), null, false, composer3, BentoIcon4.Size12.$stable | 48, 48);
                                        composer3.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(FlowRowScope flowRowScope, Composer composer3, Integer num) {
                                        invoke(flowRowScope, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }
                                }, composer2, 54), composer2, 1575936, 55);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue11 == companion.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        OptionsPortfolioRiskAnalyzerChartStickyHeaderRow(numValueOf42, strStringResource42, composableLambdaRememberComposableLambda52, null, (Function1) objRememberedValue11, composerStartRestartGroup, 24960, 8);
                        composerStartRestartGroup.endNode();
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme2.getColors(composerStartRestartGroup, i62).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void OptionsPortfolioRiskAnalyzerChartStickyHeader$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionsPortfolioRiskAnalyzerChartStickyHeader$lambda$26$lambda$7$lambda$6 */
    public static final Unit m2260x1f365811(SnapshotIntState2 snapshotIntState2, int i) {
        snapshotIntState2.setIntValue(Math.max(snapshotIntState2.getIntValue(), i));
        return Unit.INSTANCE;
    }

    private static final boolean OptionsPortfolioRiskAnalyzerChartStickyHeader$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionsPortfolioRiskAnalyzerChartStickyHeader$lambda$26$lambda$9$lambda$8 */
    public static final Unit m2261x7c93a51(SnapshotIntState2 snapshotIntState2, int i) {
        snapshotIntState2.setIntValue(Math.max(snapshotIntState2.getIntValue(), i));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionsPortfolioRiskAnalyzerChartStickyHeader$lambda$26$lambda$16$lambda$13$lambda$12 */
    public static final Unit m2255x7c1e9805(SnapshotState snapshotState) {
        OptionsPortfolioRiskAnalyzerChartStickyHeader$lambda$2(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionsPortfolioRiskAnalyzerChartStickyHeader$lambda$26$lambda$16$lambda$15$lambda$14 */
    public static final Unit m2256xa5e7fd89(int i) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionsPortfolioRiskAnalyzerChartStickyHeader$lambda$26$lambda$20$lambda$19 */
    public static final Unit m2257xdbc362a(SnapshotState snapshotState) {
        OptionsPortfolioRiskAnalyzerChartStickyHeader$lambda$2(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionsPortfolioRiskAnalyzerChartStickyHeader$lambda$26$lambda$25$lambda$22$lambda$21 */
    public static final Unit m2258x68d84fdf(SnapshotIntState2 snapshotIntState2, int i) {
        snapshotIntState2.setIntValue(Math.max(snapshotIntState2.getIntValue(), i));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionsPortfolioRiskAnalyzerChartStickyHeader$lambda$26$lambda$25$lambda$24$lambda$23 */
    public static final Unit m2259x92a1b563(SnapshotIntState2 snapshotIntState2, int i) {
        snapshotIntState2.setIntValue(Math.max(snapshotIntState2.getIntValue(), i));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void OptionsPortfolioRiskAnalyzerChartStickyHeaderRow(final Integer num, final String str, final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, final Function1<? super Integer, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        String str2;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        C2002Dp c2002Dp;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        boolean z;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1819093693);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(num) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                str2 = str;
                i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
                }
                if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1819093693, i3, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeaderRow (OptionsPortfolioRiskAnalyzerChartStickyHeader.kt:230)");
                    }
                    C2002Dp c2002DpM7993boximpl = num == null ? C2002Dp.m7993boximpl(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(num.intValue())) : null;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM(), 4, null);
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    c2002Dp = c2002DpM7993boximpl;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, 11, null);
                    if (c2002Dp != null) {
                        modifierM5146paddingqDBjuR0$default2 = SizeKt.m5174width3ABfNKs(modifierM5146paddingqDBjuR0$default2, c2002Dp.getValue());
                    }
                    Modifier modifierWrapContentWidth = SizeKt.wrapContentWidth(modifierM5146paddingqDBjuR0$default2, companion.getStart(), true);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWrapContentWidth);
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    z = (57344 & i3) != 16384;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeaderKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return OptionsPortfolioRiskAnalyzerChartStickyHeader.m2263x676ff483(function1, (IntSize) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier5 = modifier4;
                    BentoText2.m20747BentoText38GnDrw(str2, OnRemeasuredModifier2.onSizeChanged(companion3, (Function1) objRememberedValue), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, (i3 >> 3) & 14, 0, 8188);
                    composer2 = composerStartRestartGroup;
                    composer2.endNode();
                    function2.invoke(composer2, Integer.valueOf((i3 >> 6) & 14));
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeaderKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return OptionsPortfolioRiskAnalyzerChartStickyHeader.OptionsPortfolioRiskAnalyzerChartStickyHeaderRow$lambda$34(num, str, function2, modifier3, function1, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            modifier2 = modifier;
            if ((i2 & 16) != 0) {
            }
            if ((i3 & 9363) == 9362) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (num == null) {
                }
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default3 = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default2, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21595getXsmallD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21595getXsmallD9Ej5fM(), 4, null);
                Alignment.Companion companion4 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion4.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default3);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                c2002Dp = c2002DpM7993boximpl;
                Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    Modifier modifierM5146paddingqDBjuR0$default22 = PaddingKt.m5146paddingqDBjuR0$default(companion32, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 0.0f, 11, null);
                    if (c2002Dp != null) {
                    }
                    Modifier modifierWrapContentWidth2 = SizeKt.wrapContentWidth(modifierM5146paddingqDBjuR0$default22, companion4.getStart(), true);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWrapContentWidth2);
                    Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        if ((57344 & i3) != 16384) {
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeaderKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return OptionsPortfolioRiskAnalyzerChartStickyHeader.m2263x676ff483(function1, (IntSize) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifier52 = modifier4;
                            BentoText2.m20747BentoText38GnDrw(str2, OnRemeasuredModifier2.onSizeChanged(companion32, (Function1) objRememberedValue), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composerStartRestartGroup, (i3 >> 3) & 14, 0, 8188);
                            composer2 = composerStartRestartGroup;
                            composer2.endNode();
                            function2.invoke(composer2, Integer.valueOf((i3 >> 6) & 14));
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier52;
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        str2 = str;
        if ((i2 & 4) == 0) {
        }
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i2 & 16) != 0) {
        }
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionsPortfolioRiskAnalyzerChartStickyHeaderRow$lambda$33$lambda$32$lambda$31$lambda$30 */
    public static final Unit m2263x676ff483(Function1 function1, IntSize intSize) {
        function1.invoke(Integer.valueOf((int) (intSize.getPackedValue() >> 32)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionsPortfolioRiskAnalyzerChartStickyHeaderLabelValue(final String str, final String str2, Modifier modifier, Composer composer, final int i, final int i2) {
        String str3;
        int i3;
        String str4;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1514187286);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str3 = str;
        } else {
            str3 = str;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(str3) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                str4 = str2;
                i3 |= composerStartRestartGroup.changed(str4) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1514187286, i3, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeaderLabelValue (OptionsPortfolioRiskAnalyzerChartStickyHeader.kt:268)");
                    }
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    Modifier modifier5 = modifier4;
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(str3, PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composer2, i3 & 14, 0, 8184);
                    BentoText2.m20747BentoText38GnDrw(str4, PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i5).m21593getSmallD9Ej5fM(), 0.0f, 11, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextS(), composer2, (i3 >> 3) & 14, 0, 8188);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeaderKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return OptionsPortfolioRiskAnalyzerChartStickyHeader.m2262x1b1d36e(str, str2, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            modifier2 = modifier;
            if ((i3 & 147) == 146) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    Modifier.Companion companion22 = Modifier.INSTANCE;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i52 = BentoTheme.$stable;
                    Modifier modifier52 = modifier4;
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(str3, PaddingKt.m5146paddingqDBjuR0$default(companion22, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composer2, i3 & 14, 0, 8184);
                    BentoText2.m20747BentoText38GnDrw(str4, PaddingKt.m5146paddingqDBjuR0$default(companion22, 0.0f, 0.0f, bentoTheme2.getSpacing(composer2, i52).m21593getSmallD9Ej5fM(), 0.0f, 11, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i52).getTextS(), composer2, (i3 >> 3) & 14, 0, 8188);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        str4 = str2;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
