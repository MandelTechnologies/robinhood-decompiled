package com.robinhood.android.investmentstracker.composables.components;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import bff_money_movement.service.p019v1.C3328x929dba61;
import bff_money_movement.service.p019v1.InvestmentsTrackerCategoryPercentageLinePositionDto;
import com.robinhood.android.investmentstracker.InvestmentsTrackerNativeAction;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerCategoryPercentageViewModel;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InvestmentsTrackerCategoryPercentage.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0002\u001a9\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001aq\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u001c2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\u001d¨\u0006\u001e"}, m3636d2 = {"InvestmentsTrackerCategoryPercentagePreview", "", "(Landroidx/compose/runtime/Composer;I)V", "InvestmentsTrackerCategoryPercentage", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerCategoryPercentageViewModel;", "nativeActionHandler", "Lkotlin/Function2;", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerNativeAction;", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerCategoryPercentageViewModel;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "InternalCellDisplay", "title", "", "subtitle", "percentageText", "amountText", "fillPercentage", "", "fillColor", "isHeader", "", "negativeFillPercentage", "negativeLinePosition", "Lbff_money_movement/service/v1/InvestmentsTrackerCategoryPercentageLinePositionDto;", "onClick", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;ZLjava/lang/Double;Lbff_money_movement/service/v1/InvestmentsTrackerCategoryPercentageLinePositionDto;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "feature-investments-tracker_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerCategoryPercentageKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InvestmentsTrackerCategoryPercentage4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalCellDisplay$lambda$21(String str, String str2, String str3, String str4, double d, String str5, boolean z, Double d2, InvestmentsTrackerCategoryPercentageLinePositionDto investmentsTrackerCategoryPercentageLinePositionDto, Function0 function0, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        InternalCellDisplay(str, str2, str3, str4, d, str5, z, d2, investmentsTrackerCategoryPercentageLinePositionDto, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestmentsTrackerCategoryPercentage$lambda$6(InvestmentsTrackerCategoryPercentageViewModel investmentsTrackerCategoryPercentageViewModel, Function2 function2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InvestmentsTrackerCategoryPercentage(investmentsTrackerCategoryPercentageViewModel, function2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestmentsTrackerCategoryPercentagePreview$lambda$0(int i, Composer composer, int i2) {
        InvestmentsTrackerCategoryPercentagePreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private static final void InvestmentsTrackerCategoryPercentagePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2126088378);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2126088378, i, -1, "com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerCategoryPercentagePreview (InvestmentsTrackerCategoryPercentage.kt:33)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, InvestmentsTrackerCategoryPercentage.INSTANCE.m15595getLambda$934783346$feature_investments_tracker_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerCategoryPercentageKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestmentsTrackerCategoryPercentage4.InvestmentsTrackerCategoryPercentagePreview$lambda$0(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InvestmentsTrackerCategoryPercentage(final InvestmentsTrackerCategoryPercentageViewModel item, final Function2<? super InvestmentsTrackerNativeAction, Object, Unit> nativeActionHandler, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChangedInstance;
        String str;
        final Modifier modifier3;
        Composer composer2;
        int i4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(nativeActionHandler, "nativeActionHandler");
        Composer composerStartRestartGroup = composer.startRestartGroup(-865456717);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(item) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(nativeActionHandler) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-865456717, i3, -1, "com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerCategoryPercentage (InvestmentsTrackerCategoryPercentage.kt:126)");
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                String title = item.getDetails().getTitle();
                String subtitle = item.getDetails().getSubtitle();
                String valueOrStars = item.getSecurityFilter().getValueOrStars(item.getDetails().getPercentage_text());
                double line_fill_percentage = item.getDetails().getLine_fill_percentage();
                String line_fill_color = item.getDetails().getLine_fill_color();
                Double caret_position_percentage = item.getDetails().getCaret_position_percentage();
                InvestmentsTrackerCategoryPercentageLinePositionDto negative_line_position = item.getDetails().getNegative_line_position();
                String valueOrStars2 = item.getSecurityFilter().getValueOrStars(item.getDetails().getAmount());
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                int i6 = i3 & 112;
                zChangedInstance = (i6 != 32) | composerStartRestartGroup.changedInstance(item);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    str = title;
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    int i7 = -1633490746;
                    modifier3 = modifier4;
                    int i8 = i6;
                    InternalCellDisplay(str, subtitle, valueOrStars, valueOrStars2, line_fill_percentage, line_fill_color, true, caret_position_percentage, negative_line_position, (Function0) objRememberedValue, null, composerStartRestartGroup, 1572864, 0, 1024);
                    Composer composer3 = composerStartRestartGroup;
                    composer3.startReplaceGroup(-414694703);
                    if (item.getDisplayAllItems()) {
                        for (final C3328x929dba61 c3328x929dba61 : item.getDetails().getHoldings()) {
                            String ticker = c3328x929dba61.getTicker();
                            String subtitle2 = c3328x929dba61.getSubtitle();
                            String percent_text = c3328x929dba61.getPercent_text();
                            double bar_percentage = c3328x929dba61.getBar_percentage();
                            String line_fill_color2 = item.getDetails().getLine_fill_color();
                            String valueOrStars3 = item.getSecurityFilter().getValueOrStars(c3328x929dba61.getAmount());
                            Double caret_position_percentage2 = c3328x929dba61.getCaret_position_percentage();
                            InvestmentsTrackerCategoryPercentageLinePositionDto negative_line_position2 = c3328x929dba61.getNegative_line_position();
                            composer3.startReplaceGroup(i7);
                            boolean zChangedInstance2 = (i8 == 32) | composer3.changedInstance(c3328x929dba61);
                            Object objRememberedValue2 = composer3.rememberedValue();
                            if (zChangedInstance2) {
                                i4 = i8;
                            } else {
                                i4 = i8;
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                }
                                composer3.endReplaceGroup();
                                Composer composer4 = composer3;
                                InternalCellDisplay(ticker, subtitle2, percent_text, valueOrStars3, bar_percentage, line_fill_color2, false, caret_position_percentage2, negative_line_position2, (Function0) objRememberedValue2, null, composer4, 1572864, 0, 1024);
                                composer3 = composer4;
                                i8 = i4;
                                i7 = -1633490746;
                            }
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerCategoryPercentageKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return InvestmentsTrackerCategoryPercentage4.InvestmentsTrackerCategoryPercentage$lambda$5$lambda$4$lambda$3(nativeActionHandler, c3328x929dba61);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue2);
                            composer3.endReplaceGroup();
                            Composer composer42 = composer3;
                            InternalCellDisplay(ticker, subtitle2, percent_text, valueOrStars3, bar_percentage, line_fill_color2, false, caret_position_percentage2, negative_line_position2, (Function0) objRememberedValue2, null, composer42, 1572864, 0, 1024);
                            composer3 = composer42;
                            i8 = i4;
                            i7 = -1633490746;
                        }
                    }
                    composer2 = composer3;
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    str = title;
                }
                objRememberedValue = new Function0() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerCategoryPercentageKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InvestmentsTrackerCategoryPercentage4.InvestmentsTrackerCategoryPercentage$lambda$5$lambda$2$lambda$1(nativeActionHandler, item);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                int i72 = -1633490746;
                modifier3 = modifier4;
                int i82 = i6;
                InternalCellDisplay(str, subtitle, valueOrStars, valueOrStars2, line_fill_percentage, line_fill_color, true, caret_position_percentage, negative_line_position, (Function0) objRememberedValue, null, composerStartRestartGroup, 1572864, 0, 1024);
                Composer composer32 = composerStartRestartGroup;
                composer32.startReplaceGroup(-414694703);
                if (item.getDisplayAllItems()) {
                }
                composer2 = composer32;
                composer2.endReplaceGroup();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerCategoryPercentageKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InvestmentsTrackerCategoryPercentage4.InvestmentsTrackerCategoryPercentage$lambda$6(item, nativeActionHandler, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) != 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                String title2 = item.getDetails().getTitle();
                String subtitle3 = item.getDetails().getSubtitle();
                String valueOrStars4 = item.getSecurityFilter().getValueOrStars(item.getDetails().getPercentage_text());
                double line_fill_percentage2 = item.getDetails().getLine_fill_percentage();
                String line_fill_color3 = item.getDetails().getLine_fill_color();
                Double caret_position_percentage3 = item.getDetails().getCaret_position_percentage();
                InvestmentsTrackerCategoryPercentageLinePositionDto negative_line_position3 = item.getDetails().getNegative_line_position();
                String valueOrStars22 = item.getSecurityFilter().getValueOrStars(item.getDetails().getAmount());
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                int i62 = i3 & 112;
                zChangedInstance = (i62 != 32) | composerStartRestartGroup.changedInstance(item);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                }
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerCategoryPercentageKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InvestmentsTrackerCategoryPercentage4.InvestmentsTrackerCategoryPercentage$lambda$5$lambda$2$lambda$1(nativeActionHandler, item);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                composerStartRestartGroup.endReplaceGroup();
                int i722 = -1633490746;
                modifier3 = modifier4;
                int i822 = i62;
                InternalCellDisplay(str, subtitle3, valueOrStars4, valueOrStars22, line_fill_percentage2, line_fill_color3, true, caret_position_percentage3, negative_line_position3, (Function0) objRememberedValue3, null, composerStartRestartGroup, 1572864, 0, 1024);
                Composer composer322 = composerStartRestartGroup;
                composer322.startReplaceGroup(-414694703);
                if (item.getDisplayAllItems()) {
                }
                composer2 = composer322;
                composer2.endReplaceGroup();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestmentsTrackerCategoryPercentage$lambda$5$lambda$2$lambda$1(Function2 function2, InvestmentsTrackerCategoryPercentageViewModel investmentsTrackerCategoryPercentageViewModel) {
        function2.invoke(InvestmentsTrackerNativeAction.ALLOCATION_BAR_SELECTED, investmentsTrackerCategoryPercentageViewModel.getDetails().getId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestmentsTrackerCategoryPercentage$lambda$5$lambda$4$lambda$3(Function2 function2, C3328x929dba61 c3328x929dba61) {
        function2.invoke(InvestmentsTrackerNativeAction.CATEGORY_PERCENTAGE_ITEM_CLICKED, c3328x929dba61);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x08a1  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x08ac  */
    /* JADX WARN: Removed duplicated region for block: B:289:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void InternalCellDisplay(final String str, final String str2, final String str3, final String str4, double d, final String str5, final boolean z, final Double d2, final InvestmentsTrackerCategoryPercentageLinePositionDto investmentsTrackerCategoryPercentageLinePositionDto, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        String str6;
        String str7;
        int i5;
        int i6;
        BentoTheme bentoTheme;
        int i7;
        boolean z2;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Modifier.Companion companion;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        int currentCompositeKeyHash4;
        Composer composerM6388constructorimpl4;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4;
        int currentCompositeKeyHash5;
        Composer composerM6388constructorimpl5;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5;
        float f;
        int currentCompositeKeyHash6;
        Composer composerM6388constructorimpl6;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6;
        int currentCompositeKeyHash7;
        Composer composerM6388constructorimpl7;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7;
        BentoTheme bentoTheme2;
        int i8;
        double d3;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1494420527);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                str6 = str2;
                i4 |= composerStartRestartGroup.changed(str6) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else {
                if ((i & 384) == 0) {
                    str7 = str3;
                    i4 |= composerStartRestartGroup.changed(str7) ? 256 : 128;
                }
                if ((i3 & 8) != 0) {
                    i4 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        i4 |= composerStartRestartGroup.changed(str4) ? 2048 : 1024;
                    }
                    if ((i3 & 16) == 0) {
                        i4 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i4 |= composerStartRestartGroup.changed(d) ? 16384 : 8192;
                    }
                    if ((i3 & 32) != 0) {
                        if ((i & 196608) == 0) {
                            i4 |= composerStartRestartGroup.changed(str5) ? 131072 : 65536;
                        }
                        if ((i3 & 64) != 0) {
                            i4 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i4 |= composerStartRestartGroup.changed(z) ? 1048576 : 524288;
                        }
                        if ((i3 & 128) != 0) {
                            i4 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i4 |= composerStartRestartGroup.changed(d2) ? 8388608 : 4194304;
                        }
                        if ((i3 & 256) != 0) {
                            i4 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i4 |= composerStartRestartGroup.changed(investmentsTrackerCategoryPercentageLinePositionDto == null ? -1 : investmentsTrackerCategoryPercentageLinePositionDto.ordinal()) ? 67108864 : 33554432;
                        }
                        if ((i3 & 512) != 0) {
                            i4 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function0) ? 536870912 : 268435456;
                        }
                        i5 = i3 & 1024;
                        if (i5 != 0) {
                            i6 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i6 = i2 | (composerStartRestartGroup.changed(modifier) ? 4 : 2);
                        } else {
                            i6 = i2;
                        }
                        if ((i4 & 306783379) == 306783378 && (i6 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            d3 = d;
                            modifier2 = modifier;
                        } else {
                            Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1494420527, i4, i6, "com.robinhood.android.investmentstracker.composables.components.InternalCellDisplay (InvestmentsTrackerCategoryPercentage.kt:181)");
                            }
                            bentoTheme = BentoTheme.INSTANCE;
                            i7 = BentoTheme.$stable;
                            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(modifier3, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM());
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            int i9 = i4;
                            z2 = (1879048192 & i4) != 536870912;
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerCategoryPercentageKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return InvestmentsTrackerCategoryPercentage4.InternalCellDisplay$lambda$8$lambda$7(function0);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierM5142padding3ABfNKs, false, null, null, (Function0) objRememberedValue, 7, null);
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.Vertical top = arrangement.getTop();
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            Modifier modifier4 = modifier3;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default);
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
                            Column6 column6 = Column6.INSTANCE;
                            companion = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
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
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                            setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                            Row6 row6 = Row6.INSTANCE;
                            Modifier modifierWeight$default = Row5.weight$default(row6, companion, 1.0f, false, 2, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
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
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                            setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                            BentoText2.m20747BentoText38GnDrw(str, null, null, null, !z ? FontWeight.INSTANCE.getW700() : FontWeight.INSTANCE.getW400(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getTextM(), composerStartRestartGroup, i9 & 14, 0, 8174);
                            BentoText2.m20747BentoText38GnDrw(str6, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i7).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getTextS(), composerStartRestartGroup, (i9 >> 3) & 14, 0, 8186);
                            composerStartRestartGroup.endNode();
                            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
                            Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.useNode();
                            } else {
                                composerStartRestartGroup.createNode(constructor4);
                            }
                            composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy3, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                            setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
                            TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i7).getTextM();
                            TextAlign.Companion companion4 = TextAlign.INSTANCE;
                            BentoText2.m20747BentoText38GnDrw(str7, column6.align(companion, companion2.getEnd()), null, null, !z ? FontWeight.INSTANCE.getW700() : FontWeight.INSTANCE.getW400(), null, TextAlign.m7912boximpl(companion4.m7920getEnde0LSkKk()), 0, false, 0, 0, null, 0, textM, composerStartRestartGroup, (i9 >> 6) & 14, 0, 8108);
                            BentoText2.m20747BentoText38GnDrw(str4, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i7).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion4.m7920getEnde0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getTextS(), composerStartRestartGroup, (i9 >> 9) & 14, 0, 8122);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endNode();
                            float f2 = 10;
                            Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C2002Dp.m7995constructorimpl(f2));
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                            currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5156height3ABfNKs);
                            Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.useNode();
                            } else {
                                composerStartRestartGroup.createNode(constructor5);
                            }
                            composerM6388constructorimpl5 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion3.getSetResolvedCompositionLocals());
                            setCompositeKeyHash5 = companion3.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion3.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            f = 5;
                            Modifier modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21597getXxsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), C2002Dp.m7995constructorimpl(f));
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
                            currentCompositeKeyHash6 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier6 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5156height3ABfNKs2);
                            Function0<ComposeUiNode> constructor6 = companion3.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.useNode();
                            } else {
                                composerStartRestartGroup.createNode(constructor6);
                            }
                            composerM6388constructorimpl6 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl6, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl6, currentCompositionLocalMap6, companion3.getSetResolvedCompositionLocals());
                            setCompositeKeyHash6 = companion3.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                composerM6388constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                composerM6388constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl6, modifierMaterializeModifier6, companion3.getSetModifier());
                            Modifier modifierAlign = row6.align(companion, companion2.getCenterVertically());
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                            currentCompositeKeyHash7 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier7 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAlign);
                            Function0<ComposeUiNode> constructor7 = companion3.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.useNode();
                            } else {
                                composerStartRestartGroup.createNode(constructor7);
                            }
                            composerM6388constructorimpl7 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl7, currentCompositionLocalMap7, companion3.getSetResolvedCompositionLocals());
                            setCompositeKeyHash7 = companion3.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                                composerM6388constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                                composerM6388constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl7, modifierMaterializeModifier7, companion3.getSetModifier());
                            BoxKt.Box(Background3.m4872backgroundbw27NRU$default(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C2002Dp.m7995constructorimpl(f)), bentoTheme.getColors(composerStartRestartGroup, i7).m21372getBg20d7_KjU(), null, 2, null), composerStartRestartGroup, 0);
                            if (d2 != null || investmentsTrackerCategoryPercentageLinePositionDto == null) {
                                bentoTheme2 = bentoTheme;
                                i8 = i7;
                                d3 = d;
                                composerStartRestartGroup.startReplaceGroup(463368669);
                                BoxKt.Box(Background3.m4872backgroundbw27NRU$default(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth(companion, (float) d3), C2002Dp.m7995constructorimpl(f)), Color2.Color(android.graphics.Color.parseColor(str5)), null, 2, null), composerStartRestartGroup, 0);
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                composerStartRestartGroup.startReplaceGroup(461011305);
                                Modifier modifierM5156height3ABfNKs3 = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C2002Dp.m7995constructorimpl(f2));
                                MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
                                int currentCompositeKeyHash8 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier8 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5156height3ABfNKs3);
                                Function0<ComposeUiNode> constructor8 = companion3.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor8);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                Composer composerM6388constructorimpl8 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl8, measurePolicyRowMeasurePolicy3, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl8, currentCompositionLocalMap8, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = companion3.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl8.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                                    composerM6388constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                                    composerM6388constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl8, modifierMaterializeModifier8, companion3.getSetModifier());
                                if (investmentsTrackerCategoryPercentageLinePositionDto == InvestmentsTrackerCategoryPercentageLinePositionDto.LEFT) {
                                    composerStartRestartGroup.startReplaceGroup(284577813);
                                    m2128x86872c15(row6, d2.doubleValue() - d, null, null, composerStartRestartGroup, 0, 6);
                                    bentoTheme2 = bentoTheme;
                                    i8 = i7;
                                    m2128x86872c15(row6, d, null, Integer.valueOf(android.graphics.Color.parseColor(str5)), composerStartRestartGroup, (i9 >> 12) & 14, 2);
                                    double dDoubleValue = 1 - (d + (d2.doubleValue() - d));
                                    if (dDoubleValue > 0.0d) {
                                        m2128x86872c15(row6, dDoubleValue, null, null, composerStartRestartGroup, 0, 6);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    d3 = d;
                                } else {
                                    bentoTheme2 = bentoTheme;
                                    i8 = i7;
                                    composerStartRestartGroup.startReplaceGroup(285056236);
                                    m2128x86872c15(row6, d2.doubleValue(), null, null, composerStartRestartGroup, (i9 >> 21) & 14, 6);
                                    d3 = d;
                                    m2128x86872c15(row6, d3, null, Integer.valueOf(android.graphics.Color.parseColor(str5)), composerStartRestartGroup, (i9 >> 12) & 14, 2);
                                    double dDoubleValue2 = 1 - (d2.doubleValue() + d3);
                                    if (dDoubleValue2 > 0.0d) {
                                        m2128x86872c15(row6, dDoubleValue2, null, null, composerStartRestartGroup, 0, 6);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                }
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceGroup();
                            }
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.startReplaceGroup(-1667956785);
                            if (d2 != null) {
                                Modifier modifierFillMaxWidth = SizeKt.fillMaxWidth(companion, (float) d2.doubleValue());
                                MeasurePolicy measurePolicyRowMeasurePolicy4 = Row2.rowMeasurePolicy(arrangement.getEnd(), companion2.getTop(), composerStartRestartGroup, 6);
                                int currentCompositeKeyHash9 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier9 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth);
                                Function0<ComposeUiNode> constructor9 = companion3.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor9);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                Composer composerM6388constructorimpl9 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl9, measurePolicyRowMeasurePolicy4, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl9, currentCompositionLocalMap9, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash9 = companion3.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl9.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                                    composerM6388constructorimpl9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
                                    composerM6388constructorimpl9.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl9, modifierMaterializeModifier9, companion3.getSetModifier());
                                BoxKt.Box(SizeKt.m5174width3ABfNKs(SizeKt.m5156height3ABfNKs(Background3.m4872backgroundbw27NRU$default(companion, bentoTheme2.getColors(composerStartRestartGroup, i8).m21427getFg30d7_KjU(), null, 2, null), C2002Dp.m7995constructorimpl(f2)), C2002Dp.m7995constructorimpl(1)), composerStartRestartGroup, 0);
                                composerStartRestartGroup.endNode();
                                Unit unit = Unit.INSTANCE;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier4;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final double d4 = d3;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerCategoryPercentageKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return InvestmentsTrackerCategoryPercentage4.InternalCellDisplay$lambda$21(str, str2, str3, str4, d4, str5, z, d2, investmentsTrackerCategoryPercentageLinePositionDto, function0, modifier2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 196608;
                    if ((i3 & 64) != 0) {
                    }
                    if ((i3 & 128) != 0) {
                    }
                    if ((i3 & 256) != 0) {
                    }
                    if ((i3 & 512) != 0) {
                    }
                    i5 = i3 & 1024;
                    if (i5 != 0) {
                    }
                    if ((i4 & 306783379) == 306783378) {
                        if (i5 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        bentoTheme = BentoTheme.INSTANCE;
                        i7 = BentoTheme.$stable;
                        Modifier modifierM5142padding3ABfNKs2 = PaddingKt.m5142padding3ABfNKs(modifier3, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM());
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        int i92 = i4;
                        if ((1879048192 & i4) != 536870912) {
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z2) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerCategoryPercentageKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return InvestmentsTrackerCategoryPercentage4.InternalCellDisplay$lambda$8$lambda$7(function0);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(modifierM5142padding3ABfNKs2, false, null, null, (Function0) objRememberedValue, 7, null);
                            Arrangement arrangement2 = Arrangement.INSTANCE;
                            Arrangement.Vertical top2 = arrangement2.getTop();
                            Alignment.Companion companion22 = Alignment.INSTANCE;
                            Modifier modifier42 = modifier3;
                            MeasurePolicy measurePolicyColumnMeasurePolicy4 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap10 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier10 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default2);
                            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor10 = companion32.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy4, companion32.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap10, companion32.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting()) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier10, companion32.getSetModifier());
                                Column6 column62 = Column6.INSTANCE;
                                companion = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyRowMeasurePolicy5 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion22.getTop(), composerStartRestartGroup, 0);
                                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
                                Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy5, companion32.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                                setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl2.getInserting()) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                                    Row6 row62 = Row6.INSTANCE;
                                    Modifier modifierWeight$default2 = Row5.weight$default(row62, companion, 1.0f, false, 2, null);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion22.getStart(), composerStartRestartGroup, 0);
                                    currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
                                    Function0<ComposeUiNode> constructor32 = companion32.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (composerStartRestartGroup.getInserting()) {
                                    }
                                    composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy22, companion32.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion32.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash3 = companion32.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl3.getInserting()) {
                                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion32.getSetModifier());
                                        BentoText2.m20747BentoText38GnDrw(str, null, null, null, !z ? FontWeight.INSTANCE.getW700() : FontWeight.INSTANCE.getW400(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getTextM(), composerStartRestartGroup, i92 & 14, 0, 8174);
                                        BentoText2.m20747BentoText38GnDrw(str6, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i7).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getTextS(), composerStartRestartGroup, (i92 >> 3) & 14, 0, 8186);
                                        composerStartRestartGroup.endNode();
                                        MeasurePolicy measurePolicyColumnMeasurePolicy32 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion22.getStart(), composerStartRestartGroup, 0);
                                        currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap42 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier42 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
                                        Function0<ComposeUiNode> constructor42 = companion32.getConstructor();
                                        if (composerStartRestartGroup.getApplier() == null) {
                                        }
                                        composerStartRestartGroup.startReusableNode();
                                        if (composerStartRestartGroup.getInserting()) {
                                        }
                                        composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                        Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy32, companion32.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap42, companion32.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash4 = companion32.getSetCompositeKeyHash();
                                        if (!composerM6388constructorimpl4.getInserting()) {
                                            composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                            composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                            Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier42, companion32.getSetModifier());
                                            TextStyle textM2 = bentoTheme.getTypography(composerStartRestartGroup, i7).getTextM();
                                            TextAlign.Companion companion42 = TextAlign.INSTANCE;
                                            BentoText2.m20747BentoText38GnDrw(str7, column62.align(companion, companion22.getEnd()), null, null, !z ? FontWeight.INSTANCE.getW700() : FontWeight.INSTANCE.getW400(), null, TextAlign.m7912boximpl(companion42.m7920getEnde0LSkKk()), 0, false, 0, 0, null, 0, textM2, composerStartRestartGroup, (i92 >> 6) & 14, 0, 8108);
                                            BentoText2.m20747BentoText38GnDrw(str4, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i7).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion42.m7920getEnde0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getTextS(), composerStartRestartGroup, (i92 >> 9) & 14, 0, 8122);
                                            composerStartRestartGroup.endNode();
                                            composerStartRestartGroup.endNode();
                                            float f22 = 10;
                                            Modifier modifierM5156height3ABfNKs4 = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C2002Dp.m7995constructorimpl(f22));
                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getTopStart(), false);
                                            currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                            CompositionLocalMap currentCompositionLocalMap52 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier52 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5156height3ABfNKs4);
                                            Function0<ComposeUiNode> constructor52 = companion32.getConstructor();
                                            if (composerStartRestartGroup.getApplier() == null) {
                                            }
                                            composerStartRestartGroup.startReusableNode();
                                            if (composerStartRestartGroup.getInserting()) {
                                            }
                                            composerM6388constructorimpl5 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                            Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy3, companion32.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap52, companion32.getSetResolvedCompositionLocals());
                                            setCompositeKeyHash5 = companion32.getSetCompositeKeyHash();
                                            if (!composerM6388constructorimpl5.getInserting()) {
                                                composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                                composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                                Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier52, companion32.getSetModifier());
                                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                f = 5;
                                                Modifier modifierM5156height3ABfNKs22 = SizeKt.m5156height3ABfNKs(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21597getXxsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), C2002Dp.m7995constructorimpl(f));
                                                MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion22.getCenterVertically(), composerStartRestartGroup, 48);
                                                currentCompositeKeyHash6 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                                CompositionLocalMap currentCompositionLocalMap62 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier62 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5156height3ABfNKs22);
                                                Function0<ComposeUiNode> constructor62 = companion32.getConstructor();
                                                if (composerStartRestartGroup.getApplier() == null) {
                                                }
                                                composerStartRestartGroup.startReusableNode();
                                                if (composerStartRestartGroup.getInserting()) {
                                                }
                                                composerM6388constructorimpl6 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                                Updater.m6390setimpl(composerM6388constructorimpl6, measurePolicyRowMeasurePolicy22, companion32.getSetMeasurePolicy());
                                                Updater.m6390setimpl(composerM6388constructorimpl6, currentCompositionLocalMap62, companion32.getSetResolvedCompositionLocals());
                                                setCompositeKeyHash6 = companion32.getSetCompositeKeyHash();
                                                if (!composerM6388constructorimpl6.getInserting()) {
                                                    composerM6388constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                                    composerM6388constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                                                    Updater.m6390setimpl(composerM6388constructorimpl6, modifierMaterializeModifier62, companion32.getSetModifier());
                                                    Modifier modifierAlign2 = row62.align(companion, companion22.getCenterVertically());
                                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getTopStart(), false);
                                                    currentCompositeKeyHash7 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                                    CompositionLocalMap currentCompositionLocalMap72 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                                    Modifier modifierMaterializeModifier72 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAlign2);
                                                    Function0<ComposeUiNode> constructor72 = companion32.getConstructor();
                                                    if (composerStartRestartGroup.getApplier() == null) {
                                                    }
                                                    composerStartRestartGroup.startReusableNode();
                                                    if (composerStartRestartGroup.getInserting()) {
                                                    }
                                                    composerM6388constructorimpl7 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                                    Updater.m6390setimpl(composerM6388constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy22, companion32.getSetMeasurePolicy());
                                                    Updater.m6390setimpl(composerM6388constructorimpl7, currentCompositionLocalMap72, companion32.getSetResolvedCompositionLocals());
                                                    setCompositeKeyHash7 = companion32.getSetCompositeKeyHash();
                                                    if (!composerM6388constructorimpl7.getInserting()) {
                                                        composerM6388constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                                                        composerM6388constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                                                        Updater.m6390setimpl(composerM6388constructorimpl7, modifierMaterializeModifier72, companion32.getSetModifier());
                                                        BoxKt.Box(Background3.m4872backgroundbw27NRU$default(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C2002Dp.m7995constructorimpl(f)), bentoTheme.getColors(composerStartRestartGroup, i7).m21372getBg20d7_KjU(), null, 2, null), composerStartRestartGroup, 0);
                                                        if (d2 != null) {
                                                            bentoTheme2 = bentoTheme;
                                                            i8 = i7;
                                                            d3 = d;
                                                            composerStartRestartGroup.startReplaceGroup(463368669);
                                                            BoxKt.Box(Background3.m4872backgroundbw27NRU$default(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth(companion, (float) d3), C2002Dp.m7995constructorimpl(f)), Color2.Color(android.graphics.Color.parseColor(str5)), null, 2, null), composerStartRestartGroup, 0);
                                                            composerStartRestartGroup.endReplaceGroup();
                                                            composerStartRestartGroup.endNode();
                                                            composerStartRestartGroup.endNode();
                                                            composerStartRestartGroup.startReplaceGroup(-1667956785);
                                                            if (d2 != null) {
                                                            }
                                                            composerStartRestartGroup.endReplaceGroup();
                                                            composerStartRestartGroup.endNode();
                                                            composerStartRestartGroup.endNode();
                                                            if (ComposerKt.isTraceInProgress()) {
                                                            }
                                                            modifier2 = modifier42;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                if ((i3 & 16) == 0) {
                }
                if ((i3 & 32) != 0) {
                }
                if ((i3 & 64) != 0) {
                }
                if ((i3 & 128) != 0) {
                }
                if ((i3 & 256) != 0) {
                }
                if ((i3 & 512) != 0) {
                }
                i5 = i3 & 1024;
                if (i5 != 0) {
                }
                if ((i4 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            str7 = str3;
            if ((i3 & 8) != 0) {
            }
            if ((i3 & 16) == 0) {
            }
            if ((i3 & 32) != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if ((i3 & 256) != 0) {
            }
            if ((i3 & 512) != 0) {
            }
            i5 = i3 & 1024;
            if (i5 != 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        str6 = str2;
        if ((i3 & 4) == 0) {
        }
        str7 = str3;
        if ((i3 & 8) != 0) {
        }
        if ((i3 & 16) == 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if ((i3 & 256) != 0) {
        }
        if ((i3 & 512) != 0) {
        }
        i5 = i3 & 1024;
        if (i5 != 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalCellDisplay$lambda$8$lambda$7(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: InternalCellDisplay$lambda$20$lambda$19$lambda$16$lambda$15$lambda$14$BoxCreate */
    private static final void m2128x86872c15(Row5 row5, double d, Modifier modifier, Integer num, Composer composer, int i, int i2) {
        long jM6725getTransparent0d7_KjU;
        composer.startReplaceGroup(-224925010);
        if ((i2 & 2) != 0) {
            modifier = Modifier.INSTANCE;
        }
        Modifier modifier2 = modifier;
        if ((i2 & 4) != 0) {
            num = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-224925010, i, -1, "com.robinhood.android.investmentstracker.composables.components.InternalCellDisplay.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.BoxCreate (InvestmentsTrackerCategoryPercentage.kt:260)");
        }
        Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(Row5.weight$default(row5, modifier2, (float) d, false, 2, null), C2002Dp.m7995constructorimpl(5));
        if (num != null) {
            jM6725getTransparent0d7_KjU = Color2.Color(num.intValue());
        } else {
            jM6725getTransparent0d7_KjU = Color.INSTANCE.m6725getTransparent0d7_KjU();
        }
        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierM5156height3ABfNKs, jM6725getTransparent0d7_KjU, null, 2, null);
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4872backgroundbw27NRU$default);
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
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
