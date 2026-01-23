package com.robinhood.android.equitydetail.p123ui.chartsettings;

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
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.educationtour.EducationTourScreenNames;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.component.rows.BentoToggleRow3;
import com.robinhood.compose.bento.component.rows.BentoToggleRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableMap;

/* compiled from: ChartSettingsBottomSheetComposable.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ac\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"ChartSettingsBottomSheetComposable", "", "selectedChartType", "Lcom/robinhood/android/equitydetail/ui/chartsettings/ChartType;", "showAllHours", "", "onChartTypeSelected", "Lkotlin/Function1;", "onShowAllHoursToggled", "onLaunchEducationTour", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/equitydetail/ui/chartsettings/ChartType;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewChartSettingsBottomSheetComposable", "(Landroidx/compose/runtime/Composer;I)V", "feature-equity-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equitydetail.ui.chartsettings.ChartSettingsBottomSheetComposableKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class ChartSettingsBottomSheetComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartSettingsBottomSheetComposable$lambda$10(ChartSettingsBottomSheetComposable2 chartSettingsBottomSheetComposable2, boolean z, Function1 function1, Function1 function12, Function1 function13, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ChartSettingsBottomSheetComposable(chartSettingsBottomSheetComposable2, z, function1, function12, function13, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewChartSettingsBottomSheetComposable$lambda$11(int i, Composer composer, int i2) {
        PreviewChartSettingsBottomSheetComposable(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x022f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChartSettingsBottomSheetComposable(final ChartSettingsBottomSheetComposable2 selectedChartType, final boolean z, final Function1<? super ChartSettingsBottomSheetComposable2, Unit> onChartTypeSelected, final Function1<? super Boolean, Unit> onShowAllHoursToggled, final Function1<? super String, Unit> onLaunchEducationTour, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        boolean z2;
        Object objRememberedValue;
        int i5;
        boolean z3;
        boolean z4;
        Object objRememberedValue2;
        boolean z5;
        Object objRememberedValue3;
        final Function1<? super String, Unit> function1;
        boolean z6;
        Object objRememberedValue4;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(selectedChartType, "selectedChartType");
        Intrinsics.checkNotNullParameter(onChartTypeSelected, "onChartTypeSelected");
        Intrinsics.checkNotNullParameter(onShowAllHoursToggled, "onShowAllHoursToggled");
        Intrinsics.checkNotNullParameter(onLaunchEducationTour, "onLaunchEducationTour");
        Composer composerStartRestartGroup = composer.startRestartGroup(-681738737);
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
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onLaunchEducationTour) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                }
                if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    function1 = onLaunchEducationTour;
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-681738737, i3, -1, "com.robinhood.android.equitydetail.ui.chartsettings.ChartSettingsBottomSheetComposable (ChartSettingsBottomSheetComposable.kt:41)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 5, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
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
                    int i7 = i3;
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C15314R.string.chart_settings_bottom_sheet_label, composerStartRestartGroup, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8190);
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
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
                    String strStringResource = StringResources_androidKt.stringResource(C15314R.string.chart_settings_type_label_adt, composerStartRestartGroup, 0);
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, 0.0f, composerStartRestartGroup, 6, 1);
                    FontWeight.Companion companion4 = FontWeight.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, companion4.getBold(), null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 24576, 0, 16364);
                    BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
                    BentoSelectionRowState bentoSelectionRowState = new BentoSelectionRowState(type2, StringResources_androidKt.stringResource(C15314R.string.chart_settings_type_line, composerStartRestartGroup, 0), selectedChartType != ChartSettingsBottomSheetComposable2.LINE, (BentoBaseRowState.Text) null, false, false, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2040, (DefaultConstructorMarker) null);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    int i8 = i7 & 896;
                    z2 = i8 != 256;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.equitydetail.ui.chartsettings.ChartSettingsBottomSheetComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ChartSettingsBottomSheetComposable.m1970x6f00bfde(onChartTypeSelected);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    int i9 = BentoSelectionRowState.$stable;
                    BentoSelectionRow2.BentoSelectionRow(null, bentoSelectionRowState, (Function0) objRememberedValue, composerStartRestartGroup, i9 << 3, 1);
                    String strStringResource2 = StringResources_androidKt.stringResource(C15314R.string.chart_settings_type_candlestick, composerStartRestartGroup, 0);
                    if (selectedChartType != ChartSettingsBottomSheetComposable2.CANDLESTICK) {
                        i5 = 5004770;
                        z3 = true;
                    } else {
                        i5 = 5004770;
                        z3 = false;
                    }
                    BentoSelectionRowState bentoSelectionRowState2 = new BentoSelectionRowState(type2, strStringResource2, z3, (BentoBaseRowState.Text) null, false, false, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2040, (DefaultConstructorMarker) null);
                    composerStartRestartGroup.startReplaceGroup(i5);
                    z4 = i8 != 256;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!z4 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equitydetail.ui.chartsettings.ChartSettingsBottomSheetComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ChartSettingsBottomSheetComposable.m1971x5793a21e(onChartTypeSelected);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoSelectionRow2.BentoSelectionRow(null, bentoSelectionRowState2, (Function0) objRememberedValue2, composerStartRestartGroup, i9 << 3, 1);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21591getLargeD9Ej5fM()), composerStartRestartGroup, 0);
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C15314R.string.chart_settings_more_options_label_adt, composerStartRestartGroup, 0), com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, 0.0f, composerStartRestartGroup, 6, 1), null, null, companion4.getBold(), null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 24576, 0, 16364);
                    BentoToggleRow3.BentoToggleRow(new BentoToggleRowState(null, StringResources_androidKt.stringResource(C15314R.string.chart_settings_extended_hours_label_adt, composerStartRestartGroup, 0), null, false, z, null, null, false, false, false, 493, null), onShowAllHoursToggled, null, composerStartRestartGroup, BentoToggleRowState.$stable | ((i7 >> 6) & 112), 4);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C15314R.string.chart_settings_education_tour_label, composerStartRestartGroup, 0), com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, 0.0f, composerStartRestartGroup, 6, 1), null, null, companion4.getBold(), null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 24576, 0, 16364);
                    String strStringResource3 = StringResources_androidKt.stringResource(C15314R.string.chart_settings_type_tour_line_charts, composerStartRestartGroup, 0);
                    BentoBaseRowState.Meta.CallToAction callToAction = new BentoBaseRowState.Meta.CallToAction(StringResources_androidKt.stringResource(C15314R.string.chart_settings_type_tour_display_link, composerStartRestartGroup, 0), null, 2, null);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    int i10 = i7 & 57344;
                    z5 = i10 != 16384;
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!z5 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.equitydetail.ui.chartsettings.ChartSettingsBottomSheetComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ChartSettingsBottomSheetComposable.m1972x4026845e(onLaunchEducationTour);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    int i11 = BentoBaseRowState.Meta.CallToAction.$stable;
                    function1 = onLaunchEducationTour;
                    BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, strStringResource3, null, null, callToAction, null, false, false, false, 0L, (Function0) objRememberedValue3, composerStartRestartGroup, (i11 << 15) | 12582912, 0, 1883);
                    String strStringResource4 = StringResources_androidKt.stringResource(C15314R.string.chart_settings_type_tour_candlestick_charts, composerStartRestartGroup, 0);
                    BentoBaseRowState.Meta.CallToAction callToAction2 = new BentoBaseRowState.Meta.CallToAction(StringResources_androidKt.stringResource(C15314R.string.chart_settings_type_tour_display_link, composerStartRestartGroup, 0), null, 2, null);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    z6 = i10 != 16384;
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (!z6 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.android.equitydetail.ui.chartsettings.ChartSettingsBottomSheetComposableKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ChartSettingsBottomSheetComposable.m1973x28b9669e(function1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, strStringResource4, null, null, callToAction2, null, false, false, false, 0L, (Function0) objRememberedValue4, composerStartRestartGroup, (i11 << 15) | 12582912, 0, 1883);
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
                    final Function1<? super String, Unit> function12 = function1;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.chartsettings.ChartSettingsBottomSheetComposableKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ChartSettingsBottomSheetComposable.ChartSettingsBottomSheetComposable$lambda$10(selectedChartType, z, onChartTypeSelected, onShowAllHoursToggled, function12, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            modifier2 = modifier;
            if ((74899 & i3) == 74898) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default3, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), 5, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
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
                    int i72 = i3;
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C15314R.string.chart_settings_bottom_sheet_label, composerStartRestartGroup, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8190);
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
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
                        String strStringResource5 = StringResources_androidKt.stringResource(C15314R.string.chart_settings_type_label_adt, composerStartRestartGroup, 0);
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion32, 0.0f, composerStartRestartGroup, 6, 1);
                        FontWeight.Companion companion42 = FontWeight.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(strStringResource5, modifierM21623defaultHorizontalPaddingrAjV9yQ2, null, null, companion42.getBold(), null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 24576, 0, 16364);
                        BentoSelectionRowState.Type type22 = BentoSelectionRowState.Type.RadioButton;
                        BentoSelectionRowState bentoSelectionRowState3 = new BentoSelectionRowState(type22, StringResources_androidKt.stringResource(C15314R.string.chart_settings_type_line, composerStartRestartGroup, 0), selectedChartType != ChartSettingsBottomSheetComposable2.LINE, (BentoBaseRowState.Text) null, false, false, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2040, (DefaultConstructorMarker) null);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        int i82 = i72 & 896;
                        if (i82 != 256) {
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z2) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.equitydetail.ui.chartsettings.ChartSettingsBottomSheetComposableKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ChartSettingsBottomSheetComposable.m1970x6f00bfde(onChartTypeSelected);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceGroup();
                            int i92 = BentoSelectionRowState.$stable;
                            BentoSelectionRow2.BentoSelectionRow(null, bentoSelectionRowState3, (Function0) objRememberedValue, composerStartRestartGroup, i92 << 3, 1);
                            String strStringResource22 = StringResources_androidKt.stringResource(C15314R.string.chart_settings_type_candlestick, composerStartRestartGroup, 0);
                            if (selectedChartType != ChartSettingsBottomSheetComposable2.CANDLESTICK) {
                            }
                            BentoSelectionRowState bentoSelectionRowState22 = new BentoSelectionRowState(type22, strStringResource22, z3, (BentoBaseRowState.Text) null, false, false, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2040, (DefaultConstructorMarker) null);
                            composerStartRestartGroup.startReplaceGroup(i5);
                            if (i82 != 256) {
                            }
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!z4) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equitydetail.ui.chartsettings.ChartSettingsBottomSheetComposableKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return ChartSettingsBottomSheetComposable.m1971x5793a21e(onChartTypeSelected);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                composerStartRestartGroup.endReplaceGroup();
                                BentoSelectionRow2.BentoSelectionRow(null, bentoSelectionRowState22, (Function0) objRememberedValue2, composerStartRestartGroup, i92 << 3, 1);
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21591getLargeD9Ej5fM()), composerStartRestartGroup, 0);
                                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C15314R.string.chart_settings_more_options_label_adt, composerStartRestartGroup, 0), com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion32, 0.0f, composerStartRestartGroup, 6, 1), null, null, companion42.getBold(), null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 24576, 0, 16364);
                                BentoToggleRow3.BentoToggleRow(new BentoToggleRowState(null, StringResources_androidKt.stringResource(C15314R.string.chart_settings_extended_hours_label_adt, composerStartRestartGroup, 0), null, false, z, null, null, false, false, false, 493, null), onShowAllHoursToggled, null, composerStartRestartGroup, BentoToggleRowState.$stable | ((i72 >> 6) & 112), 4);
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C15314R.string.chart_settings_education_tour_label, composerStartRestartGroup, 0), com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion32, 0.0f, composerStartRestartGroup, 6, 1), null, null, companion42.getBold(), null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 24576, 0, 16364);
                                String strStringResource32 = StringResources_androidKt.stringResource(C15314R.string.chart_settings_type_tour_line_charts, composerStartRestartGroup, 0);
                                BentoBaseRowState.Meta.CallToAction callToAction3 = new BentoBaseRowState.Meta.CallToAction(StringResources_androidKt.stringResource(C15314R.string.chart_settings_type_tour_display_link, composerStartRestartGroup, 0), null, 2, null);
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                int i102 = i72 & 57344;
                                if (i102 != 16384) {
                                }
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (!z5) {
                                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.equitydetail.ui.chartsettings.ChartSettingsBottomSheetComposableKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return ChartSettingsBottomSheetComposable.m1972x4026845e(onLaunchEducationTour);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                    composerStartRestartGroup.endReplaceGroup();
                                    int i112 = BentoBaseRowState.Meta.CallToAction.$stable;
                                    function1 = onLaunchEducationTour;
                                    BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, strStringResource32, null, null, callToAction3, null, false, false, false, 0L, (Function0) objRememberedValue3, composerStartRestartGroup, (i112 << 15) | 12582912, 0, 1883);
                                    String strStringResource42 = StringResources_androidKt.stringResource(C15314R.string.chart_settings_type_tour_candlestick_charts, composerStartRestartGroup, 0);
                                    BentoBaseRowState.Meta.CallToAction callToAction22 = new BentoBaseRowState.Meta.CallToAction(StringResources_androidKt.stringResource(C15314R.string.chart_settings_type_tour_display_link, composerStartRestartGroup, 0), null, 2, null);
                                    composerStartRestartGroup.startReplaceGroup(5004770);
                                    if (i102 != 16384) {
                                    }
                                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                    if (!z6) {
                                        objRememberedValue4 = new Function0() { // from class: com.robinhood.android.equitydetail.ui.chartsettings.ChartSettingsBottomSheetComposableKt$$ExternalSyntheticLambda4
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return ChartSettingsBottomSheetComposable.m1973x28b9669e(function1);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                        composerStartRestartGroup.endReplaceGroup();
                                        BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, strStringResource42, null, null, callToAction22, null, false, false, false, 0L, (Function0) objRememberedValue4, composerStartRestartGroup, (i112 << 15) | 12582912, 0, 1883);
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
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ChartSettingsBottomSheetComposable$lambda$9$lambda$8$lambda$1$lambda$0 */
    public static final Unit m1970x6f00bfde(Function1 function1) {
        function1.invoke(ChartSettingsBottomSheetComposable2.LINE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ChartSettingsBottomSheetComposable$lambda$9$lambda$8$lambda$3$lambda$2 */
    public static final Unit m1971x5793a21e(Function1 function1) {
        function1.invoke(ChartSettingsBottomSheetComposable2.CANDLESTICK);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ChartSettingsBottomSheetComposable$lambda$9$lambda$8$lambda$5$lambda$4 */
    public static final Unit m1972x4026845e(Function1 function1) {
        function1.invoke(EducationTourScreenNames.STOCK_CHART_SETTINGS_PAGE_SCREEN);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ChartSettingsBottomSheetComposable$lambda$9$lambda$8$lambda$7$lambda$6 */
    public static final Unit m1973x28b9669e(Function1 function1) {
        function1.invoke(EducationTourScreenNames.STOCK_CHART_SETTINGS_CANDLESTICK_PAGE_SCREEN);
        return Unit.INSTANCE;
    }

    private static final void PreviewChartSettingsBottomSheetComposable(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1109223579);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1109223579, i, -1, "com.robinhood.android.equitydetail.ui.chartsettings.PreviewChartSettingsBottomSheetComposable (ChartSettingsBottomSheetComposable.kt:132)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ChartSettingsBottomSheetComposable3.INSTANCE.getLambda$1142347747$feature_equity_detail_externalDebug(), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.chartsettings.ChartSettingsBottomSheetComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChartSettingsBottomSheetComposable.PreviewChartSettingsBottomSheetComposable$lambda$11(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
