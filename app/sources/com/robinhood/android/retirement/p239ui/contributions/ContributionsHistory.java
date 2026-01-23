package com.robinhood.android.retirement.p239ui.contributions;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.history.p082ui.HistoryRowsKt;
import com.robinhood.android.retirement.C26959R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContributionsHistory.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.ui.contributions.ComposableSingletons$ContributionsHistoryKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class ContributionsHistory {
    public static final ContributionsHistory INSTANCE = new ContributionsHistory();

    /* renamed from: lambda$-202194232, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f9224lambda$202194232 = ComposableLambda3.composableLambdaInstance(-202194232, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.contributions.ComposableSingletons$ContributionsHistoryKt$lambda$-202194232$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope historySection, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(historySection, "$this$historySection");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-202194232, i, -1, "com.robinhood.android.retirement.ui.contributions.ComposableSingletons$ContributionsHistoryKt.lambda$-202194232.<anonymous> (ContributionsHistory.kt:52)");
            }
            HistoryRowsKt.DefaultHistoryHeader(null, StringResources_androidKt.stringResource(C26959R.string.retirement_contribution_history_title, composer, 0), composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1470864311, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f9223lambda$1470864311 = ComposableLambda3.composableLambdaInstance(-1470864311, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.contributions.ComposableSingletons$ContributionsHistoryKt$lambda$-1470864311$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope historySection, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(historySection, "$this$historySection");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1470864311, i, -1, "com.robinhood.android.retirement.ui.contributions.ComposableSingletons$ContributionsHistoryKt.lambda$-1470864311.<anonymous> (ContributionsHistory.kt:57)");
            }
            HistoryRowsKt.DefaultHistoryFooter(null, StringResources_androidKt.stringResource(C26959R.string.retirement_contribution_show_all_history, composer, 0), null, composer, 0, 5);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1083058060, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f9222lambda$1083058060 = ComposableLambda3.composableLambdaInstance(-1083058060, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.contributions.ComposableSingletons$ContributionsHistoryKt$lambda$-1083058060$1
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
                ComposerKt.traceEventStart(-1083058060, i, -1, "com.robinhood.android.retirement.ui.contributions.ComposableSingletons$ContributionsHistoryKt.lambda$-1083058060.<anonymous> (ContributionsHistory.kt:65)");
            }
            ContributionsHistory5.EmptyHistorySection(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1083058060$feature_retirement_tab_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m18203getLambda$1083058060$feature_retirement_tab_externalDebug() {
        return f9222lambda$1083058060;
    }

    /* renamed from: getLambda$-1470864311$feature_retirement_tab_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m18204getLambda$1470864311$feature_retirement_tab_externalDebug() {
        return f9223lambda$1470864311;
    }

    /* renamed from: getLambda$-202194232$feature_retirement_tab_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m18205getLambda$202194232$feature_retirement_tab_externalDebug() {
        return f9224lambda$202194232;
    }
}
