package com.robinhood.android.acatsin.enableoptions;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AcatsInEnableOptionsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.enableoptions.ComposableSingletons$AcatsInEnableOptionsComposableKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AcatsInEnableOptionsComposable2 {
    public static final AcatsInEnableOptionsComposable2 INSTANCE = new AcatsInEnableOptionsComposable2();

    /* renamed from: lambda$-807542109, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8614lambda$807542109 = ComposableLambda3.composableLambdaInstance(-807542109, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acatsin.enableoptions.ComposableSingletons$AcatsInEnableOptionsComposableKt$lambda$-807542109$1
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
                ComposerKt.traceEventStart(-807542109, i, -1, "com.robinhood.android.acatsin.enableoptions.ComposableSingletons$AcatsInEnableOptionsComposableKt.lambda$-807542109.<anonymous> (AcatsInEnableOptionsComposable.kt:31)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-461300731, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8613lambda$461300731 = ComposableLambda3.composableLambdaInstance(-461300731, false, AcatsInEnableOptionsComposable3.INSTANCE);

    /* renamed from: getLambda$-461300731$feature_acats_in_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10746getLambda$461300731$feature_acats_in_externalDebug() {
        return f8613lambda$461300731;
    }

    /* renamed from: getLambda$-807542109$feature_acats_in_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10747getLambda$807542109$feature_acats_in_externalDebug() {
        return f8614lambda$807542109;
    }
}
