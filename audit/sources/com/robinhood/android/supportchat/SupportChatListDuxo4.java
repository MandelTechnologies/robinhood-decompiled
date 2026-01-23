package com.robinhood.android.supportchat;

import com.robinhood.models.supportchat.p353db.SocketChatMessage;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: SupportChatListDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0006H\n"}, m3636d2 = {"<anonymous>", "", "", "Lcom/robinhood/models/supportchat/db/SocketChatMessage;", "map", "idToCount", "Lkotlin/Pair;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.supportchat.SupportChatListDuxo$observeMessagePreviews$2$1$2", m3645f = "SupportChatListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.supportchat.SupportChatListDuxo$observeMessagePreviews$2$1$2, reason: use source file name */
/* loaded from: classes9.dex */
final class SupportChatListDuxo4 extends ContinuationImpl7 implements Function3<Map<String, ? extends SocketChatMessage>, Tuples2<? extends String, ? extends SocketChatMessage>, Continuation<? super Map<String, ? extends SocketChatMessage>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    SupportChatListDuxo4(Continuation<? super SupportChatListDuxo4> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Map<String, ? extends SocketChatMessage> map, Tuples2<? extends String, ? extends SocketChatMessage> tuples2, Continuation<? super Map<String, ? extends SocketChatMessage>> continuation) {
        return invoke2((Map<String, SocketChatMessage>) map, (Tuples2<String, SocketChatMessage>) tuples2, (Continuation<? super Map<String, SocketChatMessage>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Map<String, SocketChatMessage> map, Tuples2<String, SocketChatMessage> tuples2, Continuation<? super Map<String, SocketChatMessage>> continuation) {
        SupportChatListDuxo4 supportChatListDuxo4 = new SupportChatListDuxo4(continuation);
        supportChatListDuxo4.L$0 = map;
        supportChatListDuxo4.L$1 = tuples2;
        return supportChatListDuxo4.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return MapsKt.plus((Map) this.L$0, (Tuples2) this.L$1);
    }
}
