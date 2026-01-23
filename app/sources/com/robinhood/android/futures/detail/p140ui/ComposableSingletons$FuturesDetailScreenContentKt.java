package com.robinhood.android.futures.detail.p140ui;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.history.p082ui.HistoryRowsKt;
import com.robinhood.android.futures.detail.C17042R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesDetailScreenContent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$FuturesDetailScreenContentKt {
    public static final ComposableSingletons$FuturesDetailScreenContentKt INSTANCE = new ComposableSingletons$FuturesDetailScreenContentKt();

    /* renamed from: lambda$-1607950981, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8974lambda$1607950981 = ComposableLambda3.composableLambdaInstance(-1607950981, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.detail.ui.ComposableSingletons$FuturesDetailScreenContentKt$lambda$-1607950981$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope historyPreviewSection, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(historyPreviewSection, "$this$historyPreviewSection");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1607950981, i, -1, "com.robinhood.android.futures.detail.ui.ComposableSingletons$FuturesDetailScreenContentKt.lambda$-1607950981.<anonymous> (FuturesDetailScreenContent.kt:228)");
            }
            HistoryRowsKt.DefaultHistoryHeader(null, StringResources_androidKt.stringResource(C17042R.string.futures_detail_pending_orders_section_header, composer, 0), composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-132770121, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8973lambda$132770121 = ComposableLambda3.composableLambdaInstance(-132770121, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.detail.ui.ComposableSingletons$FuturesDetailScreenContentKt$lambda$-132770121$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope historyPreviewSection, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(historyPreviewSection, "$this$historyPreviewSection");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-132770121, i, -1, "com.robinhood.android.futures.detail.ui.ComposableSingletons$FuturesDetailScreenContentKt.lambda$-132770121.<anonymous> (FuturesDetailScreenContent.kt:247)");
            }
            HistoryRowsKt.DefaultHistoryHeader(null, null, composer, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-132770121$feature_futures_detail_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m14557getLambda$132770121$feature_futures_detail_externalDebug() {
        return f8973lambda$132770121;
    }

    /* renamed from: getLambda$-1607950981$feature_futures_detail_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m14558getLambda$1607950981$feature_futures_detail_externalDebug() {
        return f8974lambda$1607950981;
    }
}
