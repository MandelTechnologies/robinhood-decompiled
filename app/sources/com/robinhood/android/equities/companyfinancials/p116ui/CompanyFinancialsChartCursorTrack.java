package com.robinhood.android.equities.companyfinancials.p116ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Intrinsic3;
import androidx.compose.foundation.layout.Intrinsic4;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material.CardKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.charts.cursor.ChartLabelTrack;
import com.robinhood.android.charts.model.Point;
import com.robinhood.android.charts.segmented.UtilKt;
import com.robinhood.android.sdui.chartgroup.ScrubState;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import rh_server_driven_ui.p531v1.ChartAxisDto;
import rh_server_driven_ui.p531v1.ChartDto;
import rh_server_driven_ui.p531v1.ChartGroupDto;
import rh_server_driven_ui.p531v1.ChartLegendItemDto;
import rh_server_driven_ui.p531v1.ChartLegendItemListDto;
import rh_server_driven_ui.p531v1.DisplayTextDto;
import rh_server_driven_ui.p531v1.TextStyleDto;

/* compiled from: CompanyFinancialsChartCursorTrack.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a)\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"CompanyFinancialsChartCursor", "", "chartGroup", "Lrh_server_driven_ui/v1/ChartGroupDto;", "xPosition", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lrh_server_driven_ui/v1/ChartGroupDto;FLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CompanyFinancialsChartCursorTrack", "scrubState", "Lcom/robinhood/android/sdui/chartgroup/ScrubState;", "(Lrh_server_driven_ui/v1/ChartGroupDto;Lcom/robinhood/android/sdui/chartgroup/ScrubState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-company-financials_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsChartCursorTrackKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class CompanyFinancialsChartCursorTrack {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompanyFinancialsChartCursor$lambda$7(ChartGroupDto chartGroupDto, float f, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CompanyFinancialsChartCursor(chartGroupDto, f, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompanyFinancialsChartCursorTrack$lambda$8(ChartGroupDto chartGroupDto, ScrubState scrubState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CompanyFinancialsChartCursorTrack(chartGroupDto, scrubState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CompanyFinancialsChartCursor(final ChartGroupDto chartGroup, final float f, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean zChanged;
        Object objRememberedValue;
        boolean zChanged2;
        Object objRememberedValue2;
        ChartAxisDto x_axis;
        Map<String, DisplayTextDto> scrubbing_labels;
        Object objRememberedValue3;
        Composer.Companion companion;
        Tuples2 tuples2;
        Object objRememberedValue4;
        BentoTheme bentoTheme;
        int i4;
        long jM21372getBg20d7_KjU;
        final Modifier modifier3;
        ChartLegendItemListDto chartLegendItemListDto;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(chartGroup, "chartGroup");
        Composer composerStartRestartGroup = composer.startRestartGroup(71608168);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(chartGroup) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(71608168, i3, -1, "com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsChartCursor (CompanyFinancialsChartCursorTrack.kt:39)");
                }
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(chartGroup);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = CompanyFinancialsUtils.parseFloatKeys(((ChartDto) CollectionsKt.first((List) chartGroup.getCharts())).getLegend_data().entrySet());
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                ImmutableList immutableList = (ImmutableList) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged2 = composerStartRestartGroup.changed(chartGroup);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    x_axis = chartGroup.getX_axis();
                    if (x_axis != null || (scrubbing_labels = x_axis.getScrubbing_labels()) == null || (objPersistentListOf = CompanyFinancialsUtils.parseFloatKeys(scrubbing_labels.entrySet())) == null) {
                        Object objPersistentListOf = extensions2.persistentListOf();
                    }
                    objRememberedValue2 = objPersistentListOf;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                ImmutableList immutableList2 = (ImmutableList) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsChartCursorTrackKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Float.valueOf(CompanyFinancialsChartCursorTrack.CompanyFinancialsChartCursor$lambda$4$lambda$3((Tuples2) obj));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                tuples2 = (Tuples2) UtilKt.getClosestItemByValue(immutableList, f, (Function1) objRememberedValue3);
                if (tuples2 != null || (chartLegendItemListDto = (ChartLegendItemListDto) tuples2.getSecond()) == null || (listPersistentListOf = chartLegendItemListDto.getItems()) == null) {
                    final List<ChartLegendItemDto> listPersistentListOf = extensions2.persistentListOf();
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Function1() { // from class: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsChartCursorTrackKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Float.valueOf(CompanyFinancialsChartCursorTrack.CompanyFinancialsChartCursor$lambda$6$lambda$5((Tuples2) obj));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                Tuples2 tuples22 = (Tuples2) UtilKt.getClosestItemByValue(immutableList2, f, (Function1) objRememberedValue4);
                final DisplayTextDto displayTextDto = tuples22 == null ? (DisplayTextDto) tuples22.getSecond() : null;
                bentoTheme = BentoTheme.INSTANCE;
                i4 = BentoTheme.$stable;
                if (bentoTheme.getColors(composerStartRestartGroup, i4).getIsDay()) {
                    composerStartRestartGroup.startReplaceGroup(96002699);
                    jM21372getBg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i4).m21372getBg20d7_KjU();
                } else {
                    composerStartRestartGroup.startReplaceGroup(96001866);
                    jM21372getBg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i4).m21371getBg0d7_KjU();
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                CardKt.m5548CardFjzlyU(modifier5, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8)), jM21372getBg20d7_KjU, 0L, null, C2002Dp.m7995constructorimpl(2), ComposableLambda3.rememberComposableLambda(764709925, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsChartCursorTrackKt.CompanyFinancialsChartCursor.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        Modifier.Companion companion2;
                        BentoTheme bentoTheme2;
                        int i7;
                        TextStyle textStyle;
                        List<ChartLegendItemDto> list;
                        Arrangement arrangement;
                        Composer composer3 = composer2;
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(764709925, i6, -1, "com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsChartCursor.<anonymous> (CompanyFinancialsChartCursorTrack.kt:59)");
                        }
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        Modifier modifierM5176widthInVpY3zN4$default = SizeKt.m5176widthInVpY3zN4$default(Intrinsic3.width(PaddingKt.m5143paddingVpY3zN4(companion3, C2002Dp.m7995constructorimpl(bentoTheme3.getSpacing(composer3, i8).m21593getSmallD9Ej5fM() + bentoTheme3.getSpacing(composer3, i8).m21595getXsmallD9Ej5fM()), bentoTheme3.getSpacing(composer3, i8).m21593getSmallD9Ej5fM()), Intrinsic4.Min), C2002Dp.m7995constructorimpl(200), 0.0f, 2, null);
                        DisplayTextDto displayTextDto2 = displayTextDto;
                        List<ChartLegendItemDto> list2 = listPersistentListOf;
                        Arrangement arrangement2 = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement2.getTop();
                        Alignment.Companion companion4 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion4.getStart(), composer3, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5176widthInVpY3zN4$default);
                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion5.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        composer3.startReplaceGroup(757975347);
                        if (displayTextDto2 != null) {
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement2.getStart(), companion4.getTop(), composer3, 0);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, companion3);
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
                            String value = displayTextDto2.getValue();
                            Color colorM6701boximpl = Color.m6701boximpl(SduiColors2.m18897toComposeColorDefaultediJQMabo(displayTextDto2.getColor(), 0L, composer3, 0, 1));
                            TextStyleDto text_style = displayTextDto2.getText_style();
                            FontWeight fontWeight = text_style != null ? com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt.getFontWeight(text_style) : null;
                            TextStyleDto text_style2 = displayTextDto2.getText_style();
                            composer3.startReplaceGroup(1914691648);
                            TextStyle composeTextStyle = text_style2 == null ? null : com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt.getComposeTextStyle(text_style2, composer3, 0);
                            composer3.endReplaceGroup();
                            composer3.startReplaceGroup(1914690842);
                            if (composeTextStyle == null) {
                                composeTextStyle = bentoTheme3.getTypography(composer3, i8).getTextS();
                            }
                            composer3.endReplaceGroup();
                            textStyle = null;
                            companion2 = companion3;
                            list = list2;
                            i7 = i8;
                            arrangement = arrangement2;
                            bentoTheme2 = bentoTheme3;
                            BentoText2.m20747BentoText38GnDrw(value, null, colorM6701boximpl, null, fontWeight, null, null, 0, false, 0, 0, null, 0, composeTextStyle, composer2, 0, 0, 8170);
                            composer3 = composer2;
                            composer3.endNode();
                        } else {
                            companion2 = companion3;
                            bentoTheme2 = bentoTheme3;
                            i7 = i8;
                            textStyle = null;
                            list = list2;
                            arrangement = arrangement2;
                        }
                        composer3.endReplaceGroup();
                        int i9 = i7;
                        int i10 = 0;
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(bentoTheme2.getSpacing(composer3, i9).m21597getXxsmallD9Ej5fM() + bentoTheme2.getSpacing(composer3, i9).m21595getXsmallD9Ej5fM())), companion4.getStart(), composer3, 0);
                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, companion2);
                        Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor3);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion5.getSetModifier());
                        composer3.startReplaceGroup(-181498869);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ChartLegendItemDto chartLegendItemDto = (ChartLegendItemDto) it.next();
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Modifier.Companion companion6 = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                            int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer3, i10);
                            CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer3, companion6);
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
                            Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyRowMeasurePolicy2, companion7.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion7.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion7.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion7.getSetModifier());
                            Row6 row62 = Row6.INSTANCE;
                            CompanyFinancialsUtils.m13534LegendColorIndicatorKTwxG1Y(SduiColors2.m18897toComposeColorDefaultediJQMabo(chartLegendItemDto.getColor(), 0L, composer3, 0, 1), Intrinsics.areEqual(chartLegendItemDto.getId(), "net_margin"), null, composer2, 0, 4);
                            String title = chartLegendItemDto.getTitle();
                            BentoTheme bentoTheme4 = BentoTheme.INSTANCE;
                            int i11 = BentoTheme.$stable;
                            int i12 = i10;
                            Iterator it2 = it;
                            BentoText2.m20747BentoText38GnDrw(title, PaddingKt.m5146paddingqDBjuR0$default(Row5.weight$default(row62, companion6, 1.0f, false, 2, null), bentoTheme4.getSpacing(composer2, i11).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), Color.m6701boximpl(SduiColors2.m18897toComposeColorDefaultediJQMabo(chartLegendItemDto.getValue_color(), 0L, composer2, 0, 1)), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme4.getTypography(composer2, i11).getTextS(), composer2, 0, 0, 8184);
                            DisplayTextDto value_suffix = chartLegendItemDto.getValue_suffix();
                            composer2.startReplaceGroup(-948240634);
                            if (value_suffix != null) {
                                String value2 = value_suffix.getValue();
                                TextStyleDto text_style3 = value_suffix.getText_style();
                                composer2.startReplaceGroup(-948236179);
                                TextStyle composeTextStyle2 = text_style3 == null ? textStyle : com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt.getComposeTextStyle(text_style3, composer2, i12);
                                composer2.endReplaceGroup();
                                composer2.startReplaceGroup(-948236613);
                                if (composeTextStyle2 == null) {
                                    composeTextStyle2 = bentoTheme4.getTypography(composer2, i11).getTextS();
                                }
                                composer2.endReplaceGroup();
                                BentoText2.m20747BentoText38GnDrw(value2, null, Color.m6701boximpl(SduiColors2.m18897toComposeColorDefaultediJQMabo(value_suffix.getColor(), 0L, composer2, 0, 1)), null, null, null, null, 0, false, 0, 0, null, 0, composeTextStyle2, composer2, 0, 0, 8186);
                                Unit unit = Unit.INSTANCE;
                            }
                            composer2.endReplaceGroup();
                            composer2.endNode();
                            composer3 = composer2;
                            i10 = i12;
                            it = it2;
                        }
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 14) | 1769472, 24);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsChartCursorTrackKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CompanyFinancialsChartCursorTrack.CompanyFinancialsChartCursor$lambda$7(chartGroup, f, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChanged = composerStartRestartGroup.changed(chartGroup);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue = CompanyFinancialsUtils.parseFloatKeys(((ChartDto) CollectionsKt.first((List) chartGroup.getCharts())).getLegend_data().entrySet());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                ImmutableList immutableList3 = (ImmutableList) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged2 = composerStartRestartGroup.changed(chartGroup);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2) {
                    x_axis = chartGroup.getX_axis();
                    if (x_axis != null) {
                        Object objPersistentListOf2 = extensions2.persistentListOf();
                        objRememberedValue2 = objPersistentListOf2;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        ImmutableList immutableList22 = (ImmutableList) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue3 == companion.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        tuples2 = (Tuples2) UtilKt.getClosestItemByValue(immutableList3, f, (Function1) objRememberedValue3);
                        if (tuples2 != null) {
                            final List<ChartLegendItemDto> listPersistentListOf2 = extensions2.persistentListOf();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue4 == companion.getEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Tuples2 tuples222 = (Tuples2) UtilKt.getClosestItemByValue(immutableList22, f, (Function1) objRememberedValue4);
                            if (tuples222 == null) {
                            }
                            bentoTheme = BentoTheme.INSTANCE;
                            i4 = BentoTheme.$stable;
                            if (bentoTheme.getColors(composerStartRestartGroup, i4).getIsDay()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifier52 = modifier4;
                            CardKt.m5548CardFjzlyU(modifier52, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8)), jM21372getBg20d7_KjU, 0L, null, C2002Dp.m7995constructorimpl(2), ComposableLambda3.rememberComposableLambda(764709925, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsChartCursorTrackKt.CompanyFinancialsChartCursor.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i6) {
                                    Modifier.Companion companion2;
                                    BentoTheme bentoTheme2;
                                    int i7;
                                    TextStyle textStyle;
                                    List<ChartLegendItemDto> list;
                                    Arrangement arrangement;
                                    Composer composer3 = composer2;
                                    if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(764709925, i6, -1, "com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsChartCursor.<anonymous> (CompanyFinancialsChartCursorTrack.kt:59)");
                                    }
                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                    BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                                    int i8 = BentoTheme.$stable;
                                    Modifier modifierM5176widthInVpY3zN4$default = SizeKt.m5176widthInVpY3zN4$default(Intrinsic3.width(PaddingKt.m5143paddingVpY3zN4(companion3, C2002Dp.m7995constructorimpl(bentoTheme3.getSpacing(composer3, i8).m21593getSmallD9Ej5fM() + bentoTheme3.getSpacing(composer3, i8).m21595getXsmallD9Ej5fM()), bentoTheme3.getSpacing(composer3, i8).m21593getSmallD9Ej5fM()), Intrinsic4.Min), C2002Dp.m7995constructorimpl(200), 0.0f, 2, null);
                                    DisplayTextDto displayTextDto2 = displayTextDto;
                                    List<ChartLegendItemDto> list2 = listPersistentListOf2;
                                    Arrangement arrangement2 = Arrangement.INSTANCE;
                                    Arrangement.Vertical top = arrangement2.getTop();
                                    Alignment.Companion companion4 = Alignment.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion4.getStart(), composer3, 0);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5176widthInVpY3zN4$default);
                                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion5.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    composer3.startReplaceGroup(757975347);
                                    if (displayTextDto2 != null) {
                                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement2.getStart(), companion4.getTop(), composer3, 0);
                                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, companion3);
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
                                        String value = displayTextDto2.getValue();
                                        Color colorM6701boximpl = Color.m6701boximpl(SduiColors2.m18897toComposeColorDefaultediJQMabo(displayTextDto2.getColor(), 0L, composer3, 0, 1));
                                        TextStyleDto text_style = displayTextDto2.getText_style();
                                        FontWeight fontWeight = text_style != null ? com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt.getFontWeight(text_style) : null;
                                        TextStyleDto text_style2 = displayTextDto2.getText_style();
                                        composer3.startReplaceGroup(1914691648);
                                        TextStyle composeTextStyle = text_style2 == null ? null : com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt.getComposeTextStyle(text_style2, composer3, 0);
                                        composer3.endReplaceGroup();
                                        composer3.startReplaceGroup(1914690842);
                                        if (composeTextStyle == null) {
                                            composeTextStyle = bentoTheme3.getTypography(composer3, i8).getTextS();
                                        }
                                        composer3.endReplaceGroup();
                                        textStyle = null;
                                        companion2 = companion3;
                                        list = list2;
                                        i7 = i8;
                                        arrangement = arrangement2;
                                        bentoTheme2 = bentoTheme3;
                                        BentoText2.m20747BentoText38GnDrw(value, null, colorM6701boximpl, null, fontWeight, null, null, 0, false, 0, 0, null, 0, composeTextStyle, composer2, 0, 0, 8170);
                                        composer3 = composer2;
                                        composer3.endNode();
                                    } else {
                                        companion2 = companion3;
                                        bentoTheme2 = bentoTheme3;
                                        i7 = i8;
                                        textStyle = null;
                                        list = list2;
                                        arrangement = arrangement2;
                                    }
                                    composer3.endReplaceGroup();
                                    int i9 = i7;
                                    int i10 = 0;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(bentoTheme2.getSpacing(composer3, i9).m21597getXxsmallD9Ej5fM() + bentoTheme2.getSpacing(composer3, i9).m21595getXsmallD9Ej5fM())), companion4.getStart(), composer3, 0);
                                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, companion2);
                                    Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor3);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer3);
                                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion5.getSetModifier());
                                    composer3.startReplaceGroup(-181498869);
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        ChartLegendItemDto chartLegendItemDto = (ChartLegendItemDto) it.next();
                                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                        Modifier.Companion companion6 = Modifier.INSTANCE;
                                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                                        int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer3, i10);
                                        CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer3, companion6);
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
                                        Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyRowMeasurePolicy2, companion7.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion7.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion7.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                            composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                            composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion7.getSetModifier());
                                        Row6 row62 = Row6.INSTANCE;
                                        CompanyFinancialsUtils.m13534LegendColorIndicatorKTwxG1Y(SduiColors2.m18897toComposeColorDefaultediJQMabo(chartLegendItemDto.getColor(), 0L, composer3, 0, 1), Intrinsics.areEqual(chartLegendItemDto.getId(), "net_margin"), null, composer2, 0, 4);
                                        String title = chartLegendItemDto.getTitle();
                                        BentoTheme bentoTheme4 = BentoTheme.INSTANCE;
                                        int i11 = BentoTheme.$stable;
                                        int i12 = i10;
                                        Iterator it2 = it;
                                        BentoText2.m20747BentoText38GnDrw(title, PaddingKt.m5146paddingqDBjuR0$default(Row5.weight$default(row62, companion6, 1.0f, false, 2, null), bentoTheme4.getSpacing(composer2, i11).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), Color.m6701boximpl(SduiColors2.m18897toComposeColorDefaultediJQMabo(chartLegendItemDto.getValue_color(), 0L, composer2, 0, 1)), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme4.getTypography(composer2, i11).getTextS(), composer2, 0, 0, 8184);
                                        DisplayTextDto value_suffix = chartLegendItemDto.getValue_suffix();
                                        composer2.startReplaceGroup(-948240634);
                                        if (value_suffix != null) {
                                            String value2 = value_suffix.getValue();
                                            TextStyleDto text_style3 = value_suffix.getText_style();
                                            composer2.startReplaceGroup(-948236179);
                                            TextStyle composeTextStyle2 = text_style3 == null ? textStyle : com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt.getComposeTextStyle(text_style3, composer2, i12);
                                            composer2.endReplaceGroup();
                                            composer2.startReplaceGroup(-948236613);
                                            if (composeTextStyle2 == null) {
                                                composeTextStyle2 = bentoTheme4.getTypography(composer2, i11).getTextS();
                                            }
                                            composer2.endReplaceGroup();
                                            BentoText2.m20747BentoText38GnDrw(value2, null, Color.m6701boximpl(SduiColors2.m18897toComposeColorDefaultediJQMabo(value_suffix.getColor(), 0L, composer2, 0, 1)), null, null, null, null, 0, false, 0, 0, null, 0, composeTextStyle2, composer2, 0, 0, 8186);
                                            Unit unit = Unit.INSTANCE;
                                        }
                                        composer2.endReplaceGroup();
                                        composer2.endNode();
                                        composer3 = composer2;
                                        i10 = i12;
                                        it = it2;
                                    }
                                    composer2.endReplaceGroup();
                                    composer2.endNode();
                                    composer2.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 14) | 1769472, 24);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier52;
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CompanyFinancialsChartCursor$lambda$4$lambda$3(Tuples2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ((Number) it.getFirst()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CompanyFinancialsChartCursor$lambda$6$lambda$5(Tuples2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ((Number) it.getFirst()).floatValue();
    }

    public static final void CompanyFinancialsChartCursorTrack(final ChartGroupDto chartGroup, final ScrubState scrubState, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Point point;
        Intrinsics.checkNotNullParameter(chartGroup, "chartGroup");
        Composer composerStartRestartGroup = composer.startRestartGroup(799315919);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(chartGroup) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(scrubState) : composerStartRestartGroup.changedInstance(scrubState) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(799315919, i3, -1, "com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsChartCursorTrack (CompanyFinancialsChartCursorTrack.kt:119)");
            }
            ChartLabelTrack.ChartCursorTrack((scrubState == null || (point = scrubState.getPoint()) == null) ? null : Float.valueOf(point.getX()), modifier3, scrubState != null ? scrubState.getChartStartXOffset() : 0.0f, ComposableLambda3.rememberComposableLambda(-2109220664, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsChartCursorTrackKt.CompanyFinancialsChartCursorTrack.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2109220664, i5, -1, "com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsChartCursorTrack.<anonymous> (CompanyFinancialsChartCursorTrack.kt:125)");
                    }
                    ScrubState scrubState2 = scrubState;
                    if (scrubState2 != null) {
                        ChartGroupDto chartGroupDto = chartGroup;
                        Float snapX = scrubState2.getSnapX();
                        CompanyFinancialsChartCursorTrack.CompanyFinancialsChartCursor(chartGroupDto, snapX != null ? snapX.floatValue() : scrubState2.getPoint().getX(), null, composer2, 0, 4);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 112) | 3072, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsChartCursorTrackKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CompanyFinancialsChartCursorTrack.CompanyFinancialsChartCursorTrack$lambda$8(chartGroup, scrubState, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
