package com.robinhood.android.feature.margin.call.p138v2.marketorder;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoText2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: MarginCallMarketOrderFormComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$MarginCallMarketOrderFormComposableKt {
    public static final ComposableSingletons$MarginCallMarketOrderFormComposableKt INSTANCE = new ComposableSingletons$MarginCallMarketOrderFormComposableKt();

    /* renamed from: lambda$-48662631, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8969lambda$48662631 = ComposableLambda3.composableLambdaInstance(-48662631, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.margin.call.v2.marketorder.ComposableSingletons$MarginCallMarketOrderFormComposableKt$lambda$-48662631$1
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
                ComposerKt.traceEventStart(-48662631, i, -1, "com.robinhood.android.feature.margin.call.v2.marketorder.ComposableSingletons$MarginCallMarketOrderFormComposableKt.lambda$-48662631.<anonymous> (MarginCallMarketOrderFormComposable.kt:76)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1518329010, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8968lambda$1518329010 = ComposableLambda3.composableLambdaInstance(-1518329010, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.margin.call.v2.marketorder.ComposableSingletons$MarginCallMarketOrderFormComposableKt$lambda$-1518329010$1
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
                ComposerKt.traceEventStart(-1518329010, i, -1, "com.robinhood.android.feature.margin.call.v2.marketorder.ComposableSingletons$MarginCallMarketOrderFormComposableKt.lambda$-1518329010.<anonymous> (MarginCallMarketOrderFormComposable.kt:273)");
            }
            BentoText2.m20747BentoText38GnDrw("\n\n\n\n", SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(24), 0.0f, 2, null), 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 54, 0, 16380);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1518329010$feature_margin_call_v2_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14481getLambda$1518329010$feature_margin_call_v2_externalDebug() {
        return f8968lambda$1518329010;
    }

    /* renamed from: getLambda$-48662631$feature_margin_call_v2_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14482getLambda$48662631$feature_margin_call_v2_externalDebug() {
        return f8969lambda$48662631;
    }
}
