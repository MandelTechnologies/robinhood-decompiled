package com.robinhood.utils.compose.reorderable;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: DragStateV2.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.utils.compose.reorderable.DragStateV2$onDragStart$1", m3645f = "DragStateV2.kt", m3646l = {102, 103}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.utils.compose.reorderable.DragStateV2$onDragStart$1, reason: use source file name */
/* loaded from: classes12.dex */
final class DragStateV23 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListItemInfo $layoutItem;
    int label;
    final /* synthetic */ DragStateV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DragStateV23(DragStateV2 dragStateV2, LazyListItemInfo lazyListItemInfo, Continuation<? super DragStateV23> continuation) {
        super(2, continuation);
        this.this$0 = dragStateV2;
        this.$layoutItem = lazyListItemInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DragStateV23(this.this$0, this.$layoutItem, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DragStateV23) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0042 -> B:11:0x001e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        LazyListState lazyListState;
        int index;
        int i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
                this.label = 2;
                if (DelayKt.delay(50L, this) != coroutine_suspended) {
                    lazyListState = this.this$0.lazyListState;
                    index = this.$layoutItem.getIndex();
                    i = -this.$layoutItem.getOffset();
                    this.label = 1;
                    if (lazyListState.scrollToItem(index, i, this) != coroutine_suspended) {
                        this.label = 2;
                        if (DelayKt.delay(50L, this) != coroutine_suspended) {
                        }
                    }
                }
                return coroutine_suspended;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        ResultKt.throwOnFailure(obj);
        lazyListState = this.this$0.lazyListState;
        index = this.$layoutItem.getIndex();
        i = -this.$layoutItem.getOffset();
        this.label = 1;
        if (lazyListState.scrollToItem(index, i, this) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }
}
