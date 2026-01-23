package com.robinhood.android.event.gamedetail.p130ui;

import android.annotation.SuppressLint;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.event.gamedetail.p130ui.position.GameDetailPositionRow;
import com.robinhood.android.event.gamedetail.p130ui.position.GameDetailPositionRowState;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: GameDetailPositions.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aQ\u0010\u0000\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062#\u0010\b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00030\u0001H\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m3636d2 = {"GameDetailPositions", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "", "Lkotlin/ExtensionFunctionType;", "rows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/event/gamedetail/ui/position/GameDetailPositionRowState;", "onPositionClick", "Ljava/util/UUID;", "Lkotlin/ParameterName;", "name", "contractId", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function1;", "feature-game-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.ui.GameDetailPositionsKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class GameDetailPositions4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GameDetailPositions$lambda$2$lambda$1(final ImmutableList immutableList, final Function1 function1, LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        GameDetailPositions gameDetailPositions = GameDetailPositions.INSTANCE;
        LazyListScope.item$default(lazyListScope, null, null, gameDetailPositions.m14224getLambda$316798785$feature_game_detail_externalDebug(), 3, null);
        LazyListScope.items$default(lazyListScope, immutableList.size(), new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailPositionsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GameDetailPositions4.GameDetailPositions$lambda$2$lambda$1$lambda$0(immutableList, ((Integer) obj).intValue());
            }
        }, null, ComposableLambda3.composableLambdaInstance(-925859832, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailPositionsKt$GameDetailPositions$1$1$2
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope items, int i, Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(items, "$this$items");
                if ((i2 & 48) == 0) {
                    i2 |= composer.changed(i) ? 32 : 16;
                }
                if ((i2 & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) == 144 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-925859832, i2, -1, "com.robinhood.android.event.gamedetail.ui.GameDetailPositions.<anonymous>.<anonymous>.<anonymous> (GameDetailPositions.kt:40)");
                }
                GameDetailPositionRow.GameDetailPositionRow(immutableList.get(i), null, function1, composer, 0, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 4, null);
        LazyListScope.item$default(lazyListScope, null, null, gameDetailPositions.getLambda$582381814$feature_game_detail_externalDebug(), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object GameDetailPositions$lambda$2$lambda$1$lambda$0(ImmutableList immutableList, int i) {
        return ((GameDetailPositionRowState) immutableList.get(i)).getContractId();
    }

    @SuppressLint({"ComposableNaming"})
    public static final Function1<LazyListScope, Unit> GameDetailPositions(final ImmutableList<GameDetailPositionRowState> rows, final Function1<? super UUID, Unit> onPositionClick, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(onPositionClick, "onPositionClick");
        composer.startReplaceGroup(-1881819545);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1881819545, i, -1, "com.robinhood.android.event.gamedetail.ui.GameDetailPositions (GameDetailPositions.kt:25)");
        }
        composer.startReplaceGroup(-1633490746);
        boolean z = ((((i & 14) ^ 6) > 4 && composer.changed(rows)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(onPositionClick)) || (i & 48) == 32);
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailPositionsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GameDetailPositions4.GameDetailPositions$lambda$2$lambda$1(rows, onPositionClick, (LazyListScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1<LazyListScope, Unit> function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return function1;
    }
}
