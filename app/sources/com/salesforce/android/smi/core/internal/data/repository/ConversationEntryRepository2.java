package com.salesforce.android.smi.core.internal.data.repository;

import com.salesforce.android.smi.core.internal.data.repository.ConversationEntryRepository;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ConversationEntryRepository.kt */
@Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.repository.ConversationEntryRepository$getConversationEntries$2", m3645f = "ConversationEntryRepository.kt", m3646l = {108}, m3647m = "loadFromCache")
/* renamed from: com.salesforce.android.smi.core.internal.data.repository.ConversationEntryRepository$getConversationEntries$2$loadFromCache$1, reason: use source file name */
/* loaded from: classes12.dex */
final class ConversationEntryRepository2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConversationEntryRepository.C421012 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConversationEntryRepository2(ConversationEntryRepository.C421012 c421012, Continuation<? super ConversationEntryRepository2> continuation) {
        super(continuation);
        this.this$0 = c421012;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.loadFromCache(this);
    }
}
