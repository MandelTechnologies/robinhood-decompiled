package com.robinhood.android.p273ui.appbar;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: WatchlistHomeAppBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.ui.appbar.ComposableSingletons$WatchlistHomeAppBarKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class WatchlistHomeAppBar {
    public static final WatchlistHomeAppBar INSTANCE = new WatchlistHomeAppBar();

    /* renamed from: lambda$-408742124, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9298lambda$408742124 = ComposableLambda3.composableLambdaInstance(-408742124, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.ui.appbar.ComposableSingletons$WatchlistHomeAppBarKt$lambda$-408742124$1
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
                ComposerKt.traceEventStart(-408742124, i, -1, "com.robinhood.android.ui.appbar.ComposableSingletons$WatchlistHomeAppBarKt.lambda$-408742124.<anonymous> (WatchlistHomeAppBar.kt:42)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$766634336 = ComposableLambda3.composableLambdaInstance(766634336, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.ui.appbar.ComposableSingletons$WatchlistHomeAppBarKt$lambda$766634336$1
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
                ComposerKt.traceEventStart(766634336, i, -1, "com.robinhood.android.ui.appbar.ComposableSingletons$WatchlistHomeAppBarKt.lambda$766634336.<anonymous> (WatchlistHomeAppBar.kt:77)");
            }
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.NOTIFICATION_24), StringResources_androidKt.stringResource(C11048R.string.top_nav_notifications_button_description, composer, 0), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU(), null, null, false, composer, BentoIcon4.Size24.$stable, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-408742124$feature_watchlist_tab_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m20023getLambda$408742124$feature_watchlist_tab_externalDebug() {
        return f9298lambda$408742124;
    }

    public final Function2<Composer, Integer, Unit> getLambda$766634336$feature_watchlist_tab_externalDebug() {
        return lambda$766634336;
    }
}
