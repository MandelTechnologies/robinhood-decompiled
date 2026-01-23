package com.robinhood.android.common.portfolio.positionsList;

import androidx.compose.foundation.lazy.LazyListScope;
import com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsList;
import com.robinhood.utils.compose.reorderable.ReorderableLazyListScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PositionsSection.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u0085\u0001\u0010\u0005\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2!\b\u0002\u0010\t\u001a\u001b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001j\u0004\u0018\u0001`\n¢\u0006\u0002\b\u00042!\b\u0002\u0010\u000b\u001a\u001b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\u00042!\b\u0002\u0010\r\u001a\u001b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u001a\u0085\u0001\u0010\u0010\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2!\b\u0002\u0010\t\u001a\u001b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001j\u0004\u0018\u0001`\n¢\u0006\u0002\b\u00042!\b\u0002\u0010\u000b\u001a\u001b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\u00042!\b\u0002\u0010\r\u001a\u001b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u001a\u0085\u0001\u0010\u0011\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2!\b\u0002\u0010\t\u001a\u001b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001j\u0004\u0018\u0001`\n¢\u0006\u0002\b\u00042!\b\u0002\u0010\u000b\u001a\u001b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\u00042!\b\u0002\u0010\r\u001a\u001b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u001a\u0085\u0001\u0010\u0012\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2!\b\u0002\u0010\t\u001a\u001b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001j\u0004\u0018\u0001`\n¢\u0006\u0002\b\u00042!\b\u0002\u0010\u000b\u001a\u001b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\u00042!\b\u0002\u0010\r\u001a\u001b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u001a\u0085\u0001\u0010\u0013\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2!\b\u0002\u0010\t\u001a\u001b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001j\u0004\u0018\u0001`\n¢\u0006\u0002\b\u00042!\b\u0002\u0010\u000b\u001a\u001b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\u00042!\b\u0002\u0010\r\u001a\u001b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u001a\u0085\u0001\u0010\u0014\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2!\b\u0002\u0010\t\u001a\u001b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001j\u0004\u0018\u0001`\n¢\u0006\u0002\b\u00042!\b\u0002\u0010\u000b\u001a\u001b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\u00042!\b\u0002\u0010\r\u001a\u001b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000f*.\b\u0000\u0010\u0000\"\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¨\u0006\u0015"}, m3636d2 = {"LazyListContent", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "", "Lkotlin/ExtensionFunctionType;", "lazyPendingEquitiesPositionsSection", "Lcom/robinhood/utils/compose/reorderable/ReorderableLazyListScope;", "positionsListState", "Lcom/robinhood/android/common/portfolio/positionsList/PositionsListState;", "loadingContent", "Lcom/robinhood/android/common/portfolio/positionsList/LazyListContent;", "headerContentOverride", "Lkotlin/Function2;", "footerContentOverride", "keyPrefix", "", "lazyEquitiesPositionsSection", "lazyPendingOptionsPositionsSection", "lazyOptionsPositionsSection", "lazyCryptoPositionsSection", "lazyFuturesPositionsSection", "feature-lib-portfolio_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.portfolio.positionsList.PositionsSectionKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class PositionsSection {
    public static /* synthetic */ void lazyPendingEquitiesPositionsSection$default(ReorderableLazyListScope reorderableLazyListScope, ReorderablePositionsList reorderablePositionsList, Function1 function1, Function2 function2, Function2 function22, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function2 = null;
        }
        if ((i & 8) != 0) {
            function22 = null;
        }
        if ((i & 16) != 0) {
            str = "lazyPendingEquities";
        }
        lazyPendingEquitiesPositionsSection(reorderableLazyListScope, reorderablePositionsList, function1, function2, function22, str);
    }

    public static final void lazyPendingEquitiesPositionsSection(ReorderableLazyListScope reorderableLazyListScope, ReorderablePositionsList positionsListState, Function1<? super LazyListScope, Unit> function1, Function2<? super LazyListScope, ? super ReorderablePositionsList, Unit> function2, Function2<? super LazyListScope, ? super ReorderablePositionsList, Unit> function22, String keyPrefix) {
        Intrinsics.checkNotNullParameter(reorderableLazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(positionsListState, "positionsListState");
        Intrinsics.checkNotNullParameter(keyPrefix, "keyPrefix");
        ReorderablePositionsList2.positionsList$default(reorderableLazyListScope, keyPrefix, positionsListState, false, function1, function2, function22, 4, null);
    }

    public static /* synthetic */ void lazyEquitiesPositionsSection$default(ReorderableLazyListScope reorderableLazyListScope, ReorderablePositionsList reorderablePositionsList, Function1 function1, Function2 function2, Function2 function22, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function2 = null;
        }
        if ((i & 8) != 0) {
            function22 = null;
        }
        if ((i & 16) != 0) {
            str = "lazyEquities";
        }
        lazyEquitiesPositionsSection(reorderableLazyListScope, reorderablePositionsList, function1, function2, function22, str);
    }

    public static final void lazyEquitiesPositionsSection(ReorderableLazyListScope reorderableLazyListScope, ReorderablePositionsList positionsListState, Function1<? super LazyListScope, Unit> function1, Function2<? super LazyListScope, ? super ReorderablePositionsList, Unit> function2, Function2<? super LazyListScope, ? super ReorderablePositionsList, Unit> function22, String keyPrefix) {
        Intrinsics.checkNotNullParameter(reorderableLazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(positionsListState, "positionsListState");
        Intrinsics.checkNotNullParameter(keyPrefix, "keyPrefix");
        ReorderablePositionsList2.positionsList(reorderableLazyListScope, keyPrefix, positionsListState, positionsListState instanceof ReorderablePositionsList.Ready, function1, function2, function22);
    }

    public static /* synthetic */ void lazyPendingOptionsPositionsSection$default(ReorderableLazyListScope reorderableLazyListScope, ReorderablePositionsList reorderablePositionsList, Function1 function1, Function2 function2, Function2 function22, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function2 = null;
        }
        if ((i & 8) != 0) {
            function22 = null;
        }
        if ((i & 16) != 0) {
            str = "lazyPendingOptions";
        }
        lazyPendingOptionsPositionsSection(reorderableLazyListScope, reorderablePositionsList, function1, function2, function22, str);
    }

    public static final void lazyPendingOptionsPositionsSection(ReorderableLazyListScope reorderableLazyListScope, ReorderablePositionsList positionsListState, Function1<? super LazyListScope, Unit> function1, Function2<? super LazyListScope, ? super ReorderablePositionsList, Unit> function2, Function2<? super LazyListScope, ? super ReorderablePositionsList, Unit> function22, String keyPrefix) {
        Intrinsics.checkNotNullParameter(reorderableLazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(positionsListState, "positionsListState");
        Intrinsics.checkNotNullParameter(keyPrefix, "keyPrefix");
        ReorderablePositionsList2.positionsList$default(reorderableLazyListScope, keyPrefix, positionsListState, false, function1, function2, function22, 4, null);
    }

    public static /* synthetic */ void lazyOptionsPositionsSection$default(ReorderableLazyListScope reorderableLazyListScope, ReorderablePositionsList reorderablePositionsList, Function1 function1, Function2 function2, Function2 function22, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function2 = null;
        }
        if ((i & 8) != 0) {
            function22 = null;
        }
        if ((i & 16) != 0) {
            str = "lazyOptions";
        }
        lazyOptionsPositionsSection(reorderableLazyListScope, reorderablePositionsList, function1, function2, function22, str);
    }

    public static final void lazyOptionsPositionsSection(ReorderableLazyListScope reorderableLazyListScope, ReorderablePositionsList positionsListState, Function1<? super LazyListScope, Unit> function1, Function2<? super LazyListScope, ? super ReorderablePositionsList, Unit> function2, Function2<? super LazyListScope, ? super ReorderablePositionsList, Unit> function22, String keyPrefix) {
        Intrinsics.checkNotNullParameter(reorderableLazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(positionsListState, "positionsListState");
        Intrinsics.checkNotNullParameter(keyPrefix, "keyPrefix");
        ReorderablePositionsList2.positionsList(reorderableLazyListScope, keyPrefix, positionsListState, positionsListState instanceof ReorderablePositionsList.Ready, function1, function2, function22);
    }

    public static /* synthetic */ void lazyCryptoPositionsSection$default(ReorderableLazyListScope reorderableLazyListScope, ReorderablePositionsList reorderablePositionsList, Function1 function1, Function2 function2, Function2 function22, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function2 = null;
        }
        if ((i & 8) != 0) {
            function22 = null;
        }
        if ((i & 16) != 0) {
            str = "lazyCrypto";
        }
        lazyCryptoPositionsSection(reorderableLazyListScope, reorderablePositionsList, function1, function2, function22, str);
    }

    public static final void lazyCryptoPositionsSection(ReorderableLazyListScope reorderableLazyListScope, ReorderablePositionsList positionsListState, Function1<? super LazyListScope, Unit> function1, Function2<? super LazyListScope, ? super ReorderablePositionsList, Unit> function2, Function2<? super LazyListScope, ? super ReorderablePositionsList, Unit> function22, String keyPrefix) {
        Intrinsics.checkNotNullParameter(reorderableLazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(positionsListState, "positionsListState");
        Intrinsics.checkNotNullParameter(keyPrefix, "keyPrefix");
        ReorderablePositionsList2.positionsList$default(reorderableLazyListScope, keyPrefix, positionsListState, false, function1, function2, function22, 4, null);
    }

    public static /* synthetic */ void lazyFuturesPositionsSection$default(ReorderableLazyListScope reorderableLazyListScope, ReorderablePositionsList reorderablePositionsList, Function1 function1, Function2 function2, Function2 function22, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function2 = null;
        }
        if ((i & 8) != 0) {
            function22 = null;
        }
        if ((i & 16) != 0) {
            str = "lazyFutures";
        }
        lazyFuturesPositionsSection(reorderableLazyListScope, reorderablePositionsList, function1, function2, function22, str);
    }

    public static final void lazyFuturesPositionsSection(ReorderableLazyListScope reorderableLazyListScope, ReorderablePositionsList positionsListState, Function1<? super LazyListScope, Unit> function1, Function2<? super LazyListScope, ? super ReorderablePositionsList, Unit> function2, Function2<? super LazyListScope, ? super ReorderablePositionsList, Unit> function22, String keyPrefix) {
        Intrinsics.checkNotNullParameter(reorderableLazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(positionsListState, "positionsListState");
        Intrinsics.checkNotNullParameter(keyPrefix, "keyPrefix");
        ReorderablePositionsList2.positionsList(reorderableLazyListScope, keyPrefix, positionsListState, true, function1, function2, function22);
    }
}
