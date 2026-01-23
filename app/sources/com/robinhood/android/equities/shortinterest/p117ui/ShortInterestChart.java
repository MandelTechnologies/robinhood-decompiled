package com.robinhood.android.equities.shortinterest.p117ui;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.sdui.chartgroup.AdvancedChartGroupState5;
import com.robinhood.android.sdui.chartgroup.ProtoAdvancedChartGroupState;
import com.robinhood.android.sdui.chartgroup.ProtoAxisConfig;
import com.robinhood.android.sdui.chartgroup.ScrubConfig;
import com.robinhood.android.sdui.chartgroup.ScrubState;
import com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt;
import com.robinhood.android.sdui.chartgroup.YAxisLocation;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import rh_server_driven_ui.p531v1.ChartAxisDto;
import rh_server_driven_ui.p531v1.ChartGroupDto;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: ShortInterestChart.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"ShortInterestChart", "", "chartGroup", "Lrh_server_driven_ui/v1/ChartGroupDto;", "onScrubStateUpdated", "Lkotlin/Function1;", "Lcom/robinhood/android/sdui/chartgroup/ScrubState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lrh_server_driven_ui/v1/ChartGroupDto;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-short-interest_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.shortinterest.ui.ShortInterestChartKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class ShortInterestChart {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShortInterestChart$lambda$4(ChartGroupDto chartGroupDto, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ShortInterestChart(chartGroupDto, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ShortInterestChart(final ChartGroupDto chartGroup, final Function1<? super ScrubState, Unit> onScrubStateUpdated, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean zChanged;
        Object objRememberedValue;
        Map<String, ChartAxisDto.ChartAxisCursorDataDto> cursor_data;
        Set<String> setKeySet;
        boolean z;
        Object objRememberedValue2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(chartGroup, "chartGroup");
        Intrinsics.checkNotNullParameter(onScrubStateUpdated, "onScrubStateUpdated");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1343233753);
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
            i3 |= composerStartRestartGroup.changedInstance(onScrubStateUpdated) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1343233753, i3, -1, "com.robinhood.android.equities.shortinterest.ui.ShortInterestChart (ShortInterestChart.kt:25)");
                }
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(chartGroup);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    ChartAxisDto x_axis = chartGroup.getX_axis();
                    objRememberedValue = (x_axis != null || (cursor_data = x_axis.getCursor_data()) == null || (setKeySet = cursor_data.keySet()) == null) ? null : ShortInterestUtils.parseXAxisSnapPoints(setKeySet);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                UIComponentDto.ConcreteDto.ChartGroup chartGroup2 = new UIComponentDto.ConcreteDto.ChartGroup(chartGroup);
                ProtoAdvancedChartGroupState protoAdvancedChartGroupState = new ProtoAdvancedChartGroupState(new ProtoAxisConfig(0.0f, 0.0f, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7924getStarte0LSkKk()), C2002Dp.m7993boximpl(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM()), C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(0)), false, YAxisLocation.START, YAxisLocation.END, false, null, 1543, null), new ScrubConfig(true, false, null, false, false, false, true, (ImmutableList) objRememberedValue, true), AdvancedChartGroupState5.NONE, 0, true, null, 40, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                z = (i3 & 112) == 32;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equities.shortinterest.ui.ShortInterestChartKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ShortInterestChart.ShortInterestChart$lambda$3$lambda$2(onScrubStateUpdated, (ScrubState) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup(chartGroup2, modifier5, null, protoAdvancedChartGroupState, null, null, (Function1) objRememberedValue2, null, null, composerStartRestartGroup, ((i3 >> 3) & 112) | (ProtoAdvancedChartGroupState.$stable << 9), 436);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.shortinterest.ui.ShortInterestChartKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ShortInterestChart.ShortInterestChart$lambda$4(chartGroup, onScrubStateUpdated, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChanged = composerStartRestartGroup.changed(chartGroup);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                ChartAxisDto x_axis2 = chartGroup.getX_axis();
                if (x_axis2 != null) {
                    objRememberedValue = (x_axis2 != null || (cursor_data = x_axis2.getCursor_data()) == null || (setKeySet = cursor_data.keySet()) == null) ? null : ShortInterestUtils.parseXAxisSnapPoints(setKeySet);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier52 = modifier4;
                    UIComponentDto.ConcreteDto.ChartGroup chartGroup22 = new UIComponentDto.ConcreteDto.ChartGroup(chartGroup);
                    ProtoAdvancedChartGroupState protoAdvancedChartGroupState2 = new ProtoAdvancedChartGroupState(new ProtoAxisConfig(0.0f, 0.0f, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7924getStarte0LSkKk()), C2002Dp.m7993boximpl(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM()), C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(0)), false, YAxisLocation.START, YAxisLocation.END, false, null, 1543, null), new ScrubConfig(true, false, null, false, false, false, true, (ImmutableList) objRememberedValue, true), AdvancedChartGroupState5.NONE, 0, true, null, 40, null);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    if ((i3 & 112) == 32) {
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!z) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equities.shortinterest.ui.ShortInterestChartKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ShortInterestChart.ShortInterestChart$lambda$3$lambda$2(onScrubStateUpdated, (ScrubState) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup(chartGroup22, modifier52, null, protoAdvancedChartGroupState2, null, null, (Function1) objRememberedValue2, null, null, composerStartRestartGroup, ((i3 >> 3) & 112) | (ProtoAdvancedChartGroupState.$stable << 9), 436);
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
    public static final Unit ShortInterestChart$lambda$3$lambda$2(Function1 function1, ScrubState scrubState) {
        function1.invoke(scrubState);
        return Unit.INSTANCE;
    }
}
