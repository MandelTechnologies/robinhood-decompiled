package com.salesforce.android.smi.core.internal.data.repository;

import com.salesforce.android.smi.core.internal.data.repository.ConversationEntryRepository;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ConversationEntryRepository.kt */
@Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.repository.ConversationEntryRepository$sendConversationEntry$2", m3645f = "ConversationEntryRepository.kt", m3646l = {87, 89, 91}, m3647m = "handleException")
/* renamed from: com.salesforce.android.smi.core.internal.data.repository.ConversationEntryRepository$sendConversationEntry$2$handleException$1, reason: use source file name */
/* loaded from: classes12.dex */
final class ConversationEntryRepository7 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConversationEntryRepository.C421122 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConversationEntryRepository7(ConversationEntryRepository.C421122 c421122, Continuation<? super ConversationEntryRepository7> continuation) {
        super(continuation);
        this.this$0 = c421122;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.handleException(null, this);
    }
}
