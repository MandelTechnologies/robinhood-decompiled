package com.robinhood.android.advisory.tlh;

import androidx.compose.foundation.layout.Row5;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Components.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.tlh.ComposableSingletons$ComponentsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class Components3 {
    public static final Components3 INSTANCE = new Components3();

    /* renamed from: lambda$-1919516621, reason: not valid java name */
    private static Function3<Row5, Composer, Integer, Unit> f8656lambda$1919516621 = ComposableLambda3.composableLambdaInstance(-1919516621, false, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.tlh.ComposableSingletons$ComponentsKt$lambda$-1919516621$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 row5, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(row5, "<this>");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1919516621, i, -1, "com.robinhood.android.advisory.tlh.ComposableSingletons$ComponentsKt.lambda$-1919516621.<anonymous> (Components.kt:78)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1919516621$feature_tax_loss_harvesting_externalDebug, reason: not valid java name */
    public final Function3<Row5, Composer, Integer, Unit> m11265getLambda$1919516621$feature_tax_loss_harvesting_externalDebug() {
        return f8656lambda$1919516621;
    }
}
