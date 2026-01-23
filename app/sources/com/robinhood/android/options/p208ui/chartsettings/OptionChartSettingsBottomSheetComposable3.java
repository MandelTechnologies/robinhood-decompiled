package com.robinhood.android.options.p208ui.chartsettings;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.options.C22993R;
import com.robinhood.android.options.p208ui.chart.ChartType;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.component.rows.BentoToggleRow3;
import com.robinhood.compose.bento.component.rows.BentoToggleRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionChartSettingsBottomSheetComposable.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aO\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m3636d2 = {"OptionChartSettingsBottomSheetComposable", "", "selectedChartType", "Lcom/robinhood/android/options/ui/chart/ChartType;", "showAllHours", "", "onChartTypeSelected", "Lkotlin/Function1;", "onShowAllHoursToggled", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/options/ui/chart/ChartType;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewChartSettingsBottomSheetComposable", "(Landroidx/compose/runtime/Composer;I)V", "feature-options-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.ui.chartsettings.OptionChartSettingsBottomSheetComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionChartSettingsBottomSheetComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionChartSettingsBottomSheetComposable$lambda$7(ChartType chartType, boolean z, Function1 function1, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OptionChartSettingsBottomSheetComposable(chartType, z, function1, function12, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewChartSettingsBottomSheetComposable$lambda$8(int i, Composer composer, int i2) {
        PreviewChartSettingsBottomSheetComposable(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionChartSettingsBottomSheetComposable(final ChartType selectedChartType, final boolean z, final Function1<? super ChartType, Unit> onChartTypeSelected, final Function1<? super Boolean, Unit> onShowAllHoursToggled, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        EventLogger current;
        UserInteractionEventDescriptor userInteractionEventDescriptor;
        boolean zChangedInstance;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        boolean z2;
        Object objRememberedValue2;
        final Function1<? super ChartType, Unit> function1;
        boolean z3;
        Object objRememberedValue3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(selectedChartType, "selectedChartType");
        Intrinsics.checkNotNullParameter(onChartTypeSelected, "onChartTypeSelected");
        Intrinsics.checkNotNullParameter(onShowAllHoursToggled, "onShowAllHoursToggled");
        Composer composerStartRestartGroup = composer.startRestartGroup(442470296);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(selectedChartType.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onChartTypeSelected) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onShowAllHoursToggled) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                }
                if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(442470296, i3, -1, "com.robinhood.android.options.ui.chartsettings.OptionChartSettingsBottomSheetComposable (OptionChartSettingsBottomSheetComposable.kt:36)");
                    }
                    current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                    userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    Unit unit = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChangedInstance = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new OptionChartSettingsBottomSheetComposable4(current, userInteractionEventDescriptor, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 5, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                    Alignment.Companion companion = Alignment.INSTANCE;
                    Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier modifier5 = modifier4;
                    int i6 = i3;
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C22993R.string.chart_settings_bottom_sheet_label, composerStartRestartGroup, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8190);
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                    String strStringResource = StringResources_androidKt.stringResource(C22993R.string.chart_settings_type_label_adt, composerStartRestartGroup, 0);
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, 0.0f, composerStartRestartGroup, 6, 1);
                    FontWeight.Companion companion4 = FontWeight.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, companion4.getBold(), null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 24576, 0, 16364);
                    BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
                    BentoSelectionRowState bentoSelectionRowState = new BentoSelectionRowState(type2, StringResources_androidKt.stringResource(C22993R.string.chart_settings_type_line, composerStartRestartGroup, 0), selectedChartType != ChartType.LINE, (BentoBaseRowState.Text) null, false, false, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2040, (DefaultConstructorMarker) null);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    int i7 = i6 & 896;
                    z2 = i7 != 256;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        function1 = onChartTypeSelected;
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.options.ui.chartsettings.OptionChartSettingsBottomSheetComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OptionChartSettingsBottomSheetComposable3.m2286xe36fbe73(function1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        function1 = onChartTypeSelected;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    int i8 = BentoSelectionRowState.$stable;
                    BentoSelectionRow2.BentoSelectionRow(null, bentoSelectionRowState, (Function0) objRememberedValue2, composerStartRestartGroup, i8 << 3, 1);
                    BentoSelectionRowState bentoSelectionRowState2 = new BentoSelectionRowState(type2, StringResources_androidKt.stringResource(C22993R.string.chart_settings_type_candlestick, composerStartRestartGroup, 0), selectedChartType != ChartType.CANDLESTICK, (BentoBaseRowState.Text) null, false, false, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2040, (DefaultConstructorMarker) null);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    z3 = i7 != 256;
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.options.ui.chartsettings.OptionChartSettingsBottomSheetComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OptionChartSettingsBottomSheetComposable3.m2287xcc02a0b3(function1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoSelectionRow2.BentoSelectionRow(null, bentoSelectionRowState2, (Function0) objRememberedValue3, composerStartRestartGroup, i8 << 3, 1);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21591getLargeD9Ej5fM()), composerStartRestartGroup, 0);
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C22993R.string.chart_settings_more_options_label_adt, composerStartRestartGroup, 0), com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, 0.0f, composerStartRestartGroup, 6, 1), null, null, companion4.getBold(), null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 24576, 0, 16364);
                    BentoToggleRow3.BentoToggleRow(new BentoToggleRowState(null, StringResources_androidKt.stringResource(C22993R.string.chart_settings_extended_hours_label_adt, composerStartRestartGroup, 0), null, false, z, null, null, false, false, false, 493, null), onShowAllHoursToggled, null, composerStartRestartGroup, BentoToggleRowState.$stable | ((i6 >> 6) & 112), 4);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.ui.chartsettings.OptionChartSettingsBottomSheetComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return OptionChartSettingsBottomSheetComposable3.OptionChartSettingsBottomSheetComposable$lambda$7(selectedChartType, z, onChartTypeSelected, onShowAllHoursToggled, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            modifier2 = modifier;
            if ((i3 & 9363) == 9362) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                Unit unit2 = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new OptionChartSettingsBottomSheetComposable4(current, userInteractionEventDescriptor, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i52 = BentoTheme.$stable;
                    Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default3, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 5, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                    Alignment.Companion companion5 = Alignment.INSTANCE;
                    Alignment.Horizontal centerHorizontally2 = companion5.getCenterHorizontally();
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement2.getTop(), centerHorizontally2, composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default2);
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy3, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        Modifier modifier52 = modifier4;
                        int i62 = i3;
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C22993R.string.chart_settings_bottom_sheet_label, composerStartRestartGroup, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8190);
                        Modifier.Companion companion32 = Modifier.INSTANCE;
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                        Modifier modifierFillMaxWidth$default22 = SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion5.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default22);
                        Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy22, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting()) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                            String strStringResource2 = StringResources_androidKt.stringResource(C22993R.string.chart_settings_type_label_adt, composerStartRestartGroup, 0);
                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion32, 0.0f, composerStartRestartGroup, 6, 1);
                            FontWeight.Companion companion42 = FontWeight.INSTANCE;
                            BentoText2.m20747BentoText38GnDrw(strStringResource2, modifierM21623defaultHorizontalPaddingrAjV9yQ2, null, null, companion42.getBold(), null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 24576, 0, 16364);
                            BentoSelectionRowState.Type type22 = BentoSelectionRowState.Type.RadioButton;
                            BentoSelectionRowState bentoSelectionRowState3 = new BentoSelectionRowState(type22, StringResources_androidKt.stringResource(C22993R.string.chart_settings_type_line, composerStartRestartGroup, 0), selectedChartType != ChartType.LINE, (BentoBaseRowState.Text) null, false, false, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2040, (DefaultConstructorMarker) null);
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            int i72 = i62 & 896;
                            if (i72 != 256) {
                            }
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (z2) {
                                function1 = onChartTypeSelected;
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.options.ui.chartsettings.OptionChartSettingsBottomSheetComposableKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return OptionChartSettingsBottomSheetComposable3.m2286xe36fbe73(function1);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                composerStartRestartGroup.endReplaceGroup();
                                int i82 = BentoSelectionRowState.$stable;
                                BentoSelectionRow2.BentoSelectionRow(null, bentoSelectionRowState3, (Function0) objRememberedValue2, composerStartRestartGroup, i82 << 3, 1);
                                BentoSelectionRowState bentoSelectionRowState22 = new BentoSelectionRowState(type22, StringResources_androidKt.stringResource(C22993R.string.chart_settings_type_candlestick, composerStartRestartGroup, 0), selectedChartType != ChartType.CANDLESTICK, (BentoBaseRowState.Text) null, false, false, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2040, (DefaultConstructorMarker) null);
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                if (i72 != 256) {
                                }
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (!z3) {
                                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.options.ui.chartsettings.OptionChartSettingsBottomSheetComposableKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return OptionChartSettingsBottomSheetComposable3.m2287xcc02a0b3(function1);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                    composerStartRestartGroup.endReplaceGroup();
                                    BentoSelectionRow2.BentoSelectionRow(null, bentoSelectionRowState22, (Function0) objRememberedValue3, composerStartRestartGroup, i82 << 3, 1);
                                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21591getLargeD9Ej5fM()), composerStartRestartGroup, 0);
                                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C22993R.string.chart_settings_more_options_label_adt, composerStartRestartGroup, 0), com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion32, 0.0f, composerStartRestartGroup, 6, 1), null, null, companion42.getBold(), null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 24576, 0, 16364);
                                    BentoToggleRow3.BentoToggleRow(new BentoToggleRowState(null, StringResources_androidKt.stringResource(C22993R.string.chart_settings_extended_hours_label_adt, composerStartRestartGroup, 0), null, false, z, null, null, false, false, false, 493, null), onShowAllHoursToggled, null, composerStartRestartGroup, BentoToggleRowState.$stable | ((i62 >> 6) & 112), 4);
                                    composerStartRestartGroup = composerStartRestartGroup;
                                    composerStartRestartGroup.endNode();
                                    composerStartRestartGroup.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier3 = modifier52;
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
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionChartSettingsBottomSheetComposable$lambda$6$lambda$5$lambda$2$lambda$1 */
    public static final Unit m2286xe36fbe73(Function1 function1) {
        function1.invoke(ChartType.LINE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionChartSettingsBottomSheetComposable$lambda$6$lambda$5$lambda$4$lambda$3 */
    public static final Unit m2287xcc02a0b3(Function1 function1) {
        function1.invoke(ChartType.CANDLESTICK);
        return Unit.INSTANCE;
    }

    private static final void PreviewChartSettingsBottomSheetComposable(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1502092540);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1502092540, i, -1, "com.robinhood.android.options.ui.chartsettings.PreviewChartSettingsBottomSheetComposable (OptionChartSettingsBottomSheetComposable.kt:109)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, OptionChartSettingsBottomSheetComposable.INSTANCE.m17029getLambda$475243332$feature_options_detail_externalDebug(), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.ui.chartsettings.OptionChartSettingsBottomSheetComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionChartSettingsBottomSheetComposable3.PreviewChartSettingsBottomSheetComposable$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
