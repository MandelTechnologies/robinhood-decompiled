package com.robinhood.android.compose.maps;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: StyleableMapComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.compose.maps.ComposableSingletons$StyleableMapComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class StyleableMapComposable {
    public static final StyleableMapComposable INSTANCE = new StyleableMapComposable();

    /* renamed from: lambda$-1565054885, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8734lambda$1565054885 = ComposableLambda3.composableLambdaInstance(-1565054885, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.compose.maps.ComposableSingletons$StyleableMapComposableKt$lambda$-1565054885$1
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
                ComposerKt.traceEventStart(-1565054885, i, -1, "com.robinhood.android.compose.maps.ComposableSingletons$StyleableMapComposableKt.lambda$-1565054885.<anonymous> (StyleableMapComposable.kt:40)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1565054885$lib_maps_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12535getLambda$1565054885$lib_maps_externalDebug() {
        return f8734lambda$1565054885;
    }
}
