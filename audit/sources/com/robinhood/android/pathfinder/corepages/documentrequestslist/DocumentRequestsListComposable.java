package com.robinhood.android.pathfinder.corepages.documentrequestslist;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocumentRequestsListComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.pathfinder.corepages.documentrequestslist.ComposableSingletons$DocumentRequestsListComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class DocumentRequestsListComposable {
    public static final DocumentRequestsListComposable INSTANCE = new DocumentRequestsListComposable();
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1295301130 = ComposableLambda3.composableLambdaInstance(1295301130, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.pathfinder.corepages.documentrequestslist.ComposableSingletons$DocumentRequestsListComposableKt$lambda$1295301130$1
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
                ComposerKt.traceEventStart(1295301130, i, -1, "com.robinhood.android.pathfinder.corepages.documentrequestslist.ComposableSingletons$DocumentRequestsListComposableKt.lambda$1295301130.<anonymous> (DocumentRequestsListComposable.kt:146)");
            }
            LoadingScreenComposablesKt.ListLoadingScreenComposable(TestTag3.testTag(Modifier.INSTANCE, DocumentRequestsListComposable4.DocumentRequestsListTestTagLoadingContent), false, false, 0, composer, 6, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1299870887, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9166lambda$1299870887 = ComposableLambda3.composableLambdaInstance(-1299870887, false, DocumentRequestsListComposable2.INSTANCE);

    /* renamed from: getLambda$-1299870887$feature_pathfinder_core_pages_externalDebug */
    public final Function2<Composer, Integer, Unit> m2363x4298c901() {
        return f9166lambda$1299870887;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1295301130$feature_pathfinder_core_pages_externalDebug() {
        return lambda$1295301130;
    }
}
