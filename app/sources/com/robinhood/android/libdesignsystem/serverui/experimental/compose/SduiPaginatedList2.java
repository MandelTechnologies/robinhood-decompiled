package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SduiPaginatedList.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.ComposableSingletons$SduiPaginatedListKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiPaginatedList2 {
    public static final SduiPaginatedList2 INSTANCE = new SduiPaginatedList2();
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1372901400 = ComposableLambda3.composableLambdaInstance(1372901400, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.ComposableSingletons$SduiPaginatedListKt$lambda$1372901400$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1372901400, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.ComposableSingletons$SduiPaginatedListKt.lambda$1372901400.<anonymous> (SduiPaginatedList.kt:70)");
            }
            SduiPaginatedList5.ProgressIndicator(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1372901400$lib_sdui_externalRelease() {
        return lambda$1372901400;
    }
}
