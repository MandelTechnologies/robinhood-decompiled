package com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings;

import android.content.res.Resources;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.material3.Divider5;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorParamValidationDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorParameterDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorParameterTypeDto;
import com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0;
import com.robinhood.android.chart.blackwidowadvancedchart.formatters.BwBentoNumpadTextInputFormatter;
import com.robinhood.android.chart.blackwidowadvancedchart.formatters.BwNumberVisualTransformer;
import com.robinhood.android.chart.libblackwidowadvancedchart.C10963R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScopeV2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ParameterNumberRow.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001aM\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\tH\u0001¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\u0012\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000fX\u008a\u008e\u0002²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0012X\u008a\u0084\u0002"}, m3636d2 = {"ParameterNumberRow", "", "value", "", "parameter", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterDto;", "numpadScope", "Lcom/robinhood/compose/bento/component/numpad/BentoNumpadScopeV2;", "showKeyboard", "Lkotlin/Function1;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/composables/indicators/settings/SettingsKeyboardState;", "onNumberChange", "(DLblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterDto;Lcom/robinhood/compose/bento/component/numpad/BentoNumpadScopeV2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "feature-black-widow-advanced-chart_externalDebug", "localValue", "", "kotlin.jvm.PlatformType", "focused", "", "error"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterNumberRowKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class ParameterNumberRow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ParameterNumberRow$lambda$6(double d, IndicatorParameterDto indicatorParameterDto, BentoNumpadScopeV2 bentoNumpadScopeV2, Function1 function1, Function1 function12, int i, Composer composer, int i2) {
        ParameterNumberRow(d, indicatorParameterDto, bentoNumpadScopeV2, function1, function12, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ParameterNumberRow(final double d, final IndicatorParameterDto parameter, final BentoNumpadScopeV2 numpadScope, final Function1<? super SettingsKeyboardState, Unit> showKeyboard, final Function1<? super Double, Unit> onNumberChange, Composer composer, final int i) {
        int i2;
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        Composer composer2;
        Double min;
        Double max;
        Double precision;
        Intrinsics.checkNotNullParameter(parameter, "parameter");
        Intrinsics.checkNotNullParameter(numpadScope, "numpadScope");
        Intrinsics.checkNotNullParameter(showKeyboard, "showKeyboard");
        Intrinsics.checkNotNullParameter(onNumberChange, "onNumberChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-60646269);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(d) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(parameter) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(numpadScope) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(showKeyboard) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onNumberChange) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-60646269, i2, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterNumberRow (ParameterNumberRow.kt:50)");
            }
            boolean z = parameter.getStudy_param_type() == IndicatorParameterTypeDto.INDICATOR_PARAMETER_TYPE_PRICE_RANGE;
            IndicatorParamValidationDto validation_to = parameter.getValidation_to();
            int iDoubleValue = ((validation_to == null || (precision = validation_to.getPrecision()) == null) ? 0 : (int) precision.doubleValue()) + 1;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(parameter);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(zzah$$ExternalSyntheticBackportWithForwarding0.m822m(BigDecimals7.toBigDecimal(Double.valueOf(d)).setScale(iDoubleValue)).toPlainString(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            IndicatorParamValidationDto validation_to2 = parameter.getValidation_to();
            if (validation_to2 == null || (max = validation_to2.getMax()) == null || (bigDecimal = BigDecimals7.toBigDecimal(max)) == null) {
                bigDecimal = BigDecimals7.toBigDecimal(Integer.MAX_VALUE);
            }
            IndicatorParamValidationDto validation_to3 = parameter.getValidation_to();
            if (validation_to3 == null || (min = validation_to3.getMin()) == null || (bigDecimal2 = BigDecimals7.toBigDecimal(min)) == null) {
                bigDecimal2 = BigDecimals7.toBigDecimal(Integer.MIN_VALUE);
            }
            final BigDecimal bigDecimal3 = bigDecimal2;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new BwBentoNumpadTextInputFormatter(iDoubleValue, null, BigDecimals7.isNegative(bigDecimal), null, 10, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            BwBentoNumpadTextInputFormatter bwBentoNumpadTextInputFormatter = (BwBentoNumpadTextInputFormatter) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged2 = composerStartRestartGroup.changed(z);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new BwNumberVisualTransformer(z);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final BwNumberVisualTransformer bwNumberVisualTransformer = (BwNumberVisualTransformer) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            final BigDecimal bigDecimal4 = bigDecimal;
            BentoBaseRowLayout.BentoBaseRowLayout(null, null, null, ComposableLambda3.rememberComposableLambda(682374768, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterNumberRowKt$ParameterNumberRow$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(682374768, i3, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterNumberRow.<anonymous>.<anonymous> (ParameterNumberRow.kt:69)");
                    }
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    String label = parameter.getLabel();
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(label, companion4, Color.m6701boximpl(bentoTheme.getColors(composer3, i4).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i4).getTextM(), composer3, 48, 0, 8184);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, ComposableLambda3.rememberComposableLambda(1083135501, true, new ParameterNumberRow3(bigDecimal3, numpadScope, snapshotState, bwBentoNumpadTextInputFormatter, d, iDoubleValue, bigDecimal, onNumberChange, showKeyboard, bwNumberVisualTransformer), composerStartRestartGroup, 54), false, false, true, null, composerStartRestartGroup, 819465216, 0, 1335);
            String strParameterNumberRow$lambda$1 = ParameterNumberRow$lambda$1(snapshotState);
            Intrinsics.checkNotNullExpressionValue(strParameterNumberRow$lambda$1, "ParameterNumberRow$lambda$1(...)");
            final BigDecimal bigDecimal5 = new BigDecimal(strParameterNumberRow$lambda$1);
            AnimatedVisibilityKt.AnimatedVisibility(column6, bigDecimal5.compareTo(bigDecimal4) > 0 || bigDecimal5.compareTo(bigDecimal3) < 0, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(1057238517, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterNumberRowKt$ParameterNumberRow$1$3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) throws Resources.NotFoundException {
                    invoke(animatedVisibilityScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer3, int i3) throws Resources.NotFoundException {
                    String strStringResource;
                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1057238517, i3, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterNumberRow.<anonymous>.<anonymous> (ParameterNumberRow.kt:202)");
                    }
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer3, i4).m21590getDefaultD9Ej5fM(), 7, null);
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    BigDecimal bigDecimal6 = bigDecimal5;
                    BigDecimal bigDecimal7 = bigDecimal4;
                    BwNumberVisualTransformer bwNumberVisualTransformer2 = bwNumberVisualTransformer;
                    BigDecimal bigDecimal8 = bigDecimal3;
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierM5146paddingqDBjuR0$default);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.TRIANGLE_ALERT_16), null, bentoTheme.getColors(composer3, i4).m21452getNegative0d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, 0.0f, bentoTheme.getSpacing(composer3, i4).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), null, false, composer3, BentoIcon4.Size16.$stable | 48, 48);
                    if (bigDecimal6.compareTo(bigDecimal7) > 0) {
                        composer3.startReplaceGroup(1437106672);
                        int i5 = C10963R.string.indicator_number_error_max;
                        String plainString = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(bigDecimal7).toPlainString();
                        Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
                        strStringResource = StringResources_androidKt.stringResource(i5, new Object[]{bwNumberVisualTransformer2.filter(new AnnotatedString(plainString, null, 2, null)).getText()}, composer3, 0);
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(1437427088);
                        int i6 = C10963R.string.indicator_number_error_min;
                        String plainString2 = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(bigDecimal8).toPlainString();
                        Intrinsics.checkNotNullExpressionValue(plainString2, "toPlainString(...)");
                        strStringResource = StringResources_androidKt.stringResource(i6, new Object[]{bwNumberVisualTransformer2.filter(new AnnotatedString(plainString2, null, 2, null)).getText()}, composer3, 0);
                        composer3.endReplaceGroup();
                    }
                    BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i4).m21452getNegative0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, null, composer3, 24576, 0, 16362);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1572870, 30);
            composer2 = composerStartRestartGroup;
            Divider5.m5851HorizontalDivider9IZ8Weo(null, 0.0f, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21373getBg30d7_KjU(), composer2, 0, 3);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterNumberRowKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ParameterNumberRow.ParameterNumberRow$lambda$6(d, parameter, numpadScope, showKeyboard, onNumberChange, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ParameterNumberRow$lambda$1(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }
}
