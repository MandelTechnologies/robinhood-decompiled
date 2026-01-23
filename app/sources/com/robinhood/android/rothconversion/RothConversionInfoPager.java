package com.robinhood.android.rothconversion;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: RothConversionInfoPager.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rothconversion.ComposableSingletons$RothConversionInfoPagerKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RothConversionInfoPager {
    public static final RothConversionInfoPager INSTANCE = new RothConversionInfoPager();

    /* renamed from: lambda$-1399239441, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9242lambda$1399239441 = ComposableLambda3.composableLambdaInstance(-1399239441, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rothconversion.ComposableSingletons$RothConversionInfoPagerKt$lambda$-1399239441$1
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
                ComposerKt.traceEventStart(-1399239441, i, -1, "com.robinhood.android.rothconversion.ComposableSingletons$RothConversionInfoPagerKt.lambda$-1399239441.<anonymous> (RothConversionInfoPager.kt:153)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1399239441$feature_roth_conversion_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m18465getLambda$1399239441$feature_roth_conversion_externalDebug() {
        return f9242lambda$1399239441;
    }
}
