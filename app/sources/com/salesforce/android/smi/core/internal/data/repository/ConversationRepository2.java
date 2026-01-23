package com.salesforce.android.smi.core.internal.data.repository;

import com.salesforce.android.smi.core.internal.data.repository.ConversationRepository;
import com.salesforce.android.smi.network.data.domain.conversation.Conversation;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ConversationRepository.kt */
@Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.repository.ConversationRepository$getConversations$2", m3645f = "ConversationRepository.kt", m3646l = {63}, m3647m = "saveProcessedResult")
/* renamed from: com.salesforce.android.smi.core.internal.data.repository.ConversationRepository$getConversations$2$saveProcessedResult$1, reason: use source file name */
/* loaded from: classes12.dex */
final class ConversationRepository2 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConversationRepository.C421192 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConversationRepository2(ConversationRepository.C421192 c421192, Continuation<? super ConversationRepository2> continuation) {
        super(continuation);
        this.this$0 = c421192;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.saveProcessedResult((List<? extends Conversation>) null, (Continuation<? super List<? extends Conversation>>) this);
    }
}
