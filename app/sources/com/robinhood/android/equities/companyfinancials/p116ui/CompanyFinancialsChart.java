package com.robinhood.android.equities.companyfinancials.p116ui;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.robinhood.android.sdui.chartgroup.AdvancedChartGroupState5;
import com.robinhood.android.sdui.chartgroup.ProtoAdvancedChartGroupState;
import com.robinhood.android.sdui.chartgroup.ProtoAxisConfig;
import com.robinhood.android.sdui.chartgroup.ScrubConfig;
import com.robinhood.android.sdui.chartgroup.ScrubState;
import com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt;
import com.robinhood.android.sdui.chartgroup.YAxisLocation;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import rh_server_driven_ui.p531v1.ChartDto;
import rh_server_driven_ui.p531v1.ChartGroupDto;
import rh_server_driven_ui.p531v1.ChartLegendItemListDto;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: CompanyFinancialsChart.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a]\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0001¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\f\u0010\u0010\u001a\u0004\u0018\u00010\rX\u008a\u008e\u0002"}, m3636d2 = {"CompanyFinancialsChart", "", "chartGroup", "Lrh_server_driven_ui/v1/ChartGroupDto;", "onScrubStateUpdated", "Lkotlin/Function1;", "Lcom/robinhood/android/sdui/chartgroup/ScrubState;", "onScrubIndexChanged", "", "modifier", "Landroidx/compose/ui/Modifier;", "lineRevealAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "(Lrh_server_driven_ui/v1/ChartGroupDto;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)V", "lib-company-financials_externalDebug", "lastSnapX"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsChartKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class CompanyFinancialsChart {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompanyFinancialsChart$lambda$10(ChartGroupDto chartGroupDto, Function1 function1, Function1 function12, Modifier modifier, AnimationSpec animationSpec, int i, int i2, Composer composer, int i3) {
        CompanyFinancialsChart(chartGroupDto, function1, function12, modifier, animationSpec, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CompanyFinancialsChart(final ChartGroupDto chartGroup, final Function1<? super ScrubState, Unit> onScrubStateUpdated, final Function1<? super Integer, Unit> onScrubIndexChanged, Modifier modifier, AnimationSpec<Float> animationSpec, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        AnimationSpec<Float> animationSpec2;
        int i5;
        final HapticFeedback hapticFeedback;
        boolean zChanged;
        Object objRememberedValue;
        Map<String, ChartLegendItemListDto> legend_data;
        Set<String> setKeySet;
        final ImmutableList immutableList;
        Object objRememberedValue2;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        boolean zChanged2;
        Object objRememberedValue3;
        final Modifier modifier3;
        final AnimationSpec<Float> animationSpec3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(chartGroup, "chartGroup");
        Intrinsics.checkNotNullParameter(onScrubStateUpdated, "onScrubStateUpdated");
        Intrinsics.checkNotNullParameter(onScrubIndexChanged, "onScrubIndexChanged");
        Composer composerStartRestartGroup = composer.startRestartGroup(-978178128);
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
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onScrubIndexChanged) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    animationSpec2 = animationSpec;
                    i3 |= composerStartRestartGroup.changedInstance(animationSpec2) ? 16384 : 8192;
                }
                i5 = i3;
                if ((i5 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    if (i6 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    AnimationSpec<Float> animationSpec4 = i4 == 0 ? null : animationSpec2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-978178128, i5, -1, "com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsChart (CompanyFinancialsChart.kt:34)");
                    }
                    hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged = composerStartRestartGroup.changed(chartGroup);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        ChartDto chartDto = (ChartDto) CollectionsKt.firstOrNull((List) chartGroup.getCharts());
                        objRememberedValue = (chartDto != null || (legend_data = chartDto.getLegend_data()) == null || (setKeySet = legend_data.keySet()) == null) ? null : CompanyFinancialsUtils.parseXAxisSnapPoints(setKeySet);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    immutableList = (ImmutableList) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    snapshotState = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    UIComponentDto.ConcreteDto.ChartGroup chartGroup2 = new UIComponentDto.ConcreteDto.ChartGroup(chartGroup);
                    ProtoAdvancedChartGroupState protoAdvancedChartGroupState = new ProtoAdvancedChartGroupState(new ProtoAxisConfig(0.0f, 0.0f, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7924getStarte0LSkKk()), C2002Dp.m7993boximpl(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM()), C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(0)), false, YAxisLocation.START, null, false, null, 1799, null), new ScrubConfig(false, false, null, false, false, false, true, immutableList, false), AdvancedChartGroupState5.NONE, 0, true, animationSpec4, 8, null);
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChanged2 = ((i5 & 896) != 256) | composerStartRestartGroup.changed(immutableList) | composerStartRestartGroup.changedInstance(hapticFeedback) | ((i5 & 112) != 32);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                        Function1 function1 = new Function1() { // from class: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsChartKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CompanyFinancialsChart.CompanyFinancialsChart$lambda$9$lambda$8(hapticFeedback, onScrubIndexChanged, onScrubStateUpdated, snapshotState, immutableList, (ScrubState) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(function1);
                        objRememberedValue3 = function1;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier4 = modifier2;
                    SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup(chartGroup2, modifier4, null, protoAdvancedChartGroupState, null, null, (Function1) objRememberedValue3, null, null, composerStartRestartGroup, ((i5 >> 6) & 112) | (ProtoAdvancedChartGroupState.$stable << 9), 436);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    animationSpec3 = animationSpec4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    animationSpec3 = animationSpec2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsChartKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CompanyFinancialsChart.CompanyFinancialsChart$lambda$10(chartGroup, onScrubStateUpdated, onScrubIndexChanged, modifier3, animationSpec3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            animationSpec2 = animationSpec;
            i5 = i3;
            if ((i5 & 9363) != 9362) {
                if (i6 != 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(chartGroup);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    ChartDto chartDto2 = (ChartDto) CollectionsKt.firstOrNull((List) chartGroup.getCharts());
                    if (chartDto2 != null) {
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        immutableList = (ImmutableList) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                        }
                        snapshotState = (SnapshotState) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        UIComponentDto.ConcreteDto.ChartGroup chartGroup22 = new UIComponentDto.ConcreteDto.ChartGroup(chartGroup);
                        ProtoAdvancedChartGroupState protoAdvancedChartGroupState2 = new ProtoAdvancedChartGroupState(new ProtoAxisConfig(0.0f, 0.0f, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7924getStarte0LSkKk()), C2002Dp.m7993boximpl(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM()), C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(0)), false, YAxisLocation.START, null, false, null, 1799, null), new ScrubConfig(false, false, null, false, false, false, true, immutableList, false), AdvancedChartGroupState5.NONE, 0, true, animationSpec4, 8, null);
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        zChanged2 = ((i5 & 896) != 256) | composerStartRestartGroup.changed(immutableList) | composerStartRestartGroup.changedInstance(hapticFeedback) | ((i5 & 112) != 32);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2) {
                            Function1 function12 = new Function1() { // from class: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsChartKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CompanyFinancialsChart.CompanyFinancialsChart$lambda$9$lambda$8(hapticFeedback, onScrubIndexChanged, onScrubStateUpdated, snapshotState, immutableList, (ScrubState) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(function12);
                            objRememberedValue3 = function12;
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifier42 = modifier2;
                            SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup(chartGroup22, modifier42, null, protoAdvancedChartGroupState2, null, null, (Function1) objRememberedValue3, null, null, composerStartRestartGroup, ((i5 >> 6) & 112) | (ProtoAdvancedChartGroupState.$stable << 9), 436);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier42;
                            animationSpec3 = animationSpec4;
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        animationSpec2 = animationSpec;
        i5 = i3;
        if ((i5 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit CompanyFinancialsChart$lambda$9$lambda$8(HapticFeedback hapticFeedback, Function1 function1, Function1 function12, SnapshotState snapshotState, ImmutableList immutableList, ScrubState scrubState) {
        Integer num;
        Float snapX;
        Object next;
        if (!Intrinsics.areEqual(CompanyFinancialsChart$lambda$3(snapshotState), scrubState != null ? scrubState.getSnapX() : null)) {
            if (scrubState == null || (snapX = scrubState.getSnapX()) == null) {
                num = null;
                if (num != null) {
                    hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
                }
                function1.invoke(num);
                snapshotState.setValue(scrubState != null ? scrubState.getSnapX() : null);
            } else {
                float fFloatValue = snapX.floatValue();
                if (immutableList != null) {
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList, 10));
                    int i = 0;
                    for (Object obj : immutableList) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        arrayList.add(Tuples4.m3642to(Integer.valueOf(i), Float.valueOf(Math.abs(((Number) obj).floatValue() - fFloatValue))));
                        i = i2;
                    }
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        next = it.next();
                        if (it.hasNext()) {
                            float fFloatValue2 = ((Number) ((Tuples2) next).getSecond()).floatValue();
                            do {
                                Object next2 = it.next();
                                float fFloatValue3 = ((Number) ((Tuples2) next2).getSecond()).floatValue();
                                if (Float.compare(fFloatValue2, fFloatValue3) > 0) {
                                    next = next2;
                                    fFloatValue2 = fFloatValue3;
                                }
                            } while (it.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    Tuples2 tuples2 = (Tuples2) next;
                    if (tuples2 != null) {
                        num = (Integer) tuples2.getFirst();
                    }
                    if (num != null) {
                    }
                    function1.invoke(num);
                    snapshotState.setValue(scrubState != null ? scrubState.getSnapX() : null);
                }
            }
        }
        function12.invoke(scrubState);
        return Unit.INSTANCE;
    }

    private static final Float CompanyFinancialsChart$lambda$3(SnapshotState<Float> snapshotState) {
        return snapshotState.getValue();
    }
}
