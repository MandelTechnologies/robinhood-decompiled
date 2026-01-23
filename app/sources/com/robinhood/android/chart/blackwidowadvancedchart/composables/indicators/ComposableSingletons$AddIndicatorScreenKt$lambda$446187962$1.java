package com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorDto;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AddIndicatorScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
final class ComposableSingletons$AddIndicatorScreenKt$lambda$446187962$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$AddIndicatorScreenKt$lambda$446187962$1 INSTANCE = new ComposableSingletons$AddIndicatorScreenKt$lambda$446187962$1();

    ComposableSingletons$AddIndicatorScreenKt$lambda$446187962$1() {
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
            ComposerKt.traceEventStart(446187962, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.ComposableSingletons$AddIndicatorScreenKt.lambda$446187962.<anonymous> (AddIndicatorScreen.kt:551)");
        }
        IndicatorDto indicatorDto = new IndicatorDto(null, "Relative Strength Index Relative Strength Index Relative Strength Index", "RSI", false, null, 25, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.ComposableSingletons$AddIndicatorScreenKt$lambda$446187962$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComposableSingletons$AddIndicatorScreenKt$lambda$446187962$1.invoke$lambda$1$lambda$0((IndicatorDto) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        AddIndicatorScreenKt.IndicatorRow(indicatorDto, (Function1) objRememberedValue, false, false, null, composer, 3504, 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(IndicatorDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
