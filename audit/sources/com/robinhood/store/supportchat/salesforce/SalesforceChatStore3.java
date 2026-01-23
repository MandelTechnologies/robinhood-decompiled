package com.robinhood.store.supportchat.salesforce;

import com.plaid.internal.EnumC7081g;
import com.salesforce.android.smi.core.ConversationClient;
import com.salesforce.android.smi.core.CoreClient;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.Produce4;

/* compiled from: SalesforceChatStore.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/salesforce/android/smi/core/ConversationClient;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamConversationClient$1$1$1", m3645f = "SalesforceChatStore.kt", m3646l = {155, EnumC7081g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamConversationClient$1$1$1, reason: use source file name */
/* loaded from: classes12.dex */
final class SalesforceChatStore3 extends ContinuationImpl7 implements Function2<Produce4<? super ConversationClient>, Continuation<? super Unit>, Object> {
    final /* synthetic */ UUID $conversationId;
    final /* synthetic */ CoreClient $coreClient;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SalesforceChatStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SalesforceChatStore3(CoreClient coreClient, UUID uuid, SalesforceChatStore salesforceChatStore, Continuation<? super SalesforceChatStore3> continuation) {
        super(2, continuation);
        this.$coreClient = coreClient;
        this.$conversationId = uuid;
        this.this$0 = salesforceChatStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SalesforceChatStore3 salesforceChatStore3 = new SalesforceChatStore3(this.$coreClient, this.$conversationId, this.this$0, continuation);
        salesforceChatStore3.L$0 = obj;
        return salesforceChatStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Produce4<? super ConversationClient> produce4, Continuation<? super Unit> continuation) {
        return ((SalesforceChatStore3) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (kotlinx.coroutines.channels.Produce.awaitClose(r1, r6, r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Produce4 produce4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            produce4 = (Produce4) this.L$0;
            ConversationClient conversationClient = this.$coreClient.conversationClient(this.$conversationId);
            this.L$0 = produce4;
            this.label = 1;
            if (produce4.send(conversationClient, this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        produce4 = (Produce4) this.L$0;
        ResultKt.throwOnFailure(obj);
        final SalesforceChatStore salesforceChatStore = this.this$0;
        final UUID uuid = this.$conversationId;
        Function0<Unit> function0 = new Function0<Unit>() { // from class: com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamConversationClient$1$1$1.1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                salesforceChatStore.getConversationClients$lib_store_support_chat_externalRelease().remove(uuid);
            }
        };
        this.L$0 = null;
        this.label = 2;
    }
}
