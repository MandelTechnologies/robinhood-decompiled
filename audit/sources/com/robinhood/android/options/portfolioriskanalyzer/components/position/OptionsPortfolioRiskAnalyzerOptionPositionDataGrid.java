package com.robinhood.android.options.portfolioriskanalyzer.components.position;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
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
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.options.portfolioriskanalyzer.C23462R;
import com.robinhood.android.options.portfolioriskanalyzer.components.OptionsPortfolioRiskAnalyzerDataCellRow;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: OptionsPortfolioRiskAnalyzerOptionPositionDataGrid.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"OptionsPortfolioRiskAnalyzerOptionPositionDataGrid", "", "viewState", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerOptionPositionDataGridViewState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerOptionPositionDataGridViewState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionDataGridKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsPortfolioRiskAnalyzerOptionPositionDataGrid {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsPortfolioRiskAnalyzerOptionPositionDataGrid$lambda$1(OptionsPortfolioRiskAnalyzerOptionPositionDataGridViewState optionsPortfolioRiskAnalyzerOptionPositionDataGridViewState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OptionsPortfolioRiskAnalyzerOptionPositionDataGrid(optionsPortfolioRiskAnalyzerOptionPositionDataGridViewState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionsPortfolioRiskAnalyzerOptionPositionDataGrid(final OptionsPortfolioRiskAnalyzerOptionPositionDataGridViewState viewState, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        String strStringResource;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1428700912);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1428700912, i3, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionDataGrid (OptionsPortfolioRiskAnalyzerOptionPositionDataGrid.kt:15)");
                }
                if (!viewState.isCost()) {
                    composerStartRestartGroup.startReplaceGroup(-696794677);
                    strStringResource = StringResources_androidKt.stringResource(C23462R.string.options_pra_label_average_cost, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-696718231);
                    strStringResource = StringResources_androidKt.stringResource(C23462R.string.options_pra_label_average_credit, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(Tuples4.m3642to(StringResources_androidKt.stringResource(C23462R.string.options_pra_greek_label_delta, composerStartRestartGroup, 0), NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), viewState.getDelta(), null, 2, null)), Tuples4.m3642to(StringResources_androidKt.stringResource(C23462R.string.options_pra_greek_label_gamma, composerStartRestartGroup, 0), NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), viewState.getGamma(), null, 2, null)), Tuples4.m3642to(StringResources_androidKt.stringResource(C23462R.string.options_pra_greek_label_theta, composerStartRestartGroup, 0), NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), viewState.getTheta(), null, 2, null)), Tuples4.m3642to(StringResources_androidKt.stringResource(C23462R.string.options_pra_greek_label_vega, composerStartRestartGroup, 0), NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), viewState.getVega(), null, 2, null)), Tuples4.m3642to(StringResources_androidKt.stringResource(C23462R.string.options_pra_label_current_price, composerStartRestartGroup, 0), NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), viewState.getCurrentPrice(), null, 2, null)), Tuples4.m3642to(strStringResource, NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), viewState.getAvgCostOrCredit(), null, 2, null)));
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                OptionsPortfolioRiskAnalyzerDataCellRow.OptionsPortfolioRiskAnalyzerDataCellRow(immutableList3PersistentListOf.subList(0, 3), null, composerStartRestartGroup, 0, 2);
                OptionsPortfolioRiskAnalyzerDataCellRow.OptionsPortfolioRiskAnalyzerDataCellRow(immutableList3PersistentListOf.subList(3, 6), null, composerStartRestartGroup, 0, 2);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionDataGridKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OptionsPortfolioRiskAnalyzerOptionPositionDataGrid.OptionsPortfolioRiskAnalyzerOptionPositionDataGrid$lambda$1(viewState, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!viewState.isCost()) {
            }
            ImmutableList3 immutableList3PersistentListOf2 = extensions2.persistentListOf(Tuples4.m3642to(StringResources_androidKt.stringResource(C23462R.string.options_pra_greek_label_delta, composerStartRestartGroup, 0), NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), viewState.getDelta(), null, 2, null)), Tuples4.m3642to(StringResources_androidKt.stringResource(C23462R.string.options_pra_greek_label_gamma, composerStartRestartGroup, 0), NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), viewState.getGamma(), null, 2, null)), Tuples4.m3642to(StringResources_androidKt.stringResource(C23462R.string.options_pra_greek_label_theta, composerStartRestartGroup, 0), NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), viewState.getTheta(), null, 2, null)), Tuples4.m3642to(StringResources_androidKt.stringResource(C23462R.string.options_pra_greek_label_vega, composerStartRestartGroup, 0), NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), viewState.getVega(), null, 2, null)), Tuples4.m3642to(StringResources_androidKt.stringResource(C23462R.string.options_pra_label_current_price, composerStartRestartGroup, 0), NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), viewState.getCurrentPrice(), null, 2, null)), Tuples4.m3642to(strStringResource, NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), viewState.getAvgCostOrCredit(), null, 2, null)));
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                OptionsPortfolioRiskAnalyzerDataCellRow.OptionsPortfolioRiskAnalyzerDataCellRow(immutableList3PersistentListOf2.subList(0, 3), null, composerStartRestartGroup, 0, 2);
                OptionsPortfolioRiskAnalyzerDataCellRow.OptionsPortfolioRiskAnalyzerDataCellRow(immutableList3PersistentListOf2.subList(3, 6), null, composerStartRestartGroup, 0, 2);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
