package com.robinhood.android.p273ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.portfolio.lists.p391ui.CuratedListState;
import com.robinhood.shared.portfolio.lists.p391ui.title.CuratedListTitleRow;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;

/* compiled from: WatchlistScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.ui.ComposableSingletons$WatchlistScreenKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class WatchlistScreen2 {
    public static final WatchlistScreen2 INSTANCE = new WatchlistScreen2();
    private static Function3<CuratedListState.Loaded, Composer, Integer, Unit> lambda$229673513 = ComposableLambda3.composableLambdaInstance(229673513, false, new Function3<CuratedListState.Loaded, Composer, Integer, Unit>() { // from class: com.robinhood.android.ui.ComposableSingletons$WatchlistScreenKt$lambda$229673513$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(CuratedListState.Loaded loaded, Composer composer, Integer num) {
            invoke(loaded, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(CuratedListState.Loaded loadedState, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(loadedState, "loadedState");
            if ((i & 6) == 0) {
                i |= (i & 8) == 0 ? composer.changed(loadedState) : composer.changedInstance(loadedState) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(229673513, i, -1, "com.robinhood.android.ui.ComposableSingletons$WatchlistScreenKt.lambda$229673513.<anonymous> (WatchlistScreen.kt:40)");
            }
            CuratedListTitleRow.CuratedListTitleRow(extensions2.toImmutableMap(loadedState.getCuratedListViewModes()), loadedState.getUpdateWatchlistViewMode(), PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<CuratedListState.Loaded, Composer, Integer, Unit> getLambda$229673513$feature_watchlist_tab_externalDebug() {
        return lambda$229673513;
    }
}
