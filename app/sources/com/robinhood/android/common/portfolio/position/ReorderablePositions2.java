package com.robinhood.android.common.portfolio.position;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.models.portfolio.api.PositionsLocation;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.compose.reorderable.ReorderableLazyListScope;
import com.robinhood.utils.compose.reorderable.ReorderableListState;
import com.robinhood.utils.compose.reorderable.ReorderableListStateKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReorderablePositions.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a2\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b¨\u0006\f"}, m3636d2 = {"reorderablePositions", "", "Lcom/robinhood/utils/compose/reorderable/ReorderableLazyListScope;", "keyPrefix", "", "positionsState", "Lcom/robinhood/utils/compose/reorderable/ReorderableListState;", "Lcom/robinhood/android/common/portfolio/position/DisplayPositionListItem;", "positionsLocation", "Lcom/robinhood/android/models/portfolio/api/PositionsLocation;", "animateItemPlacement", "", "feature-lib-portfolio_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.portfolio.position.ReorderablePositionsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class ReorderablePositions2 {
    public static /* synthetic */ void reorderablePositions$default(ReorderableLazyListScope reorderableLazyListScope, String str, ReorderableListState reorderableListState, PositionsLocation positionsLocation, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        reorderablePositions(reorderableLazyListScope, str, reorderableListState, positionsLocation, z);
    }

    public static final void reorderablePositions(ReorderableLazyListScope reorderableLazyListScope, String keyPrefix, final ReorderableListState<DisplayPositionListItem> positionsState, final PositionsLocation positionsLocation, boolean z) {
        Intrinsics.checkNotNullParameter(reorderableLazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(keyPrefix, "keyPrefix");
        Intrinsics.checkNotNullParameter(positionsState, "positionsState");
        Intrinsics.checkNotNullParameter(positionsLocation, "positionsLocation");
        ReorderableListStateKt.reorderableItems$default(reorderableLazyListScope, positionsState, keyPrefix, new Function2() { // from class: com.robinhood.android.common.portfolio.position.ReorderablePositionsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ReorderablePositions2.reorderablePositions$lambda$0(((Integer) obj).intValue(), (DisplayPositionListItem) obj2);
            }
        }, null, false, z, ComposableLambda3.composableLambdaInstance(1031126599, true, new Function6<LazyItemScope, DisplayPositionListItem, Integer, Boolean, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.portfolio.position.ReorderablePositionsKt.reorderablePositions.2
            @Override // kotlin.jvm.functions.Function6
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, DisplayPositionListItem displayPositionListItem, Integer num, Boolean bool, Composer composer, Integer num2) {
                invoke(lazyItemScope, displayPositionListItem, num.intValue(), bool.booleanValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope reorderableItems, DisplayPositionListItem displayPositionItem, int i, boolean z2, Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(reorderableItems, "$this$reorderableItems");
                Intrinsics.checkNotNullParameter(displayPositionItem, "displayPositionItem");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1031126599, i2, -1, "com.robinhood.android.common.portfolio.position.reorderablePositions.<anonymous> (ReorderablePositions.kt:43)");
                }
                NavigatingPositionListItem.NavigatingPositionListItem(displayPositionItem, z2 ? Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21373getBg30d7_KjU(), null, 2, null) : Modifier.INSTANCE, NavigationExtensions.getPositionIds(positionsState.getItems()), NavigationExtensions.getAssociatedCodes(positionsState.getItems()), positionsLocation, null, composer, (i2 >> 3) & 14, 32);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String reorderablePositions$lambda$0(int i, DisplayPositionListItem displayPositionItem) {
        Intrinsics.checkNotNullParameter(displayPositionItem, "displayPositionItem");
        String string2 = NavigationExtensions.getPositionId(displayPositionItem.getPosition()).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }
}
