package com.robinhood.android.equitydetail.p123ui.chart;

import androidx.compose.foundation.layout.Row5;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.charts.span.ChartDisplaySpanExtensions;
import com.robinhood.android.charts.span.UnifiedSpan;
import com.robinhood.android.charts.span.UnifiedSpanSelectorKt;
import com.robinhood.android.charts.span.UnifiedSpanSelectorState;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentChartIntervals;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentChartSpan;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentChartSpans;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: InstrumentChartSpansDynamicSelector.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aß\u0001\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u001c\b\u0002\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\f2:\b\u0002\u0010\u0013\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\r\u0018\u00010\b2\u001b\b\u0002\u0010\u0016\u001a\u0015\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0002\b\u00152\u001b\b\u0002\u0010\u0017\u001a\u0015\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0002\b\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001aO\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d*\u00020\u001a2\u001a\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0003¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/models/db/bonfire/instrument/InstrumentChartSpans;", "instrumentChartSpans", "", "selectedDisplaySpan", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/robinhood/models/db/bonfire/instrument/InstrumentChartIntervals;", "instrumentChartIntervals", "Lkotlin/Function2;", "", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "spanModifiers", "Lkotlin/Function1;", "", "onSpanSelected", "Lkotlin/ParameterName;", "name", "instrumentId", "spanId", "onOpenCustomIntervals", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "trailingListItem", "trailingButton", "InstrumentChartSpansDynamicSelector", "(Lcom/robinhood/models/db/bonfire/instrument/InstrumentChartSpans;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/robinhood/models/db/bonfire/instrument/InstrumentChartIntervals;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/models/db/bonfire/instrument/InstrumentChartSpan;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "activeSpanId", "Lcom/robinhood/android/charts/span/UnifiedSpan;", "toUnifiedSpan", "(Lcom/robinhood/models/db/bonfire/instrument/InstrumentChartSpan;Lkotlin/jvm/functions/Function4;ILjava/lang/String;Lcom/robinhood/models/db/bonfire/instrument/InstrumentChartIntervals;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/charts/span/UnifiedSpan;", "feature-equity-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartSpansDynamicSelectorKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class InstrumentChartSpansDynamicSelector {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstrumentChartSpansDynamicSelector$lambda$5(InstrumentChartSpans instrumentChartSpans, String str, Modifier modifier, InstrumentChartIntervals instrumentChartIntervals, Function4 function4, Function1 function1, Function2 function2, Function3 function3, Function3 function32, int i, int i2, Composer composer, int i3) {
        InstrumentChartSpansDynamicSelector(instrumentChartSpans, str, modifier, instrumentChartIntervals, function4, function1, function2, function3, function32, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstrumentChartSpansDynamicSelector$lambda$1$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InstrumentChartSpansDynamicSelector(final InstrumentChartSpans instrumentChartSpans, final String selectedDisplaySpan, Modifier modifier, InstrumentChartIntervals instrumentChartIntervals, Function4<? super Integer, ? super DisplaySpan, ? super Composer, ? super Integer, ? extends Modifier> function4, Function1<? super String, Unit> function1, Function2<? super String, ? super String, Unit> function2, Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3, Function3<? super Row5, ? super Composer, ? super Integer, Unit> function32, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        InstrumentChartIntervals instrumentChartIntervals2;
        int i5;
        Function4<? super Integer, ? super DisplaySpan, ? super Composer, ? super Integer, ? extends Modifier> function42;
        int i6;
        Function1<? super String, Unit> function12;
        int i7;
        final Function2<? super String, ? super String, Unit> function22;
        int i8;
        int i9;
        int i10;
        final Function1<? super String, Unit> function13;
        final Function2<? super String, ? super String, Unit> function23;
        final InstrumentChartIntervals instrumentChartIntervals3;
        Composer composer2;
        boolean zChangedInstance;
        Object objRememberedValue;
        Composer composer3;
        final Function1<? super String, Unit> function14;
        final Modifier modifier3;
        final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function33;
        final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function34;
        final Function4<? super Integer, ? super DisplaySpan, ? super Composer, ? super Integer, ? extends Modifier> function43;
        final InstrumentChartIntervals instrumentChartIntervals4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(instrumentChartSpans, "instrumentChartSpans");
        Intrinsics.checkNotNullParameter(selectedDisplaySpan, "selectedDisplaySpan");
        Composer composerStartRestartGroup = composer.startRestartGroup(-40486411);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(instrumentChartSpans) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(selectedDisplaySpan) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    instrumentChartIntervals2 = instrumentChartIntervals;
                    i3 |= composerStartRestartGroup.changedInstance(instrumentChartIntervals2) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        function42 = function4;
                        i3 |= composerStartRestartGroup.changedInstance(function42) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                        function12 = function1;
                    } else {
                        function12 = function1;
                        if ((i & 196608) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function12) ? 131072 : 65536;
                        }
                    }
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i3 |= 1572864;
                        function22 = function2;
                    } else {
                        function22 = function2;
                        if ((i & 1572864) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function22) ? 1048576 : 524288;
                        }
                    }
                    i8 = i2 & 128;
                    if (i8 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
                    }
                    i9 = i2 & 256;
                    if (i9 != 0) {
                        if ((i & 100663296) == 0) {
                            i10 = i9;
                            i3 |= composerStartRestartGroup.changedInstance(function32) ? 67108864 : 33554432;
                        }
                        if ((i3 & 38347923) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier4 = i11 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                instrumentChartIntervals2 = null;
                            }
                            if (i5 != 0) {
                                function42 = null;
                            }
                            if (i6 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartSpansDynamicSelectorKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return InstrumentChartSpansDynamicSelector.InstrumentChartSpansDynamicSelector$lambda$1$lambda$0((String) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                function13 = (Function1) objRememberedValue2;
                            } else {
                                function13 = function12;
                            }
                            function23 = i7 == 0 ? null : function22;
                            Function3<? super Row5, ? super Composer, ? super Integer, Unit> function35 = i8 == 0 ? null : function3;
                            Function3<? super Row5, ? super Composer, ? super Integer, Unit> function36 = i10 == 0 ? function32 : null;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-40486411, i3, -1, "com.robinhood.android.equitydetail.ui.chart.InstrumentChartSpansDynamicSelector (InstrumentChartSpansDynamicSelector.kt:26)");
                            }
                            composerStartRestartGroup.startReplaceGroup(-252709465);
                            ImmutableList<InstrumentChartSpan> spans = instrumentChartSpans.getSpans();
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(spans, 10));
                            int i12 = 0;
                            for (InstrumentChartSpan instrumentChartSpan : spans) {
                                int i13 = i12 + 1;
                                if (i12 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                Composer composer4 = composerStartRestartGroup;
                                InstrumentChartIntervals instrumentChartIntervals5 = instrumentChartIntervals2;
                                Function4<? super Integer, ? super DisplaySpan, ? super Composer, ? super Integer, ? extends Modifier> function44 = function42;
                                arrayList.add(toUnifiedSpan(instrumentChartSpan, function44, i12, selectedDisplaySpan, instrumentChartIntervals5, composer4, ((i3 >> 9) & 112) | ((i3 << 6) & 7168) | ((i3 << 3) & 57344)));
                                instrumentChartIntervals2 = instrumentChartIntervals5;
                                i12 = i13;
                                composerStartRestartGroup = composer4;
                                function42 = function44;
                            }
                            instrumentChartIntervals3 = instrumentChartIntervals2;
                            Function4<? super Integer, ? super DisplaySpan, ? super Composer, ? super Integer, ? extends Modifier> function45 = function42;
                            composer2 = composerStartRestartGroup;
                            composer2.endReplaceGroup();
                            ImmutableList immutableList = extensions2.toImmutableList(arrayList);
                            composer2.startReplaceGroup(-1224400529);
                            zChangedInstance = ((3670016 & i3) != 1048576) | ((i3 & 112) != 32) | composer2.changedInstance(instrumentChartIntervals3) | ((458752 & i3) != 131072);
                            objRememberedValue = composer2.rememberedValue();
                            if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartSpansDynamicSelectorKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return InstrumentChartSpansDynamicSelector.InstrumentChartSpansDynamicSelector$lambda$4$lambda$3(function23, selectedDisplaySpan, instrumentChartIntervals3, function13, (String) obj);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceGroup();
                            int i14 = i3;
                            int i15 = i14 >> 6;
                            function22 = function23;
                            Function3<? super Row5, ? super Composer, ? super Integer, Unit> function37 = function35;
                            Function3<? super Row5, ? super Composer, ? super Integer, Unit> function38 = function36;
                            composer3 = composer2;
                            function14 = function13;
                            Modifier modifier5 = modifier4;
                            UnifiedSpanSelectorKt.UnifiedDynamicSpanSelector(new UnifiedSpanSelectorState(immutableList, selectedDisplaySpan, (Function1) objRememberedValue, false, null, false, 0.0f, 112, null), modifier5, null, null, null, function37, function38, composer3, UnifiedSpanSelectorState.$stable | ((i14 >> 3) & 112) | (458752 & i15) | (i15 & 3670016), 28);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier5;
                            function33 = function37;
                            function34 = function38;
                            function43 = function45;
                            instrumentChartIntervals4 = instrumentChartIntervals3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            function34 = function32;
                            composer3 = composerStartRestartGroup;
                            modifier3 = modifier2;
                            instrumentChartIntervals4 = instrumentChartIntervals2;
                            function43 = function42;
                            function14 = function12;
                            function33 = function3;
                        }
                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartSpansDynamicSelectorKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return InstrumentChartSpansDynamicSelector.InstrumentChartSpansDynamicSelector$lambda$5(instrumentChartSpans, selectedDisplaySpan, modifier3, instrumentChartIntervals4, function43, function14, function22, function33, function34, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 100663296;
                    i10 = i9;
                    if ((i3 & 38347923) != 38347922) {
                        if (i11 == 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceGroup(-252709465);
                        ImmutableList<InstrumentChartSpan> spans2 = instrumentChartSpans.getSpans();
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(spans2, 10));
                        int i122 = 0;
                        while (r2.hasNext()) {
                        }
                        instrumentChartIntervals3 = instrumentChartIntervals2;
                        Function4<? super Integer, ? super DisplaySpan, ? super Composer, ? super Integer, ? extends Modifier> function452 = function42;
                        composer2 = composerStartRestartGroup;
                        composer2.endReplaceGroup();
                        ImmutableList immutableList2 = extensions2.toImmutableList(arrayList2);
                        composer2.startReplaceGroup(-1224400529);
                        zChangedInstance = ((3670016 & i3) != 1048576) | ((i3 & 112) != 32) | composer2.changedInstance(instrumentChartIntervals3) | ((458752 & i3) != 131072);
                        objRememberedValue = composer2.rememberedValue();
                        if (!zChangedInstance) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartSpansDynamicSelectorKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return InstrumentChartSpansDynamicSelector.InstrumentChartSpansDynamicSelector$lambda$4$lambda$3(function23, selectedDisplaySpan, instrumentChartIntervals3, function13, (String) obj);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                            composer2.endReplaceGroup();
                            int i142 = i3;
                            int i152 = i142 >> 6;
                            function22 = function23;
                            Function3<? super Row5, ? super Composer, ? super Integer, Unit> function372 = function35;
                            Function3<? super Row5, ? super Composer, ? super Integer, Unit> function382 = function36;
                            composer3 = composer2;
                            function14 = function13;
                            Modifier modifier52 = modifier4;
                            UnifiedSpanSelectorKt.UnifiedDynamicSpanSelector(new UnifiedSpanSelectorState(immutableList2, selectedDisplaySpan, (Function1) objRememberedValue, false, null, false, 0.0f, 112, null), modifier52, null, null, null, function372, function382, composer3, UnifiedSpanSelectorState.$stable | ((i142 >> 3) & 112) | (458752 & i152) | (i152 & 3670016), 28);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier52;
                            function33 = function372;
                            function34 = function382;
                            function43 = function452;
                            instrumentChartIntervals4 = instrumentChartIntervals3;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function42 = function4;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                i8 = i2 & 128;
                if (i8 == 0) {
                }
                i9 = i2 & 256;
                if (i9 != 0) {
                }
                i10 = i9;
                if ((i3 & 38347923) != 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            instrumentChartIntervals2 = instrumentChartIntervals;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function42 = function4;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            i8 = i2 & 128;
            if (i8 == 0) {
            }
            i9 = i2 & 256;
            if (i9 != 0) {
            }
            i10 = i9;
            if ((i3 & 38347923) != 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        instrumentChartIntervals2 = instrumentChartIntervals;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function42 = function4;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        i8 = i2 & 128;
        if (i8 == 0) {
        }
        i9 = i2 & 256;
        if (i9 != 0) {
        }
        i10 = i9;
        if ((i3 & 38347923) != 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstrumentChartSpansDynamicSelector$lambda$4$lambda$3(Function2 function2, String str, InstrumentChartIntervals instrumentChartIntervals, Function1 function1, String spanId) {
        Intrinsics.checkNotNullParameter(spanId, "spanId");
        if (function2 != null && Intrinsics.areEqual(spanId, str) && instrumentChartIntervals != null && instrumentChartIntervals.containsCustomIntervals(spanId)) {
            function2.invoke(instrumentChartIntervals.getInstrumentId(), spanId);
        } else {
            function1.invoke(spanId);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final UnifiedSpan<String> toUnifiedSpan(InstrumentChartSpan instrumentChartSpan, Function4<? super Integer, ? super DisplaySpan, ? super Composer, ? super Integer, ? extends Modifier> function4, int i, String str, InstrumentChartIntervals instrumentChartIntervals, Composer composer, int i2) {
        boolean z;
        composer.startReplaceGroup(-565377012);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-565377012, i2, -1, "com.robinhood.android.equitydetail.ui.chart.toUnifiedSpan (InstrumentChartSpansDynamicSelector.kt:64)");
        }
        DisplaySpan displaySpanFromServerValue = DisplaySpan.INSTANCE.fromServerValue(instrumentChartSpan.getId());
        if (displaySpanFromServerValue == null) {
            displaySpanFromServerValue = DisplaySpan.UNKNOWN;
        }
        String id = instrumentChartSpan.getId();
        String title = instrumentChartSpan.getTitle();
        if (!Intrinsics.areEqual(str, instrumentChartSpan.getId()) || instrumentChartIntervals == null) {
            z = false;
        } else {
            z = true;
            if (!instrumentChartIntervals.containsCustomIntervals(instrumentChartSpan.getId())) {
            }
        }
        boolean z2 = z;
        String educationTourId = ChartDisplaySpanExtensions.getEducationTourId(displaySpanFromServerValue);
        Modifier modifierInvoke = function4 == null ? null : function4.invoke(Integer.valueOf(i), displaySpanFromServerValue, composer, Integer.valueOf(((i2 >> 6) & 14) | ((i2 << 3) & 896)));
        if (modifierInvoke == null) {
            modifierInvoke = Modifier.INSTANCE;
        }
        UnifiedSpan<String> unifiedSpan = new UnifiedSpan<>(id, title, false, z2, educationTourId, modifierInvoke);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return unifiedSpan;
    }
}
