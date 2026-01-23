package com.robinhood.android.supportchat.thread.compose;

import androidx.compose.foundation.lazy.LazyListState;
import com.robinhood.models.p355ui.pathfinder.messaging.ChatMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CxChatMessageList.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.supportchat.thread.compose.CxChatMessageListKt$CxChatMessageList$2$1", m3645f = "CxChatMessageList.kt", m3646l = {112}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.supportchat.thread.compose.CxChatMessageListKt$CxChatMessageList$2$1, reason: use source file name */
/* loaded from: classes9.dex */
final class CxChatMessageList2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChatMode $chatMode;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ Function1<ChatMode, Unit> $markAllMessagesAsRead;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CxChatMessageList2(LazyListState lazyListState, Function1<? super ChatMode, Unit> function1, ChatMode chatMode, Continuation<? super CxChatMessageList2> continuation) {
        super(2, continuation);
        this.$listState = lazyListState;
        this.$markAllMessagesAsRead = function1;
        this.$chatMode = chatMode;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CxChatMessageList2(this.$listState, this.$markAllMessagesAsRead, this.$chatMode, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CxChatMessageList2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LazyListState lazyListState = this.$listState;
            this.label = 1;
            if (CxChatMessageList.scrollToBottom(lazyListState, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.$markAllMessagesAsRead.invoke(this.$chatMode);
        return Unit.INSTANCE;
    }
}
