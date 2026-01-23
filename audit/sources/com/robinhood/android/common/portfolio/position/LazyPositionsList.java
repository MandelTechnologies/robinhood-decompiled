package com.robinhood.android.common.portfolio.position;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.models.portfolio.api.PositionsLocation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: LazyPositionsList.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a4\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b¨\u0006\f"}, m3636d2 = {"lazyDisplayPositions", "", "Landroidx/compose/foundation/lazy/LazyListScope;", "positions", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/common/portfolio/position/DisplayPositionListItem;", "positionsLocation", "Lcom/robinhood/android/models/portfolio/api/PositionsLocation;", "modifier", "Landroidx/compose/ui/Modifier;", "keyPrefix", "", "feature-lib-portfolio_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.portfolio.position.LazyPositionsListKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class LazyPositionsList {
    public static /* synthetic */ void lazyDisplayPositions$default(LazyListScope lazyListScope, ImmutableList immutableList, PositionsLocation positionsLocation, Modifier modifier, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if ((i & 8) != 0) {
            str = "";
        }
        lazyDisplayPositions(lazyListScope, immutableList, positionsLocation, modifier, str);
    }

    public static final void lazyDisplayPositions(LazyListScope lazyListScope, final ImmutableList<DisplayPositionListItem> positions, final PositionsLocation positionsLocation, final Modifier modifier, final String keyPrefix) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(positions, "positions");
        Intrinsics.checkNotNullParameter(positionsLocation, "positionsLocation");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(keyPrefix, "keyPrefix");
        final Function1 function1 = new Function1() { // from class: com.robinhood.android.common.portfolio.position.LazyPositionsListKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LazyPositionsList.lazyDisplayPositions$lambda$0(keyPrefix, (DisplayPositionListItem) obj);
            }
        };
        final C11543xcdd5c3ae c11543xcdd5c3ae = new Function1() { // from class: com.robinhood.android.common.portfolio.position.LazyPositionsListKt$lazyDisplayPositions$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(DisplayPositionListItem displayPositionListItem) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((DisplayPositionListItem) obj);
            }
        };
        lazyListScope.items(positions.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.common.portfolio.position.LazyPositionsListKt$lazyDisplayPositions$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return function1.invoke(positions.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: com.robinhood.android.common.portfolio.position.LazyPositionsListKt$lazyDisplayPositions$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c11543xcdd5c3ae.invoke(positions.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.portfolio.position.LazyPositionsListKt$lazyDisplayPositions$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                DisplayPositionListItem displayPositionListItem = (DisplayPositionListItem) positions.get(i);
                composer.startReplaceGroup(1617797709);
                NavigatingPositionListItem.NavigatingPositionListItem(displayPositionListItem, modifier, NavigationExtensions.getPositionIds(positions), NavigationExtensions.getAssociatedCodes(positions), positionsLocation, null, composer, 0, 32);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object lazyDisplayPositions$lambda$0(String str, DisplayPositionListItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return str + NavigationExtensions.getPositionId(item.getPosition());
    }
}
