package com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import black_widow.contracts.mobile_app_chart.proto.p024v1.ChartTypeDto;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: ChartTypeRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ComposableSingletons$ChartTypeRowKt$lambda$-1496448193$1, reason: use source file name */
/* loaded from: classes7.dex */
final class ChartTypeRow6 implements Function2<Composer, Integer, Unit> {
    public static final ChartTypeRow6 INSTANCE = new ChartTypeRow6();

    ChartTypeRow6() {
    }

    private static final String invoke$lambda$1(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1496448193, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ComposableSingletons$ChartTypeRowKt.lambda$-1496448193.<anonymous> (ChartTypeRow.kt:128)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotState3.mutableStateOf$default("Candles", null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
        composer.endReplaceGroup();
        String strInvoke$lambda$1 = invoke$lambda$1(snapshotState);
        ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(new ChartTypeDto("Candles", "Candles", null, 4, null), new ChartTypeDto("Line", "Line", null, 4, null), new ChartTypeDto("Bars", "Bars", null, 4, null), new ChartTypeDto("Area", "Area", null, 4, null), new ChartTypeDto("Baseline", "Baseline", null, 4, null));
        composer.startReplaceGroup(5004770);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ComposableSingletons$ChartTypeRowKt$lambda$-1496448193$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ChartTypeRow6.invoke$lambda$4$lambda$3(snapshotState, (String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        ChartTypeRow.ChartTypeRow(strInvoke$lambda$1, immutableList3PersistentListOf, (Function1) objRememberedValue2, composer, 384);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(SnapshotState snapshotState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        snapshotState.setValue(it);
        return Unit.INSTANCE;
    }
}
