package com.robinhood.android.dashboard.lib;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.dashboard.futures.DashboardEventTopicsSection;
import com.robinhood.shared.portfolio.lists.p391ui.CuratedListState;
import com.robinhood.shared.portfolio.lists.p391ui.title.CuratedListTitleRow;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;

/* compiled from: LoadedDashboard.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$LoadedDashboardKt {
    public static final ComposableSingletons$LoadedDashboardKt INSTANCE = new ComposableSingletons$LoadedDashboardKt();
    private static Function2<Composer, Integer, Unit> lambda$1781005566 = ComposableLambda3.composableLambdaInstance(1781005566, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.ComposableSingletons$LoadedDashboardKt$lambda$1781005566$1
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
                ComposerKt.traceEventStart(1781005566, i, -1, "com.robinhood.android.dashboard.lib.ComposableSingletons$LoadedDashboardKt.lambda$1781005566.<anonymous> (LoadedDashboard.kt:134)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1075652693 = ComposableLambda3.composableLambdaInstance(1075652693, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.ComposableSingletons$LoadedDashboardKt$lambda$1075652693$1
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
                ComposerKt.traceEventStart(1075652693, i, -1, "com.robinhood.android.dashboard.lib.ComposableSingletons$LoadedDashboardKt.lambda$1075652693.<anonymous> (LoadedDashboard.kt:148)");
            }
            DashboardEventTopicsSection.DashboardEventTopicsSection("investing_tab_v2", null, null, composer, 6, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-129805487, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8859lambda$129805487 = ComposableLambda3.composableLambdaInstance(-129805487, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.ComposableSingletons$LoadedDashboardKt$lambda$-129805487$1
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
                ComposerKt.traceEventStart(-129805487, i, -1, "com.robinhood.android.dashboard.lib.ComposableSingletons$LoadedDashboardKt.lambda$-129805487.<anonymous> (LoadedDashboard.kt:164)");
            }
            DashboardEventTopicsSection.DashboardEventTopicsSection("investing_tab_v2", null, null, composer, 6, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<CuratedListState.Loaded, Composer, Integer, Unit> lambda$1959482552 = ComposableLambda3.composableLambdaInstance(1959482552, false, new Function3<CuratedListState.Loaded, Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.ComposableSingletons$LoadedDashboardKt$lambda$1959482552$1
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
                ComposerKt.traceEventStart(1959482552, i, -1, "com.robinhood.android.dashboard.lib.ComposableSingletons$LoadedDashboardKt.lambda$1959482552.<anonymous> (LoadedDashboard.kt:229)");
            }
            CuratedListTitleRow.CuratedListTitleRow(extensions2.toImmutableMap(loadedState.getCuratedListViewModes()), loadedState.getUpdateWatchlistViewMode(), ModifiersKt.standardComponentTopPadding(Modifier.INSTANCE), composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-129805487$lib_account_home_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m13174getLambda$129805487$lib_account_home_externalDebug() {
        return f8859lambda$129805487;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1075652693$lib_account_home_externalDebug() {
        return lambda$1075652693;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1781005566$lib_account_home_externalDebug() {
        return lambda$1781005566;
    }

    public final Function3<CuratedListState.Loaded, Composer, Integer, Unit> getLambda$1959482552$lib_account_home_externalDebug() {
        return lambda$1959482552;
    }
}
