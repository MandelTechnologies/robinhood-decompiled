package com.robinhood.android.p273ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.p273ui.appbar.WatchlistHomeAppBar4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: WatchlistHomeFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.ui.ComposableSingletons$WatchlistHomeFragmentKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class WatchlistHomeFragment2 {
    public static final WatchlistHomeFragment2 INSTANCE = new WatchlistHomeFragment2();

    /* renamed from: lambda$-517303417, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9297lambda$517303417 = ComposableLambda3.composableLambdaInstance(-517303417, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.ui.ComposableSingletons$WatchlistHomeFragmentKt$lambda$-517303417$1
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
                ComposerKt.traceEventStart(-517303417, i, -1, "com.robinhood.android.ui.ComposableSingletons$WatchlistHomeFragmentKt.lambda$-517303417.<anonymous> (WatchlistHomeFragment.kt:48)");
            }
            WatchlistHomeAppBar4.WatchlistHomeAppBar(null, null, composer, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-517303417$feature_watchlist_tab_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m20013getLambda$517303417$feature_watchlist_tab_externalDebug() {
        return f9297lambda$517303417;
    }
}
