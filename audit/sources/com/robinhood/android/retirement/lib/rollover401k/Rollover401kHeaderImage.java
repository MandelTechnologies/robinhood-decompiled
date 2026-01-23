package com.robinhood.android.retirement.lib.rollover401k;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: Rollover401kHeaderImage.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.lib.rollover401k.ComposableSingletons$Rollover401kHeaderImageKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class Rollover401kHeaderImage {
    public static final Rollover401kHeaderImage INSTANCE = new Rollover401kHeaderImage();

    /* renamed from: lambda$-555861888, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9212lambda$555861888 = ComposableLambda3.composableLambdaInstance(-555861888, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.lib.rollover401k.ComposableSingletons$Rollover401kHeaderImageKt$lambda$-555861888$1
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
                ComposerKt.traceEventStart(-555861888, i, -1, "com.robinhood.android.retirement.lib.rollover401k.ComposableSingletons$Rollover401kHeaderImageKt.lambda$-555861888.<anonymous> (Rollover401kHeaderImage.kt:79)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-555861888$lib_retirement_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m18134getLambda$555861888$lib_retirement_externalDebug() {
        return f9212lambda$555861888;
    }
}
