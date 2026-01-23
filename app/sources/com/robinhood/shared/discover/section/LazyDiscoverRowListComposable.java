package com.robinhood.shared.discover.section;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.shared.discover.section.DiscoverRow;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LazyDiscoverRowListComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.discover.section.ComposableSingletons$LazyDiscoverRowListComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class LazyDiscoverRowListComposable {
    public static final LazyDiscoverRowListComposable INSTANCE = new LazyDiscoverRowListComposable();
    private static Function2<Composer, Integer, Unit> lambda$918462534 = ComposableLambda3.composableLambdaInstance(918462534, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.discover.section.ComposableSingletons$LazyDiscoverRowListComposableKt$lambda$918462534$1
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
                ComposerKt.traceEventStart(918462534, i, -1, "com.robinhood.shared.discover.section.ComposableSingletons$LazyDiscoverRowListComposableKt.lambda$918462534.<anonymous> (LazyDiscoverRowListComposable.kt:83)");
            }
            DiscoverRow2.DiscoverRowComposable(DiscoverRow.Loading.INSTANCE.getDefaultLoadingState(), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-771454282, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f9450lambda$771454282 = ComposableLambda3.composableLambdaInstance(-771454282, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.discover.section.ComposableSingletons$LazyDiscoverRowListComposableKt$lambda$-771454282$1
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
                ComposerKt.traceEventStart(-771454282, i, -1, "com.robinhood.shared.discover.section.ComposableSingletons$LazyDiscoverRowListComposableKt.lambda$-771454282.<anonymous> (LazyDiscoverRowListComposable.kt:82)");
            }
            LocalShowPlaceholder.Loadable(true, null, null, LazyDiscoverRowListComposable.INSTANCE.getLambda$918462534$lib_discover_externalDebug(), composer, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-771454282$lib_discover_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m25300getLambda$771454282$lib_discover_externalDebug() {
        return f9450lambda$771454282;
    }

    public final Function2<Composer, Integer, Unit> getLambda$918462534$lib_discover_externalDebug() {
        return lambda$918462534;
    }
}
