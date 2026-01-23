package com.salesforce.android.smi.core.internal.data.repository;

import com.plaid.internal.EnumC7081g;
import com.salesforce.android.smi.core.internal.data.repository.ConversationEntryRepository;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ConversationEntryRepository.kt */
@Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.repository.ConversationEntryRepository$sendConversationEntry$2", m3645f = "ConversationEntryRepository.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE, EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE}, m3647m = "sendRequest")
/* renamed from: com.salesforce.android.smi.core.internal.data.repository.ConversationEntryRepository$sendConversationEntry$2$sendRequest$1, reason: use source file name */
/* loaded from: classes12.dex */
final class ConversationEntryRepository8 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConversationEntryRepository.C421122 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConversationEntryRepository8(ConversationEntryRepository.C421122 c421122, Continuation<? super ConversationEntryRepository8> continuation) {
        super(continuation);
        this.this$0 = c421122;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.sendRequest(this);
    }
}
