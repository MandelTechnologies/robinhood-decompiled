package com.robinhood.android.charts.span;

import androidx.compose.foundation.layout.Row5;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.charts.span.SpanSelector5;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UnifiedSpanSelector.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.charts.span.ComposableSingletons$UnifiedSpanSelectorKt$lambda$-380826289$1, reason: invalid class name */
/* loaded from: classes7.dex */
final class ComposableSingletons$UnifiedSpanSelectorKt$lambda$380826289$1 implements Function3<Row5, Composer, Integer, Unit> {
    public static final ComposableSingletons$UnifiedSpanSelectorKt$lambda$380826289$1 INSTANCE = new ComposableSingletons$UnifiedSpanSelectorKt$lambda$380826289$1();

    ComposableSingletons$UnifiedSpanSelectorKt$lambda$380826289$1() {
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
        invoke(row5, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Row5 UnifiedDynamicSpanSelector, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(UnifiedDynamicSpanSelector, "$this$UnifiedDynamicSpanSelector");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-380826289, i, -1, "com.robinhood.android.charts.span.ComposableSingletons$UnifiedSpanSelectorKt.lambda$-380826289.<anonymous> (UnifiedSpanSelector.kt:537)");
        }
        SpanSelector5.BentoIcon bentoIcon = new SpanSelector5.BentoIcon(new BentoIcon4.Size24(ServerToBentoAssetMapper2.SETTINGS_24), "Settings");
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.charts.span.ComposableSingletons$UnifiedSpanSelectorKt$lambda$-380826289$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        SpanSelector3.ChartSpanTrailingButton(bentoIcon, (Function0) objRememberedValue, null, composer, BentoIcon4.$stable | 48, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
