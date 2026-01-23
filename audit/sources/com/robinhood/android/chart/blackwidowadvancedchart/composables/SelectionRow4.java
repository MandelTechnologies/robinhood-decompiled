package com.robinhood.android.chart.blackwidowadvancedchart.composables;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SelectionRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.ComposableSingletons$SelectionRowKt$lambda$437296409$1, reason: use source file name */
/* loaded from: classes7.dex */
final class SelectionRow4 implements Function2<Composer, Integer, Unit> {
    public static final SelectionRow4 INSTANCE = new SelectionRow4();

    SelectionRow4() {
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
            ComposerKt.traceEventStart(437296409, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.ComposableSingletons$SelectionRowKt.lambda$437296409.<anonymous> (SelectionRow.kt:78)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.ComposableSingletons$SelectionRowKt$lambda$437296409$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        SelectionRow5.SelectionRow(false, (Function0) objRememberedValue, SelectionRow2.INSTANCE.m1750x7cf1a3e8(), null, true, null, composer, 25014, 40);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
