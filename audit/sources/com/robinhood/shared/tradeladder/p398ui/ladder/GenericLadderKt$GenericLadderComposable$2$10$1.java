package com.robinhood.shared.tradeladder.p398ui.ladder;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import com.plaid.internal.EnumC7081g;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderState;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GenericLadder.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$GenericLadderComposable$2$10$1", m3645f = "GenericLadder.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes12.dex */
final class GenericLadderKt$GenericLadderComposable$2$10$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LadderState.LadderData $ladderData;
    final /* synthetic */ LazyListState $listState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GenericLadderKt$GenericLadderComposable$2$10$1(LadderState.LadderData ladderData, LazyListState lazyListState, Continuation<? super GenericLadderKt$GenericLadderComposable$2$10$1> continuation) {
        super(2, continuation);
        this.$ladderData = ladderData;
        this.$listState = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GenericLadderKt$GenericLadderComposable$2$10$1(this.$ladderData, this.$listState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GenericLadderKt$GenericLadderComposable$2$10$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LadderState.LadderData.SelectedRow selectedRow = this.$ladderData.getSelectedRow();
            Integer numBoxInt = selectedRow != null ? boxing.boxInt(selectedRow.getIndex()) : null;
            if (numBoxInt != null) {
                LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.last((List) this.$listState.getLayoutInfo().getVisibleItemsInfo());
                if (numBoxInt.intValue() >= lazyListItemInfo.getIndex()) {
                    LazyListState lazyListState = this.$listState;
                    int iIntValue = numBoxInt.intValue();
                    int i2 = -(((int) (this.$listState.getLayoutInfo().mo5206getViewportSizeYbymL2g() & 4294967295L)) - lazyListItemInfo.getSize());
                    this.label = 1;
                    if (lazyListState.animateScrollToItem(iIntValue, i2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
