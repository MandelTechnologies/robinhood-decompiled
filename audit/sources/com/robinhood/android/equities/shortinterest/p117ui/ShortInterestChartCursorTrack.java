package com.robinhood.android.equities.shortinterest.p117ui;

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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import rh_server_driven_ui.p531v1.ChartGroupDto;
import rh_server_driven_ui.p531v1.DisplayTextDto;
import rh_server_driven_ui.p531v1.TextStyleDto;

/* compiled from: ShortInterestChartCursorTrack.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a)\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"ShortInterestChartCursor", "", "chartGroup", "Lrh_server_driven_ui/v1/ChartGroupDto;", "xPosition", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lrh_server_driven_ui/v1/ChartGroupDto;FLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ShortInterestChartCursorTrack", "scrubState", "Lcom/robinhood/android/sdui/chartgroup/ScrubState;", "(Lrh_server_driven_ui/v1/ChartGroupDto;Lcom/robinhood/android/sdui/chartgroup/ScrubState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-short-interest_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.shortinterest.ui.ShortInterestChartCursorTrackKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class ShortInterestChartCursorTrack {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShortInterestChartCursor$lambda$4(ChartGroupDto chartGroupDto, float f, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ShortInterestChartCursor(chartGroupDto, f, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShortInterestChartCursorTrack$lambda$5(ChartGroupDto chartGroupDto, ScrubState scrubState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ShortInterestChartCursorTrack(chartGroupDto, scrubState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ShortInterestChartCursor(final ChartGroupDto chartGroup, final float f, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean zChanged;
        Object objRememberedValue;
        ChartAxisDto x_axis;
        Object objRememberedValue2;
        BentoTheme bentoTheme;
        int i4;
        long jM21372getBg20d7_KjU;
        final Modifier modifier3;
        ChartAxisDto.ChartAxisCursorDataDto chartAxisCursorDataDto;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(chartGroup, "chartGroup");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2088730773);
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
                    ComposerKt.traceEventStart(-2088730773, i3, -1, "com.robinhood.android.equities.shortinterest.ui.ShortInterestChartCursor (ShortInterestChartCursorTrack.kt:38)");
                }
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(chartGroup);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    x_axis = chartGroup.getX_axis();
                    if (x_axis != null || (objPersistentListOf = ShortInterestUtils.parseFloatKeys(x_axis.getCursor_data().entrySet())) == null) {
                        Object objPersistentListOf = extensions2.persistentListOf();
                    }
                    objRememberedValue = objPersistentListOf;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                ImmutableList immutableList = (ImmutableList) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equities.shortinterest.ui.ShortInterestChartCursorTrackKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Float.valueOf(ShortInterestChartCursorTrack.ShortInterestChartCursor$lambda$3$lambda$2((Tuples2) obj));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Tuples2 tuples2 = (Tuples2) UtilKt.getClosestItemByValue(immutableList, f, (Function1) objRememberedValue2);
                final ChartAxisDto.ChartAxisCursorDataDto.ConcreteDto concrete = (tuples2 != null || (chartAxisCursorDataDto = (ChartAxisDto.ChartAxisCursorDataDto) tuples2.getSecond()) == null) ? null : chartAxisCursorDataDto.getConcrete();
                bentoTheme = BentoTheme.INSTANCE;
                i4 = BentoTheme.$stable;
                if (bentoTheme.getColors(composerStartRestartGroup, i4).getIsDay()) {
                    composerStartRestartGroup.startReplaceGroup(-1520525074);
                    jM21372getBg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i4).m21372getBg20d7_KjU();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1520525907);
                    jM21372getBg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i4).m21371getBg0d7_KjU();
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                CardKt.m5548CardFjzlyU(modifier5, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8)), jM21372getBg20d7_KjU, 0L, null, C2002Dp.m7995constructorimpl(2), ComposableLambda3.rememberComposableLambda(2111559592, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.shortinterest.ui.ShortInterestChartCursorTrackKt.ShortInterestChartCursor.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        String value;
                        TextStyleDto text_style;
                        String value2;
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2111559592, i6, -1, "com.robinhood.android.equities.shortinterest.ui.ShortInterestChartCursor.<anonymous> (ShortInterestChartCursorTrack.kt:53)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        Modifier modifierM5176widthInVpY3zN4$default = SizeKt.m5176widthInVpY3zN4$default(Intrinsic3.width(PaddingKt.m5143paddingVpY3zN4(companion, C2002Dp.m7995constructorimpl(bentoTheme2.getSpacing(composer2, i7).m21593getSmallD9Ej5fM() + bentoTheme2.getSpacing(composer2, i7).m21595getXsmallD9Ej5fM()), bentoTheme2.getSpacing(composer2, i7).m21593getSmallD9Ej5fM()), Intrinsic4.Min), C2002Dp.m7995constructorimpl(150), 0.0f, 2, null);
                        ChartAxisDto.ChartAxisCursorDataDto.ConcreteDto concreteDto = concrete;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer2, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5176widthInVpY3zN4$default);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        composer2.startReplaceGroup(-870800105);
                        if (concreteDto instanceof ChartAxisDto.ChartAxisCursorDataDto.ConcreteDto.AxisCursorData) {
                            ChartAxisDto.ChartAxisCursorDataDto.ConcreteDto.AxisCursorData axisCursorData = (ChartAxisDto.ChartAxisCursorDataDto.ConcreteDto.AxisCursorData) concreteDto;
                            DisplayTextDto title = axisCursorData.getValue().getTitle();
                            List<ChartAxisDto.AxisCursorDataDto> data = axisCursorData.getValue().getData();
                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composer2, i7).m21593getSmallD9Ej5fM(), 7, null);
                            String str = (title == null || (value2 = title.getValue()) == null) ? "" : value2;
                            long jM18897toComposeColorDefaultediJQMabo = SduiColors2.m18897toComposeColorDefaultediJQMabo(title != null ? title.getColor() : null, 0L, composer2, 0, 1);
                            FontWeight fontWeight = (title == null || (text_style = title.getText_style()) == null) ? null : com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt.getFontWeight(text_style);
                            TextStyleDto text_style2 = title != null ? title.getText_style() : null;
                            composer2.startReplaceGroup(-870783518);
                            TextStyle composeTextStyle = text_style2 == null ? null : com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt.getComposeTextStyle(text_style2, composer2, 0);
                            composer2.endReplaceGroup();
                            composer2.startReplaceGroup(-870784076);
                            if (composeTextStyle == null) {
                                composeTextStyle = bentoTheme2.getTypography(composer2, i7).getTextS();
                            }
                            composer2.endReplaceGroup();
                            BentoText2.m20747BentoText38GnDrw(str, modifierM5146paddingqDBjuR0$default, Color.m6701boximpl(jM18897toComposeColorDefaultediJQMabo), null, fontWeight, null, null, 0, false, 0, 0, null, 0, composeTextStyle, composer2, 0, 0, 8168);
                            Composer composer3 = composer2;
                            int i8 = 0;
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(bentoTheme2.getSpacing(composer3, i7).m21597getXxsmallD9Ej5fM() + bentoTheme2.getSpacing(composer3, i7).m21595getXsmallD9Ej5fM())), companion2.getStart(), composer3, 0);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, companion);
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                            composer3.startReplaceGroup(-1660889952);
                            List<ChartAxisDto.AxisCursorDataDto> list = data;
                            ArrayList<DisplayTextDto> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((ChartAxisDto.AxisCursorDataDto) it.next()).getData());
                            }
                            for (DisplayTextDto displayTextDto : arrayList) {
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, i8);
                                CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, companion4);
                                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
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
                                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion5.getSetModifier());
                                Row6 row6 = Row6.INSTANCE;
                                ShortInterestUtils.m13581LegendColorIndicator3JVO9M(SduiColors2.m18897toComposeColorDefaultediJQMabo(displayTextDto != null ? displayTextDto.getColor() : null, 0L, composer3, 0, 1), null, composer2, 0, 2);
                                if (displayTextDto == null || (value = displayTextDto.getValue()) == null) {
                                    value = "";
                                }
                                TextStyleDto text_style3 = displayTextDto != null ? displayTextDto.getText_style() : null;
                                composer2.startReplaceGroup(-926434007);
                                TextStyle composeTextStyle2 = text_style3 == null ? null : com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt.getComposeTextStyle(text_style3, composer2, i8);
                                composer2.endReplaceGroup();
                                composer2.startReplaceGroup(-926434503);
                                if (composeTextStyle2 == null) {
                                    composeTextStyle2 = BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextS();
                                }
                                composer2.endReplaceGroup();
                                BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                                int i9 = BentoTheme.$stable;
                                BentoText2.m20747BentoText38GnDrw(value, PaddingKt.m5146paddingqDBjuR0$default(Row5.weight$default(row6, companion4, 1.0f, false, 2, null), bentoTheme3.getSpacing(composer2, i9).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), Color.m6701boximpl(bentoTheme3.getColors(composer2, i9).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, composeTextStyle2, composer2, 0, 0, 8184);
                                composer2.endNode();
                                composer3 = composer2;
                                i8 = i8;
                            }
                            composer2.endReplaceGroup();
                            composer2.endNode();
                        } else if (!(concreteDto instanceof ChartAxisDto.ChartAxisCursorDataDto.ConcreteDto.ComponentCursorData) && concreteDto != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.endReplaceGroup();
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.shortinterest.ui.ShortInterestChartCursorTrackKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ShortInterestChartCursorTrack.ShortInterestChartCursor$lambda$4(chartGroup, f, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                x_axis = chartGroup.getX_axis();
                if (x_axis != null) {
                    Object objPersistentListOf2 = extensions2.persistentListOf();
                    objRememberedValue = objPersistentListOf2;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    ImmutableList immutableList2 = (ImmutableList) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Tuples2 tuples22 = (Tuples2) UtilKt.getClosestItemByValue(immutableList2, f, (Function1) objRememberedValue2);
                    if (tuples22 != null) {
                        bentoTheme = BentoTheme.INSTANCE;
                        i4 = BentoTheme.$stable;
                        if (bentoTheme.getColors(composerStartRestartGroup, i4).getIsDay()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifier52 = modifier4;
                        CardKt.m5548CardFjzlyU(modifier52, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8)), jM21372getBg20d7_KjU, 0L, null, C2002Dp.m7995constructorimpl(2), ComposableLambda3.rememberComposableLambda(2111559592, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.shortinterest.ui.ShortInterestChartCursorTrackKt.ShortInterestChartCursor.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i6) {
                                String value;
                                TextStyleDto text_style;
                                String value2;
                                if ((i6 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2111559592, i6, -1, "com.robinhood.android.equities.shortinterest.ui.ShortInterestChartCursor.<anonymous> (ShortInterestChartCursorTrack.kt:53)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                int i7 = BentoTheme.$stable;
                                Modifier modifierM5176widthInVpY3zN4$default = SizeKt.m5176widthInVpY3zN4$default(Intrinsic3.width(PaddingKt.m5143paddingVpY3zN4(companion, C2002Dp.m7995constructorimpl(bentoTheme2.getSpacing(composer2, i7).m21593getSmallD9Ej5fM() + bentoTheme2.getSpacing(composer2, i7).m21595getXsmallD9Ej5fM()), bentoTheme2.getSpacing(composer2, i7).m21593getSmallD9Ej5fM()), Intrinsic4.Min), C2002Dp.m7995constructorimpl(150), 0.0f, 2, null);
                                ChartAxisDto.ChartAxisCursorDataDto.ConcreteDto concreteDto = concrete;
                                Arrangement arrangement = Arrangement.INSTANCE;
                                Arrangement.Vertical top = arrangement.getTop();
                                Alignment.Companion companion2 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer2, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5176widthInVpY3zN4$default);
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                if (composer2.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                composer2.startReplaceGroup(-870800105);
                                if (concreteDto instanceof ChartAxisDto.ChartAxisCursorDataDto.ConcreteDto.AxisCursorData) {
                                    ChartAxisDto.ChartAxisCursorDataDto.ConcreteDto.AxisCursorData axisCursorData = (ChartAxisDto.ChartAxisCursorDataDto.ConcreteDto.AxisCursorData) concreteDto;
                                    DisplayTextDto title = axisCursorData.getValue().getTitle();
                                    List<ChartAxisDto.AxisCursorDataDto> data = axisCursorData.getValue().getData();
                                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composer2, i7).m21593getSmallD9Ej5fM(), 7, null);
                                    String str = (title == null || (value2 = title.getValue()) == null) ? "" : value2;
                                    long jM18897toComposeColorDefaultediJQMabo = SduiColors2.m18897toComposeColorDefaultediJQMabo(title != null ? title.getColor() : null, 0L, composer2, 0, 1);
                                    FontWeight fontWeight = (title == null || (text_style = title.getText_style()) == null) ? null : com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt.getFontWeight(text_style);
                                    TextStyleDto text_style2 = title != null ? title.getText_style() : null;
                                    composer2.startReplaceGroup(-870783518);
                                    TextStyle composeTextStyle = text_style2 == null ? null : com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt.getComposeTextStyle(text_style2, composer2, 0);
                                    composer2.endReplaceGroup();
                                    composer2.startReplaceGroup(-870784076);
                                    if (composeTextStyle == null) {
                                        composeTextStyle = bentoTheme2.getTypography(composer2, i7).getTextS();
                                    }
                                    composer2.endReplaceGroup();
                                    BentoText2.m20747BentoText38GnDrw(str, modifierM5146paddingqDBjuR0$default, Color.m6701boximpl(jM18897toComposeColorDefaultediJQMabo), null, fontWeight, null, null, 0, false, 0, 0, null, 0, composeTextStyle, composer2, 0, 0, 8168);
                                    Composer composer3 = composer2;
                                    int i8 = 0;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(bentoTheme2.getSpacing(composer3, i7).m21597getXxsmallD9Ej5fM() + bentoTheme2.getSpacing(composer3, i7).m21595getXsmallD9Ej5fM())), companion2.getStart(), composer3, 0);
                                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, companion);
                                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                                    composer3.startReplaceGroup(-1660889952);
                                    List<ChartAxisDto.AxisCursorDataDto> list = data;
                                    ArrayList<DisplayTextDto> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                    Iterator<T> it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((ChartAxisDto.AxisCursorDataDto) it.next()).getData());
                                    }
                                    for (DisplayTextDto displayTextDto : arrayList) {
                                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                        Modifier.Companion companion4 = Modifier.INSTANCE;
                                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, i8);
                                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, companion4);
                                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
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
                                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion5.getSetModifier());
                                        Row6 row6 = Row6.INSTANCE;
                                        ShortInterestUtils.m13581LegendColorIndicator3JVO9M(SduiColors2.m18897toComposeColorDefaultediJQMabo(displayTextDto != null ? displayTextDto.getColor() : null, 0L, composer3, 0, 1), null, composer2, 0, 2);
                                        if (displayTextDto == null || (value = displayTextDto.getValue()) == null) {
                                            value = "";
                                        }
                                        TextStyleDto text_style3 = displayTextDto != null ? displayTextDto.getText_style() : null;
                                        composer2.startReplaceGroup(-926434007);
                                        TextStyle composeTextStyle2 = text_style3 == null ? null : com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt.getComposeTextStyle(text_style3, composer2, i8);
                                        composer2.endReplaceGroup();
                                        composer2.startReplaceGroup(-926434503);
                                        if (composeTextStyle2 == null) {
                                            composeTextStyle2 = BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextS();
                                        }
                                        composer2.endReplaceGroup();
                                        BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                                        int i9 = BentoTheme.$stable;
                                        BentoText2.m20747BentoText38GnDrw(value, PaddingKt.m5146paddingqDBjuR0$default(Row5.weight$default(row6, companion4, 1.0f, false, 2, null), bentoTheme3.getSpacing(composer2, i9).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), Color.m6701boximpl(bentoTheme3.getColors(composer2, i9).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, composeTextStyle2, composer2, 0, 0, 8184);
                                        composer2.endNode();
                                        composer3 = composer2;
                                        i8 = i8;
                                    }
                                    composer2.endReplaceGroup();
                                    composer2.endNode();
                                } else if (!(concreteDto instanceof ChartAxisDto.ChartAxisCursorDataDto.ConcreteDto.ComponentCursorData) && concreteDto != null) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer2.endReplaceGroup();
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
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ShortInterestChartCursor$lambda$3$lambda$2(Tuples2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ((Number) it.getFirst()).floatValue();
    }

    public static final void ShortInterestChartCursorTrack(final ChartGroupDto chartGroup, final ScrubState scrubState, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Point point;
        Intrinsics.checkNotNullParameter(chartGroup, "chartGroup");
        Composer composerStartRestartGroup = composer.startRestartGroup(1209977234);
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
                ComposerKt.traceEventStart(1209977234, i3, -1, "com.robinhood.android.equities.shortinterest.ui.ShortInterestChartCursorTrack (ShortInterestChartCursorTrack.kt:112)");
            }
            ChartLabelTrack.ChartCursorTrack((scrubState == null || (point = scrubState.getPoint()) == null) ? null : Float.valueOf(point.getX()), modifier3, scrubState != null ? scrubState.getChartStartXOffset() : 0.0f, ComposableLambda3.rememberComposableLambda(-760678389, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.shortinterest.ui.ShortInterestChartCursorTrackKt.ShortInterestChartCursorTrack.1
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
                        ComposerKt.traceEventStart(-760678389, i5, -1, "com.robinhood.android.equities.shortinterest.ui.ShortInterestChartCursorTrack.<anonymous> (ShortInterestChartCursorTrack.kt:118)");
                    }
                    ScrubState scrubState2 = scrubState;
                    if (scrubState2 != null) {
                        ChartGroupDto chartGroupDto = chartGroup;
                        Float snapX = scrubState2.getSnapX();
                        ShortInterestChartCursorTrack.ShortInterestChartCursor(chartGroupDto, snapX != null ? snapX.floatValue() : scrubState2.getPoint().getX(), null, composer2, 0, 4);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.shortinterest.ui.ShortInterestChartCursorTrackKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ShortInterestChartCursorTrack.ShortInterestChartCursorTrack$lambda$5(chartGroup, scrubState, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
