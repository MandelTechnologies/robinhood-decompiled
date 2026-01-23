package com.robinhood.android.supportchat;

import com.robinhood.models.p355ui.pathfinder.messaging.AgentChat;
import com.robinhood.models.p355ui.pathfinder.messaging.SupportChat;
import com.robinhood.models.supportchat.p353db.SocketChatMessage;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: SupportChatListDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Pair;", "", "Lcom/robinhood/models/supportchat/db/SocketChatMessage;", "chat", "Lcom/robinhood/models/ui/pathfinder/messaging/SupportChat;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.supportchat.SupportChatListDuxo$observeMessagePreviews$2$1$1", m3645f = "SupportChatListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.supportchat.SupportChatListDuxo$observeMessagePreviews$2$1$1, reason: use source file name */
/* loaded from: classes9.dex */
final class SupportChatListDuxo3 extends ContinuationImpl7 implements Function2<SupportChat, Continuation<? super Flow<? extends Tuples2<? extends String, ? extends SocketChatMessage>>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SupportChatListDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SupportChatListDuxo3(SupportChatListDuxo supportChatListDuxo, Continuation<? super SupportChatListDuxo3> continuation) {
        super(2, continuation);
        this.this$0 = supportChatListDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SupportChatListDuxo3 supportChatListDuxo3 = new SupportChatListDuxo3(this.this$0, continuation);
        supportChatListDuxo3.L$0 = obj;
        return supportChatListDuxo3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(SupportChat supportChat, Continuation<? super Flow<Tuples2<String, SocketChatMessage>>> continuation) {
        return ((SupportChatListDuxo3) create(supportChat, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(SupportChat supportChat, Continuation<? super Flow<? extends Tuples2<? extends String, ? extends SocketChatMessage>>> continuation) {
        return invoke2(supportChat, (Continuation<? super Flow<Tuples2<String, SocketChatMessage>>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        AgentChat.AgentChatConversation conversation;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SupportChat supportChat = (SupportChat) this.L$0;
        AgentChat agentChat = supportChat.getAgentChat();
        if (agentChat == null || (conversation = agentChat.getConversation()) == null) {
            return FlowKt.emptyFlow();
        }
        if (supportChat.isEndable()) {
            return this.this$0.streamPreviewMessage(conversation);
        }
        return FlowKt.emptyFlow();
    }
}
