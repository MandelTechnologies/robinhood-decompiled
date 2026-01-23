package com.robinhood.android.options.lib.simulatedreturn.chart;

import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.SnapshotFloatState2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionsSimulatedReturnChart.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartKt$OptionsSimulatedReturnBaseChart$6$1$2$1 */
/* loaded from: classes11.dex */
final class C23286xd491fbe6 implements Function1<IntSize, Unit> {
    final /* synthetic */ SnapshotFloatState2 $parentWidthAfterPadding$delegate;

    C23286xd491fbe6(SnapshotFloatState2 snapshotFloatState2) {
        this.$parentWidthAfterPadding$delegate = snapshotFloatState2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
        m16946invokeozmzZPI(intSize.getPackedValue());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final void m16946invokeozmzZPI(long j) {
        this.$parentWidthAfterPadding$delegate.setFloatValue((int) (j >> 32));
    }
}
