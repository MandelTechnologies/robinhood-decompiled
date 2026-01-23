package com.robinhood.shared.tradeladder.p398ui.ladder;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotState4;
import com.plaid.internal.EnumC7081g;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GenericLadder.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.tradeladder.ui.ladder.GenericLadderKt$GenericLadderComposable$2$1$1", m3645f = "GenericLadder.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class GenericLadderKt$GenericLadderComposable$2$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ SnapshotState4<List<Integer>> $zoomOverlayItems$delegate;
    int I$0;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    GenericLadderKt$GenericLadderComposable$2$1$1(SnapshotState4<? extends List<Integer>> snapshotState4, LazyListState lazyListState, Continuation<? super GenericLadderKt$GenericLadderComposable$2$1$1> continuation) {
        super(2, continuation);
        this.$zoomOverlayItems$delegate = snapshotState4;
        this.$listState = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GenericLadderKt$GenericLadderComposable$2$1$1(this.$zoomOverlayItems$delegate, this.$listState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GenericLadderKt$GenericLadderComposable$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(50, r10) != r0) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0064 -> B:7:0x0018). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        LazyListState lazyListState;
        GenericLadderKt$GenericLadderComposable$2$1$1 genericLadderKt$GenericLadderComposable$2$1$1;
        int i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Integer num = (Integer) CollectionsKt.firstOrNull(GenericLadderKt.GenericLadderComposable$lambda$47$lambda$25(this.$zoomOverlayItems$delegate));
            if (num != null) {
                LazyListState lazyListState2 = this.$listState;
                iIntValue = num.intValue();
                lazyListState = lazyListState2;
                this.L$0 = lazyListState;
                this.I$0 = iIntValue;
                this.label = 1;
                genericLadderKt$GenericLadderComposable$2$1$1 = this;
                if (LazyListState.scrollToItem$default(lazyListState, iIntValue, 0, genericLadderKt$GenericLadderComposable$2$1$1, 2, null) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            lazyListState = (LazyListState) this.L$0;
            ResultKt.throwOnFailure(obj);
            iIntValue = i;
            this.L$0 = lazyListState;
            this.I$0 = iIntValue;
            this.label = 1;
            genericLadderKt$GenericLadderComposable$2$1$1 = this;
            if (LazyListState.scrollToItem$default(lazyListState, iIntValue, 0, genericLadderKt$GenericLadderComposable$2$1$1, 2, null) != coroutine_suspended) {
                i = iIntValue;
                genericLadderKt$GenericLadderComposable$2$1$1.L$0 = lazyListState;
                genericLadderKt$GenericLadderComposable$2$1$1.I$0 = i;
                genericLadderKt$GenericLadderComposable$2$1$1.label = 2;
            }
            return coroutine_suspended;
        }
        i = this.I$0;
        lazyListState = (LazyListState) this.L$0;
        ResultKt.throwOnFailure(obj);
        genericLadderKt$GenericLadderComposable$2$1$1 = this;
        genericLadderKt$GenericLadderComposable$2$1$1.L$0 = lazyListState;
        genericLadderKt$GenericLadderComposable$2$1$1.I$0 = i;
        genericLadderKt$GenericLadderComposable$2$1$1.label = 2;
    }
}
